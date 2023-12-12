package servlet;



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
@WebServlet("/delete")
public class DeleteTrain extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ids=req.getParameterValues("id");
        TrainService trainService=new TrainServiceImpl();
        try {
            trainService.delTrain(ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/train").forward(req,resp);
    }
}
