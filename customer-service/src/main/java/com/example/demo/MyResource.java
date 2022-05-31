package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;

/**
 * Root resource (exposed at "myresource" path)
 */
@RestController
@RequestMapping("/resource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
	@RequestMapping(value ="/get", method = RequestMethod.GET)
    public String getIt() {
		System.out.println("pase por get 2");
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Camilo");
		customer.setAddress("Carra 14 # 9 -62");
		customer.setPhoneNumber("3105504647");
        return customer.getName();
    }
}
