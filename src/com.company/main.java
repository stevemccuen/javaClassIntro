package src.com.company;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 600);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 700);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(mellisa);
        teachersList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith Vasudev",12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(tamasha);
        studentsList.add(rakshith);
        studentsList.add(rabbi);

        School ghs = new School(teachersList, studentsList);
        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----Making GHS Pay Salary----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + "and now has $" + ghs.getTotalMoneyEarned());
    }
}
