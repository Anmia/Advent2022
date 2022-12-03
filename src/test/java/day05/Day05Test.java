package day05;

import aoc.day04.Day04;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day05Test {

    @Test
    public void testPart1(){
        // Given
        ArrayList<String> block = new ArrayList<>();

        String test  = "A Y\n" +
                "B X\n" +
                "C Z";

        String[] toBlock = test.split("\n");

        for (String item : toBlock) {
            block.add(item);
        }

        List<String> input = block;
        // When
        String result = new Day04().part1(input);

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
        String result = new Day04().part2(input);

        // Then
        assertEquals(input.get(0), result);
    }
}
