package com.example.manager.model;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;
    private Long assigneeId;
}
