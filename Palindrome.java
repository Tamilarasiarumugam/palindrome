package assignments;

 
public class Palindrome {
	
	public static boolean palindrome(String str)
	{
		int l=0;
		int h=str.length()-1;
		
		str=str.toLowerCase();
		while(l<=h)
		{
			char getFirst=str.charAt(l);
			char getLast=str.charAt(h);
			
			if(! (getFirst>='a' && getLast<='z'))
				l++;
			else if(!(getLast>='a' && getLast<='z'))
			   h--;
			else if(getFirst==getLast)
			{
				l++;
				h--;
			}
			else
				return false;
		}
		return true;
	}
	


public static void main(String[] args)
{
	String str="malayalam mam malayalam";
	if(palindrome(str))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
