abstract class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    abstract void displayDetails();
}
class Student extends Person{
    int rollNumber;
    Student(String name,int age,int rollNumber){
        super(name,age);
        this.rollNumber=rollNumber;
    }
    void displayDetails(){
        System.out.println("Student Details:\nName: "+name+"\nAge: "+age+"\nRoll Number: "+rollNumber);
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    void displayDetails(){
        System.out.println("Teacher Details:\nName: "+name+"\nAge: "+age+"\nSubject: "+subject);
    }
}
public class StudentInfoSystem{
    public static void main(String[] args){
        Student s=new Student("Alice",20,101);
        Teacher t=new Teacher("Mr. Smith",40,"Mathematics");
        s.displayDetails();
        t.displayDetails();
    }
}
