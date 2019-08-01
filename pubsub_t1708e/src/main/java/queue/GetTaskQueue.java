package queue;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskHandle;
import com.google.appengine.api.taskqueue.TaskOptions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GetQueue extends HttpServlet {
    private static Queue q = QueueFactory.getQueue("pull-queue");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TaskHandle> tasks = q.leaseTasks(3600, TimeUnit.SECONDS, 5);
        
    }
}
