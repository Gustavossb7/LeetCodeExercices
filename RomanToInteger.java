import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        for(int i = 0; i<s.length(); i++){
            if(i>0 && romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i-1))){   //Verifica se o digito anterior é menor que o atual (se sim, isso será uma subtração)
                result += romanMap.get(s.charAt(i)) - 2*romanMap.get(s.charAt(i-1));    //Realiza uma subtração, multiplicada por 2 para corrigir esse digito que foi adicionado na última alteração  
            } else{
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;

    }



    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        
        // Example usage:
        String romanNumeral = "MXXVII";
        int result = converter.romanToInt(romanNumeral);

        System.out.println("The integer representation of " + romanNumeral + " is: " + result);
    }
}
