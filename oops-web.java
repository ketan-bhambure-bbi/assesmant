class person{
    String Name;
    int Age;
    String Gender;
    void introduce(){
        System.out.println("Name : "+Name);
        System.out.println("Age : "+Age);
        System.out.println("Gender : "+Gender);
    }
}
class student extends person{
    int studentId;
    String Department;
    String classs;
    student( String Name,int Age,String Gender,int studentId, String Department,String classs){
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
        studentId=studentId;
        Department=Department;
        classs=classs;
    }
    void displayStudentInformation(){
        System.out.println("Name : "+this.Name);
        System.out.println("Age :"+this.Age);
        System.out.println("Gender :"+this.Gender);
        System.out.println("studentId :"+studentId);
        System.out.println("Department : "+Department);
        System.out.println("classs :"+classs);
        
        
    }
    
}
class Teacher extends person{
    int TeacherId;
    String Department;
    String SpecializeSubject;
    Teacher(String Name,int Age,String Gender,int TeacherId,String Department,String SpecializeSubject){
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
        TeacherId=TeacherId;
        Department=Department;
        SpecializeSubject=SpecializeSubject;
    }
    void displayTeacherInformation(){
        System.out.println("Name : "+this.Name);
        System.out.println("Age :"+this.Age);
        System.out.println("Gender :"+this.Gender);
        System.out.println("TeacherId :"+TeacherId);
        System.out.println("Department : "+Department);
        System.out.println("SpecializeSubject :"+SpecializeSubject);
        
        
    }
    
}
public class Main
{
	public static void main(String[] args) {
		student S1=new student("ketan",21,"Male",115,"Computer Engineering","BEA");
		S1.introduce();
		Teacher T1=new Teacher("Amit",40,"Male",8,"Computer Engineering","Physics");
		T1.introduce();
	}
}
