package cn.jiangwenwen.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class People {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long personId;

    private String firstName;

    private String LastName;

}
