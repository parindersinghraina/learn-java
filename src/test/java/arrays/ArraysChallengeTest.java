package arrays;

import com.parinder.learn.java.arrays.ArraysChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArraysChallengeTest {

    @Test
    public void testGetAverageArray() {
        int[] array = {10, 10, 10, 10, 10};
        ArraysChallenge arraysChallenge = new ArraysChallenge();
        Assertions.assertEquals(10, arraysChallenge.getAverageArray(array));
    }

    @Test
    public void testGetArrayReturnString() {
        int[] array = {10, 10, 10, 10, 10};
        ArraysChallenge arraysChallenge = new ArraysChallenge();
        Assertions.assertEquals("[20, 20, 20, 20, 20]", arraysChallenge.getReturnArrayString(array));
    }

    @Test
    public void testNumberIsPresentInArray() {
        int[] array = {11, 12, 13, 14, 15};
        ArraysChallenge arraysChallenge = new ArraysChallenge();
        Assertions.assertTrue(arraysChallenge.numberIsPresentOrNot(array, 11));
    }

    @Test
    public void testNumberIsNotPresentInArray() {
        int[] array = {11, 12, 13, 14, 15};
        ArraysChallenge arraysChallenge = new ArraysChallenge();
        Assertions.assertFalse(arraysChallenge.numberIsPresentOrNot(array, 100));
    }

    @Test
    public void testGetReverseArray() {
        int[] array = {11, 12, 13, 14, 15};
        ArraysChallenge arraysChallenge = new ArraysChallenge();
        Assertions.assertEquals("[15, 14, 13, 12, 11]", arraysChallenge.getReverseOfArray(array));
    }
}
