package ZeroJudge;

import java.util.Scanner;

public class 最大公因數A738 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int GCD=1;
			for(int i=2;i<=a;i++) {
				if(a%i==0&&b%i==0) {
					GCD=i;
				}
			}
			System.out.println(GCD);
		}
	}

}
