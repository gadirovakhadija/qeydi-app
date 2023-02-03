package com.khady.dao.inter;

import com.khady.entity.Teachway;

import java.util.List;

public interface TeachwayDaoInter {
    List<Teachway> getAll();
    public Teachway getById(int teachwayId);
    boolean updateTeachway(Teachway tw);
    boolean removeTeachway(int teachwayId);
}
