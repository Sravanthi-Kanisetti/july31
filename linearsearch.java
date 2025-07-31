
public class linearsearch
{
	public static void main(String[] args) {
		int[] nums={11,22,33,44,55,66,77,88,99};
		int target=55;
		int result=linear(nums,target);
		System.out.println("the result is at index "+result);
	}
	
	static int linear(int[] nums,int target){
	    for(int i=0;i<nums.length;i++){
	        if(nums[i]==target){
	            return i;
	        }
	    }
	    return -1;
	}
}
