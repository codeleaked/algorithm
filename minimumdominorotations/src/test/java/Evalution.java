import com.codeleaked.algorithm.minimumdominorotations.Solution;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evalution {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[] A = new int[] { 2, 1, 2, 4, 2, 2 };
        int[] B = new int[] { 5, 2, 6, 2, 3, 2 };
        assertThat(solution.minDominoRotations(A, B)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] A = new int[] { 3, 5, 1, 2, 3 };
        int[] B = new int[] { 3, 6, 3, 3, 4 };
        assertThat(solution.minDominoRotations(A, B)).isEqualTo(-1);
    }

    @Test
    public void test3() {
        int[] A = new int[] { 6, 1, 6, 4, 6, 6 };
        int[] B = new int[] { 5, 6, 2, 6, 3, 6 };
        assertThat(solution.minDominoRotations(A, B)).isEqualTo(2);
    }

}
