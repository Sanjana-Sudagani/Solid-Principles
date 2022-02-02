interface OrderInterface{

    public void placeOrder();
}

interface PaymentInterface{

    public void payForOrder();
}

class OnlineCustomerImpln implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {

        // logic to place online order
    }

    @Override
    public void payForOrder() {

        // logic to do online payment
    }
}


class WalkInCustomerImpln implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {

        // logic to place in-person order
    }

    @Override
    public void payForOrder() {

        // logic to do in-person payment
    }
}


class TelephoneCustomerImpln implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {

        // logic to place telephonic order
    }

    @Override
    public void payForOrder() {

        // logic to do online payment
    }
}

public class interfacesegmentation2 {
    public static void main(String[] args){

    }
}
