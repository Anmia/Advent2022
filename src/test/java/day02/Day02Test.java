package day02;

import aoc.day01.Day01;
import aoc.day02.Day02;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day02Test {

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
        String result = new Day02().part1(input);

        // Then
        assertEquals("15", result);
    }

    @Test
    public void testPart2(){
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
        String result = new Day02().part2(input);

        // Then
        assertEquals("12", result);
    }
}
