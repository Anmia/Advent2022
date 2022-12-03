package aoc.day24;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;

public class Day24 implements Day {

    @Override
    public String part1(List<String> input) {
        List<Integer> scores = new ArrayList<>();

        int x = 0;

        for (int i = 0; i < input.size(); i++) {
            if (!input.get(i).isEmpty()) {
                x += Integer.parseInt(input.get(i));
            }

            if (input.get(i).isEmpty() || i == input.size() - 1) {
                scores.add(x);
                x = 0;
            }
        }

        for (int item : scores) {
            if (x < item) {
                x = item;
            }
        }

        return x + "";
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
