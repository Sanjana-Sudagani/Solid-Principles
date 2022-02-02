public class HRPromotion {
    public static boolean promotionduethisyear(int yearsOfExperience ) {
        //calculate whether eligible for promotion or not
        if (yearsOfExperience > 5) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){

            System.out.println("Promotion: "+promotionduethisyear(6));

        }
}
