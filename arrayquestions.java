// to pass true if any duplicate value in array or else pass false

// public class arrayquestions {
//     public static boolean temp(int n[]){
//         for(int i =0; i<n.length-1; i++){
//             for(int j = i+1; j <n.length; j++){
//             if(n[i] == n[j]){
//                 return  true;
//             }
//         }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int n[] = {1,3,5,5,7};
//     System.out.println(temp(n));
//     }
// }


// to pass the index of and rotated sorted array by a pivot index at which an element is present


// public class arrayquestions {
//     public static int temp(int n[] , int target){
//         int left = 0;
//         int right = n.length-1;

//         // to find the pivot index from where it rotated
//         // to find mid of the array
//         while(left<=right){
//             int mid = (left+ right)/2;
//             if(n[mid] == target){
//                 return mid;
//             }

//         //to check if target lies in right or left side of the mid

//         //if the left part is sorted
//         if(n[left]<=n[mid]){
            
//             if(target >= n[left] && target <= n[mid]){
//                 right = mid - 1;
//             }
//             else{
//                 left = mid + 1;
//             }
//         }
//         //if the right part is sorted
//         else{
//             if(target >= n[mid] && target <= n[right]){
//                 left = mid + 1;
//             }
//             else{
//                 right = mid -1;
//             }
//         }
//        }
//        return -1;

//     }
//     public static void main(String[] args) {
//         int n[] = {4,5,6,7,0,1,2};
//         int target = 0;
//         System.out.println(temp(n, target));
//     }
// }

// to make maximum profit out of prices of stocks on every day


// public class arrayquestions {
//     public static int stocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i<prices.length; i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice ;
//                 maxProfit = Math.max(maxProfit, profit);

//             }

//             else{
//                 buyPrice = prices[i];
//             }
//         }

//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int prices[] = {5,1,2,3,7,4};
//         System.out.println("maximum profit will be:" +stocks(prices));
//     }    
// }

//