// public class sortingques {

//     public static void bubbleSort(int n[]){
         
//         //for outer loop
//         for(int turn = 0; turn<n.length-1; turn++){
//             for(int j = 0; j<n.length - 1 - turn; j++){
//                 if(n[j] > n[j+1]){

//                     int temp = n[j];
//                     n[j] = n[j+1];
//                     n[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void print(int n[]) {
//         for(int i = 0; i< n.length; i++){
//             System.out.print(n[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int n[] = {3,6,2,1,8,7,4,5,3,1};
//         bubbleSort(n);
//         print(n);
//     }
// }

// selection sort


public class sortingques {
    public static void sort(int n[]){
        for(int i = 0; i<n.length-1; i++){
            int minPos = i;

            for(int j = i + 1; j < n.length; j++ ){

                if(n[minPos] > n[j]){
                    minPos = j;
                }

                int temp = n[minPos];
                n[minPos] = n[i];
                n[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int n [] = {3,6,2,1,8,7,4,5,3,1};
    }
}
