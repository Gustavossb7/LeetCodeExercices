public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }

    public static boolean checkIfPangram(String sentence) {
        boolean result;
        result = sentence.contains("a");
        result = result &&  sentence.contains("b");
        result = result &&  sentence.contains("c");
        result = result &&  sentence.contains("d");
        result = result &&  sentence.contains("e");
        result = result &&  sentence.contains("f");
        result = result &&  sentence.contains("g");
        result = result &&  sentence.contains("h");
        result = result &&  sentence.contains("i");
        result = result &&  sentence.contains("j");
        result = result &&  sentence.contains("k");
        result = result &&  sentence.contains("l");
        result = result &&  sentence.contains("m");
        result = result &&  sentence.contains("n");
        result = result &&  sentence.contains("o");
        result = result &&  sentence.contains("p");
        result = result &&  sentence.contains("q");
        result = result &&  sentence.contains("r");
        result = result &&  sentence.contains("s");
        result = result &&  sentence.contains("t");
        result = result &&  sentence.contains("u");
        result = result &&  sentence.contains("v");
        result = result &&  sentence.contains("w");
        result = result &&  sentence.contains("x");
        result = result &&  sentence.contains("y");
        result = result &&  sentence.contains("z");
        return result;
    }
}