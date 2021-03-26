package com.test.one;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestAnswer {

    /**
     * data set
     */
    private static Map<Integer, List<String>> data = null;

    /**
     * date set init
     */
    @BeforeAll
    static void initAll() {
        data = new HashMap<Integer, List<String>>() {{
            put(0, new ArrayList<String>() {{
                add("0");
            }});
            put(1, new ArrayList<String>() {{
                add("1");
            }});
            put(2, new ArrayList<String>() {{
                add("a");
                add("b");
                add("c");
            }});
            put(3, new ArrayList<String>() {{
                add("d");
                add("e");
                add("f");
            }});
            put(4, new ArrayList<String>() {{
                add("g");
                add("h");
                add("i");
            }});
            put(5, new ArrayList<String>() {{
                add("j");
                add("k");
                add("l");
            }});
            put(6, new ArrayList<String>() {{
                add("m");
                add("n");
                add("o");
            }});
            put(7, new ArrayList<String>() {{
                add("p");
                add("q");
                add("r");
                add("s");
            }});
            put(8, new ArrayList<String>() {{
                add("t");
                add("u");
                add("v");
            }});
            put(9, new ArrayList<String>() {{
                add("w");
                add("x");
                add("y");
                add("z");
            }});
        }};
    }


    /**
     * test01
     */
    @Test
    public void runTest01() {
        Integer[] test01 = {0,2, 3};
        testCodePrint(test01);
        Integer[] test02 = {9};
        testCodePrint(test02);
    }

    /**
     * test02
     * TODO unfinished
     */
    @Test
    public void runTest02() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i);
        }
        Integer[] testNumber = integers.toArray(new Integer[integers.size()]);
        testCodePrint(testNumber);
    }

    /**
     * test code
     *
     * @param number testNumber
     */
    private void testCodePrint(Integer[] number) {
        System.out.println("Input: arr[] = " + Arrays.toString(number));
        System.out.print("Output: ");
        Queue<String> dataAnswer = new LinkedList<String>() {{
            add("");
        }};
        while (!dataAnswer.isEmpty()) {
            String answer = dataAnswer.remove();
            if (answer.length() == number.length) {
                System.out.print(answer);
                System.out.print("\t");
            } else {
                List<String> dateSetItem = data.get(number[answer.length()]);
                if (!Objects.isNull(dateSetItem))
                    dateSetItem.forEach(Item -> {
                        dataAnswer.add(answer + Item);
                    });
            }
        }
        System.out.println();
    }

}
