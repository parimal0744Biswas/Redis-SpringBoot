package com.parimal.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.parimal.entity.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService
{

	@Override
	public StudentEntity createStudent(StudentEntity studentEntity)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity deleteStudent(Long id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentEntity> viewAllStudent()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity updateStudent(Long id, StudentEntity studentEntity)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentEntity> uploadThroughCSV(MultipartFile file)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
