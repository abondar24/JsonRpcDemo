package org.abondar.experimental.jsonrpcdemo.server;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
@AutoJsonRpcServiceImpl
public class ServerAPIImpl implements ServerAPI {

    @Override
    public String hello(String name) {
        return "Hello "+name;
    }

    @Override
    public Date getDate() {
        return new Date();
    }
}
