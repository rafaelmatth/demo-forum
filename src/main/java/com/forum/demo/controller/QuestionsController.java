package com.forum.demo.controller;

import com.forum.demo.models.Course;
import com.forum.demo.models.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class QuestionsController {

    @RequestMapping("/questions")
    @ResponseBody
    public List<Question> list(){
        Question question = new Question("Duvida", "duvida com spring", new Course("Spring", "Programação"));

        return Arrays.asList(question, question, question);
    }

}
