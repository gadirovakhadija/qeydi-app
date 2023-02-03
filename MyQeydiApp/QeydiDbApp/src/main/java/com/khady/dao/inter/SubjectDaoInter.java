package com.khady.dao.inter;

import com.khady.entity.Subject;
import com.khady.entity.Teachway;

import java.util.List;

public interface SubjectDaoInter {
    List<Subject> getAll();
    public Subject getById(int subjectId);
    boolean updateSubject(Subject sb);
    boolean removeSubject(int subjectId);
}
