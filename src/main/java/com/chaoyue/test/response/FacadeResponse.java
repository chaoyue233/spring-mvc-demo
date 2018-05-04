package com.chaoyue.test.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class FacadeResponse<T> implements Serializable {
    private static final long serialVersionUID = 7052826045269070971L;

    @Getter
    @Setter
    private FacadeResponseMeta meta;

    @Getter
    @Setter
    private FacadeResponseResult<T> result;


    public FacadeResponse() {
    }

    public FacadeResponse(String code) {
        FacadeResponseMeta facadeResponseMeta = new FacadeResponseMeta(code);
        FacadeResponseResult<T> facadeResponseResult = new FacadeResponseResult<>();
        this.meta = facadeResponseMeta;
        this.result = facadeResponseResult;
    }

    public FacadeResponse(String code, T data) {
        this.meta = new FacadeResponseMeta(code);
        this.result = new FacadeResponseResult<>(data);
    }

    public FacadeResponse(String code, String message, T data) {
        if (message != null) {
            this.meta = new FacadeResponseMeta(code);
        } else {
            this.meta = new FacadeResponseMeta(code, message);
        }
        this.result = new FacadeResponseResult<>(data);
    }
}
