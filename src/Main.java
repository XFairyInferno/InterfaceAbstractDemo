import Abstract.CustomerService;
import Abstract.ValidationService;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Concrete.ValidationManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        customer.id=31;
        customer.firstName="Arca";
        customer.lastName="asdas";
        ValidationService validationService=new ValidationManager();

        CustomerService neroManager=new NeroCustomerManager();
        CustomerService starManager= new StarBucksCustomerManager(validationService);
        starManager.Save(customer);
		
	
	

	}

}
