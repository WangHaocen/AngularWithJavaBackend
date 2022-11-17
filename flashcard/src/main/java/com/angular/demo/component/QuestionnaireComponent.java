package com.angular.demo.component;

import java.util.List;

import org.springframework.stereotype.Component;

import com.angular.demo.entity.Questionnaire;
import com.angular.demo.repository.QuestionnaireRepository;

@Component
public class QuestionnaireComponent {
	private QuestionnaireRepository questionnaireRepository;

    public QuestionnaireComponent(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public List<Questionnaire> getQuestionnaires() {
        return questionnaireRepository.findAll();
    }
    
    public Questionnaire saveQuestionnaire(Questionnaire questionnaire) {
    	return questionnaireRepository.save(questionnaire);
    }

}
