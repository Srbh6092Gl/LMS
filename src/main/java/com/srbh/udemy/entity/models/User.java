package com.srbh.udemy.entity.models;

import com.srbh.udemy.entity.enums.CategoryType;
import com.srbh.udemy.entity.enums.Experience;
import com.srbh.udemy.entity.enums.UserType;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String displayName;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> interests;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> domainExpertise;

    private String role;

    @Enumerated(EnumType.STRING)
    private Experience experience;

    @URL(message = "Enter a valid URL")
    private String profileURL;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> cart;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> orders;

}