package com.javalover.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;
    private String name;
    private String projectCode;
    @OneToMany(cascade = CascadeType.PERSIST,orphanRemoval = true)
    @JoinColumn(name = "projectId_fk",referencedColumnName = "projectId")
    private List<Engineer> engineers;

}
