package com.eudagama12.example.redis.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Teacher")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher implements Serializable {

    public enum Gender {
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
    // ...
}
