public class StringsEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1, res2;
        res1 = "";
        res2 = ""; 

        for (int i = 0; i<word1.length;i++){
            res1 += word1[i];
        }

        for (int i = 0; i<word2.length;i++){
            res2 += word2[i];
        }

        return res1.equals(res2);
    }
}
