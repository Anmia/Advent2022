package aoc.day03;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;

public class Day03 implements Day {

    public String alfa = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public String part1(List<String> input) {
        List<String[]> comps = inputTransform(input);

        int result = 0;

        for (String item[] : comps) {
            result += matcher(item);
        }

        return result + "";
    }

    public int matcher(String[] input) {
            for (int i = 0; i < alfa.length(); i++) {
                if (input[0].contains(alfa.substring(i, i + 1)) && input[1].contains(alfa.substring(i, i + 1))) {
                    return i + 1;
                }
            }
            return 0;
    }

    public List<String[]> inputTransform(List<String> input) {
        List<String[]> compartments = new ArrayList<>();

        for (String item : input) {
            String[] temp = new String[2];
            temp[0] = item.substring(0, item.length() / 2);
            temp[1] = item.substring(item.length() / 2);

            compartments.add(temp);
        }
        return compartments;
    }

    @Override
    public String part2(List<String> input) {
        int result = 0;

        for (int i = 0; i < input.size(); i += 3) {
            String[] temp = {input.get(i), input.get(i + 1), input.get(i + 2)};
            result += matcherTwo(temp);
        }

        return result + "";
    }

    public int matcherTwo(String[] input) {
        for (int i = 0; i < alfa.length(); i++) {
            if (input[0].contains(alfa.substring(i, i + 1)) && input[1].contains(alfa.substring(i, i + 1)) && input[2].contains(alfa.substring(i, i + 1))) {
                return i + 1;
            }
        }
        return 0;
    }
}
