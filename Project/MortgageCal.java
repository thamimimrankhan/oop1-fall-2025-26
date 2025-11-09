import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class MortgageCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MORTGAGE CALCULATOR ==="); 
        double salary = 0;
        while (true) {
            System.out.print("Enter your Salary: ");
            if (sc.hasNextInt()) {
                salary = sc.nextInt();

                if (salary > 0) {
                break;
                }else{ System.out.println("Salary must be positive.");
                }

            } else {
                System.out.println("Invalid Data");
                sc.next();
            }
        }
        double annualSalary = salary * 12;
        boolean isCriminal = false;
        while (true) {
            System.out.print("Do You Have Any Criminal Record(eg:true/false): ");
            if (sc.hasNextBoolean()) {
                isCriminal = sc.nextBoolean();
                break;
            } else {
                System.out.println("Invalid Data Type");
                sc.next();
            }
        }

 
        int creditScore = 0;
        while (true) {
            System.out.print("Enter Your Credit Score (0 - 500): ");
            if (sc.hasNextInt()) {
                creditScore = sc.nextInt();

                if (creditScore >= 0 && creditScore <= 500) {  
                   break;
                }
                else { System.out.println("Credit score must be between 0 and 500.");}
            } else {
                System.out.println("Invalid Data ");
                sc.next();
            }
        }

   
        int T = 0;
        while (true) {
            System.out.print("Enter loan amount (principal in BDT): ");
            if (sc.hasNextInt()) {
                T = sc.nextInt();
                if (T > 0) {
                 break;
                }
                else {System.out.println("Loan amount must be positive.");}
            } else {
                System.out.println("Invalid Data Type");
                sc.next();
            }
        }


        
        if (T < (annualSalary * 2) && !isCriminal && creditScore > 300) {

            
            float Z = 0;
            while (true) {
                System.out.print("Enter annual interest (in %): ");
                if (sc.hasNextFloat()) {
                    Z = sc.nextFloat();

                    if (Z > 0){
                     break;
                    } 
                    else {System.out.println("Interest rate must be positive.");}
                } else {
                    System.out.println("Invalid Data Type");
                    sc.next();
                }
            }


            
            int N = 0;
            while (true) {
                System.out.print("Enter Loan Period in Years: ");
                if (sc.hasNextInt()) {
                    N = sc.nextInt();
                    if (N > 0) {
                      break;
                    }
                    else {System.out.println("Loan period must be positive.");}
                } else {
                    System.out.println("Invalid Data ");
                    sc.next();
                }
            }


            
            double z = (Z / 100) / 12; 
            int n = N * 12; 
            double M = T * (z * Math.pow(1 + z, n)) / (Math.pow(1 + z, n) - 1); 
            double totalPayment = M * n;
            double totalInterest = totalPayment - T;


            
            System.out.println("=== Mortgage Summary ===");
            Locale bdCurrency = Locale.of("en", "BD");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdCurrency);

            System.out.println("Loan Amount    : " + currencyFormatter.format(T));
            System.out.println("Monthly Payment: " + currencyFormatter.format(M));
            System.out.println("Total Payment  : " + currencyFormatter.format(totalPayment));
            System.out.println("Total Interest : " + currencyFormatter.format(totalInterest));

        } else if (creditScore <= 300) {
            System.out.println("Sorry! The minimum credit score for eligibility is 300.");
        } else if (T > annualSalary * 2) {
            System.out.println("Sorry! The maximum loan qualification is twice your gross annual salary.");
        } else if (isCriminal) {
            System.out.println("Sorry! You Are Not Eligeble For Loan.");
        }

        sc.close();
    }
}