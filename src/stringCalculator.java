import java.util.Scanner;

public class stringCalculator {
    public int Add(String numbers)
    {
        if(numbers.length()==0)
            return 0;
        else if(numbers.trim().length()==1)
        {
            return Integer.parseInt(numbers.trim());
        }
        else if(numbers.trim().length()>1)
        {
            int sum=0;
            String[] strArr = numbers.trim().split("[,\n]",0);
            for (String s : strArr) {
                sum += Integer.parseInt(s);
            }
            return sum;
        }
        else
            return 0;

    }
}
