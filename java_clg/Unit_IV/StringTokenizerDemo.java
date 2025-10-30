import java.util.*;

class StringTokenizerDemo
{
	public static void main(String arg[])
	{
		String str = "Bahubali@directed, Raja@mouliwhichcollected 1800@cr:ores in the ye@r 2015";
		StringTokenizer st = new StringTokenizer(str, "'@', ',', ':'");
		System.out.println("No. of Tokens: " +st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}