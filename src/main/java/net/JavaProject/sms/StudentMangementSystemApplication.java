package net.JavaProject.sms;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.JavaProject.sms.entity.Student;
import net.JavaProject.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@NoArgsConstructor
@SpringBootApplication
public class StudentMangementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentMangementSystemApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student s1=new Student("Mohammad","Sameer","sam@gmail.com");
//		studentRepository.save(s1);
//
//		Student s2=new Student("Mohammad","shad","shad@gmail.com");
//		studentRepository.save(s2);
//
//		Student s3=new Student("Mohammad","Said","saif@gmail.com");
//		studentRepository.save(s3);
	}
}
