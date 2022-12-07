package a_daily_topic;

// 消失的两个数字

public class Interview17_19 {
    public int[] missingTwo(int[] nums) {
        //分别对当前数组、以及完整数组求和
        int len = nums.length + 2;
        int sumAll = (len + 1) * len / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        //两个和进行差值计算，得到缺失两个值的总和：x + y = sumAll - sum
        int sumTwoNum = sumAll - sum;
        //对差值进行对半计算，那么x,y必然有一个值是小于计算后的对半值
        int mid = sumTwoNum / 2;
        //同样使用对半值未基准，通过两个数组求和，得出差值即为x或者y
        sumAll = (mid + 1) * mid / 2;
        sum = 0;
        for (int num : nums) {
            if (num <= mid) {
                sum += num;
            }
        }
        int num1 = sumAll - sum;
        //得到其中一值，再根据第一步的差值和，即可得出另外值
        int num2 = sumTwoNum - num1;
        return new int[]{num1, num2};
    }
}
