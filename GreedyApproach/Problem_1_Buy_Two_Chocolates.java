import java.util.*;
class Solution {
    public int Problem_1_Buy_Two_Chocolates(int[] arr, int money) {
        Arrays.sort(arr);
        if(Math.abs(arr[0] + arr[1]) <= money){
            return money - Math.abs(arr[0] + arr[1]);
        }
        return money;
    }
}