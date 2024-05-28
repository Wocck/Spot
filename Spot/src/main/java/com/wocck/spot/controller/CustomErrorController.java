package com.wocck.spot.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ModelAndView handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        ModelAndView modelAndView = new ModelAndView("error");  // Default view is set to 'error'

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                modelAndView.addObject("errorCode", "404");
                modelAndView.addObject("errorMessage", "Nie znaleziono strony");
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                modelAndView.addObject("errorCode", "500");
                modelAndView.addObject("errorMessage", "Wewnętrzny błąd serwera");
            } else {
                modelAndView.addObject("errorCode", statusCode);
                modelAndView.addObject("errorMessage", "Wystąpił nieoczekiwany błąd");
            }
        }
        return modelAndView;
    }
}
