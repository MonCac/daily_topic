package a_daily_topic;

// 无法吃午餐的学生数量

public class No_1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] sd = new int[2];
        int[] sw = new int[2];
        int[] ans = new int[2];
        for(int i = 0; i < students.length; i++){
            if(students[i] == 0)
                sd[0]++;
            else
                sd[1]++;
            if(sandwiches[i] == 0)
                sw[0]++;
            else
                sw[1]++;
        }
        if(sd[0] == sw[0])
            return 0;
        if(sd[0] > sw[0]){
            int i = 0;
            while (ans[1] <= sd[1]){
                if(sandwiches[i] == 0)
                    ans[0]++;
                else
                    ans[1]++;
                i++;
            }
            return sd[0] - ans[0];
        }
        if(sd[1] > sw[1]){
            int i = 0;
            while (ans[0] <= sd[0]){
                if(sandwiches[i] == 0)
                    ans[0]++;
                else
                    ans[1]++;
                i++;
            }
            return sd[1] - ans[1];
        }
        return 0;
    }
}
