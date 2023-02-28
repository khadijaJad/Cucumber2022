import java.util.Arrays;
import java.util.Scanner;

public class ZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("How many numbers you want to enter?");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid positive integer number!");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("Enter " + n + " integers:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid integer!");
                sc.next(); // this is important!
            }
            array[i] = sc.nextInt();
        }

        zerosToEnd(array);
        System.out.println(Arrays.toString(array));

    }
    public static int[] zerosToEnd(int[] arr){
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<len){
            arr[count++]=0;
        }
        return arr;
    }
}
