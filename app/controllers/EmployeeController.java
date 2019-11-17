package controllers;

import models.Employee;
import models.Phone;
import models.User;
import persist.EmployeePersist;
import persist.OfficePersist;
import persist.UserPersist;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import misc.Search;
import views.html.employees.*;

import javax.inject.Inject;
import java.util.*;

public class EmployeeController extends Controller {

    private final EmployeePersist employeePersist;
    private final OfficePersist officePersist;
    private final UserPersist userPersist;


    @Inject
    FormFactory formFactory;


    @Inject
    public EmployeeController() {
        employeePersist = new EmployeePersist();
        officePersist   = new OfficePersist();
        userPersist     = new UserPersist();
    }


    /**
     * This method is the initial page of the application and shows the login page, if the user not signed in.
     * Otherwise redirects to user's homepage.
     * @param request
     * @return shows the initial page of the application and shows the login page, if the user not signed in.
     * Otherwise redirects to user's homepage.
     */
    public Result index(Http.Request request) {
        Form<User> userForm = formFactory.form(User.class);
        Form<Search> searchForm = formFactory.form(Search.class);
        return request.session().getOptional("username")
                .map((user) -> ok(homepage.render(searchForm, request.session())).removingFromSession(request,"success"))
                .orElseGet(()-> ok(index.render(userForm, request.session())));
    }

    /**
     * This method authenticate the user.
     * @param request
     * @return user's home page if successful, or login page otherwise
     */
    public Result login(Http.Request request) {
        Form<Search> searchForm = formFactory.form(Search.class);
        Form<User> userForm = formFactory.form(User.class).bindFromRequest(request);
        User user = userForm.get();
        Optional<User> userOptional = userPersist.getUser(user.username,user.password);
        if (userOptional.isPresent()) {
            user = userOptional.get();
            List<Employee> employees = employeePersist.getAllEmployees();
            Http.Session session = request.session().adding("username", user.username).adding("firstname", user.fname);
            if(user.type.equals("admin")) {
                session = session.adding("admin", "admin");
                return ok(homepage.render(searchForm,session)).withSession(session);
//                return ok(allEmployees.render(employees, session)).withSession(session);
//                ok(allEmployees.render(employees, request)).addingToSession(request, "username", user.username)
//                        .addingToSession(request, "firstname", user.fname).addingToSession(request, "admin", "admin");
            }else {
                return ok(homepage.render(searchForm,session)).withSession(session);
//                return ok(allEmployees.render(employees, session)).withSession(session);
//                return ok(allEmployees.render(employees, session)).addingToSession(request, "username", user.username)
//                        .addingToSession(request, "firstname", user.fname);
            }
        }
        return redirect(routes.EmployeeController.index());
    }

    /**
     * This method signs out the user from the application.
     * @param request
     * @return the login page
     */
    public Result logOut(Http.Request request) {
        return redirect(routes.EmployeeController.index()).withNewSession();
    }


    /**
     * This method shows the user's home page if they're already logged in, or shows login page.
     * @param request
     * @return user's home page if they're already logged in, or shows login page
     */
//    public Result goToHomePage(Http.Request request) {
//        Form<Search> searchForm = formFactory.form(Search.class);
//        return request.session().getOptional("username")
//                .map((user) -> ok(homepage.render(searchForm, request.session()))).orElseGet(()-> redirect(routes.EmployeeController.index()));
//    }


    /**
     * This method searches for employees(s) based on either "email" or "phone number".
     * @param request
     * @return shows the search result page
     */
    public Result search(Http.Request request) {
        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest(request);
        Search empSearch = searchForm.get();
        Optional<List<Employee>> empListOptional =  employeePersist.findByKeyword(empSearch.query, empSearch.searchType);
        return ok(searchResult.render(searchForm, empListOptional, request.session().removing("success")));
    }


    /**
     * This method shows a single employee's information.
     * @param id
     * @param request
     * @return employee's information page
     */
    public Result show(int id, Http.Request request) {
        Employee employee = employeePersist.findById(id);
        return ok(show.render(employee, request.session()));
    }


    /**
     * This method displays the create employee page.
     * @param request
     * @return loads the create employee page.
     */
    public Result create(Http.Request request) {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        Map<String, String> offices = officePersist.getAllOffices();
        return ok(create.render(employeeForm, offices, request.session()));
    }


    /**
     * This method inserts (i.e. adds) the new employee into the system.
     * @param request
     * @return shows the user's homepage
     */
    public Result save(Http.Request request) {
        Form<Employee> employeeForm = formFactory.form(Employee.class).bindFromRequest(request);
        Employee employee = employeeForm.get();
        String[] phoneNumbers = request.body().asFormUrlEncoded().get("phonenumber[]");
        List<Phone> phones = new ArrayList<Phone>();
        for(String phoneNumber : phoneNumbers) {
            Phone phone = new Phone();
            phone.employee = employee;
            phone.phonenumber = phoneNumber;
            phones.add(phone);
        }
        employee.phones = phones;
        employeePersist.persist(employee);
        return redirect(routes.EmployeeController.index()).addingToSession(request,"success", "The Employee record has been created.");
    }


    /**
     * This method shows the employee information edit page
     * @param id
     * @param request
     * @return edit page
     */
    public Result edit(int id, Http.Request request) {
        Employee employee = employeePersist.findById(id);
        Form<Employee> employeeForm = formFactory.form(Employee.class).fill(employee);
        return ok(edit.render(employeeForm, request.session()));
    }


    /**
     * This method updates the employee information in the system
     * @param id
     * @param request
     * @return Shows the user's homepage
     */
    public Result update(int id, Http.Request request) {
        Form<Employee> employeeForm = formFactory.form(Employee.class).bindFromRequest(request);
        Employee updatedEmployee = employeeForm.get();
        Employee oldEmployee = employeePersist.findById(id);
        oldEmployee.fname = updatedEmployee.fname;
        oldEmployee.lname = updatedEmployee.lname;
        oldEmployee.email = updatedEmployee.email;
        oldEmployee.address = updatedEmployee.address;
        employeePersist.update(oldEmployee);
        return redirect(routes.EmployeeController.index());
    }



}
