package com.pcy.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 16:16
 */
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        User person = new User(rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("sex"));
        return person;
    }
}
