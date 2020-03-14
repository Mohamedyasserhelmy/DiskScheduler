import java.util.ArrayList;

public class scan {
	
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
			int current_index=0,m=0,before_index=0;
			
			for(int i=0;i<sectors.size();i++)
			{
				if(sectors.get(i)==cp)
				{
					current_index=i;
				}
			}
			before_index=current_index;
			result.add(cp);
			int pointer=cp;
			++current_index;
			while(cp!=end)
			{
				pointer=sectors.get(current_index++);
				result.add(pointer);
				movements+=Math.abs(pointer-cp);
				cp=pointer;
			}
			movements+=Math.abs(cp-pointer);
			before_index--;
			pointer=sectors.get(before_index--);
			while(pointer!=start)
			{ 
				result.add(pointer);
				m=Math.abs(cp-pointer);
				movements+=m;
				cp=pointer;
				pointer=sectors.get(before_index--);
			}
			System.out.println("movements are :");
			for(int j=0;j<result.size();j++)
			{
			System.out.println(result.get(j));
			}
		    System.out.println("total number of movements = "+movements);
		}
		else if(up==0)
		{
			int current_index=0,m=0;
			result.add(cp);
			int pointer=cp;
			
			for(int i=0;i<sectors.size();i++)
			{
				if(sectors.get(i)==cp)
				{
					current_index=i;
				}
			}
			
			int after_index=current_index;
			current_index--;
			while(pointer!=start)
			{
				pointer=sectors.get(current_index--);
				result.add(pointer);
				movements+=Math.abs(cp-pointer);
				cp=pointer;
			}
			movements+=Math.abs(cp-pointer);
		    cp=start;
		    pointer=sectors.get(++after_index);
		    movements+=Math.abs(cp-pointer);
		    cp=pointer;
		    while(cp!=end)
		    {
		    	pointer=sectors.get(after_index++);
		    	if(pointer!=end)
				{
		    	result.add(pointer);
				}
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
