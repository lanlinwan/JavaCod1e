import axios from './axios.min'

const container = document.getElementsByClassName('container')[0];
const signIn = document.getElementById('sign-in');
const signUp = document.getElementById('sign-up');

signUp.onclick = function() {
    container.classList.add('active');
}
signIn.onclick = function() {
    container.classList.remove('active');
}



const loginemail=document.getElementById('loginemail');
const loginpassword=document.getElementById('loginpassword');
const loginbutton=document.getElementById('login');

loginbutton.onclick=function () {
    const email = loginemail.value;
    const password = loginpassword.value;
    //alert(email,password);
    axios({
        method:"post",
        url:"http://localhost:8080/Comprehensive/login?email="+email+"&pageSize="+password,

    }).then(resp=>{

        location.href = 'brand.html'
    })
    $.post("/login",{email:email,password:password},function(data){
        alert(data.data);
        if (data.error == 0){
            // 登录成功

        }
    },"json")

}

