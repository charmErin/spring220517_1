package com.its.req;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // 스프링이 관리하는 객체를 쓰려면
    // 객체 주입한다 (필드)
    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    // /welcome 요청 처리
    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("HomeController.welcome");
        return "welcome";
    }

    @GetMapping("/form-ex")
    public String formEx() {
        System.out.println("HomeController.ex");
        return "form-ex";
    }

    // get 방식으로 전달 했기 때문에 get 방식으로 받아야 함
    // 방식이 다르면 오류 O
    @GetMapping("/param-req1")
    public String paramReq1(@RequestParam("param1") String param1,
                            @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        System.out.println("HomeController.paramReq1");
        return null;
    }

    // 주소는 같은데 방식을 다르게 하는건 가능 O
    @PostMapping("/param-req1")
    public String paramReq2(@RequestParam("param1") String param1,
                            @RequestParam("param2") String param2, Model model) {   // model 인터페이스
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        System.out.println("HomeController.paramReq1");

        // HomeService 클래스의 serviceMethod1() 메서드를 호출하면서
        // param1, param2를 넘기고 serviceMethod1 에서는 param1, param2의 값을 출력
        //HomeService hs = new HomeService();
        homeService.serviceMethod1(param1, param2);

        // param1, param2 를 "param1", "param2"에 담아서 param-print.jsp 로 가져가서 출력
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);


        return "param-print";
    }

}
