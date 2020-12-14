public class PaintJob {
    public static double bucketsToBuy = 0;

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double wallAreaPaintedFromExtraBuckets = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }else{
            //get the are of the wall
            double wallArea = width * height;
            //how many area of the wall can be painted from extra buckets
            wallAreaPaintedFromExtraBuckets = extraBuckets * areaPerBucket;
            //is that enough for area of the wall?
            if(wallAreaPaintedFromExtraBuckets < wallArea){
                bucketsToBuy = Math.ceil( (wallArea - wallAreaPaintedFromExtraBuckets) / areaPerBucket );
                return (int)bucketsToBuy;
            }else{
                return (int)bucketsToBuy;
            }
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }else{
            double wallArea = width * height;
            bucketsToBuy = Math.ceil( wallArea / areaPerBucket );
            return (int)bucketsToBuy;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            bucketsToBuy = Math.ceil( area / areaPerBucket);
            return (int)bucketsToBuy;
        }
    }
}
