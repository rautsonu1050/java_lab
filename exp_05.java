class Payment {
    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs. " + amount);
    }

    void makePayment(double amount, String method) {
        System.out.println("Payment Amount: Rs. " + amount);
        System.out.println("Payment Method: " + method);
    }

    void makePayment(double amount, String method, String name) {
        System.out.println("Payment Amount: Rs. " + amount);
        System.out.println("Payment Method: " + method);
        System.out.println("Customer Name: " + name);
    }
}
class UPIPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment");
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Payment Successful");
    }
}

public class exp_5 {
    public static void main(String[] args) {
        Payment p = new Payment();

        System.out.println("=== Method Overloading ===");
        p.makePayment(500);
        System.out.println();

        p.makePayment(1000, "Credit Card");
        System.out.println();

        p.makePayment(1500, "Debit Card", "Rahul");
        System.out.println();

        System.out.println("=== Method Overriding ===");
        Payment upi = new UPIPayment();
        upi.makePayment(2000);
    }
}