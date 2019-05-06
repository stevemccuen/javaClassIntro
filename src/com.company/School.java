package src.com.company;

import java.util.List;

public class School<created> {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created
     *
     * @param teachers list of teachers in the school.
     * @param students list of students i the school.
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Adds total money earned by the school.
     *
     * money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * Update the money that is spent by the school which
     * is the salary given by the school to it's teachers.
     *
     * the money spent by the school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    /**
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     *
     * @param teacher the teacher to be added.
     */

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param student add student to the school.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @return the total money spent.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}
