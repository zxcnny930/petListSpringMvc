package com.petList.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatFrom {
    private int id;
    private String name;
    private String gender;
    private String location;
    private String date;
    private int phone;
    private String Prove;
}
