interface RestaurantInterface {

    public void acceptOnlineOrder();

    public void acceptTelephoneOrder();

    public void acceptWalkInCustomerOrder();

    public void payOnline();

    public void payInPerson();

}

class OnlineCustomerImpl implements RestaurantInterface {

    public void acceptOnlineOrder() {

        //logic for placing online order
    }

    public void acceptTelephoneOrder() {

        //Not Applicable for Online Order

        throw new UnsupportedOperationException();
    }

    public void payOnline() {

        //logic for paying online
    }

    public void acceptWalkInCustomerOrder() {

        //Not Applicable for Online Order

        throw new UnsupportedOperationException();
    }

    public void payInPerson() {

        //Not Applicable for Online Order

        throw new UnsupportedOperationException();
    }
}

public class interfacesegmentation1 {
    public static void main(String[] args){
        OnlineCustomerImpl ol= new OnlineCustomerImpl();
        ol.acceptWalkInCustomerOrder();
    }
}
