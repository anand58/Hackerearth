import java.util.Arrays;
import java.util.List;

public class SumOf2NumsArray {
    public static void main(String args[]) {
        Integer[] arr = {3,4,5,6,-1,11};
        List<Integer> arrList = Arrays.asList(arr);
        int sum = 10;
        Integer[] sum1 = new Integer[2];

        for(int a: arr){
            if(arrList.contains((int)sum-a)){
                sum1[0] = a;
                sum1[1] = sum-a;
            }
        }
        System.out.println(Arrays.toString(sum1));
    }
}
