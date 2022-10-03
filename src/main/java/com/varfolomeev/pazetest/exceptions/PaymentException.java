package com.varfolomeev.pazetest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Некорректный запрос")
public class PaymentException extends Throwable {

}
