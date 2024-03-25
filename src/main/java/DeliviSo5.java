import java.util.Scanner;
public class DeliviSo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		int i,n ;
		System.out.print("Do brojot: ");
		n = input.nextInt();
		for(i=1; i<=n; i++) {
			if (i % 5 == 0)
			{
			System.out.println(i);
			}	
		}
		
		
//		i=1;
//		while (i <= n)
//		{
//		
//		i = i+1;
//		}
	}

}
