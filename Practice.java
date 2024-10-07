import java.util.*;
// tax calculator with input from user
public class Practice {
    /* public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = (int)(income*0.0);
        }
        else if(income>= 500000 && income <= 1000000){
            tax = (int)(income*0.5);
        }
        else{
            tax = (int)(income*0.7);
        }
        System.out.println("your tax is : " + tax);
        sc.close();
    }  */
    
     /*
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks out of 100 : ");
        int marks = sc.nextInt();
        String result = (marks >=33) ? "you have passed" : "you have failed";
        System.out.println(result);
        sc.close();
    } */

     /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value a : ");
        int a = sc.nextInt();
        System.out.println("Enter second value b :");
        int b = sc.nextInt();
        System.out.println("Enter the operator :");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break;
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default : System.out.println("Enter valid operator");
                }
                sc.close();
    } */

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if((year % 100 == 0)  || (year % 100 != 0)){
                if(year % 400 == 0){
                    System.out.println("It is leap year : ");
                }
            }
        }
        else{
            System.out.println("It is not a leap year");
        }
        sc.close();
    } */

    //check if no is prime or not
    /* public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n = sc.nextInt();
         boolean isPrime = true;
         for(int i = 2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
         }

         if(isPrime == true){
            System.out.println("n is prime");
         }
         else{
            System.out.println("n is not prime");
         }
         sc.close();
    } */

    // read integers and give sum of even n odd integers specifically

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            System.out.println("Enter the number :");
            int n = sc.nextInt();

            if (n %2 ==0){
                evenSum += n;
            }
            else{
                oddSum += n;
            }
            System.out.println("Do you want to contiue? press 1 for yes and for no 0");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("sum of even numbers is:" +evenSum);
        System.out.println("sum of odd numbers is :" +oddSum);
        sc.close();
    }
}
 