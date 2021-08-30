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
        else if(numbers.trim().length()==3)
        {
            String[] strArr = numbers.trim().split(",",2);
            return (Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]));
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
