package bigdatasystem.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


//@RequestMapping("/api/test")
@Controller
public class ArtsController {

    @GetMapping("/main")
    public String start() {
        return "main";
    }


}
