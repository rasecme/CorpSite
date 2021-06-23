package com.globex.web;

import com.globex.web.config.SpringConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.lightstep.opentelemetry.launcher.OpenTelemetryConfiguration;

OpenTelemetryConfiguration.newBuilder()
                  .setServiceName("GlobexWeb")
                  .setAccessToken("+3ebvEvYjVREOk3aWr0oMgAyrpEU1YQ6ROuFGAOEMcxkVMdRwrPKm9No+8pnvaDHUjPLtYjLcDy0AhnkmEJMMD4MvLB8LJnNMcULosBX")
                  .install();


public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
