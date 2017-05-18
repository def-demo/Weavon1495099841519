package com.altimetrikCCIndex.api.service.impl;

import com.altimetrikCCIndex.api.service.*;
import com.altimetrikCCIndex.models.*;
import org.springframework.stereotype.Service;
import com.altimetrikCCIndex.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrikCCIndex.models.Employeeccindex;


import java.util.List;
import com.altimetrik.CCIndex.exception.NotFoundException;


@Service
@Transactional
public class EmployeeccindexApiServiceImpl implements EmployeeccindexApiService {
		  	  
	  @Autowired
	
  	  private EmployeeccindexRepository  employeeccindexRepository ;
	   
  
  
				
			
      @Override
      public List<Employeeccindex> findAllEmployeeccindex()
      throws NotFoundException {
      
        
  		
  		
  			return employeeccindexRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Employeeccindex updateEmployeeccindex(Employeeccindex employeeccindex)
      throws NotFoundException {
      
         
        	return employeeccindexRepository.save(employeeccindex);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Employeeccindex addEmployeeccindex(Employeeccindex employeeccindex)
      throws NotFoundException {
      
         
        	return employeeccindexRepository.save(employeeccindex);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Employeeccindex findByIdEmployeeccindex(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return employeeccindexRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteEmployeeccindex(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

