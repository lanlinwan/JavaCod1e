package service;

import entity.TrainInfo;

import java.util.List;

public interface TrainService {
    /**
     * 查询所有车次的信息
     * @return List<TrainInfo>
     */
    List<TrainInfo> getAllTrain() throws Exception;

    /**
     *
     * @param trainId 车次号数组
     * @return
     * @throws Exception
     */
    void delTrain(String[] trainId) throws Exception;

    /**
     * 查询指定车次的车次信息
     * @return  TrainInfo
     */
    TrainInfo findTrain(String no) throws Exception;
}
