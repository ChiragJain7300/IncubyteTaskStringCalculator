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
            String[] numArr;
            
                StringBuilder regex = new StringBuilder("\\n,");
                StringBuilder result = new StringBuilder();
                if(numbers.startsWith("//"))
                {
                    regex.append(numbers,numbers.indexOf("//"),numbers.indexOf("\n"));
                    result.append(numbers.substring(numbers.indexOf("\n")).trim());
                }
                else{
                    result.append(numbers);
                }
                numArr = result.toString().split("[" + regex + "]" );

            




            return sum(numArr);
        }


    }

    private int sum(String[] arr) {


        int arrSum=0;
        StringBuilder negString = new StringBuilder();
        for (String s : arr) {

            if (Integer.parseInt(s) < 0) {
                if (negString.toString().equals(""))
                    negString = new StringBuilder(s);
                else
                    negString.append(",").append(s);
            }
            if(Integer.parseInt(s)>1000)
            {
                continue;
            }
            arrSum+= Integer.parseInt(s);
        }
        if (!negString.toString().equals("")) {
            throw new IllegalArgumentException("Negatives not allowed: " + negString);
        }
        return arrSum;
    }

    

}
