import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int counter=0;
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(numbers));
        for(int i = 0;i<numbers.length-1;i++){
            counter++;
            for(int j=0; j < numbers.length-1;j++) {
                counter++;
                if (numbers[j] > numbers[j+1]) {
                    counter++;
                    int greater = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = greater;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(counter);
    }
}
