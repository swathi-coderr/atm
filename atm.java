import java.util.*;
public class atm
{
    public static void main(String args[])
    {
        int pin =1234;
        int balance=10000;
        int addamount=0;
        int takeamount=0;
        String name;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your Pin number");

        int password=scan.nextInt();
        if(password==pin)
        {
            System.out.println("Enter Your Name");
            name=scan.next();
            System.out.println("Welcome "+name);

            while(true)
            {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to add receipt");
                System.out.println("Press 5 to EXIT");

                int opt=scan.nextInt();
                switch(opt)
                {
                    case 1:
                    System.out.println("Your Balance is"+balance);
                    break;
                    case 2:
                    System.out.println("How much amount did you want to ADD to your account");
                    addamount=scan.nextInt();
                    System.out.println("Successfully Credited");
                    balance=addamount+balance;
                    break;
                    case 3:
                    System.out.println("How much amount did you want to take");
                    takeamount=scan.nextInt();
                    if(takeamount>balance)
                    {
                        System.out.println("Insufficient Balance");
                        System.out.println("Try less than your avalaible balance");
                    }
                    else
                    {
                        System.out.println("Successfully Taken");
                        balance=balance-takeamount;
                    }
                    break;
                    case 4:
                    
                        System.out.println("Welcome to Aall atm");
                        System.out.println("Available balance is"+balance);
                        System.out.println("Amount deposited"+addamount);
                        System.out.println("Amount taken"+takeamount);
                        System.out.println("Thank You");
                        
                    
                    break;
                    default:
                    System.out.println("Press the number Below 5");
                    break;
                }
                if(opt==5)
                {
                    System.out.println("Thank You");
                    break;
                }


            }
        }
        else
        {
            System.out.println("Wrong Pin Number");
        }
scan.close();
    }
}