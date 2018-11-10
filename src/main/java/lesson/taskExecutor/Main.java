package lesson.taskExecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);

        for (int i=0;i<100;i++){
            service.executeAsyncTask(i);
            service.executeAsyncPlusTask(i);
        }
    }
}
