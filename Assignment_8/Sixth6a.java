package Lamda;


	import java.util.ArrayList;
	import java.util.Arrays;

  public class Sixth6a
	{
	public static void main(String[] args) 
			throws CloneNotSupportedException
	{
	ArrayList<String> alphabets =
	new ArrayList<>(Arrays.asList("bommu", "seshu", "spandana"));



	System.out.println(alphabets);



	alphabets.replaceAll( e -> e.toUpperCase() );



	System.out.println(alphabets);
	}

}


