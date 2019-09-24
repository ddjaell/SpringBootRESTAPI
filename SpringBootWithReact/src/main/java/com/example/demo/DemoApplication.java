package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.Device;
import com.example.demo.repositories.DeviceRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Override
	public void run(String...args) throws Exception
	{
		//logger.info("All devices -> {}", deviceRepository.findAll().get(0).getId());
		//deviceRepository.insert(new Device("REST_TEST", 0, 0, "", "10.1.1.1", "","","","","","","","","","","","","","","","",""));
		//logger.info("device found by id REST_TEST -> {}", deviceRepository.findById("REST_TEST"));
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}

}
