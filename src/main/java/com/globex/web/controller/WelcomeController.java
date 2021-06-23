package com.globex.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import com.lightstep.opentelemetry.launcher.OpenTelemetryConfiguration;

OpenTelemetryConfiguration.newBuilder()
                  .setServiceName("GlobexWeb")
                  .setAccessToken("+3ebvEvYjVREOk3aWr0oMgAyrpEU1YQ6ROuFGAOEMcxkVMdRwrPKm9No+8pnvaDHUjPLtYjLcDy0AhnkmEJMMD4MvLB8LJnNMcULosBX")
                  .install();


@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

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
