package sda.ee.springboot.dto;

// creates the getters and setters!!
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Ryan Alexander on 20/11/2018.
 */

@Entity
@Data
//all argument constructors
@AllArgsConstructor
//empty contructors
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
}
