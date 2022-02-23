package problems;

public class AddDigits {
    public int addDigits(int num) {

        String nums=String.valueOf(num);
        int sum=0;
        for(int i=0;i<nums.length();i++)
        {
            sum+=Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        if(sum>9)
        return addDigits(sum);
        else return sum;

    }
}
