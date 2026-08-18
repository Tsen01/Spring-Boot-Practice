package tw.tsen.ch07_ch09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    // 用 @Component 創建 Bean, Bean 的名字是 class 名稱的第一個字母會變成小寫
    @Qualifier("canonPrinter")  // 指定要注入 canonPrinter
    private Printer printer;

    // 在瀏覽器前往 http://localhost:8080/test 會執行 test()
    @RequestMapping("/test")
    public String test(){
        printer.print("Test");  // Canon 印表機會印出 Test
        return "Test";
    }
}
