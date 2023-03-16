package com.mpr.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpr.model.Mpr;
import com.mpr.repository.MprRepository;


@Service
@Transactional
public class MprService {

	@Autowired
	private MprRepository repository;

	public void createUser(String username, String password){
		Mpr user = new Mpr();
		user.setUsername(username);
		user.setPassword(password);
		repository.save(user);
	}
	public boolean getUser(String username, String password){
		Optional<Mpr> user = repository.findById(username);
		if(user.isPresent()) {
			if(user.get().getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}
