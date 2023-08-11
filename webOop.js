
class person{

    constructor(name,age,gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    introduce(){
        console.log(" ||Name: "+this.name+" ||age: "+this.age+". ||gender: "+this.gender);
    }
}
class student extends person{
    constructor(name,age,gender,studentId,Department,classs){
        super(name,age,gender);
        this.studentId=studentId;
        this.Department=Department;
        this.classs=classs;

    }
    Sshow(){
        console.log(" ||Name: "+this.name+" ||age: "+this.age+" ||gender: "+this.gender+" ||studentId : "+this.studentId+" ||Department: "+this.Department+"||classs: "+this.classs);

    }
}
class teacher extends person{
    constructor(name,age,gender ,teacherId,Department,specializeSubject){
        super(name,age,gender);
        this.teacherId=teacherId;
        this.Department=Department;
        this.specializeSubject=specializeSubject;
    }
    Tshow(){
        
        console.log(" ||Name: "+this.name+" ||age: "+this.age+" || gender"+this.gender+" ||teacherId : "+this.teacherId+" ||Department: "+this.Department+" ||specializeSubject: "+this.specializeSubject);

    }
     
}
const T1=new teacher("ketan",21,"Male",115,"computer","web Development");
T1.Tshow();
T1.introduce();

const S1=new student("Aniket",10,"Male",10,"civil","BEA");
S1.Sshow();
S1.introduce();