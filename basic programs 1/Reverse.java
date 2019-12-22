class Reverse 
{
	public static void main(String[] args) 
	{
		String sentence = "java is an inevitable";
		String reverse =reverse(sentence);
		System.out.println("the reverse sentence is:" +reverse);


	}
	public static String reverse(String sentence)
	{
		if (sentence.isEmpty())
				return sentence;

		return reverse(sentence.substring(1)) + sentence.charAt(0);

			
		
	}
}
