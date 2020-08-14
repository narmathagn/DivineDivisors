import java.util.*;
public class DivineDivisors{
	public static void main(String args[]){
		int n=36;
		double a=Math.sqrt(n);
		List<Integer> s=new ArrayList<Integer>();
		for(int i=1;i<=a;i++)
		{
			if(n%i==0)
			{
					s.add(i);
			}
		}
		int b=0;
		if(a-Math.floor(a)==0)
		{
			b=s.size()-2;
		}
		else
		{
			b=s.size()-1;
		}
		for(int i=b;i>=0;i--)
		{
			s.add(n/s.get(i));
		}
		Collections.sort(s);
		for(int i=0;i<s.size();i++)
		{
			System.out.print(s.get(i)+" ");
		}
	}
}