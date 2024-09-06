package org.example.springcorehw2_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

@Data
public class Student {
//    Создать класс Student
//    Свойства id группа и фио
//    Без конструктора
//    Ничего не внедрять
    private int id;
    private String group;
    private String surname;
    private String name;
    private String lastname;

}
