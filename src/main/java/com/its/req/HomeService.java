package com.its.req;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public void serviceMethod1(String param1, String param2) {
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
    }
}
