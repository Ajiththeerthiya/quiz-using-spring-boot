package com.quizweb.quizweb.repository;

import com.quizweb.quizweb.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query(value = "SELECT q FROM Question q WHERE category = ?1 ORDER BY RAND() LIMIT ?2")
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
