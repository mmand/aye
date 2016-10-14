package provimeAsju;

public class KontrollSona {

	public static void main(String[] args) {
		String sona = TextIO.getlnString();
		char[] warray = sona.toCharArray();
		System.out.println(onPalindroom(warray));
	}
	
	public static boolean onPalindroom(char[] sona){
	    int i1 = 0;
	    int i2 = sona.length - 1;
	    while (i2 > i1) {
	        if (sona[i1] != sona[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
		
	}
