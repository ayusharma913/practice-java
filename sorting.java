//bubble sorting method 
// as loop here runs n*n times its complexity is o(n^2)

// public class sorting {
//     public static void bubbleSort(int n[]){

//         //for the turns i.e. outer loop
//         for(int turn = 0; turn < n.length-1; turn++){
//             for(int j = 0; j< n.length - 1 - turn; j++){
//                 if(n[j] > n[j+1]){

//                     // now we swap
//                     int temp = n[j];
//                     n[j] = n[j+1];
//                     n[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int n[]){
//         for(int i = 0; i< n.length; i++){
//             System.out.print(n[i]+ " ");

//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int n[] = {5,4,3,2,1};
//         bubbleSort(n);
//         printArr(n);
//     }
// }


//selection sorting method
//o(n^2)

// public class sorting {

//     public static void selectionSort(int n[]){

//         //for outer loop

//         for(int i = 0; i<n.length-1; i++){
//             int minPos = i;

//             //for inner loop

//             for(int j = i+1; j<n.length; j++){
//                 if( n[minPos] > n[j]){
//                     minPos = j;
//                 }
//             }
//              // swap
//              int temp = n[minPos];
//              n[minPos] = n[i];
//              n[i] = temp;
//         }
//     }

//     public static void printArr(int n[]){
//                 for(int i = 0; i< n.length; i++){
//                     System.out.print(n[i]+ " ");
        
//                 }
//                 System.out.println();
//             }
        
//         public static void main(String[] args) {
//         int n[] = {5,4,1,3,2};
//         selectionSort(n);
//         printArr(n);

//     }    
// }

//insertion sort
//o(n^2)

// public class sorting {
//     public static void insertionSort(int n[]){
//         for(int i = 1; i<n.length; i++){
//             int curr =n[i];
//             int prev = i-1;

//             // finidng out the correct pos to insert
//             // now from here we push the larger elements back 
//             while(prev>=0 && n[prev] > curr){
//                 n[prev + 1] = n[prev];
//                 prev--;
//             }
//             // insertion is done now
//             n[prev + 1] = curr;  
//         }
//     }

//     public static void printArr(int n[]){
//                         for(int i = 0; i< n.length; i++){
//                             System.out.print(n[i]+ " ");
                
//                         }
//                         System.out.println();
//                     }
               
//     public static void main(String[] args) {
//         int n[] = {5,4,1,3,2};
//         insertionSort(n);
//         printArr(n);
//     }
// }

//inbuilt java sort

// import java.util.Arrays;
// public class sorting {

//     public static void printArr(int n[]){
//                         for(int i = 0; i< n.length; i++){
//                             System.out.print(n[i]+ " ");
                
//                         }
//                         System.out.println();
//                     }
               
//     public static void main(String[] args) {
//         int n[] = {5,4,1,3,2};
//         Arrays.sort(n , 0,4) ;
//         printArr(n);
//     }
// }

//counting sort


public class sorting {
    public static void countingSort(int n[]) {
        int largest = Integer.MIN_VALUE;

        for(int i =0; i<n.length; i++){
            largest = Math.max(largest, n[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i<n.length; i++){
            count[n[i]]++;
        }

        //sorting
        int j =0;
        for(int i = 0; i<count.length; i++){
            while (count[i] > 0) {
                n[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int n[]){
                                for(int i = 0; i< n.length; i++){
                                    System.out.print(n[i]+ " ");
                        
                                }
                                System.out.println();
                            }
    public static void main(String[] args) {
        int n[] = { 1,4,1,3,2,4,3,7};
        countingSort(n);
        printArr(n);
    }    
}