package com.profile.studentmanagementrepository;

import org.springframework.data.repository.CrudRepository;

import com.profile.studentmanagemententity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
