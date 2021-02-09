import java.util.Arrays;

// public class arrays {
//     public static void main(String[] args) {
//         int[] numbers = new int[5];
//         numbers[0] = 9;
//         numbers[1] = 6;
//         numbers[3] = 5;
//         System.out.println(Arrays.toString(numbers));
//     }
// }

public class arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 7, 4, 6, 0};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}