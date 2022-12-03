package aoc.day02;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        List<int[]> hands = hands(input);

        int score = 0;

        for (int item[] : hands) {
            int tempScore = 0;

            tempScore += item[1];

            if (item[0] == item[1]) {
                tempScore += 3;
            }

            if ((item[0] == 1 && item[1] == 2) ||
                    (item[0] == 2 && item[1] == 3) ||
                    (item[0] == 3 && item[1] == 1)) {
                tempScore += 6;
            }

            score += tempScore;
        }
        return score + "";
    }

    public  List<int[]> hands(List<String> input) {
        List<int[]> hands = new ArrayList<>();

        for (String item : input) {
            String[] temp = item.split(" ");
            int[] tempHand = new int[2];
            switch (temp[1].toLowerCase()) {
                case "x": tempHand[1] = 1; break;
                case "y": tempHand[1] = 2; break;
                case "z": tempHand[1] = 3; break;
            }

            switch (temp[0].toLowerCase()) {
                case "a": tempHand[0] = 1; break;
                case "b": tempHand[0] = 2; break;
                case "c": tempHand[0] = 3; break;
            }

            hands.add(tempHand);
        }
        return hands;
    }

    @Override
    public String part2(List<String> input) {
        return "TODO";
    }

}
