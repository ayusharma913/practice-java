import java.util.Scanner;
 // to check if no is prime or not using function calling

 // public class primenumber {
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for(int i = 2; i<=n-1;i++){
//             if(n%i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int n =sc.nextInt();
//         System.out.println(isPrime(n));
//         sc.close();
//     }
// }

// optimised way to check if number is prime or not
// using math class and its funtion sqrt

// public class primenumber {
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//                 for(int i = 2; i<=Math.sqrt(n);i++){
//                     if(n%i == 0){
//                         return false;
//                  }
//                 }
//                 return true;
//             }
//     public static void main(String[] args) {
//         System.out.print("Enter the number:");
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         System.out.println(isPrime(n));
//         sc.close();
//     }
// }

// to check the number of primes within a range

public class primenumber {
    public static boolean isPrime(int n){
                if(n==2){
                    return true;
                }
                        for(int i = 2; i<=Math.sqrt(n);i++){
                            if(n%i == 0){
                                return false;
                         }
                        }
                        return true;
                    }
    public static void primesInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(" " +i);
            }
        }
        System.out.println();
    }         
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        primesInRange(n);
        sc.close();
    }
}  