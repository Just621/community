package life.just.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*controller的意思是允许这个类去接收请求*/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";

    }
}
