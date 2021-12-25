/**
 * 
 */
package com.microservices.loans.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.loans.domain.Loan;

/**
 * @author pawan
 *
 */

@RestController
public class LoanService {
	
	@GetMapping("/loans/{id}")
	public Loan createLoan(@PathVariable long id) throws Exception {
		Loan loan = new Loan();
		loan.setId(10001);
		loan.setAmount(10000);
		loan.setTenure(15);
		return loan;
	}
	
	@PostMapping("/loans/create")
	public Loan createLoan(@RequestBody Loan loan) throws Exception {
		if(loan.getAmount()<5000)
			throw new Exception("Loan amount should be greater than or equal to 5000");
		
		if(loan.getAmount()>50000)
			throw new Exception("Loan amount should be less than or equal to 50000");
		
		if(loan.getTenure()<5)
			throw new Exception("Loan tenure should be greater than or equal to 5");
		
		if(loan.getAmount()>30)
			throw new Exception("Loan tenure should be less than or equal to 30");
		
		loan.setId(10001);
		
		return loan;
	}

}
