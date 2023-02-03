package org.example;

import com.khady.dao.impl.TeachwayDaoImpl;
import com.khady.dao.impl.UserDaoImpl;
import com.khady.dao.inter.TeachwayDaoInter;
import com.khady.dao.inter.UserDaoInter;
import com.khady.entity.Subject;
import com.khady.entity.Teachway;
import com.khady.entity.User;

public class Main {
    public static void main(String[] args) {
//        User u = new User(1, "Rashad1", "Ibrahimli1", 40, "AZTU1", 661, "Yoxdur1",new Teachway(1,"Astroloji"), new Subject(1,"Tebiet"), "ibrahimli991", "#hdh1",22, "34322");
        TeachwayDaoInter t = Context.instanceTeacwayDao();
        System.out.println(t.getAll());
    }
}