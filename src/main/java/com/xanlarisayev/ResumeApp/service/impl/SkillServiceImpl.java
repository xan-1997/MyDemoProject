package com.xanlarisayev.ResumeApp.service.impl;

import com.xanlarisayev.ResumeApp.dao.inter.SkillDaoInter;
import com.xanlarisayev.ResumeApp.entity.Skill;
import com.xanlarisayev.ResumeApp.service.inter.SkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillServiceImpl implements SkillServiceInter {

    @Autowired
    private SkillDaoInter sdi;

    @Override
    public boolean addSkill(Skill skill) {
        return sdi.addSkill(skill);
    }

    @Override
    public boolean deleteSkill(Integer skillId) {
        return sdi.deleteSkill(skillId);
    }
}
