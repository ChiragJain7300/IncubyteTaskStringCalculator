import java.util.Scanner;

public class stringCalculator {
    public int Add(String numbers)
    {
        numbers = numbers.trim();
        if(numbers.length()<2)
        {
            if(numbers.length()==0)
                return 0;
            else
                return Integer.parseInt(numbers);

        }

        else
        {

            String delimiter = ",";
            if (numbers.matches("//(.*)\n(.*)")) {
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }
            String[] numArr = splitNumbers(numbers, delimiter + "|\n");
            return sum(numArr);
        }


    }

    private int sum(String[] arr) {
        int arrSum=0;
        for (String s : arr) {
            arrSum += Integer.parseInt(s);
        }
        return arrSum;
    }

    private String[] splitNumbers(String numbers, String delim) {
        return numbers.split(delim);
    }
}
