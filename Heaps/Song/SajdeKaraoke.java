//package Song;

// public class song01 {
    
// }
// Karaoke-style lyrics printer for "Sajde"
// Author: Ranit Ghosh (template by ChatGPT)

public class SajdeKaraoke {
    public static void main(String[] args) {

// STEP 1: Add your lyrics below (each line or phrase of the song)
String[] lyrics = {
    "🎵 Intro music ...",
    "Sajde kiye hote khuda ke maine agar, chhod ke na jaata woh bhi iss qadar-",
    "Sajda kiya, sajda kiya tera hi maine, magar isliye gaya mujhe chhodkar",
    "Jaaya sapne, jaaya apne, jaaya meri zindagi hai-",
    "Jaaya sapne, jaaya apne, jaaya meri har khushi hai-",
    "Dhadkane iss dil ki ab kyun na suno, hai basa yaadon mein ab bas tu hi kyun-",
    "Tu na milat tu na mila, toh sabse keh kar alvida, na aaunga kabhi phir laut kar-",
    "Jaaya sapne, jaaya apne, jaaya meri chaahat hai-",
    "Yeh chaah thi ke tu mile, har shai mein ab tu dikhe-",
    "🎵 Outro music ..."
};

// STEP 2: Estimated timestamps in milliseconds
// (These are approximate. Adjust by listening to the song.)
// Example: 0 ms = start, 5000 ms = after 5 seconds, etc.
long[] timeStamps = {
    0,       // intro
    5000,    // line 1
    11000,   // line 2
    17000,   // line 3
    23000,   // line 4
    29000,   // line 5
    35000,   // line 6
    41000,   // line 7
    47000,   // line 8
    53000    // outro
};

        // STEP 3: Check if both arrays have equal length
        if (lyrics.length != timeStamps.length) {
            System.err.println("Error: lyrics[] and timeStamps[] must have same length!");
            return;
        }

        // STEP 4: Print lyrics line-by-line in sync
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < lyrics.length; i++) {
            long targetTime = startTime + timeStamps[i];
            long now = System.currentTimeMillis();
            long wait = targetTime - now;

            if (wait > 0) {
                try {
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(lyrics[i]);
        }

        // STEP 5: End message
        System.out.println("\n🎤 Song ended. Hope you enjoyed singing 'Sajde'!");
    }
}