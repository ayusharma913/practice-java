import java.util.*;
/* public class array {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("array length : " + marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy:" +marks[0]);
        System.out.println("chem:" +marks[1]);
        System.out.println("maths:" +marks[2]);
        sc.close();
    }
} */

//arrays are called by refrence 
// public class array {
//     public static void update(int marks[]) {
//         for(int i = 0 ; i < marks.length ; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = {98 , 95, 93};
//         update(marks); // here the update function is called 

//         //to print our marks
//         for(int i = 0; i<marks.length ; i++){
//                   // this for is to print the marks as update function is not used for print purpose
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }

 // to find largest number in an array
 // it has time complexity of big oh n

//  public class array {
//     public static int largestNum(int n[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i =0; i<n.length; i++){
//             if(largest<n[i]){
//                 largest = n[i];
//             }
//             if(smallest>n[i]){
//                 smallest = n[i];
//             }
//         }
//         System.out.println("smallest value is:" +smallest);
//         return largest;
//     }    

//     public static void main(String[] args) {
//        int n[] = {1,3,5,8,6,4};
//        System.out.println("largest value is:" +largestNum(n)); 
//     }
//  }

//reverse an array and it has time complexity of bigoh of n
// it has space complexity of constant i.e. 1

// public class array {
//     public static void reverseArray(int n[]) {
//         int first = 0;
//         int last = n.length-1;

//         while(first<last){
//             //swap
//             int temp = n[last];
//             n[last]=n[first];
//             n[first] = temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//         int n[] = {2,4,6,8,10};
//         reverseArray(n);
//         for(int i =0; i<n.length; i++){
//              System.out.print(n[i] + " ");
//         }
//         System.out.println();
 
//     }
// }


//all possible pairs in array
// it  has time complexity of bigoh of n^2

// public class array {
//     public static void pairs(int n[]){
//         int tp=0;
//         for(int i = 0; i<n.length; i++){
//             int cur = n[i];
//             for(int j = i+1; j<n.length; j++){
//                 System.out.print("(" + cur + "," +n[j] +")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.print("total pairs :" +tp);
//     }
//     public static void main(String[] args) {
//         int n[] = {1,3,5,7,9,11};
//         pairs(n);
//     }    
// }

//print subarrays : subarrays is a continuous part of array


// public class array {
//     public static void subArrays(int n[]) {
//         int ts =0;
//         for(int i = 0; i<n.length; i++){
//             int start = i;
//             for(int j = 0; j<n.length; j++){
//                 int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(n[k]+ " ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarrays:" +ts );
//     }
//      public static void main(String[] args) {
//         int n[] = {2,4,6,8,10};
//         subArrays(n);

//      }
//  }

//to print maximum and current sum of subarrays

public class array {
        public static void subArraysum(int n[]) {
            int curSum = 0;
            int maxSum = Integer.MIN_VALUE;

            for(int i = 0; i<n.length; i++){
                int start = i;
                for(int j = 0; j<n.length; j++){
                    int end = j;
                    curSum = 0;
                    for(int k=start; k<=end; k++){
                        //subarray sum
                        curSum += n[k];
                    }
                    System.out.println(curSum);
                    if(maxSum < curSum){
                        maxSum = curSum;
                    }
                }
            }
            System.out.println("max sum:" +maxSum);
        }
         public static void main(String[] args) {
            int n[] = {2,4,6,8,10};
            subArraysum(n);
    
         }
     }