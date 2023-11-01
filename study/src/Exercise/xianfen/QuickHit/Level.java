package Exercise.xianfen.QuickHit;

public class Level {
    int levelNo;
    int strLeng;
    int strTime;
    long timeLimit;
    int perScore;

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getStrLeng() {
        return strLeng;
    }

    public void setStrLeng(int strLeng) {
        this.strLeng = strLeng;
    }

    public int getStrTime() {
        return strTime;
    }

    public void setStrTime(int strTime) {
        this.strTime = strTime;
    }

    public long getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(long timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }

    public Level(int levelNo, int strLeng, int strTime, int timeLimit, int perScore) {
        this.levelNo = levelNo;
        this.strLeng = strLeng;
        this.strTime = strTime;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }
}
