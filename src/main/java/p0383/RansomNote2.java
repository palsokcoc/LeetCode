package p0383;

// 4 ms,	82.12%
// 46.4 MB,	51.68%
public class RansomNote2 {
	public boolean canConstruct(String ransomNote, String magazine) {
		// Array stores all the English letters and how many times they appear in the magazine
		int[] alphabet = new int[26];

		// Populate the array
		for(Character letter: magazine.toCharArray()) {
			alphabet[letter - 'a']++;
		}

		// For each letter in the ransom note, check if there is enough of that letter
		for(Character letter: ransomNote.toCharArray()) {
			if(alphabet[letter - 'a']-- == 0) {
				return false;
			}
		}

		return true;
	}
}
