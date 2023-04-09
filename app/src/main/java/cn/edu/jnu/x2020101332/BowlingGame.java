package cn.edu.jnu.x2020101332;

public class BowlingGame {
    private int rolls[] = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
    rolls[currentRoll++]=pins;
    }

    public int score() {
        int score =0;
        int currentFrameScoreIndex=0;
        for(int currentFrame=0;currentFrame<10;currentFrame++)
        {   score+=rolls[currentFrameScoreIndex];
            score+=rolls[currentFrameScoreIndex+1];
            if(isaStrick(currentFrameScoreIndex))
            {
                score+=rolls[currentFrameScoreIndex+2];
            }
            else if(isaSpare(currentFrameScoreIndex))
            {
                score+=rolls[currentFrameScoreIndex+2];
                currentFrameScoreIndex++;
            }
            else
            {
                currentFrameScoreIndex++;
            }
            currentFrameScoreIndex++;
        }
        return score;
    }

    private boolean isaSpare(int j) {
        return rolls[j] + rolls[j + 1] == 10;
    }
    private boolean isaStrick(int j) {
        return rolls[j]  == 10;
    }
}
