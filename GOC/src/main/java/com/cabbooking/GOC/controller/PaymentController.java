package com.cabbooking.GOC.controller;
import com.cabbooking.GOC.dto.PaymentRequestDTO;
import com.cabbooking.GOC.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/pay")
    public String makePayment(@RequestBody PaymentRequestDTO  dto) {

        paymentService.makePayment(dto);
        return "Payment Sucessful";
    }

}

