package lesson.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("prod")
public class Tests {

    @Autowired
    private TestBean testBean;

    @Test
    public void test(){
        System.out.println(testBean.getContent()+"1");
    }

    @Test
    public void test2(){
        System.out.println(testBean.getContent()+"2");
    }
}
