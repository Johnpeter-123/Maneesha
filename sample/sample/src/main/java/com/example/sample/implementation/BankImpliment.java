package com.example.sample.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sample.blueprint.Bank;
import com.example.sample.repository.Repository;
import com.example.sample.service.BankService;

@Service
			public  class BankImpliment implements BankService{
				private Repository employeeInt;

				public BankImpliment(Repository employeeInt) {

					this.employeeInt = employeeInt;
				}

					@Override
					public List<Bank> fetchAllEmployee(){

						return employeeInt.findAll();//select * from learners_table
					}
			         @Override//for redable purpose
						public Bank saveEmployee(Bank obj) {//Restaurents-Salary
							return employeeInt.save(obj);  //insert query 
						}

						//get , find --> fetch only 1 rec on the basis id provided
						//findall
						
						@Override
						public Object viewEmployefromDB() {
							
							return employeeInt;
						}
						public Bank getEmployeeById(int id) {
							return	employeeInt.findById(id).get();
							}
							

						public void deleteEmployeeByid(int id) {
							employeeInt.deleteById(id);
							
						}
						

			}	



