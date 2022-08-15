package string.basic;

public class StringLearn {

	

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = "Java";
		String str3 = new String(new char[] {'h', 'i'});
		
		
		if (str1.isEmpty()) {
			System.out.println("String str1 is empty");
		}
		
		str3 = str3.concat(str2);
		
		
		System.out.println(str3);
		
		String str4 = String.join(" ", "hi", str2);
		
		System.out.println(str4);
		
		char c = str4.charAt(1);
		
		System.out.println(c);
		
		System.out.println("Index of 'h': " + str4.indexOf("h"));
		
		String test = "myfile.exe";
		
		boolean start = test.startsWith("myfile");
		boolean end = test.endsWith("exe");
		
		System.out.println(start + " " + end);
		
		String testChange = test.replace("myfile", "userdata");
		
		System.out.println(testChange);
		
		String text = "I like cheesee";
		
		String[] words = text.split(" ");
		
		for (String word : words) {
			System.out.println(word);
		}
		
		
		
	}
}
