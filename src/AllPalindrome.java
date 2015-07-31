import java.util.HashSet;
import java.util.Set;

public class AllPalindrome
{
	public static void findallPalindrome(String str)
	{   Set<String> palindromeArray = new HashSet<String>();
		for(int i=2;i<=str.length();i++)
		{
			for(int j=0;j<=str.length();j++)
			{
				int k=i+j-1;
				if(k>=str.length())
					continue;
				
				String s =str.substring(j,i+j);
				if(s.equals(new StringBuilder(s).reverse().toString()));
				palindromeArray.add(s);
				
			}
		}
		System.out.print(palindromeArray);
	}
	public static void main(String args[])
	{
		String str= "aba";
		findallPalindrome(str);
		
	}
}