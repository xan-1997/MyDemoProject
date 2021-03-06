package com.xanlarisayev.ResumeApp.controller;

import com.xanlarisayev.ResumeApp.dao.inter.*;
import com.xanlarisayev.ResumeApp.entity.*;
import com.xanlarisayev.ResumeApp.service.inter.*;
import com.xanlarisayev.ResumeApp.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditController {

    @Autowired
    private ProfileServiceInter profileService;

    @Autowired
    private SkillDaoInter skillRepo;

    @Autowired
    private PracticeDaoInter practiceRepo;

    @Autowired
    private EducationDaoInter educationRepo;

    @Autowired
    private LanguageDaoInter languageRepo;

    @Autowired
    private HobbyDaoInter hobbyRepo;


    //Profile
    @RequestMapping("/edit_profile")
    public String editPage() {
        return "edit_profile";
    }

    @RequestMapping(value = "/save_prof", method = RequestMethod.POST)
    public String saveProf(@ModelAttribute("myProfile") Profile profile) {
        profileService.update(profile);
        return "redirect:/edit_contacts";
    }


    //Contacts
    @RequestMapping("/edit_contacts")
    public String editContacts() {
        return "edit_contacts";
    }

    @RequestMapping(value = "/save_contacts", method = RequestMethod.POST)
    public String saveContacts(@ModelAttribute("myProfile") Profile profile) {
        profileService.update(profile);
        return "redirect:/edit_skills";
    }


    //Skills
    @RequestMapping("/edit_skills")
    public String editSkills() {
        return "edit_skills";
    }

    @RequestMapping(value = "/save_skills", method = RequestMethod.POST)
    public String saveSkills(@ModelAttribute("myProfile") Profile profile) {
        //relational between all tables cascade on update and delete
        profileService.update(profile);
        return "redirect:/edit_practise";
    }

    @RequestMapping(value = "/add_skill", method = RequestMethod.POST)
    public String addSkill(@ModelAttribute("skill") Skill skill) {
        skillRepo.save(skill);
        return "redirect:/edit_skills";
    }

    @RequestMapping(value = "/delete_skill/{skillId}")
    public String deleteSkill(@PathVariable Integer skillId) {
        Skill skill = skillRepo.findById(skillId).orElseThrow();
        skillRepo.delete(skill);
        return "redirect:/edit_skills";
    }


    //Practice
    @RequestMapping("/edit_practise")
    public String editPractise() {
        return "edit_practise";
    }

    @RequestMapping(value = "/save_practise", method = RequestMethod.POST)
    public String savePractise(@ModelAttribute("myProfile") Profile profile) {
        profileService.update(profile);
        return "redirect:/edit_education";
    }

    @RequestMapping(value = "/add_practice", method = RequestMethod.POST)
    public String addPractice(@ModelAttribute("practice") Practic practice) {
        practiceRepo.save(practice);
        return "redirect:/edit_practise";
    }

    @RequestMapping("/delete_practice/{practiceId}")
    public String deletePractice(@PathVariable Integer practiceId) {
        Practic practic = practiceRepo.findById(practiceId).orElseThrow();
        practiceRepo.delete(practic);
        return "redirect:/edit_practise";
    }


    //Education
    @RequestMapping("/edit_education")
    public String editEdu() {
        return "edit_education";
    }

    @RequestMapping(value = "/save_education", method = RequestMethod.POST)
    public String saveEducation(@ModelAttribute("myProfile") Profile profile) {
        profileService.update(profile);
        return "redirect:/edit_languages";
    }

    @RequestMapping(value = "/add_education", method = RequestMethod.POST)
    public String addEducation(@ModelAttribute("education") Education education) {
        educationRepo.save(education);
        return "redirect:/edit_education";
    }

    @RequestMapping("/delete_education/{educationId}")
    public String deleteEducation(@PathVariable Integer educationId) {
        Education education = educationRepo.findById(educationId).orElseThrow();
        educationRepo.delete(education);
        return "redirect:/edit_education";
    }


    //Languages
    @RequestMapping("/edit_languages")
    public String editLang() {
        return "edit_languages";
    }

    @RequestMapping(value = "/save_languages", method = RequestMethod.POST)
    public String saveLanguages(@ModelAttribute("myProfile") Profile profile) {
        profileService.update(profile);
        return "redirect:/edit_hobbies";
    }

    @RequestMapping(value = "/add_language", method = RequestMethod.POST)
    public String addLanguage(@ModelAttribute("language") Language language) {
        languageRepo.save(language);
        return "redirect:/edit_languages";
    }

    @RequestMapping("/delete_language/{languageId}")
    public String deleteLanguage(@PathVariable Integer languageId){
        Language language = languageRepo.findById(languageId).orElseThrow();
        languageRepo.delete(language);
        return "redirect:/edit_languages";
    }


    //Hobbies
    @RequestMapping("/edit_hobbies")
    public String editHobbies() {
        return "edit_hobbies";
    }

    @RequestMapping(value = "/save_hobbies", method = RequestMethod.POST)
    public String saveHobbies(@ModelAttribute("myProfile") Profile profile) {
        profileService.update(profile);
        return "redirect:/";
    }

    @RequestMapping(value = "/add_hobby", method = RequestMethod.POST)
    public String addHobby(@ModelAttribute("hobby") Hobby hobby) {
        hobbyRepo.save(hobby);
        return "redirect:/edit_hobbies";
    }

    @RequestMapping("/delete_hobby/{hobbyId}")
    public String deleteHobby(@PathVariable Integer hobbyId){
        Hobby hobby = hobbyRepo.findById(hobbyId).orElseThrow();
        hobbyRepo.delete(hobby);
        return "redirect:/edit_hobbies";
    }


    //All Models
    @ModelAttribute
    public void getModels(Model model) {
        Profile myProfile = profileService.getById(16);
        Utility utility = new Utility();
        Skill skill = new Skill();
        Practic practic = new Practic();
        Education education = new Education();
        Language language = new Language();
        Hobby hobby = new Hobby();

        model.addAttribute("hobby", hobby);
        model.addAttribute("language", language);
        model.addAttribute("education", education);
        model.addAttribute("practice", practic);
        model.addAttribute("skill", skill);
        model.addAttribute("utility", utility);
        model.addAttribute("myProfile", myProfile);
    }
}
