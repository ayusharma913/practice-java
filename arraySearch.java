import java.util.*;
// linear search
// public class arraySearch {
//     public static int linearSearch(int n[] , int key) {
        
//         for(int i = 0; i<n.length;i++){
//             if(n[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int n[] = {2,4,6,8,10,12,16,20};
//         int key = 21;

//         int  index = linearSearch(n, key);
//         if(index == -1){
//             System.out.println("not found");
//         }
//         else{
//         System.out.println("key is at index " +index);
//         }
//     }
// }


// binary search
// itstime complexity is big oh of logn
public class arraySearch {
    public static int binarySearch(int n[], int key) {
        int  start = 0, end = n.length-1;

        while(start<=end){
            int  mid = (start+end)/2;

            if(n[mid]==key){
                return mid;
            }
            if(n[mid] < key){ // right wali condition
                start = mid+1;
            }
            else{ // left wali condition
                end = mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int n[] = {1,3,5,7,9,11,13};
        int key =10;

        System.out.println("index for key is:" +binarySearch(n, key));
        
    }
}