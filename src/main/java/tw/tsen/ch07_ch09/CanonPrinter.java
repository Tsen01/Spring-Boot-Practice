package tw.tsen.ch07_ch09;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer {
    private int count;

    @PostConstruct
    public void initialize(){
        count = 5;  // count 的值初始化為 5
    }
    @Override
    public void print(String message){
        count--;
        System.out.println("Canon 印表機: " + message);
        System.out.println("剩餘次數: " + count);
    }
}