public class GreatestCommonDivisor{
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 36));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        int commonDivisor = 1;
        int testedDivisor = 1;
        int smaller = 0;

        if(first < 10 || second < 10) {
            return -1;
        }

        if(first < second) {
            smaller = first;
        }else{
            smaller = second;
        }


        while(testedDivisor <= smaller) {
            if((first % testedDivisor == 0) && (second % testedDivisor == 0)) {
                commonDivisor = testedDivisor;

            }
            testedDivisor ++;
        }
        return commonDivisor;
    }


}