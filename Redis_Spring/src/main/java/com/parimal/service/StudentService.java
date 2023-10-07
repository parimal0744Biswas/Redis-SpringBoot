package com.parimal.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.parimal.entity.StudentEntity;

public interface StudentService
{
	StudentEntity createStudent(StudentEntity studentEntity);

	StudentEntity deleteStudent(Long id);

	List<StudentEntity> viewAllStudent();

	StudentEntity updateStudent(Long id, StudentEntity studentEntity);

	List<StudentEntity> uploadThroughCSV(MultipartFile file);

}
