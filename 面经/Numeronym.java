/**
 * FB-ft-04/2018
 * 双针模型
 */
public class Numeronym {

	public boolean isNumeronym(String s, String t) {
		int i = 0;
		int j = 0;
		while (i < s.length()) {
			int num = 0;
			while (i < s.length()-1 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num = num * 10 + s.charAt(i) - '0';
				i++;
			}
			j = j + num;
			if (j > t.length()-1 || s.charAt(i) != t.charAt(j))
				return false;
			else {
				i++;
				j++;
			}

		}
		return j == t.length();


	}

	public static void main(String[] args) {
		String s = "f6k3";
		String t = "facebook";
		Numeronym p = new Numeronym();
		System.out.println(p.isNumeronym(s,t));
	}


}
