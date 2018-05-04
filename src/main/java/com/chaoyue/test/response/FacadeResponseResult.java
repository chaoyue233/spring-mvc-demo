package com.chaoyue.test.response;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FacadeResponseResult<T> implements Serializable {
    private static final long serialVersionUID = -2542773673758406245L;
    @Getter
    @Setter
    private FacadeResponseResultPage page;
    @Getter
    @Setter
    private T data;

    FacadeResponseResult() {
    }

    @SuppressWarnings("unchecked")
    FacadeResponseResult(T data) {
        if (data != null) {
            // 如果data类型为pageInfo 进行拆分
            if (data.getClass().equals(PageInfo.class)) {
                PageInfo pageInfo = (PageInfo) data;
                this.page = new FacadeResponseResultPage(
                        pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal());
                Map<String, Object> resultMap = new HashMap<>();
                resultMap.put("list", pageInfo.getList());
                this.data = (T) resultMap;
            } else if (data.getClass().equals(ArrayList.class)) {
                Map<String, Object> resultMap = new HashMap<>();
                resultMap.put("list", data);
                this.data = (T) resultMap;
            } else {
                this.data = data;
            }
        }
    }
}


// page
class FacadeResponseResultPage implements Serializable {
    private static final long serialVersionUID = -3263542269864903648L;
    @Getter
    @Setter
    private Integer currentPage;
    @Getter
    @Setter
    private Integer pageSize;
    @Getter
    @Setter
    private Long totalCount;

    public FacadeResponseResultPage() {
    }

    FacadeResponseResultPage(Integer currentPage, Integer pageSize, Long totalCount) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }
}

