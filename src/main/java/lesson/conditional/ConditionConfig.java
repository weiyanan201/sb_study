package lesson.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(MacCondition.class)
    public ListService MacService() {
        return new MacListService();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService WindowsService(){
        return new WindowsListService();
    }
}
