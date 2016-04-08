
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		Driver.displayString(s);
		Driver.displayWithSpaces(s);
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static void displayInReverse(String s)
	{
		String Input = "Hello";
		StringBuilder input1 = new StringBuilder();
		input1.append(i);
		input1 = input1.reverse();
		for (int i=0;i<input1.length();i++);
		System.out.print(input1.charAt(i));
				
	}
}
