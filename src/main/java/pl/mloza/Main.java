package pl.mloza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Main {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Hello World!</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
