package src.com.company;

public class Teacher {
    /**
     * This class is responsible for keeping the track of teacher's
     * id, name, and salary.
     */

    public int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     *
     * @param id     id for the Teacher.
     * @param name   name of the Teacher.
     * @param salary salary of the Teacher.
     */

    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return id of the teacher.
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name of the teacher.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary.
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to the salary.
     * removes from total money earned by school.
     *
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
