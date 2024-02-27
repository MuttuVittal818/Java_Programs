package Revers_String_Progm;

// ReverseString using CharcterArray

public class charcterArray {
	
	public static void main(String[]args) {
	
	String stringinput = "hello word";
	
	char[] resultarray = stringinput.toCharArray();
	
	for(int i = resultarray.length -1; i >= 0; i--)
	
	System.out.print(resultarray[i]);
	}
}