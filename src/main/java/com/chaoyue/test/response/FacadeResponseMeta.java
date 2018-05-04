package com.chaoyue.test.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class FacadeResponseMeta implements Serializable {
    private static final long serialVersionUID = 2258917990541559780L;
    @Setter
    @Getter
    private Integer errno;
    @Getter
    @Setter
    private String msg;

    public FacadeResponseMeta() {
    }

    FacadeResponseMeta(String errno) {
        this.errno = Integer.valueOf(errno);
        this.msg = null;

    }

    FacadeResponseMeta(String errno, String msg) {
        String sysMsg = null;
        if (sysMsg != null) {
            this.msg = sysMsg;
        } else {
            this.msg = msg;
        }
        this.errno = Integer.valueOf(errno);
    }
}
