package ZeroJudge;
import java.util.*;
public class �����R�Ƽ�A215 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int sum=0;
			int total=0;
			while(total<=m) {
				sum++;
				total+=n;
				n++;
			}
			if(sum==0)
			System.out.println(1);
			else
			System.out.println(sum);
		
		}
	}
}
