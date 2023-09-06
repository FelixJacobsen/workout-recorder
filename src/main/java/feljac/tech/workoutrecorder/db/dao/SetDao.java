package feljac.tech.workoutrecorder.db.dao;

import feljac.tech.workoutrecorder.db.entity.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SetDao extends JpaRepository<Set, Long> {

    Set findById(@Param("id") Long id);

    List<Set> findByExerciseId(@Param("exercise-id") Long id);
}
