package com.micro.quiz.service.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin
@RequestMapping("quiz")
@Validated
@Tag(name = "Quiz Controller", description = "Quiz Operations API")
public class QuizController {

}
