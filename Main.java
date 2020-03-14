import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true)
		{
		int nsectors;
		int n,check;
		int up,start,end,currentposition;
		Scanner input=new Scanner(System.in);
		System.out.println("enter (1) to scan , (2) to cscan or (0) to exit :");
		check=input.nextInt();
		
		ArrayList<Integer>sectors=new ArrayList<Integer>();
		
		if(check==1)
		{
		System.out.println("welcome to scan algorithm");
		System.out.println("enter number of sectors do you want :");
		nsectors=input.nextInt();
		for(int i=0;i<nsectors;i++)
		{
			System.out.println("enter number of sector number : "+(i+1));
			n=input.nextInt();
			sectors.add(n);
		}
		
		System.out.println("enter start of sectors :");
		start=input.nextInt();
		System.out.println("enter end of sectors :");
		end=input.nextInt();
		System.out.println("enter current position :");
		currentposition=input.nextInt();
		System.out.println("enter 1 to up or 0 to down :");
		up=input.nextInt();
		scan s=new scan();
		s.calculate(sectors,start,end,currentposition,up);
		}
		else if(check==2)
		{
			System.out.println("welcome to cscan algorithm");
			System.out.println("enter number of sectors do you want :");
			nsectors=input.nextInt();
			for(int i=0;i<nsectors;i++)
			{
				System.out.println("enter number of sector number : "+(i+1));
				n=input.nextInt();
				sectors.add(n);
			}
			
			System.out.println("enter start of sectors :");
			start=input.nextInt();
			System.out.println("enter end of sectors :");
			end=input.nextInt();
			System.out.println("enter current position :");
			currentposition=input.nextInt();
			System.out.println("enter 1 to up or 0 to down :");
			up=input.nextInt();
			cscan cs=new cscan();
			cs.calculate(sectors,start,end,currentposition,up);
		}
		else if(check==0)
		{
			System.out.println("exit");
			break;
		}
		else
		{
			System.out.println("invalid input");
		}
		}

	}

}
