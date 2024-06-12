package com.wocck.spot.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public Map<String, Object> handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        Map<String, Object> errorInfo = new HashMap<>();

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                errorInfo.put("errorCode", "404");
                errorInfo.put("errorMessage", "Nie znaleziono strony");
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                errorInfo.put("errorCode", "500");
                errorInfo.put("errorMessage", "Wewnętrzny błąd serwera");
            } else {
                errorInfo.put("errorCode", statusCode);
                errorInfo.put("errorMessage", "Wystąpił nieoczekiwany błąd");
            }
        }
        return errorInfo;
    }
}
