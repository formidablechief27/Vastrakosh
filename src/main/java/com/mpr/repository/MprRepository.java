package com.mpr.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.mpr.model.*;


public interface MprRepository extends JpaRepository<Mpr, String>{
	
}
