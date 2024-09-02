package org.example.springcorehw2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
        Student student1=context.getBean("student1",Student.class);
        System.out.println(student1);
        Student student2=context.getBean("student2",Student.class);
        System.out.println(student2);
        Student student3=context.getBean("student3",Student.class);
        System.out.println(student3);
        Student student4=context.getBean("student4",Student.class);
        System.out.println(student4);
    }
}
