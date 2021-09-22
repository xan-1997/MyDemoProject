package com.xanlarisayev.ResumeApp.service.inter;

import com.xanlarisayev.ResumeApp.entity.Hobby;

public interface HobbyServiceInter {
    boolean addHobby(Hobby hobby);
    boolean deleteHobby(Integer hobbyId);
}
