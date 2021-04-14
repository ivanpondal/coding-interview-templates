package templates.array2array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class SolutionTest {

    private final Solution solver = new Solution();
    @Parameter(0)
    public int[] input;
    @Parameter(1)
    public int[] expected;

    @Parameters(name = "test case {index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 1, 2}, new int[]{0}}
        });
    }

    @Test
    public void checkSolution() {
        int[] result = solver.solution(input);

        assertArrayEquals(expected, result);
    }
}