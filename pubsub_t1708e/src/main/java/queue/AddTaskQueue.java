package queue;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddQueue extends HttpServlet {
    private static Queue q = QueueFactory.getQueue("demo-queue");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        q.add(TaskOptions.Builder.withMethod(TaskOptions.Method.PULL).payload(req.getParameter("content")));
    }
}
