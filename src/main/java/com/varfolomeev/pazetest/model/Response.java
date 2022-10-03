package com.varfolomeev.pazetest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {

    private String timeStamp;

    private Integer status;

    private Result result;

}
