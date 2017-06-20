package com.imooc.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class TestJDBCUtil {

    @Test
    public void testgetConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }
}
