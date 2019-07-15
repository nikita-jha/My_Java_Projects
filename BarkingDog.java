public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }else if(hourOfDay < 8 && barking == true) {
            return true;
        }else if(hourOfDay < 8 && barking == false) {
            return false;
        }else if(hourOfDay > 22 && barking == true) {
            return true;
        }else if(hourOfDay > 22 && barking == false) {
            return false;
        }else{
            return false;
        }
    }
}
