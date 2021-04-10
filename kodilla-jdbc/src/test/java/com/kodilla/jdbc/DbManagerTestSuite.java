package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {

    @Test
    void testConnection() throws SQLException {
        //Given
        //Then
        DbManager dbManager = DbManager.getInstance();
        //When
        assertNotNull(dbManager.getConnection());
    }
}
