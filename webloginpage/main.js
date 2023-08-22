function checklogin(){
     
    var usernam=document.myform.user.value; 
    var passwor=document.myform.pass.value;
    if(usernam==""){
        alert("username cant be empty");
        return false;
    }
    if(passwor.length<8 && passwor.length>15){
        alert("password should be greate than 7");
        return false;
    }
    if(!containspecialcharacter(passwor) || !containdigit(passwor)){
        alert("password should contain at least one speacial character and digit");
        return false;
    }
    alert("successfully login");
     
     
}
function containdigit(firstName){
    var sizeFirst=firstName.length;
    for(var i = 0; i<sizeFirst; i++){
        if(firstName.charAt(i) == 1 || firstName.charAt(i) == 2 || firstName.charAt(i) == 3 || firstName.charAt(i) == 4 || firstName.charAt(i) == 5 || firstName.charAt(i) == 6 || firstName.charAt(i) == 7 || firstName.charAt(i) == 8 || firstName.charAt(i) == 9 || firstName.charAt(i) == 0){
            return true;
        }
    }
    return false; 


}
function containspecialcharacter(str){
    var sizestr=str.length;
    for(var i=0;i<sizestr;i++){
        if(str.charAt(i)== '@' || str.charAt(i)== '#' || str.charAt(i)== '!' || str.charAt(i)== '$' || str.charAt(i)== '^'){
            return true;
        }
    }
    return false;
}
function checksignup(){

    var fname=document.myform1.fname.value;     
    var lname=document.myform1.lname.value;
    var username1=document.myform1.Uname.value;
    var passs=document.myform1.passs.value;          
    if(containdigit(fname)){
        alert("first name should not contain digit");
        return false;
    }
    else if(containdigit(lname) ){
        alert("last name should not contain digit");
        return false;
    }
    else if(passs.length<8 && passs.length>15){
        alert("password length should be between 8 and 15 ");
        return false;
    }
    else if(!containspecialcharacter(passs) || !containdigit(passs)){
        alert("password should contain at least one speacial character and digit");
        return false;
    }else if(fname==""){
        alert("first name should not be empty");
        return false;
    }else if(lname==""){
        alert("last name should not be empty");
        return false;
    }

    else{
        alert("user successfully registerd");

    }

     
     



}