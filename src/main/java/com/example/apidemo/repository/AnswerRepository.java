package com.example.apidemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apidemo.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long>{
	List<Answer> findByQuestionId(Long questionId);
}
