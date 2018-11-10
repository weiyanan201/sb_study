package lesson.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        System.out.println(context.getEnvironment().getProperty("os.name"));

        ListService service = context.getBean(ListService.class);
        System.out.println(service.showListCmd());

        
    }
}
