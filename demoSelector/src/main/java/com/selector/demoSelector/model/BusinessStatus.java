package com.selector.demoSelector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String status;

    @Override
    public String toString(){
        return "Department ID: " + id + "%nDepartment name: " + status;
    }

}
