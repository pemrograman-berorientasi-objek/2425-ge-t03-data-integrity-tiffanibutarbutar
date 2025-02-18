package academic.driver; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollments;

/**
 * @author 12S23001-Kevin Gultom
 * @author 12S23010-Tiffani Butar-butar
 */

public class Driver1 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Enrollments> enrollments = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            if (parts.length < 2) {
                continue;
            }

            String command = parts[0];

            switch (command) {
                case "course-add":
                    if (parts.length == 5) {
                        courses.add(new Course(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                    }
                    break;
                case "student-add":
                    if (parts.length == 5) {
                        students.add(new Student(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                    }
                    break;
                case "enrollment-add":
                    if (parts.length == 5) {
                        enrollments.add(new Enrollments(parts[1], parts[2], parts[3], parts[4], "None"));
                    }
                    break;
                default:
                    break;
            }
        }
        Collections.sort(courses, (course1, course2) -> course1.getCode().compareTo(course2.getCode()));
        // Menggunakan forEach untuk mencetak kursus setelah diurutkan
        courses.forEach(course -> System.out.println(course));

        for (Course course : courses) {
            System.out.println(course);
        }
        for (Student student : students) {
            System.out.println(student);
        }
        for (Enrollments enrollment : enrollments) {
            System.out.println(enrollment);
        }

        scanner.close();
    }
}
