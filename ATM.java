import java.util.Scanner;

//create ATMExample class to implement the ATM functionality  
public class ATM {
    // main method starts
    public static void main(String args[]) {
        // declare and initialize balance, withdraw, and deposit
        int count = 0;
        UserPrompt prompt = new UserPrompt();
        do {
            System.out.println("Enter your pin number: ");
            Scanner sc = new Scanner(System.in);
            int pinCode = sc.nextInt();
            if (pinCode == 3489) {
                prompt.askUserToEnterInfo();
            } else {
                count++;
            }

        } while (count < 3);
        System.out.println("Error!, Your card has been seized");

        // create scanner class object to get choice of user

    }
}