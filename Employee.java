public class Employee {

    public static Double calculatePayForMonth(int dayspresent) {
        //calculate this month salary
        return dayspresent*1000.03;

    }

    public static boolean promotionduethisyear(int yearsOfExperience ) {
        //calculate whether eligible for promotion or not
        if(yearsOfExperience>5){
            return true;
        }
        else{
            return false;
        }

    }

    public void getEmployeeReport() {
        //logic to get employee report

    }

    public static void main(String[] args){
        System.out.println("Salary: "+calculatePayForMonth(20));
        System.out.println("Promotion: "+promotionduethisyear(4));

    }

}