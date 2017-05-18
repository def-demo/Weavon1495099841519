package com.altimetrikCCIndex.models.repository;

import com.altimetrikCCIndex.models.*;

import com.altimetrikCCIndex.models.SoftSkills;
import com.altimetrikCCIndex.models.CoreAltimetrikSkills;
import com.altimetrikCCIndex.models.TechnicalSkills;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmployeeccindexRepository extends JpaRepository<Employeeccindex, String>{

}



