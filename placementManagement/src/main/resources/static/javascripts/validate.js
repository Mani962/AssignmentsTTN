
$(document).on('focusout', '#loginbutton', function () {
    var uname = this.value;
    console.log(uname);
    var check = $.ajax({
        url: "/loginpage",
        data: {"uname": uname},
        method: "GET"
    });
    check.done(function (data) {
        if (data) {
            document.getElementById('loginbutton').value = null;
            //$('#uname-msg').text("Username already exists");
            alert("Username already exists")
            console.log(data);
        }

    });

});