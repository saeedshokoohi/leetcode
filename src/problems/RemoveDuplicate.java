package problems;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {

        int counter=1;
        int current=nums[0];
        int duplicatesCount=0;
        int[] correctedArray=nums;
        correctedArray[0]=current;
        int secIndex=1;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==current){
            counter++;
            if(counter>2)
            {
                duplicatesCount++;
            }
            else
            {
                correctedArray[secIndex]=nums[i];
                secIndex++;
            }
        }
        else
        {
            correctedArray[secIndex]=nums[i];
            secIndex++;
            counter=1;
        }
        current=nums[i];

    }
    nums=correctedArray;
  return nums.length-duplicatesCount;
    }
}
