package com.example.demo.repository;

import com.example.demo.model.Item;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepository {

    private final JdbcTemplate jdbcTemplate;

    public ItemRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Item> findAll() {
        String sql = "SELECT id, name FROM items";
        return jdbcTemplate.query(
                sql,
                (rs, rowNum) ->
                        new Item(
                                rs.getLong("id"),
                                rs.getString("name")
                        )
        );
    }
}

