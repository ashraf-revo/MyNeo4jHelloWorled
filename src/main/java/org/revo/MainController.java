package org.revo;

import org.revo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ashraf on 4/10/15.
 */
@RestController
public class MainController {
    @Autowired
    UserService service;

    @RequestMapping("/")
    public String index() {
        service.create("ddddd", "ddddddd");
        return "hhh";
    }
}
