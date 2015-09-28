package ex.spring.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ex.spring.practice.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
