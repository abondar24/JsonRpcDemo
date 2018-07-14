package org.abondar.experimental.jsonrpcdemo.client;

import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.Date;

@JsonRpcService("/demoService")
public interface DemoService {
        String hello(String name);
        Date getDate();

}
