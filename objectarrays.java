class Student{
    int roll;
    String name;
    int marks;
}
public class objectarrays {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Abhishekh";
        s1.marks = 80;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Bimal";
        s2.marks = 90;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Chitra";
        s3.marks = 89;

        Student[] students = new Student[3];
        students [0]=s1;
        students [1]=s2;
        students [2]=s3;

        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].roll+" "+students[i].name+" "+students[i].marks);
        }

    }
}
