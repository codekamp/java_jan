package codekamp;

public class Demo {

    public static int balance = 0;

    public static void main(String[] args) {
        Demo.add(10, 20);


        // Transaction module
        try {
            Demo.sendSms("998877$6655", "Your OTP is 1122");
            System.out.println("SMS sending try was successful");
        } catch (NumberNotValidException a) {
            System.out.println("Reason is " + a.reason);
            System.out.println("SHow user message to visit nearest branch");
        } catch (BalanceKhatamException b) {
            System.out.println("show IVRS");
        }

        System.out.println("Code after try catch");


        // Marketing Module
        try {
            Demo.sendSms("9988776655", "Loan lelo Loan");
            System.out.println("SMS sending try was successful");
        } catch (Exception a) {
            System.out.println("Send email");
        } finally {

        }


            Demo.sendSms("9988776655", "sdfsdfsdf");
    }

    public static void sendSms(String number, String message) throws NumberNotValidException, BalanceKhatamException {
        // code to check if number is valid
        if(number.length() < 10) {
            throw new NumberNotValidException("Too Short");
        }

        if(number.contains("$")) {
            throw new NumberNotValidException("Has special");
        }

        // code to check balance
        if(Demo.balance <= 0 ) {
            throw new BalanceKhatamException();
        }


        //code to actually send SMS
        System.out.println("Sending SMS");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}