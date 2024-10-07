import java.util.Scanner; // jiss methid ko use  karna hai simply write it other than * //
public class Practice2 {
    // to print factorial of any number

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=n ; i++){
            fact *= i;
        }
        System.out.println("Factorial of that number is:" +fact);
        sc.close();
    } */

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        int n = sc.nextInt();
        for(int i = 1; i<=10 ; i++){
            System.out.println(n + " * " + i + " = " +n*i);
        }
        sc.close();
} */

// to write java method to compute avg of 3 numbers'=

// public static void average(int a, int b, int c) {
//     float avg = (a+b+c)/3;
//     System.out.print("the average is: " +avg);
// }

// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.print("enter first value:");
//     int a = sc.nextInt();
//     System.out.print("enter second value:");
//     int b = sc.nextInt();
//     System.out.print("enter third value:");
//     int c = sc.nextInt();
//     average(a, b, c);
//     sc.close();
// }
// }


//to check even or odd

// public static boolean isEven(int n) {
//     if(n%2==0){
//         return true;
//     }
//     else{
//         return false;
//     }
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.println(isEven(n));
//     sc.close();
// }
// }

// to check if no. is palindrome

// public static void isPal(int n) {
//     int oldNum = n;
//      int newNum = 0;
//      while(n>0){
//         int lastDigit = n % 10;
//         newNum = newNum*10 + lastDigit;
//         n = n/10;
//      } 
//      if(newNum == oldNum){
//         System.out.println("the input number is a palindrome");
//      }
//      else{
//         System.out.println("the number is not palindrome");
//      }
    
// }
// public static void main(String[] args) {
//     Scanner sc  = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.println(n);
//    isPal(n);
//     sc.close();
// }
// }


// to calculate sum of digits in an integer

public static void temp(double n) {
    int num = (int)n;
    int sum = 0;
    while(n>0){
        int lastDigit = (int)n%10;
        sum = sum + lastDigit;
        n = n/10;
    }
    System.out.println("the sum of digits of" +num + "=" +sum);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int n =sc.nextInt();
    temp(n);
}
}