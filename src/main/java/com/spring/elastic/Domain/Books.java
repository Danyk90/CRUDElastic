package com.spring.elastic.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Books {
    @Id
    @GeneratedValue
    private int id;
    private String author;
    private String title;
    @ManyToOne
    private Categoryy category;

}
