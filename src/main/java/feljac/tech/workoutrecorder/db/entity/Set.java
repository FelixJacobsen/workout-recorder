package feljac.tech.workoutrecorder.db.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "set")
@Data

public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date", nullable = false, updatable = false)
    private Date date = new Date();

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "reps", nullable = false)
    private Integer reps;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;
}
