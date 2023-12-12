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

/**
 * @author 童归权
 * @version 1.0 2021/1/22
 */
@WebServlet("/showtrain")
public class ShowTrain extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TrainService trainService=new TrainServiceImpl();
        String tid= req.getParameter("id");
        TrainInfo trainInfo=new TrainInfo();
        try {
            trainInfo= trainService.findTrain(tid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("train",trainInfo);
        req.getRequestDispatcher("/showTrain.jsp").forward(req,resp);

    }
}
