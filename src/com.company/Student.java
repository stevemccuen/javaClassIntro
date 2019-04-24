package src.com.company;

public class Student {

    /**
     * This is responsible for keeping the
     * track of students id, name, grade and fees
     * paid.
     */
    private static int id;
    private static String name;
    private static int grade;
    private static int feesPaid;
    private static int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     *
     * @param id    id for the student: unique.
     * @param name  name of the student.
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's name, and student's id.

    /**
     * Keep adding the fees to feesPaid field.
     * feespaid = 10,000 + 5000 + 15000.
     * Add the fees to the fees paid
     * The school is going to receive the funds.
     *
     * @param fees the fees the student pays.
     */

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return id of student.
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Used to update the student's grade.
     *
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}
