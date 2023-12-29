package com.springframework.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.jokesapp.services.JokeService;

/**
 * Created by jt on 1/23/21.
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
