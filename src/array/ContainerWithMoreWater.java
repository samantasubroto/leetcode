package array;

//not solved as question description not makes sense

public class ContainerWithMoreWater {
    public static int waterCheck(int[] c) {
        if(c.length == 2){
            return Math.min(c[0], c[1]) * Math.min(c[0], c[1]);
        }
        int previous_distance = 0;
        int previous_container_size = Math.min(c[c.length-1], c[0]) * Math.min(c[c.length-1], c[0]);
        int previousDistanceToWater = 0;
        for(int i=0;i<c.length-2;i++) {
           for(int j=c.length-1;j!=i;j--){
               int distanceToWater = (c[i]*c[j]) * (j-i);
               if((j-i > previous_distance || distanceToWater > previousDistanceToWater) && Math.min(c[i], c[j]) * Math.min(c[i], c[j]) > previous_container_size){
                   previous_container_size = Math.min(c[i], c[j]) * Math.min(c[i], c[j]);
                   previous_distance = j-i;
                   previousDistanceToWater = distanceToWater;
               }
           }
        }
        return previous_container_size;
    }

    public static void main(String[] args) {
        System.out.println(waterCheck(new int[]{1,2,1}));
    }
}
