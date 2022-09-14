package com.srbh.udemy.entity.models;

import com.srbh.udemy.entity.enums.CategoryType;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    //Will be professional UserType
    @ManyToOne(cascade = CascadeType.ALL)
    private User author;

    private double price;

    //input in format: P3DT12H45M30.345000S
    //3DT: 3days
    //12H: 12 hours, etc.
    private String duration;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> domain;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> orders;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews;

    //Avg
    private double ratings;

    //Helps in recalculating avg ratings after a new rating
    private int noOfRatings;

}
