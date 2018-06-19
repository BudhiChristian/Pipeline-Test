document.addEventListener("DOMContentLoaded", function () {
    sendAjaxGet("http://localhost:8082/ServletLoginDemo/session", displayUsername);
});

function sendAjaxGet(url, func) {
    let xhr = (new XMLHttpRequest || new ActiveXObject("Microsoft.HTTPRequest"));
    xhr.onreadystatechange = function () {
        if (this.status == 200 & this.readyState == 4) {
            func(this);
        }
    }

    xhr.open("GET", url);
    xhr.send();
}        


function displayUsername(xhr) {
    let response = xhr.response;
    let info = JSON.parse(response);
    console.log(response);

    let username = document.createElement("h1");
    username.innerHTML = info.username;
    document.getElementById("user").appendChild(username);
}