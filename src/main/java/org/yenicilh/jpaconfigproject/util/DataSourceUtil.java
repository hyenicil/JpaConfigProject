package org.yenicilh.jpaconfigproject.util;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSoruceUtil {

    public static DataSource createDataSource(String url, String username, String password) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
