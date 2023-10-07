package com.parimal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parimal.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<Long, StudentEntity>
{

}
