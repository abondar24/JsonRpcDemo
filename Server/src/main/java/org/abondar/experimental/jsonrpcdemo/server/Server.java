package org.abondar.experimental.jsonrpcdemo.server;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Server extends SpringBootServletInitializer {

    @Bean
    public static AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter() {
        AutoJsonRpcServiceImplExporter exp = new AutoJsonRpcServiceImplExporter();
        //in here you can provide custom HTTP status code providers etc. eg:
        //exp.setHttpStatusCodeProvider();
        //exp.setErrorResolver();
        return exp;
    }

    private static Logger logger = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Server.class);
        builder.web(WebApplicationType.SERVLET).bannerMode(Banner.Mode.OFF).run(args);
        logger.info("Application has started");
    }
}
