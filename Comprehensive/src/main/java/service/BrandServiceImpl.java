package service;

import mapper.BrandMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Brand;
import pojo.PageBean;
import util.SqlSessionUtils;

import java.util.List;

public class BrandServiceImpl implements BrandService {
    //1. 创建SqlSessionFactory 工场对象
    SqlSessionFactory factory = SqlSessionUtils.getSqlSessionFactory();

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<Brand> selectAll() {
        //2. 获取
        SqlSession sqlSession = factory.openSession();
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        List<Brand> brands = mapper.selectAll();
        //5.释放资源
        sqlSession.close();

        return brands;
    }

    /**
     * 添加
     *
     * @param brand
     */
    @Override
    public void add(Brand brand) {
        //1. 获取
        SqlSession sqlSession = factory.openSession();
        //2.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3.调用方法
        mapper.add(brand);
        //4.提交事务
        sqlSession.commit();


        //5.释放资源
        sqlSession.close();


    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //调用方法
        mapper.deleteByIds(ids);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param pageSize    每页展示条数
     * @return
     */
    @Override
    public PageBean<Brand> selectByPage(int currentPage, int pageSize) {
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //1.计算开始索引
        int begin=(currentPage-1) * pageSize;
        //2.计算查询条目
        int size =pageSize;

        //3.查询当前页数据
        List<Brand> rows=mapper.selectByPage(begin,size);
        //4.查询中记录数
        int totalCount =mapper.selectTotalCount();
        //5.封装对象并返回
        PageBean<Brand> pageBean=new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);

        sqlSession.close();

        return  pageBean;


    }

    /**
     * 分页 条件查询
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    @Override
    public PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand) {
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //1.计算开始索引
        int begin=(currentPage-1) * pageSize;
        //2.计算查询条目
        int size =pageSize;

        //处理brand条件,模糊表达式
        String brandName=brand.getBrandName();
        if(brandName !=null && brandName.length()>0){
            brand.setBrandName("%"+brandName+"%");
        }
        String companyName = brand.getCompanyName();
        if (companyName != null && companyName.length() > 0) {
            brand.setCompanyName("%" + companyName + "%");
        }

        //3.查询当前页数据
        List<Brand> rows=mapper.selectByPageAndCondition(begin,size,brand);
        //4.查询中记录数
        int totalCount =mapper.selectTotalCountByCondition(brand);
        //5.封装对象并返回
        PageBean<Brand> pageBean=new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);

        sqlSession.close();

        return  pageBean;

    }

}
