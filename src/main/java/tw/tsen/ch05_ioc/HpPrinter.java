package tw.tsen.ch05_ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 告訴 Spring 如果沒指定印表機, 優先選擇 HpPrinter
public class HpPrinter implements Printer{
    @Override
    public void print(String message){
        System.out.println("Hp 印表機: " + message);
    }
}
