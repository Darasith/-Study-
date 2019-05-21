import java.util.Scanner;
public class Square {
    public static void main(String args[]) {
        int a, i, j;
        Scanner inp= new Scanner(System.in);
        a=inp.nextInt();
        for (i = 0; i < a; i++){
            for(j=0;j<a;j++){
                if(i==0||i==a-1||j==0||j==a-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
