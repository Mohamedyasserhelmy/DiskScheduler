import java.util.ArrayList;

public class cscan {

	private  ArrayList<Integer>sectors=new ArrayList<Integer>();
	private  ArrayList<Integer>result=new ArrayList<Integer>();
	
	public void calculate(ArrayList<Integer>l,int start,int end,int currentposition,int up)
	{
		int movements=0;
		int cp=currentposition;
		
		for(int i=0;i<l.size();i++)
		{
			sectors.add(l.get(i));
		}
		sectors.add(start);
		sectors.add(end);
	    sectors.add(currentposition);
		sectors.sort(null);
		
		if(up==1)
		{
			int current_index=0,m=0,after_index=0;
			
			for(int i=0;i<sectors.size();i++)
			{
				if(sectors.get(i)==cp)
				{
					current_index=i;
				}
			}
			after_index=current_index;
			int pointer=cp;
			after_index++;
			while(pointer!=end)
			{
				result.add(pointer);
				pointer=sectors.get(after_index++);
				movements+=Math.abs(pointer-cp);
				cp=pointer;
			}
			result.add(pointer);
			movements+=Math.abs(pointer-cp);
			cp=start;
			after_index=start+1;
			while(cp!=currentposition)
			{
				result.add(cp);
				pointer=sectors.get(after_index++);
				m=Math.abs(pointer-cp);
				movements+=m;
				cp=pointer;
			}
			movements-=m;
			System.out.println("movements are :");
			for(int j=0;j<result.size();j++)
			{
			System.out.println(result.get(j));
			}
		    System.out.println("total number of movements = "+movements);
		}
		else if(up==0)
		{
            int current_index=0,m=0,before_index=0;
			
			for(int i=0;i<sectors.size();i++)
			{
				if(sectors.get(i)==cp)
				{
					current_index=i;
				}
			}
			
			before_index=current_index;
			current_index--;
			while(cp!=start)
			{
				result.add(cp);
				int pointer=sectors.get(current_index--);
				movements+=Math.abs(cp-pointer);
				cp=pointer;
			}
			result.add(start);
			cp=end;
			before_index=sectors.size()-1;
			before_index--;
			while(cp!=currentposition)
			{
				result.add(cp);
				int pointer=sectors.get(before_index--);
				m=Math.abs(cp-pointer);
				movements+=m;
				cp=pointer;
			}
			movements-=m;
			System.out.println("movements are :");
			for(int j=0;j<result.size();j++)
			{
			System.out.println(result.get(j));
			}
		    System.out.println("total number of movements = "+movements);
		}
		else
		{
			System.out.println("invalid up or down");
		}

	}
}
