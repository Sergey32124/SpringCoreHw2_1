package org.example.springcorehw2_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;
@Data
@Scope("singleton")
public class School {
    private String name;
    private String adress;


}
