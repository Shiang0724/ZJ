package ZeroJudge;

import java.util.Scanner;

public class ���Ȱ�A799 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			Long n=sc.nextLong();
			if(n<0) {
				System.out.println(-n);
			}else {
				System.out.println(n);
			}
		}
	}
}
