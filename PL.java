import java.util.*;
import java.io.*;
class PL
{
	public static void main(String args[])
	{
		try
		{
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String ST;
			System.out.println("Enter the String");
			ST=br.readLine();
			int i,j;	
			int ln=ST.length();
			char c;
			int count;
			HashMap<Character,Integer> hashMap = new HashMap<>();
			
			for(j=0;j<ln;j++)
			{
				count=0;
				c=ST.charAt(j);
				for(i=0;i<ln;i++)
				{
					if(ST.charAt(i)==c)
					{
						count++;
					}
				}
				hashMap.put(c,count);
			}
			for(Map.Entry<Character, Integer> entry : hashMap.entrySet())
			{
				System.out.println("Number of "+entry.getKey()+" is "+entry.getValue());
			}
			System.out.println();
			System.out.println("The Resultant string is ");
			for(i=0;i<ln;i++)
			{
				c=ST.charAt(i);
				if(i%2==0)
				{
					System.out.println(Character.toLowerCase(c));
				}
				else
				{
					System.out.println(Character.toUpperCase(c));
				}
			}
			
		}
		catch (Exception e) {}
	}
}