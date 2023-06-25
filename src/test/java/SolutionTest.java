
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    @Test
    public void testTrap() {
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected1 = 6;
        int actual1 = Solution.trap(height1);
        assertEquals(expected1, actual1);

        int[] height2 = {4, 2, 0, 3, 2, 5};
        int expected2 = 9;
        int actual2 = Solution.trap(height2);
        assertEquals(expected2, actual2);

        int[] height3 = {2, 0, 2};
        int expected3 = 2;
        int actual3 = Solution.trap(height3);
        assertEquals(expected3, actual3);

        int[] height4 = {3, 1, 2, 3, 4};
        int expected4 = 3;
        int actual4 = Solution.trap(height4);
        assertEquals(expected4, actual4);

        int[] height5 = {5, 4, 3, 2, 1};
        int expected5 = 0;
        int actual5 = Solution.trap(height5);
        assertEquals(expected5, actual5);

        int[] height6 = {0, 0, 0, 0, 0};
        int expected6 = 0;
        int actual6 = Solution.trap(height6);
        assertEquals(expected6, actual6);

        int[] height7 = {1, 1, 1, 1, 1};
        int expected7 = 0;
        int actual7 = Solution.trap(height7);
        assertEquals(expected7, actual7);

        int[] height8 = {5, 1, 2, 3, 4, 2, 1, 4};
        int expected8 = 11;
        int actual8 = Solution.trap(height8);
        assertEquals(expected8, actual8);

        int[] height9 = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int expected9 = 4;
        int actual9 = Solution.trap(height9);
        assertEquals(expected9, actual9);

        int[] height10 = {3, 1, 2, 1, 4, 0, 3};
        int expected10 = 8;
        int actual10 = Solution.trap(height10);
        assertEquals(expected10, actual10);
    }
}
