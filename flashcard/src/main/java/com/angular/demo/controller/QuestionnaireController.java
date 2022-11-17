package com.angular.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.demo.component.QuestionnaireComponent;
import com.angular.demo.entity.Questionnaire;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class QuestionnaireController {
	
	@Autowired
	QuestionnaireComponent questionnaireComponent;
	
	@GetMapping(path = "/questionnaires")
	public ResponseEntity<List<Questionnaire>> getAllQuestionnaires() {
	       // log.info("UsersController:  list users");
	        List<Questionnaire> resource = questionnaireComponent.getQuestionnaires();
	        //System.out.println(resource.get(0).getDescription());
	       // System.out.println(resource.get(0).toString());
	        return ResponseEntity.ok(resource);
	}
	
	@PostMapping(path = "/questionnaire")
	public ResponseEntity<?> saveQuestionnaire(@RequestBody Questionnaire questionnaire) {
      //  log.info("UsersController:  list users");
		Questionnaire resource = questionnaireComponent.saveQuestionnaire(questionnaire);
        return ResponseEntity.ok(resource);
    }
}
