import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class stringCalculatorTest {
    stringCalculator strCal;
    @BeforeEach
    public void setup()
    {
        strCal = new stringCalculator();
    }

    @Test
    @DisplayName("Test for empty string")
    void step1_empty_string() {

        Assertions.assertEquals(0,strCal.Add(""));
    }
    @Test
    @DisplayName("Test for string_length == 1")
    void step1_add_One() {
        /* No extra spaces */
        String str = "2";
        Assertions.assertEquals(Integer.parseInt(str),strCal.Add(str));
        /* with extra spaces */
        str=" 4   ";
        Assertions.assertEquals(4,strCal.Add(str));
    }
    @Test
    @DisplayName("Test for two numbers seperated by comma")
    void step1_addTwoNumbers() {

        String str=" 4,5   ";
        Assertions.assertEquals(9,strCal.Add(str));
    }
    @Test
    @DisplayName("Test for multiple numbers")
    void step2_addMoreThanOne() {

        String str=" 4,5,6,9  ";
        Assertions.assertEquals(24,strCal.Add(str));
    }
    @Test
    @DisplayName("Test for multiple delimiters")
    void step3_addWithNewLineDelimiter() {

        String str="4\n5,6\n9";
        Assertions.assertEquals(24,strCal.Add(str));
    }
    @Test
    @DisplayName("Test for multiple delimiters")
    void step4_addWithDifferentDelimiters() {

        String str="//;\n1;2";
        Assertions.assertEquals(3,strCal.Add(str));
    }
    @Test
    @DisplayName("Test for Negative Numbers")
    void step5_throws_exception_addWithNegativeNumbers() {
        try {
            strCal.Add("-1,2");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }
        try {
            strCal.Add("1,-2,3,-5");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(e.getMessage(), "Negatives not allowed: -2,-5");
        }
    }
    @Test
    @DisplayName("Test for numbers greater than 1000")
    void step6_addWithLargeNumbers() {
        Assertions.assertEquals(1005,strCal.Add("1000,1018,5"));
        Assertions.assertEquals(1000,strCal.Add("999,1001,1"));
    }
    @Test
    @DisplayName("Test for Delimiters of any length")
    void step7_DelimitersWithGivenFormat() {
        Assertions.assertEquals(6,strCal.Add("//[***]\n1***2***3"));

    }
    @Test
    @DisplayName("Test for Delimiters of any length")
    void step8_DelimitersWithGivenFormat() {
        Assertions.assertEquals(6,strCal.Add("//[*][%]\\n1*2%3"));

    }
}
