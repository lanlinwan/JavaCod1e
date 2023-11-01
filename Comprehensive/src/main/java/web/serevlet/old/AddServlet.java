package web.serevlet.old;

import com.alibaba.fastjson.JSON;
import pojo.Brand;
import service.BrandService;
import service.BrandServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

//@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    private BrandService brandService=new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
