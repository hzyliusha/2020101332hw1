package cn.edu.jnu.x2020101332;

public class BowlingGame {
    private int rolls[] = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
    rolls[currentRoll++]=pins;
    }

    public int score() {
        int score =0;
        for(int j=0;j<rolls.length;j++)
        {
            score+=rolls[j];
            if ((j%2==0)&&((j<19))&& isaSpare(j))
            {
                score+=rolls[j+2];
            }
        }
        return score;
    }

    private boolean isaSpare(int j) {
        return rolls[j] + rolls[j + 1] == 10;
    }
}
