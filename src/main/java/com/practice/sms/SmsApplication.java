package com.practice.sms;

import com.practice.sms.entity.Student;
import com.practice.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Mason", "Mount", "masonmount@email.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Christian", "Pulisic", "christianpulisic@email.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Reece", "James", "reecejames@email.com");
//		studentRepository.save(student3);


	}
}
