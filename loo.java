
import java.util.Scanner;
public class loo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char sym=sc.next().charAt(0);
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(sym);
			}
			System.out.println();
			
		}
	}
}
