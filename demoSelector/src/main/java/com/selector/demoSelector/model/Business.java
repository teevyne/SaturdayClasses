package com.selector.demoSelector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String businessName;

    private String businessOwner;

    private String location;

    @OneToOne
//    @JoinColumn
    private BusinessStatus businessStatus;

    public String toString(){
        return "Business info: %nName: " + businessName + "%nOwned by " + businessOwner + "%nLocation " + location +
                "%nDepartment: " + businessStatus;
    }
}
