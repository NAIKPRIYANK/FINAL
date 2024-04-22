
import java.util.*;
public class tring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of nodes:");
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			System.out.print(" "+ i);
		}
		System.out.print(" "+0);
		System.out.println(" ");
		try {
			while(true) {
		
				System.out.println("Enter Sender:");
				int s= sc.nextInt();
				System.out.println("Enter Receiver:");
				int r= sc.nextInt();
				System.out.println("Enter data");
				String data=sc.next();
				
				System.out.println("Token Passing:-");
				for(int i=0;i<s;i++) {
					System.out.print(" "+ i + "->");
				}
				System.out.print(" "+s);
				System.out.println(" ");
				System.out.println("Sender "+s+" sending data:"+data);
				
				for(int i=(s+1)%n;i !=r;i = (i+1)%n) {
					System.out.println("Data: "+data+" received by:"+i);	
				}
				System.out.println("Receiver:"+r+" received data:"+data);
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	}