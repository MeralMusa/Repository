package day30_WrapperClass;

public class task97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(str));

	}
	
	public static String filterString(String s) {
		
		String str = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
				
				str = str + s.charAt(i);
			}
			
		}
		
		return str;
		
		
	
        }
	}


