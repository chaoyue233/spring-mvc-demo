package com.chaoyue.test.swagger;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CORS 跨域访问支持
 * 目前主要为 api文档做跨域配置
 *
 **/
public class CORSInterceptor extends HandlerInterceptorAdapter {

  private static String DEFAULT_API_DOC_SERVER = "http://wxbase.dev.rongyi.so";

  private String apiDocServer = DEFAULT_API_DOC_SERVER;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    response.addHeader("Access-Control-Allow-Origin",DEFAULT_API_DOC_SERVER);
    response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, OPTIONS");
    // response.addHeader("Access-Control-Max-Age", "100");
    response.addHeader("Access-Control-Allow-Headers", "Content-Type, api_key, Authorization");
    // response.addHeader("Access-Control-Allow-Credentials", "false");
    return super.preHandle(request, response, handler);
  }

  public String getApiDocServer() {
    return apiDocServer;
  }

  public void setApiDocServer(String apiDocServer) {
    this.apiDocServer = apiDocServer;
  }

}
