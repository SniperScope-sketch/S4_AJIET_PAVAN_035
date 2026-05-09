import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        int N=10,K=5,Balance,Sold;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of candy sold: ");
Sold = sc.nextInt();
Balance = N-Sold;
        if(Balance<=K){
            Balance=N;
            System.out.println("Refilling the jar");
            System.out.println("Number of candy sold: " + Sold);
            System.out.println("Remaining candy: " + Balance);
        }
        else if (Balance>K){
            System.out.println("Not refilling the jar");
            System.out.println("Number of candy sold: " + Sold);
            System.out.println("Remaining candy: " + Balance);
        }
}
}
