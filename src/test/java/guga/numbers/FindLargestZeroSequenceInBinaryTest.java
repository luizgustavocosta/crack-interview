package guga.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class FindLargestZeroSequenceInBinaryTest {

    @Before
    public void setUp() {
        new FindLargestZeroSequenceInBinary();
    }

    @Test
    public void
    givenANumberFindTheLargestSequenceInBinary() {
        int number = 9;
        int otherNumber = 32;

        int resultExpected = 2;
        int otherResultExpected = 5;
        int algorithm = findTheLargestSequence(number);
        int sameAlgorithm = findTheLargestSequence(otherNumber);
        assertEquals(resultExpected, algorithm);
        assertEquals(otherResultExpected, sameAlgorithm);
    }

    private int findTheLargestSequence(int number) {
        // Solution copied from https://codereview.stackexchange.com/questions/122410/printing-longest-sequence-of-zeroes
        return Optional.ofNullable(number)
                .map(Integer::toBinaryString)
                .filter(numberInBinary -> numberInBinary.length() > 1)
                .map(binaryRepresentation -> {
                    List<Integer> counts = new ArrayList<>();
                    int count = 0;
                    for (int i = 0; i < binaryRepresentation.length(); i++) {
                        if (binaryRepresentation.charAt(i) == '0') {
                            count += 1;
                        } else if (count > 0) {
                            counts.add(count);
                            count = 0;
                        }
                    }
                    if (!counts.isEmpty()) {
                        Collections.sort(counts);
                        return counts.get(counts.size() - 1);
                    }
                    return count;
                }).orElse(0);
    }

}