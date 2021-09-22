package com.xanlarisayev.ResumeApp.dao.inter;

import com.xanlarisayev.ResumeApp.entity.Hobby;

public interface HobbyDaoInter {
    boolean addHobby(Hobby hobby);
    boolean deleteHobby(Integer hobbyId);
}
