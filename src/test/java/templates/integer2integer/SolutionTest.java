package templates.integer2integer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class SolutionTest {

    private final Solution solver = new Solution();
    @Parameter(0)
    public int input;
    @Parameter(1)
    public int expected;

    @Parameters(name = "given {0}, result should be {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0}
        });
    }

    @Test
    public void checkSolution() {
        int result = solver.solution(input);

        assertEquals(expected, result);
    }
}