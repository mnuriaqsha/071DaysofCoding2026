import java.util.Scanner;

public class Day71 {
public static void main(String[] args) {
Scanner hi = new Scanner(System.in);

System.out.print("Masukkan tinggi segitiga siku-siku : ");  
    int n = hi.nextInt();  
      
    int i = 1;  
    while (i <= n) {  
        int j = i;  
        while (j <= n) {  
            System.out.print(" *");  
            j++;  
        }  
        System.out.println();  
        i++;  
    }  
}

}
