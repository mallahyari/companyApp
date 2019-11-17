### Company Employee Directory App

This application is a Play application that uses Java and MySQL, and is based on the following description:

_Design an employee directory in the form of a web application for a company ABC. Company has multiple physical locations with in US. Employees have a unique email address and may have multiple phone numbers but one unique mailing address. Only an employee or HR can add employee information to the application. Anyone in the company can search employee phone and email information but only HR and the employee itself can access employee address.  When searched, the application should display employee name, contact information and  office the employee is associated with._

### Play Requirement
1. Java SE 1.8 or higher
2. [sbt](https://www.scala-sbt.org/download.html?_ga=2.252241996.410877668.1573953266-1944032210.1571247971) build tool

### MySQL Requirement
MySQL database needs to be installed, as this application uses MySQL as the database.

### How to Run the Application
1. Run the `create.sql` file using the following command to create the database along with all the tables and populate it with several dummy data:
```
mysql> source path/to/the/create.sql
```
2. Unzip the `employeedirectory-1.0.zip` file and run the script in the `bin` directory of the unzipped folder:
```
$ unzip employeedirectory-1.0.zip
$ chmod +x /path/to/bin/<project-name>
$ employeedirectory-1.0/bin/employeedirectory -Dplay.http.secret.key='UnnbI4fx=pX95r]>anPRgBX64jjDI1_ux_x<s<p9:v2]TcC8=fe>I5HD21N@neI/'
```
3. Open the browser and enter <http://localhost:9000>
4. You need to login to be able to use the app. The **username** and **password** information can be found in the `user` table in the MySQL database:
```
mysql> select * from user;
```
### How to Run the Application from Source Code
1. Run the `create.sql` file using the following command to create the database along with all the tables and populate it with several dummy data:
```
mysql> source path/to/the/create.sql
```
2. Download the source code:
```
$ git clone https://github.com/sci2lab/companyApp.git
$ cd companyApp
$ sbt update
$ sbt compile
$ sbt run
```
3. Open the browser and enter <http://localhost:9000>
