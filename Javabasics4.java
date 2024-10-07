import java.util.*; 
// 1 to n numbers
/* public class Javabasics4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n ){
        System.out.print(counter + " ");
        counter++;
    }
    sc.close();
}
} */

/// sum of 1 to n numbers
/* public class Javabasics4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int number = 1;
        int sum = 0;
        int n = sc.nextInt();
        while(number <= n){
            sum += number; // sum = sum + number
            number++;
        }
        System.out.println(sum);
    }
} */

// print square pattern
/* public class Javabasics4 {
    public static void main(String[] args) {
       // for(int line = 1; line <=4; line++){
         //   System.out.println();
        //}

        int line = 1;
        while(line <= 4){
            System.out.println("****");
            line++;
        }
    }
} */

//print a number in reverse order
/**
 * Javabasics4
 */
 /* public class Javabasics4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value :");
        int n = sc.nextInt();
        while(n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit + "");
            n = n/10;
        }
        sc.close();
    } 
}*/

//break statement use

/**
 * Javabasics4
 */
public class Javabasics4 {
    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("enter your number : ");
        int n =sc.nextInt();

        if(n % 10 == 0){
            break;
        }
        System.out.println(n);
        }while(true);
        sc.close();
    } */

    //continue statement
    public static void main(String[] args) {
        System.out.print("enter the vlaue of n:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
                for(int i = 1; i<=n; i++){
            if(i % 10 == 0){
                continue; 
                // in this way we skipped 3
            }
            System.out.println(i);
        }
        sc.close();
    }
}