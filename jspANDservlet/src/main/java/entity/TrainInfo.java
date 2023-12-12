package entity;

/**
 * @author 童归权
 * @version 1.0 2021/1/22
 */
public class TrainInfo {
    /**
     * 火车编号
     */
    private String trainNo;
    /**
     * 起始站
     */
    private String startStation;
    /**
     * 终点站
     */
    private String arrivalStation;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 到达时间
     */
    private String arrivalTime;
    /**
     * 车类型
     */
    private String type;
    /**
     * 运行时间
     */
    private String runTime;
    /**
     * 里程
     */
    private  Double mile;

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public Double getMile() {
        return mile;
    }

    public void setMile(Double mile) {
        this.mile = mile;
    }

    public TrainInfo() {
    }

    public TrainInfo(String trainNo, String startStation, String arrivalStation, String startTime, String arrivalTime, String type, String runTime, Double mile) {
        this.trainNo = trainNo;
        this.startStation = startStation;
        this.arrivalStation = arrivalStation;
        this.startTime = startTime;
        this.arrivalTime = arrivalTime;
        this.type = type;
        this.runTime = runTime;
        this.mile = mile;
    }
}
