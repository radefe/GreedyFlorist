import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    }
    static int getMinimumCost(int k, int[] c){
        Arrays.sort(c);
        int[] arr = new int[c.length];
        int l=0;

        for(int i = c.length -1 ; i>=0; i--){
        arr[l] = c[i];
        l++;
        }

        int min=0;

       for (int i=0;i<arr.length;i++) {
          min+=(i/k + 1) * arr[i];
       }

        return min;
    }
}
