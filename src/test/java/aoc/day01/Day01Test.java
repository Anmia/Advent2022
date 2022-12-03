package aoc.day01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void testPart1(){
        // Given
        ArrayList<String> block = new ArrayList<>();

        String test  = "1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000";

        String[] toBlock = test.split("\n");

        for (String item : toBlock) {
            block.add(item);
        }

        List<String> input = block;
        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("24000", result);
    }

    @Test
    public void testPart2(){
        // Given
        ArrayList<String> block = new ArrayList<>();

        String test  = "1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000";

        String[] toBlock = test.split("\n");

        for (String item : toBlock) {
            block.add(item);
        }

        List<String> input = block;

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("45000", result);
    }
}
