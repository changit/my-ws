package kws.ws;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: uchan
 * Date: 7/23/11
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "kws.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    public void sayHello() {
        System.out.println("Hello Hello");
    }
}
