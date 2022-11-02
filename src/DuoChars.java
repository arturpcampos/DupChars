
public class DuoChars {

	public static void main(String[] args) {
		
		String n = "Hello World";
		System.out.println(n);
		
		String characters = "";
		String duplicates = "";
		
		for(int i = 0; i < n.length(); i++) {
			String current = Character.toString(n.charAt(i));
			
			if(characters.contains(current)) {
				
				if(!duplicates.contains(current)) {
					duplicates += current + ",";
					
				}
				
			}
			characters += current;
		}
		System.out.println(duplicates);

	}

}
