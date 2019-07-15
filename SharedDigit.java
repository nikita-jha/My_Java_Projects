public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));
    }
    public static boolean hasSharedDigit(int iFirst, int iSecond) {
        int X = iFirst;
        int Y = iSecond;
        int lastDigitF = iFirst % 10;
        int lastDigitY = iSecond % 10;
        if((iFirst < 10 || iFirst > 99) || (iSecond < 10 || iSecond > 99)) {
            return false;
        }
        while(X >= 10) {
            X /= 10;
        }
        while(Y >= 10) {
            Y /= 10;
        }
        if(X == lastDigitF || X == lastDigitY || Y == lastDigitY || Y == lastDigitF || X == Y || lastDigitF == lastDigitY) {
            return true;
        }
        return false;
    }
}
