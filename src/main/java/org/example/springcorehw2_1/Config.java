package org.example.springcorehw2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Configuration
@ComponentScan("org.example.springcorehw2_1")
public class Config {

    @Bean
   public Student student(){
     Student student=new Student();
     student.setId(1);
     student.setSurname("Иванов");
     student.setName("Сергей");
     student.setLastname("Викторович");
     student.setGroup("IT-1");
     return student;
    }
    @Bean
    public Student student1(){
        Student student=new Student();
        student.setId(2);
        student.setSurname("Иванов");
        student.setName("Сергей");
        student.setLastname("Викторович");
        student.setGroup("IT-2");
        return student;
    }
    @Bean
    public Student student2(){
        Student student=new Student();
        student.setId(3);
        student.setSurname("Иванов");
        student.setName("Сергей");
        student.setLastname("Викторович");
        student.setGroup("IT-3");
        return student;
    }
    @Bean
    public Student student3(){
        Student student=new Student();
        student.setId(4);
        student.setSurname("Иванов");
        student.setName("Сергей");
        student.setLastname("Викторович");
        student.setGroup("IT-4");
        return student;
    }
    @Bean
    public Student student4(){
        Student student=new Student();
        student.setId(5);
        student.setSurname("Иванов");
        student.setName("Сергей");
        student.setLastname("Викторович");
        student.setGroup("IT-5");
        return student;
    }
    @Bean
    public School school(Student student){
     School school=new School();
     school.setName("KKKKK");
     school.setAdress("NT-65");
     school(student);
     return school;
    }
}
