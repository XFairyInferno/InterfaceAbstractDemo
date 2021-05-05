package Concrete;

import Abstract.ValidationService;
import Entities.Customer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean Validate(Customer cusotmer) {
		System.out.println("Validatoin process works... ");
		return true;
	}

}
