package pl.marcinszewczyk.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SdsApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("sda.xml");
                new AnnotationConfigApplicationContext(SdaConfig.class);
        SdaService sdaService = applicationContext.getBean("sdaService", SdaService.class);
        sdaService.run();
    }


}
