package com.sharding.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderServiceTest extends BaseJunit {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testSave() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement pstmt = connection.prepareStatement("insert into t_order(user_id,order_id,order_type) values (1,2,3)");
        pstmt.executeUpdate();
    }
}