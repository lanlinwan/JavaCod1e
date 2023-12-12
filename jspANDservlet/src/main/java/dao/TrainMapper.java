package dao;



import entity.TrainInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TrainMapper {

    /**
     * 查询所有车次的信息
     * @return List<TrainInfo>
     */
    @Select("select trainNo,startStation,arrivalStation,startTime,arrivalTime,type,runTime,mile from train")
    List<TrainInfo> getAllTrain() ;

    /**
     * 删除车次信息
     * @param trainId 车次id
     * @return int
     */
    @Delete("delete from train where trainNo=#{trainId}")
    int delTrain(String trainId) throws Exception;

    /**
     * 查询指定车次的车次信息
     * @return  TrainInfo
     */
    @Select("select trainNo,startStation,arrivalStation,startTime,arrivalTime,type,runTime,mile from train where trainNo=#{no}")
    TrainInfo findTrain(String no) throws Exception;
}
