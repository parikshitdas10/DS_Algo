/**
 * revArr
 */
public class revArr {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int length = arr.length;
        int temp = 0;

        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }

        for (int j = 0; j < length; j++) {
            System.out.println(arr[j]);
        }
    }
}