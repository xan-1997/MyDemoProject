package com.xanlarisayev.ResumeApp.controller;

import com.xanlarisayev.ResumeApp.entity.Profile;
import com.xanlarisayev.ResumeApp.service.inter.ProfileServiceInter;
import com.xanlarisayev.ResumeApp.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private ProfileServiceInter profileService;



    @RequestMapping("/")
    public String welcomePage(){
        return "main";
    }

    @ModelAttribute
    public void getModels(Model model){
        Profile myProfile = profileService.getById(16);
        Utility utility = new Utility();

        model.addAttribute("utility", utility);
        model.addAttribute("myProfile", myProfile);
    }
}
