package com.example.sample.service;

import java.util.List;

import com.example.sample.blueprint.Bank;

public interface BankService {
			Bank saveEmployee(Bank obj);//Restaurents-Employee
			List<Bank> fetchAllEmployee();
			Bank getEmployeeById(int id);
			 Object viewEmployefromDB();
			 void deleteEmployeeByid(int id);
			

	}


