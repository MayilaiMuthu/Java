package optionalpack;

import java.util.Optional;

public class OptionalKeyTest {
	
	public static void main(String[] args) {
		
		String s[]=new String[2];
		
		s[0]="MUTHU";
		
		if(s[1]==null) { System.out.println("It is Null Value s[1]"); }else { System.out.println(s[1].toLowerCase()); }
		
		if(s[0]==null) { System.out.println("It is Null Value s[0]"); }else { System.out.println(s[0].toLowerCase()); }
		
		String res=Optional.ofNullable(s[1]).orElse("It is Null Value s[1]"); System.out.println(res.toUpperCase());
		
		String res1=Optional.ofNullable(s[0]).orElse("It is Null Value s[0]"); System.out.println(res1.toLowerCase());
		
	}

}
