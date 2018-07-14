package org.abondar.experimental.jsonrpcdemo.server;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.Date;


@JsonRpcService("/demoService")
public interface ServerAPI {
    String hello(@JsonRpcParam(value = "name") String name);
    Date getDate();
}
