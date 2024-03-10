package UserInput;

public class PaintJobChallenge {
    public static void main(String[] args) {
        System.out.println("getBucketCount : "+getBucketCount(3.4,2.1,1.5,2));
        System.out.println("getBucketCount : "+getBucketCount(8.45,4.6,2.25));
        System.out.println("getBucketCount : "+getBucketCount(6.26,2.2));
        System.out.println("getBucketCount : "+getBucketCount(3.26,0.75));
    }
    protected static int getBucketCount(double width, double height, double areaPerBucket, int  extraBuckets ){
        double area = 0d; int noOfBucket = 0;

        if(width<=0 || height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }

        area =  height * width;
        noOfBucket = (int)Math.ceil( area/areaPerBucket);

        if(noOfBucket < extraBuckets)
            return 0;
        else
            return noOfBucket-extraBuckets;


    }
    protected static int getBucketCount(double width, double height, double areaPerBucket ){
        double area = 0d; int noOfBucket = 0;

        if(width<=0 || height<=0||areaPerBucket<=0){
            return -1;
        }

        area =  height * width;
        noOfBucket = (int)Math.ceil( area/areaPerBucket);
            return noOfBucket;
    }

    protected static int getBucketCount(double area, double areaPerBucket ){
        int noOfBucket = 0;

        if(area<=0 || areaPerBucket<=0){
            return -1;
        }


        noOfBucket = (int)Math.ceil(area/areaPerBucket);


        return noOfBucket;


    }


}
