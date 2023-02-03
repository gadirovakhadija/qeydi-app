package org.example;

import com.khady.dao.impl.SubjectDaoImpl;
import com.khady.dao.impl.TeachwayDaoImpl;
import com.khady.dao.impl.UserDaoImpl;
import com.khady.dao.inter.SubjectDaoInter;
import com.khady.dao.inter.TeachwayDaoInter;
import com.khady.dao.inter.UserDaoInter;

public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static TeachwayDaoInter instanceTeacwayDao(){
        return new TeachwayDaoImpl();
    }
    public static SubjectDaoInter instanceSubjectDao(){
        return new SubjectDaoImpl();
    }
}
