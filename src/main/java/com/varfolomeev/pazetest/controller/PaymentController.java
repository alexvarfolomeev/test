package com.varfolomeev.pazetest.controller;

import com.varfolomeev.pazetest.client.PaymentClient;
import com.varfolomeev.pazetest.client.PaymentClientImpl;
import com.varfolomeev.pazetest.exceptions.PaymentException;
import com.varfolomeev.pazetest.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.math.BigDecimal;

import static java.util.Objects.isNull;


@Controller
@RequestMapping("/api/v1/payment")
public class PaymentController {

    @Autowired
    PaymentClient paymentClient;

    private final static String BEARER_TOKEN = "cAmmvalAikARkB81fgxgMtnMbEdNbuWa";

    @GetMapping("/create-payment")
    public String createPayment(Model model) {
        model.addAttribute("request", new Request());
        return "/create_payment";
    }

    @PostMapping(value = "/create-payment")
    public RedirectView createPayment(@ModelAttribute Request request) throws PaymentException {
        try {
            if (!isNull(request.getAmount())) {
                var response = paymentClient.createPayment(request.getAmount(), BEARER_TOKEN, request);
                var redirectUrl = response.getResult().getRedirectUrl();
                var redirectView = new RedirectView();
                redirectView.setUrl(redirectUrl);
                return redirectView;
            } else {
                throw new PaymentException();
            }
        } catch (Throwable e) {
            throw new PaymentException();
        }
    }
}
