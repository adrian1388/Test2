package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carvajalonline.domain.OperationResult;
import com.carvajalonline.domain.OperationSuccess;

@RestController
public class TestController {

    @RequestMapping(value = "/text")
    public OperationResult forgotPassword(
            @RequestParam("text")
            String text,

            HttpServletRequest request,
            HttpServletResponse response
        ) {
    	
System.out.println(" string: " + text);

        return new OperationSuccess("success");
    }
}
