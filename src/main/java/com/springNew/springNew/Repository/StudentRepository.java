package com.springNew.springNew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springNew.springNew.Model.Student;

/**
 * @author krishnakumar
 *
 */
public interface StudentRepository  extends JpaRepository<Student, Long>{

}
