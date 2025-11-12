import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to factorial");
        Scanner input=new Scanner(System.in);
        fac oop=new fac();
        int p=input.nextInt();
        int f=oop.fact(p);
        System.out.printf("%d", f);

    }
    
}


