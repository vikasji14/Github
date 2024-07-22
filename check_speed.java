public class check_speed {
    public static void main(String[] args) {
        int arr[] = { 10, 1, 30, 40, 5, 60, 70, 80, 3, 5 };
        int pos = 4;
        int count = 0;
        for(int i=0; i<pos; i++){
            if(arr[i] > arr[pos]) count++;
        }
        for(int i=pos+1; i<arr.length; i++){
            if(arr[pos] >arr[i]) count++;
        }

        System.out.println(count);


    }
}