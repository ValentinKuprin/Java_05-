import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
    /**      Test Data:
     “    Red Rover School   “ → “Лишние пробелы удалены”
     “Red Rover School“ → “Пробелов не было”
     “” → “Строка пустая” */

    @Test
    public void testStringMethods_TrimSpaceInBeginAndEndOfString() {
        String str = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringMethods_SpaceIsNotBeginAndEndOfString() {
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringMethods_StringIsEmpty() {
        String str = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**      Test Data:
     “    Red Rover School   “ →  “Red Rover School“
     “panda   “ → “pnd”
     “taramasalata” → “trmslt” */

    @Test
    public void testremoveAllAs_TrimSpacesInBeginAndEndOfString() {
        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testremoveAllAs_TrimSpaceAndRemoveALetters() {
        String str = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testremoveAllAs_RemoveALetters() {
        String str = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**      Test Data:
     “3504209706040000 “ →  “35429764“
     “0000000111“ → “111”   */

    @Test
    public void testRemoveAllZeros_TrimSpaceAndRemoveZeros(){
       String str = "3504209706040000 ";
       String expectedResult = "35429764";
       String actualResult = new StringMethods().removeAllZeros(str);

       Assert.assertEquals(actualResult, expectedResult);
   }

    @Test
    public void testRemoveAllZeros_RemoveZeros(){
        String str = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_NotSpacesAndZeros(){
        String str = "111";
        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**      Test Data:
     “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     “p a     n   d a   “ → “panda” */

    @Test
    public void testRemoveAllSpaces_SpaceInBeginMiddleEnd() {
        String str = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_SpaceInMiddleEnd() {
        String str = "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**      Test Data:
     “Abracadabra” → “5, 6”
     “Homenum Revelio” → “0, 15”
     “3 tarAmasAlatA” → “6, 8”  */

    @Test
    public void testCountAs_() {
        String str = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs__() {
        String str = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs____() {
        String str = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
