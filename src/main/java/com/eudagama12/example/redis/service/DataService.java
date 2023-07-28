package com.eudagama12.example.redis.service;

import com.eudagama12.example.redis.entity.Student;
import com.eudagama12.example.redis.repository.StudentRepository;
import com.eudagama12.example.redis.repository.TeacherRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataService {

    final
    StudentRepository studentRepository;

    final TeacherRepository teacherRepository;

    @Autowired
    public DataService(StudentRepository studentRepository, TeacherRepository teacherRepository) {
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
    }

    @PostConstruct
    void init() {
        saveData();
        getData();
    }

    public void saveData() {
        Student student = new Student(
                "Eng2015001", "John Doe", Student.Gender.MALE, 1);
        studentRepository.save(student);

    }

    public void getData() {
        Student retrievedStudent =
                studentRepository.findById("Eng2015001").get();
        log.info(retrievedStudent.toString());

    }
}
