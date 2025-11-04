package org.example.metier;

import org.example.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements Imetier{
@Autowired
    private Idao idao;
    @Override
    public double claclul() {
        double val=idao.getValue();
        return 3*val;
    }
    public void setIdao(Idao idao){
        this.idao=idao;
    }
}
