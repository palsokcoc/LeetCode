package p0383;

import java.util.HashMap;
import java.util.Map;

// 30 ms,	27.56%
// 52.6 MB,	19.35%
public class RansomNote1 {
	public boolean canConstruct(String ransomNote, String magazine) {
		// Map stores the letters and how many times they appear in the magazine
		Map<Character, Integer> magazineLetters = new HashMap<>();

		// Populate the magazineLetters map
		for(Character letter: magazine.toCharArray()) {
			final Integer letterCount = magazineLetters.get(letter);
			if(letterCount == null) {
				magazineLetters.put(letter, 1);
			} else {
				magazineLetters.put(letter, letterCount + 1);
			}
		}

		// For each letter in the ransom note, check if magazineLetters has enough of that letter
		for(Character letter: ransomNote.toCharArray()) {
			final Integer letterCount = magazineLetters.get(letter);
			if(letterCount== null || letterCount== 0) {
				return false;
			} else {
				magazineLetters.put(letter, letterCount - 1);
			}
		}

		return true;
	}
}
