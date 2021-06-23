package com.globex.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import com.lightstep.opentelemetry.launcher.OpenTelemetryConfiguration;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;




@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    public static void main(String[] args) throws Exception {
        OpenTelemetryConfiguration.newBuilder()
                .setServiceName("GlobexWeb")
                .setAccessToken("+3ebvEvYjVREOk3aWr0oMgAyrpEU1YQ6ROuFGAOEMcxkVMdRwrPKm9No+8pnvaDHUjPLtYjLcDy0AhnkmEJMMD4MvLB8LJnNMcULosBX")
                .install();

        Tracer tracer = GlobalOpenTelemetry
                .getTracer("instrumentation-library-name", "1.0.0");
        Span span = tracer.spanBuilder("start example").startSpan();
        span.end();
    }
    @GetMapping("/")
    public String index(Model model) {
        logger.debug("Welcome to globex.com...");
        model.addAttribute("msg", getMessage());
        return "index";

    }

    public String getMessage() {
        return "we're not evil";
         }


}
