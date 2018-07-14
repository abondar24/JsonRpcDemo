package org.abondar.experimental.jsonrpcdemo.client;

import com.googlecode.jsonrpc4j.IJsonRpcClient;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;

import java.net.URL;

public class Client {
    private static final String SERVER_ENDPOINT = "http://localhost:8024/demoService";

    public static void main(String[] args) throws Exception {
        IJsonRpcClient client = new JsonRpcHttpClient(new URL(SERVER_ENDPOINT));


        DemoService service = ProxyUtil.createClientProxy(Client.class.getClassLoader(),DemoService.class,client);

        System.out.println(service.hello("Alex"));
        System.out.println("Today is " + service.getDate());
    }



}
