package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixedCaps = "";
		for(int i =0; i<s.length();i++) {
			String character = ""+s.charAt(i);
			if(i%2==0) {
				mixedCaps+= character.toLowerCase();
			}
			else {
				mixedCaps+= character.toUpperCase();
			}
		}
		return mixedCaps;
	}

}
