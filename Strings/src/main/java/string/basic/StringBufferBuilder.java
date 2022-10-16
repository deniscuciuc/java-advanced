package string.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBufferBuilder {
	public static void main(String[] args) {
		String str = "Java";
		
		StringBuffer strBuffer = new StringBuffer(str);
		System.out.println("Емкость: " + strBuffer.capacity());
		
		strBuffer.ensureCapacity(32);
		System.out.println("Емкость теперь: " + strBuffer.capacity());
		
		
		
		System.out.println("Длина строки: " + strBuffer.length());
		
		System.out.println("Вытаскиваем строку: " + strBuffer.toString());
		
		char c = strBuffer.charAt(0);
		System.out.println(c);
		
		
		strBuffer.setCharAt(0, 'Y');
		System.out.println(strBuffer.toString());
		
		strBuffer.append(" is good");
		System.out.println(strBuffer.toString());
		
		strBuffer.reverse();
		System.out.println(strBuffer.toString());
		
		String input = "Hello";
		
		Pattern pattern = Pattern.compile(input);
		Matcher matcher = pattern.matcher(input);
		
		boolean found = matcher.matches();
		
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}

}
