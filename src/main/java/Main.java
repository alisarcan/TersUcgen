import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        for (int i = n ; i >= 1; i--){
            for (int k = (n-i); k >= 1;k--){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    }

