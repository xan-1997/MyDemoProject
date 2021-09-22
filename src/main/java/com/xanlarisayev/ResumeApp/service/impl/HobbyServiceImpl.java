package com.xanlarisayev.ResumeApp.service.impl;

import com.xanlarisayev.ResumeApp.dao.inter.HobbyDaoInter;
import com.xanlarisayev.ResumeApp.entity.Hobby;
import com.xanlarisayev.ResumeApp.service.inter.HobbyServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HobbyServiceImpl implements HobbyServiceInter {

    @Autowired
    private HobbyDaoInter hdi;

    @Override
    public boolean addHobby(Hobby hobby) {
        return hdi.addHobby(hobby);
    }

    @Override
    public boolean deleteHobby(Integer hobbyId) {
        return hdi.deleteHobby(hobbyId);
    }
}
