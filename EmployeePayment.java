public class EmployeePayment {

    public static Double calculatePayForMonth(int dayspresent) {
        //calculate this month salary
        return dayspresent*1000.03;

    }
    public static void main(String[] args) {
        System.out.println("Salary: " + calculatePayForMonth(20));
    }

}