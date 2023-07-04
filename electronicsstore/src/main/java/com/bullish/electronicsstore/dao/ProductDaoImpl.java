package com.bullish.electronicsstore.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.bullish.electronicsstore.dao.ProductDao;
import com.bullish.electronicsstore.model.Product;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public Product createProduct(String productName) {
        String sql = "INSERT INTO product " + "(productId, productName) VALUES (?, ?)";
        Product product = new Product(productName);
        getJdbcTemplate().update(sql, new Object[] { product.getProductId(), product.getProductName() });
    }

    @Override
    public void removeProduct(UUID productId) {
        String deleteQuery = "DELETE FROM product WHERE productId = ?";
        getJdbcTemplate().update(deleteQuery, productId);

    }
}