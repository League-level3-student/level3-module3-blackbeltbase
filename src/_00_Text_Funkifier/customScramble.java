package _00_Text_Funkifier;


public class customScramble extends SpecialString{

	public customScramble(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String funkifyText(String s) {
		String scrambled = "";
		for(int i =0; i<s.length();i++) {
			String character = ""+ s.charAt(i);
			scrambled += character.toUpperCase();
		}
		return scrambled;
	}
}
