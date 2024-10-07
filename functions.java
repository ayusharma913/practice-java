import java.util.Scanner;
// here function calling is used in main method  via addition
/* 
public class functions {
    public static int calculate(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a =sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        System.out.println("the sum is :" +calculate(a, b));
        sc.close();
    }
}
 */

// finding product using fucntion calling

/*
public class functions{
public static int calculate(int num1,int num2){
    int product = num1*num2;
    return product;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = sc.nextInt();
    System.out.println("Enter the value of b:");
    int b = sc.nextInt();
    System.out.println("The product is:" +calculate(a,b));
    sc.close();
}
}
*/

//to find factorial via function calling

/*
public class functions {
    public static int temp(int n){
        int f =1;
        for(int i =1;i<=n;i++){
        f = f*i;
    }
        return f;
    }

    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(temp(n));
        sc.close();
    }
}
*/
 
//to find binomial coefficient

/*
public class functions {
    public static int temp(int n ){
        int f =1;
        for(int i =1;i<=n;i++){
        f = f*i;
    }
        return f;
    }
    public static int bincoeff(int n, int r){
        int fact_n = temp(n);
        int fact_r = temp(r);
        int fact_nmr = temp(n-r);
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        System.out.println("Enter value of r:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bincoeff(n,r));
        sc.close();
    }
}
*/