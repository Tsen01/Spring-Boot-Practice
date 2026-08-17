package tw.tsen.ch05_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher{
    // 不指定印表機
    @Autowired
    private Printer printer;

    // 指定使用 HpPrinter
    // private final Printer printer = new HpPrinter();

    public void teach(){
        printer.print("I'm a teacher.");
    }
}
