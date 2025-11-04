package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Idao{
    @Override
    public double getValue() {
        return 12.5;
    }
}
