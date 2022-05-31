package globant.camcar.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import globant.camcar.customer.domain.Customers;
import globant.camcar.customer.domain.service.CustomerService;

/**
 * Root resource (exposed at "myresource" path)
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService; 

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
	@RequestMapping(value ="/test", method = RequestMethod.GET)
    public String getIt() {
		System.out.println("pase por get 2");
		
		Customers customer = new Customers();
		customer.setId(1);
		customer.setName("Camilo");
		customer.setAddress("Carra 14 # 9 -62");
		customer.setPhoneNumber("3105504647");
        return customer.getName();
    }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public boolean createCustomer(@RequestBody Customers customer) {
		System.out.println("pase por createCustomer controller");
		return customerService.createCustomer(customer);
	}
}
