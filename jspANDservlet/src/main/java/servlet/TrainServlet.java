package servlet;


import entity.TrainInfo;
import service.TrainService;
import service.impl.TrainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 童归权
 * @version 1.0 2021/1/22
 */
@WebServlet("/train")
public class TrainServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TrainService trainService=new TrainServiceImpl();
        List<TrainInfo> infoList=new ArrayList<>();
        try {
            System.out.println("infoList: "+infoList);
            infoList=trainService.getAllTrain();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("list",infoList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
