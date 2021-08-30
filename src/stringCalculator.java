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
            String[] strArr = numbers.trim().split(",",0);
            for (String s : strArr) {
                sum += Integer.parseInt(s);
            }
            return sum;
        }
        else
            return 0;

    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        stringCalculator strCal1 = new stringCalculator();
//        System.out.println("Enter");
//        String str = sc.nextLine();
//        System.out.println(strCal1.Add(str));
//    }
}
