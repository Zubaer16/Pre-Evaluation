package com.example.management_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.exception.DataException;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id

    private Long reg_id;
    private Long institution_id;
    private Long student_id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    private Date reg_date;
    private Date date_of_birth;
    private int age;
    private String gender;

    @Column(unique = true)
    private Long nid;

    private String occupation;
    private String email;

    @CreatedDate
    private Date created_on;

    private String created_by;


}
