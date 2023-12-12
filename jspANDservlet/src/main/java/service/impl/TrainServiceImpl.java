package service.impl;



import dao.TrainMapper;
import entity.TrainInfo;
import org.apache.ibatis.session.SqlSession;
import service.TrainService;
import util.ConnUtil;

import java.util.List;

/**
 * @author 童归权
 * @version 1.0 2021/1/22
 */
public class TrainServiceImpl implements TrainService {
    SqlSession sqlSession= ConnUtil.conn();
    TrainMapper trainDAO=sqlSession.getMapper(TrainMapper.class);
    @Override
    public List<TrainInfo> getAllTrain() throws Exception {
        return trainDAO.getAllTrain();
    }

    @Override
    public void delTrain(String[] trainId) throws Exception {
        for (String s : trainId) {
            trainDAO.delTrain(s);
            sqlSession.commit();
        }
    }

    @Override
    public TrainInfo findTrain(String no) throws Exception {
        return trainDAO.findTrain(no);
    }
}
