package com.chaoyue.test.swagger;

import com.mangofactory.swagger.paths.RelativeSwaggerPathProvider;

import javax.servlet.ServletContext;

/**
 * 主要解决nginx转发的基础路径不同的问题
 */
public class NginxSwaggerPathProvider extends RelativeSwaggerPathProvider {

    private String nginxPath;

    /**
     * @param servletContext servletContext
     * @param nginxPath      should end with \ e.g. api3\ or empty string
     */
    public NginxSwaggerPathProvider(ServletContext servletContext, String nginxPath) {
        super(servletContext);
        this.nginxPath = nginxPath;
    }

    @Override
    protected String applicationPath() {
        return super.applicationPath() + nginxPath;
    }

    public String getNginxPath() {
        return nginxPath;
    }

    public void setNginxPath(String nginxPath) {
        this.nginxPath = nginxPath;
    }

}