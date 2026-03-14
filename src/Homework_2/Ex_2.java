package Homework_2;
import java.util.Scanner;
import java.util.Arrays;

public class Ex_2 {

    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]<key) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] array = {45, 12, 78, 3, 56, 90, 11, 34, 67, 2, 88, 25, 39, 100};

        Arrays.sort(array);

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = binarySearch(array, key);

        if(index!=-1){
            System.out.println("The number is on index - "+index);
        }
        else {
            System.out.println("The  number isn't in the array!");
        }

    }
}
