package lesson.scheduledTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportTask(){
        System.out.println("每隔5秒执行一次：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 55 12 ? * *")
    public void cronTask(){
        System.out.println("执行时间：" + dateFormat.format(new Date()));
    }
}
