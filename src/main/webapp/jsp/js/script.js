function add() {
    var studentName = document.getElementById("name").value;
    var studentLastName = document.getElementById("last_name").value;
    var studentPhoneNumber = document.getElementById("phone_number").value;
    var studentBirthday = document.getElementById("birthday").value;
    var studentEmail = document.getElementById("email").value;

    var data = {
        'name': studentName,
        'last_name': studentLastName,
        'phone_number': studentPhoneNumber,
        'birthday': studentBirthday,
        'email': studentEmail
    };
    $.post({
        url: "/addData",
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        dataType: 'json'
    });
}

function go_to_add() {
    window.location.assign("/add");
}
function go_to_view() {
    window.location.assign("/view");
}

function update() {
    var studentId = document.getElementById("id").value;
    var studentName = document.getElementById("name").value;
    var studentLastName = document.getElementById("last_name").value;
    var studentPhoneNumber = document.getElementById("phone_number").value;
    var studentBirthday = document.getElementById("birthday").value;
    var studentEmail = document.getElementById("email").value;

    var data = {
        'id': studentId,
        'name': studentName,
        'last_name': studentLastName,
        'phone_number': studentPhoneNumber,
        'birthday': studentBirthday,
        'email': studentEmail
    };
    $.post({
        url: "/updateData",
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        dataType: 'json',
    });
}

function delete_st(num) {

    var data = {
        'id': num
    };
    $.post({
        url: "/delete",
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        dataType: 'json'
    });
}