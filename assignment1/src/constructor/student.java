package constructor;

public class student {
	String name;
    int age;
    char section;
    char gender;
    int subject1;
    int subject2;
    int subject3;
    
    student(String n, int a, char s, char g, int s1, int s2, int s3){
        name = n;
        age = a;
        section = s;
        gender = g;
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    public int marks(){
        return subject1+subject2+subject3;
    }
    public float percentage(){
        return (marks()*100)/300;
    }
    public static void main(String[] args) {
        student s1 = new student("Yugal", 24, 'A','M', 77,79,89);
        student s2 = new student("Nikhil", 29, 'B','M', 0,56,65);
        student s3 = new student("Shrey", 21, 'A','M', 0,89,66);
        student s4 = new student("Gayu", 24, 'B','F', 79,98,87);
        
        System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
        System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
        System.out.println("Marks of student s3 "+ s3.marks() + " Percentage of student s3 " + s3.percentage());
        System.out.println("Marks of student s4 "+ s4.marks() + " Percentage of student s4 " + s4.percentage());
        
}
}