package ZeroJudge;
import java.util.*;
public class ¼Æ¦rÂ½ÂàA038 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	       while(sc.hasNext()){
	           int a=sc.nextInt();
	           while(a%10==0) {
	        	   a=a/10;
	           }
	           String b=Integer.toString(a);
	           char c[]=b.toCharArray();
	           for(int i=c.length-1;i>=0;i--) {
	        	   System.out.print(c[i]);
	           }
	       }
	}

}
