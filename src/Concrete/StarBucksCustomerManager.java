package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ValidationService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager{
 
	ValidationService validationservice;
	
	public StarBucksCustomerManager(ValidationService _validationService) {
		validationservice = _validationService; 
	}
	
	@Override
	public void Save(Customer customer) {
		if(validationservice.Validate(customer)) {
			System.out.println("Saved to db: "+customer.firstName);
		}else {
			System.out.println("Geçersiz Kiþi.");
		}
		
		
	}

}
