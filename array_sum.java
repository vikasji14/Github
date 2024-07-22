import java.util.*;

public class array_sum {
    static int sum(int arr[]){
        int ans=0;
        for (int i=0; i<arr.length; i++) {
            ans+=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,5,6,7,86,54,4,3,32,4,5,46,4};
        System.out.println("sorting array");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Sum: " + sum(arr));

    }
}
