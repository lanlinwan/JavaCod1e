package Exercise.xianfen.QuickHit;

import java.util.Scanner;

public class Player {
    int levelNo;
    int currScore;
    long startTime;
    long elapsedTime;

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurrScore() {
        return currScore;
    }

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String printResult() {
        Scanner scanner=new Scanner(System.in);
        return scanner.next();
    }
}
