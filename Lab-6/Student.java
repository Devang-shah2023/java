import java.util.Scanner;

public class Student {

    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(Scanner scanner2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID number: ");
        this.id_no = scanner.nextInt();

        System.out.println("Enter number of subjects registered: ");
        this.no_of_subjects_registered = scanner.nextInt();

        this.subject_code = new int[no_of_subjects_registered];
        this.subject_credits = new int[no_of_subjects_registered];
        this.grade_obtained = new String[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.print("Enter details for subject:\n"+i);
            System.out.print("Subject code: ");
            this.subject_code[i] = scanner.nextInt();

            System.out.print("Subject credits: ");
            this.subject_credits[i] = scanner.nextInt();

            System.out.print("Grade obtained (e.g., A, B, C): ");
            this.grade_obtained[i] = scanner.next();
        }
    }

    public void calculate_spi() {
        int points = 0;
        int credits = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            double gradeValue = getGradeValue(grade_obtained[i]);
            points += gradeValue * subject_credits[i];
            credits += subject_credits[i];
        }

        this.spi = points / credits;
    }
    public double getGradeValue(String grade) {
        switch (grade.charAt(0)) {
            case'O':
              return 10.0;
            // case'A+':
            //   return 9.5;
            case 'A':
                return 9.0;
            case 'B':
                return 8.0;
            case 'C':
                return 7.0;
            case 'D':
                return 6.0;
            case 'E':
                return 5.0;
            case 'F':
                return 0.0;
        }
        return id_no;
    }

    
    public void display() {
        System.out.println("\nStudent details:");
        System.out.println("ID number: " + id_no);
        System.out.print("Number of subjects registered: " + no_of_subjects_registered);

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("Subject"+ i + 1);
            System.out.println("Subject code: " + subject_code[i]);
            System.out.println("Subject credits: " + subject_credits[i]);
            System.out.println("Grade obtained: " + grade_obtained[i]);
        }

        calculate_spi(); 
        System.out.print("Semester Performance Index (SPI):"+spi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student(scanner);
            students[i].display();
        }
    }
}
