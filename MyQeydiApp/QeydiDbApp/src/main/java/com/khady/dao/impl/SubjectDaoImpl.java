package com.khady.dao.impl;

import com.khady.dao.inter.AbstractDao;
import com.khady.dao.inter.SubjectDaoInter;
import com.khady.entity.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl extends AbstractDao implements SubjectDaoInter {

    private Subject getAllSubject(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String subject = rs.getString("subject");

        Subject sb = new Subject(id, subject);
        return sb;
    }

    @Override
    public List<Subject> getAll() {
        List<Subject> list = new ArrayList<>();

        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from subj_table");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Subject subject = getAllSubject(rs);
                list.add(subject);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Subject getById(int subjectId) {
        Subject subject = null;

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("select * from subj_table where id=?");
            stmt.setInt(1, subjectId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                subject = getAllSubject(rs);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return subject;
    }

    @Override
    public boolean updateSubject(Subject sb) {

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update subj_table(id,subject) set(?,?)");
            stmt.setInt(1, sb.getId());
            stmt.setString(2, sb.getSubject());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeSubject(int subjectId) {

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("delete from subj_table where id=?");
            stmt.setInt(1, subjectId);
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
