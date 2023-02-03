package com.khady.dao.impl;

import com.khady.dao.inter.AbstractDao;
import com.khady.dao.inter.TeachwayDaoInter;
import com.khady.entity.Teachway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeachwayDaoImpl extends AbstractDao implements TeachwayDaoInter {

    private Teachway getAllTeachway(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String teachway = rs.getString("teachway");

        Teachway tw = new Teachway(id, teachway);
        return tw;
    }

    @Override
    public List<Teachway> getAll() {
        List<Teachway> list = new ArrayList<>();

        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from teach_table");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Teachway teachway = getAllTeachway(rs);
                list.add(teachway);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Teachway getById(int teachwayId) {
        Teachway teachway = null;

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("select * from teach_table where id=?");
            stmt.setInt(1, teachwayId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                teachway = getAllTeachway(rs);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return teachway;
    }

    @Override
    public boolean updateTeachway(Teachway tw) {

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update teach_table(id,teachway) set(?,?)");
            stmt.setInt(1, tw.getId());
            stmt.setString(2, tw.getTeachway());
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeTeachway(int teachwayId) {

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("delete from teach_table where id =?");
            stmt.setInt(1, teachwayId);
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
