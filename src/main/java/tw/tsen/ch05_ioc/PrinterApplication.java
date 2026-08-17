package tw.tsen.ch05_ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrinterApplication {

    public static void main(String[] args) {
        // 啟動 Spring 容器 (Spring Container)
        ApplicationContext context = SpringApplication.run(PrinterApplication.class, args);
        Teacher teacher = context.getBean(Teacher.class);
        teacher.teach();
    }

}
