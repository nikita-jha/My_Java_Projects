public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(4,18,19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int x = bigCount * 5;
        int y = smallCount * 1;

        if (x > 0 && goal < 5 ) {
            return false;
        } else if (x + y < goal) {
            return false;
        }

        if ((x+y)%goal < 5) return true;

        if (bigCount > goal) return false;

        if ( goal !=5 && x > goal) return false;

        if (x==0 && y >= goal) return true;


        if (goal > bigCount) return true; else return false;
    }
}
