package Comprehensive.src.main.java.web.serevlet;

import com.alibaba.fastjson.JSON;
import Comprehensive.src.main.java.pojo.Brand;
import Comprehensive.src.main.java.pojo.PageBean;
import Comprehensive.src.main.java.service.BrandService;
import Comprehensive.src.main.java.service.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet{
    private BrandService brandService=new BrandServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用service查询
        List<Brand> brands=brandService.selectAll();
        //2.转为JSON
        String jsonString= JSON.toJSONString(brands);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1.接收品牌数据
        BufferedReader br=request.getReader();
        String params=br.readLine();//js字符串
        //2.转为Brand对象
        Brand brand=JSON.parseObject(params,Brand.class);
        //3.调用方法添加
        brandService.add(brand);
        //4.响应成功标识
        response.getWriter().write("success");

    }

    /**
     * 批量删除
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1.接收数据 []
        BufferedReader br=request.getReader();
        String params=br.readLine();//js字符串
        //2.转为int[]
        int[] ids=JSON.parseObject(params,int[].class);
        //3.调用方法添加
        brandService.deleteByIds(ids);
        //4.响应成功标识
        response.getWriter().write("success");
    }

    /**
     *分页查询
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收 当前页码 和 每页展示条数  get: url?currentPage=0&pageSize=5
        String _currentPage=request.getParameter("currentPage");
        String _pageSize=request.getParameter("pageSize");

        int currentPage=Integer.parseInt(_currentPage);
        int pageSize=Integer.parseInt(_pageSize);

        //2.调用方法查询
        PageBean<Brand> pageBean= brandService.selectByPage(currentPage,pageSize);

        //2.转为JSON
        String jsonString= JSON.toJSONString(pageBean);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }


    /**
     * 条件分页查询
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPageAndCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收 当前页码 和 每页展示条数  get: url?currentPage=0&pageSize=5
        String _currentPage=request.getParameter("currentPage");
        String _pageSize=request.getParameter("pageSize");

        int currentPage=Integer.parseInt(_currentPage);
        int pageSize=Integer.parseInt(_pageSize);

        //获取查询条件对象
        BufferedReader br=request.getReader();
        String params=br.readLine();//js字符串
        //转为brand
        Brand brand=JSON.parseObject(params,Brand.class);

        //2.调用方法查询
        PageBean<Brand> pageBean= brandService.selectByPageAndCondition(currentPage,pageSize,brand);

        //2.转为JSON
        String jsonString= JSON.toJSONString(pageBean);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }



}
