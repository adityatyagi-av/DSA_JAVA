public class CLASS_example {
    public static void main(String[] args) {
    Student vashu = new Student("vashu tyagi",02,"AKTU",3,'a',75.5f);
    Student aditya = new Student(vashu);
    Student tyagi =new Student();
        System.out.println(tyagi.name);
        System.out.println();
        int a =10;
        Character ab = 'a';


        final int ram =23;
        final A aadi =new A("aditya tyagi");
        System.out.println(aadi.name);
        aadi.name="23";
        System.out.println(aadi);
    }
}
class A {
    final int num =10;
    String name ;
    A(String name){
        this.name =name;
    }
}
class Student{
    String name;
    int roll_no;
    String university;
    int year;
    char section;
    float marks;


    Student (){
        this("aditya Tyagi",23,"Aktu",4,'a',65.6f);
    }
    Student (Student other){
        this.name=other.name;
        this.roll_no=other.roll_no;
        this.university=other.university;
        this.year=other.year;
        this.section=other.section;
        this.marks=other.marks;
    }
    Student (String name,int roll_no,String university,int year ,char section,float marks){
        this.name=name;
        this.roll_no=roll_no;
        this.university=university;
        this.year=year;
        this.section=section;
        this.marks=marks;
    }
}