$(document).ready(function(){
    $('#empTable').bootstrapTable({
        pagination: false,
        onPreBody: function() {
          $('.spinner-border').show();
        },
        onPostBody: function () {
            $('.spinner-border').hide();
            $('#empTableHolder').show();
        }
    });

    $('#addBtn').click(function () {
        $('#phoneHolder dl:last').after('<dl><dt><label for="phonenumber">Phone Number</label></dt><dd><input type="text" id="phonenumber" name="phonenumber[]" class="form-control col-md-3 mb-5" required /></dd></dl>');
        // $('#phoneHolder input').last('@inputText(myForm("phonenumber[]"),Symbol("_label") -> "Phone Number",Symbol("name") -> "phone", Symbol("class") -> "form-control col-md-3 mb-5")\n');
    })

    $('#removeBtn').click(function () {
        if ($('#phoneHolder').find('dl').length > 1) {
            $('#phoneHolder').find('dl:last').remove();
        }
    })



})