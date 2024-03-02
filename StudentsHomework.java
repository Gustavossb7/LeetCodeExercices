public class StudentsHomework {
    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        int result = busyStudent(startTime,endTime,queryTime);
        System.out.println(result);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int nStudents = 0;
        for(int i = 0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                nStudents += 1;
            }
        }
        return nStudents;

    }

}
