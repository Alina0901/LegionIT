import StaticClassesEnumsExceptions.Calculator;
import StaticClassesEnumsExceptions.WeekDays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.stream.Stream;

public class WeekDaysTest {

    static Stream<Arguments> CorrectReturnValues(){
        return Stream.of(
                Arguments.of(1,"Sunday"),
                Arguments.of(2,"Monday"),
                Arguments.of(3,"Tuesday"),
                Arguments.of(4,"Wednesday"),
                Arguments.of(5,"Thursday"),
                Arguments.of(6,"Friday"),
                Arguments.of(7,"Saturday")
        );
    }

   @ParameterizedTest
    @MethodSource("CorrectReturnValues")
    public void methodSourceTes( int dayNumber, String expectedResult){
        String actualResult = WeekDays.getDay(dayNumber);
        assertNotNull(actualResult,"result is not null");
        assertEquals(expectedResult, actualResult, "Expected and actual results are the same");
        assertTrue(expectedResult==actualResult,"Expected results equals actual results");

   }


   @Test
    @DisplayName("NullPointer Exception Test")
    public void errorTest(){
        WeekDays.getDay(5);
        assertThrows(NullPointerException.class, () -> {WeekDays.getDay(null);});
   }

   @Test
   @DisplayName("Trying a larger number than 7")
   public void largerNumberTest(){
        String expectedResult = "The number should be equal or smaller than 7";
        String actualResult = WeekDays.getDay(8);
        assertEquals(expectedResult, actualResult);
   }

   @Test
    @DisplayName("Trying 0 as  a smaller number than 1")
    public void numberZeroTest(){
        String expectedResult = "The number should be equal or larger that 1";
        String actualResult = WeekDays.getDay(0);
        assertEquals(expectedResult, actualResult);
   }

   @Test
    @DisplayName("Trying negative number")
    public void negativeNumbersTest(){
        String expectedResult = "The number should be equal or larger that 1";
        String actualResult = WeekDays.getDay(-1);
        assertEquals(expectedResult, actualResult);
   }



}
