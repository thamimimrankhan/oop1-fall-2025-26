import java.text.NumberFormat;
import java.util.Scanner;
 
public class MortgageCalculator{
 
    public static void main(String[] args) {
        System.out.println("===Bangladesh Mortgage Calculator(BDT)=== ");
         System.out.print("Enter Your Amount:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
     
         System.out.print("Enter Annual interest rate: ");
         float r= sc.nextFloat();
          System.out.print("Enter Loan Period: ");
          float n = sc.nextFloat();
double  M = (double) p* (r* Math.pow(1+r , n))/((Math.pow(1+r,n)-1));
double Monthly= M/(n*12);
double I= M-p;
 
       
          NumberFormat currencyFormatter =  NumberFormat.getCurrencyInstance();
           
          String formattedvalue= currencyFormatter.format(p);
          System.out.println("Loan Amount:"+formattedvalue);
           NumberFormat percenetFormatter= NumberFormat.getInstance();
          String percentValue= percenetFormatter.format(r);
          System.out.println("Monthly Payment:"+percentValue);
          String formatYearly= currencyFormatter.format(M);
          System.out.println("Total Payment:"+formatYearly);
          String formattedInterest= currencyFormatter.format(I);
         System.out.println("Total Interest:"+formattedInterest);
         
           
          };
    }