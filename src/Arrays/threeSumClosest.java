package Arrays;

public class threeSumClosest {
    public static  int threeSumClosest(int[] nums, int target) {
        int  n=nums.length;
        int closestsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int currentsum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(currentsum-target)< Math.abs(closestsum-target)){
                        closestsum=currentsum;
                    }
                }

            }

        }
        return closestsum;
    }

    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(arr,target));
    }
}
