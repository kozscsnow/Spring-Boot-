package jpa_hibernate.jpa_hibernate.MVC.sayHello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello Java";
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJSP() {
        return "sayHello";
    }
}
