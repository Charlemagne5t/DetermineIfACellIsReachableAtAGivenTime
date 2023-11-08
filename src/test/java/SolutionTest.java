import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isReachableAtTimeTest1() {
        int sx = 2;
        int sy = 4;
        int fx = 7;
        int fy = 7;
        int t = 6;

        Assert.assertTrue(new Solution().isReachableAtTime(sx, sy, fx, fy, t));
    }

    @Test
    public void isReachableAtTimeTest2() {
        int sx = 3;
        int sy = 1;
        int fx = 7;
        int fy = 3;
        int t = 3;

        Assert.assertTrue(new Solution().isReachableAtTime(sx, sy, fx, fy, t));
    }
}
