function myFunction() {
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;

    debugger;
    $.ajax("/login",{"username":username,"password":password},function (data) {
        if(data){
            alert("登陆成功");
        }else {
            alert(data.returnMsg)
        }
    })
}