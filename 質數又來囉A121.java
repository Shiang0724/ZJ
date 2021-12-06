package ZeroJudge;

import java.util.Scanner;

public class 質數又來囉A121 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=0;
			int d=0;
			for(int i=a;i<=b;i++) {
				for(int j=2;j<=i;j++) {
					if(i==1) {
						continue;
					}else if(i%j==0) {
						c++;
					}
				}
				if(c==1) {
					d++;
				}
				c=0;
			}
			System.out.println(d);
		}
	}

}
