package problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class sumoftwo {

  /*  public static int[] sumOfTwo(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // no solution found
    } 

    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 11, 15};
        int target = 9;

        int[] result = sumOfTwo(nums, target);

        if (result.length > 0) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }*/
	
	
	public static void main(String[] args) {
	/*	List<Integer> List1=Arrays.asList(1,3,5,6,43,3);
		List<Integer> List2=Arrays.asList(2,3,4,7,8,1);
		
		List<Integer> List=Stream.concat(List1.stream(),List2.stream())
				.distinct()
				.sorted()
				.toList();

		System.out.println(List);
	}*/
	
	
	int[] arr= {23,3,4,5,2,33,43,1,64,32};
	Arrays.sort(arr);
	for(int n:arr) {
		System.out.print(n +" ");
	}
	
}


  }

