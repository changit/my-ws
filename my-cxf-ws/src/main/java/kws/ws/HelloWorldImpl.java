package kws.ws;

import javax.jws.WebService;

import kws.ws.HelloWorld;
import kws.ws.Request;
import kws.ws.Response;

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

	public Response payBill(Request request) {
		Response response = new Response();
		
		if("wow".equals(request.getRequestString())) {
			response.setResponseCode(1);
		} else {
			response.setResponseCode(0);
		}
		
		return response;
	}
}
