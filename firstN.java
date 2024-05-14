//displays the sum of natural number

import java.util.Scanner;

public class firstN {
    public static void printSum(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        printSum(n, 0);

    }
}
