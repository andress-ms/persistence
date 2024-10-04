package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="students")
@Getter @Setter
@ToString
public class Student {
    @Id
    @Column
    private Long id;

    @Basic
    private String name;
    private String major;


}
