public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75,0.75,0.5,0));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.24,4.3,2.35));
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ) {
            return -1;
        }
        double area = width * height;
        double alreadyPresentArea = areaPerBucket * extraBuckets;
        int numOfBuckets = (int)(area/alreadyPresentArea);

        if(numOfBuckets==2147483647) {
            numOfBuckets = (int)(area/areaPerBucket);
        }

        if((numOfBuckets+extraBuckets)*areaPerBucket>area) {
            return numOfBuckets;
        }
        if ((numOfBuckets + extraBuckets) * areaPerBucket < area) {
        for(int i = 1; i <= area; i++) {

                numOfBuckets = numOfBuckets + i;
            if((numOfBuckets + extraBuckets) * areaPerBucket >= area) {
                break;
            }
            }

        }


        return numOfBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double alreadyPresentArea = areaPerBucket ;
        int numOfBuckets = (int)(area/alreadyPresentArea);
        double numOfBucketsDouble = (area/alreadyPresentArea);


        if(numOfBucketsDouble*alreadyPresentArea==area) {
            numOfBuckets = numOfBuckets+1;
        }
        return numOfBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area<= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int numOfBuckets = (int)(area/areaPerBucket);
        double numOfBucketsDouble = (area/areaPerBucket);



        if(numOfBucketsDouble*areaPerBucket==area) {
            numOfBuckets = numOfBuckets+1;
        }
        return numOfBuckets;
    }
}
