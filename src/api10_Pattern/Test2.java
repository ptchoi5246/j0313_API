package api10_Pattern;

import java.util.regex.Pattern;

//영문자와 숫자 포함 유무 ^[\\w]*$ ,^[\\W]*$ 
public class Test2 {
	public static void main(String[] args) {
		
		//정규식
		String regEx1 = "^[\\w]*$"; //영문 대소문자, 숫자 
		
		String str1 = "hello"; 			//영문자로 구성
		String str2 = "hello1234";	//영문자와 숫자로 구성
		String str3 = "hello12!!"; 	//영문자와 숫자, 기호로 구성
		String str4 = "hello    "; 	//영문자와 공백로 구성
		String str5 = "안녕"; 				//한글로 구성
		
		if(Pattern.matches(regEx1, str1)) System.out.println("1. 영문자와 숫자로 구성되어 있습니다.");
		else System.out.println("1. 영문자와 숫자가 아닌 문자가 포함되어 있습니다.");
				
		System.out.println("2: " + Pattern.matches(regEx1, str2));
		System.out.println("3: " + Pattern.matches(regEx1, str3));
		System.out.println("4: " + Pattern.matches(regEx1, str4));
		System.out.println("5: " + Pattern.matches(regEx1, str5));
		System.out.println();

		
		String regEx2 = "^[\\W]*$"; //헷갈림.....
		if(Pattern.matches(regEx2, str2)) System.out.println("11. 영문자와 숫자가 아닌 문자만 포함되어 있습니다.");
		else System.out.println("11. 영문자와 숫자로 구성되어 있습니다.");
		System.out.println("12: " + Pattern.matches(regEx2, str2));
		System.out.println("13: " + Pattern.matches(regEx2, str3));
		System.out.println("14: " + Pattern.matches(regEx2, str4));
		System.out.println("15: " + Pattern.matches(regEx2, str5));
		System.out.println();
			
	}
}
