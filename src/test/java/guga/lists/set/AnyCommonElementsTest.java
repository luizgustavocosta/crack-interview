package guga.lists.set;

import org.assertj.core.api.WithAssertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnyCommonElementsTest implements WithAssertions {

    private AnyCommonElements anyCommonElements;

    @Before
    public void setUp() {
        anyCommonElements = new AnyCommonElements();
    }

    @Test
    public void given2ArraysOfStringIsThereCommonElements() {
        String[] firstArray = {"A", "B", "C"};
        String[] secondArray = {"D", "E", "A"};

        String[] otherFirstArray = {"Z", "X", "Y"};
        String[] otherSecondArray = {"D", "E", "A"};
        boolean algorithmResult =
                anyCommonElements.hasCommonElements(firstArray, secondArray);
        boolean otherAlgorithmResult =
                anyCommonElements.hasCommonElements(otherFirstArray, otherSecondArray);
        assertThat(algorithmResult).as("First result should be true").isTrue();
        assertThat(otherAlgorithmResult).as("Second result should be false").isFalse();
    }
}