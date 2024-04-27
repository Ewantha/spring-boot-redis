package com.eudagama12.example.redis.repository;

import com.eudagama12.example.redis.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, String> {}
