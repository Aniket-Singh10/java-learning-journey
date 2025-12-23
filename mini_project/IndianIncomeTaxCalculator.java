import java.util.Scanner;
public class IndianIncomeTaxCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your income in lakhs per annum(in Rs.)");
            float tax = 0;
            float income = sc.nextFloat();
            if(income<=4){
                tax = tax + 0;
            }
            else if(income>4 && income<=8){
                tax = tax + 0.05f * (income - 4f);
            }
            else if(income>8 && income<=12){
                tax = tax + 0.05f * (8.0f - 4.0f);
                tax = tax + 0.1f * (income - 8.0f);
            }
            else if(income>12 && income<=16){
                tax = tax + 0.05f * (8.0f - 4.0f);
                tax = tax + 0.1f * (12.0f - 8.0f);
                tax = tax + 0.15f * (income - 12.0f);
            }
            else if(income>16 && income<=20){
                tax = tax + 0.05f * (8.0f - 4.0f);
                tax = tax + 0.1f * (12.0f - 8.0f);
                tax = tax + 0.15f * (16.0f - 12.0f);
                tax = tax + 0.20f * (income - 16.0f);
            }
            else if(income>20 && income<=24){
                tax = tax + 0.05f * (8.0f - 4.0f);
                tax = tax + 0.1f * (12.0f - 8.0f);
                tax = tax + 0.15f * (16.0f - 12.0f);
                tax = tax + 0.20f * (20.0f - 16.0f);
                tax = tax + 0.25f * (income - 20.0f);
            }
            else if(income>24){
                tax = tax + 0.05f * (8.0f - 4.0f);
                tax = tax + 0.15f * (12.0f - 8.0f);
                tax = tax + 0.20f * (16.0f - 12.0f);
                tax = tax + 0.25f * (20.0f - 16.0f);
                tax = tax + 0.30f * (income - 24.0f);
            }
            System.out.println("The total tax paid by the employee is: Rs." + tax + "lakh");
        }
    }
}
