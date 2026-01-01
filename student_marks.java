class Student {
    private int marks;   // data hidden

    // Setter
    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {   // validation
            marks = m;
        }
    }

    // Getter
    public int getMarks() {
        return marks;
    }
}

public class student_marks{
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setMarks(85);              // setting value
        System.out.println(s1.getMarks());  // getting value
    }
}
