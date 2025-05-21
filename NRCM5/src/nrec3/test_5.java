package nrec3;

public class test_5 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		if (str1.length() != str2.length()) {
			System.out.println("not anagrams");
			return;
		}
		int[] count = new int[26]; // for a-z
		
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i) - 'a']++;
			count[str2.charAt(i) - 'a']--;
		}
		
		boolean isAnagram = true;
		for (int i =0; i < 26; i++) {
			if (count[i] != 0) {
				break;
			}
		}
		
		if (isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
	}

}
