package com.pay.dao;

import com.pay.bean.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PayDao extends JpaRepository<Pay,String> {

    List<Pay> getByStateIs(Integer state);

    List<Pay> getByStateIsNotAndStateIsNot(Integer state1,Integer state2);
}
