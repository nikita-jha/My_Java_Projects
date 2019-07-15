public class Multiplesof3And5 {

        public static void main (String arg[]) {

            int result = 0;

            for(int i=1; i < 1000; i++) {
                //System.out.println("Loop : " + i + " - i%3 : " + i%3 + " i%5 : " + i%5);
                if ((i%3 == 0) || (i%5 == 0)) {
                    //System.out.println("	" + i + " : " + result);
                    result += i;
                    //System.out.println("	Now the result is "  + result);
                }
            }

            System.out.println("The answer is : " + result);
        }

    }

