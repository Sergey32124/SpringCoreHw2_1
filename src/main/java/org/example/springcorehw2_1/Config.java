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
   Student student(){return new  Student(111,"СТ","Иванов","Иван","Иванович");}

    @Bean
    Student student1(){return new  Student(112,"ТТ","Петров","Иван","Иванович");}

    @Bean
    Student student2(){return new  Student(113,"ДД","Иванов","Петр","Иванович");}

    @Bean
    Student student3(){return new  Student(114,"ЛЛ","Добров","Иван","Петрович");}

    @Bean
    Student student4(){return new  Student(115,"ХХ","Итан","Иван","Итанович");}
    @Bean
    School school(){return new School("AA","DSW",  );    }
}
