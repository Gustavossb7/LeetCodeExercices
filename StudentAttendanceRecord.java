public class StudentAttendanceRecord {
    public static void main(String[] args) {
        String s = "LLPLLPLPPLLPLPLPPPLPLPLPPPLPPP" ;
        Boolean historico = checkRecord(s);
        System.out.println(historico);
    }

    public static boolean checkRecord(String s){
        int faltas = 0;
        int atraso = 0;
        boolean tresAtrasos = false;

        for (int i = 0; i < s.length(); i++) {
            char caractere = s.charAt(i);
            if('L' == caractere){
                atraso += 1;
            }
            if(atraso >= 3){
                tresAtrasos = true;
            }
            if('A' == caractere){
                faltas += 1 ;
                if(atraso>0){
                    atraso = 0;
                }
            }
            if('P' == caractere){
                if(atraso>0){
                atraso = 0;
            }
            }
        }
        if(faltas > 1 || tresAtrasos){
            return false;
        }
        else{
            return true;
        }
    }
}

