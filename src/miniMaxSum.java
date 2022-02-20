import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class miniMaxSum {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127);

        miniMaxSum(a);

    }
    public static void miniMaxSum(List<Integer> arr) {
        long sum=0;
        long min= arr.get(0);
        long max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            sum+=arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i)<min){
                min=arr.get(i);
            }
            if(arr.get(i)>max){
                max = arr.get(i);
            }

        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
        System.out.print(sum-max + " ");
        System.out.print(sum-min);

    }
}
