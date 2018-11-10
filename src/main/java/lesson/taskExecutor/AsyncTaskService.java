package lesson.taskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int i) throws InterruptedException {
        System.out.println("执行异步操作：" + i + Thread.currentThread().toString());
        Thread.sleep(1000);
    }

    @Async
    public void executeAsyncPlusTask(int i) throws InterruptedException {
        System.out.println("执行异步加：" + i + Thread.currentThread().toString());
        Thread.sleep(2000);
    }
}
