package com.profile.studentmanagementservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.studentmanagemententity.Student;
import com.profile.studentmanagementrepository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		List<Student> Student = new ArrayList<Student>();
		studentRepository.findAll().forEach(Student1 -> Student.add(Student1));
		return Student;
	}

	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}

	public void delete(long id) {
		studentRepository.deleteById(id);
	}

	public void update(Student student, long id) {
		studentRepository.save(student);
	}
}
