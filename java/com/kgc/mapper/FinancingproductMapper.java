package com.kgc.mapper;

import com.kgc.pojo.Financingproduct;
import com.kgc.pojo.FinancingproductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancingproductMapper {
    int countByExample(FinancingproductExample example);

    int deleteByExample(FinancingproductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Financingproduct record);

    int insertSelective(Financingproduct record);

    List<Financingproduct> selectByExample(FinancingproductExample example);

    Financingproduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Financingproduct record, @Param("example") FinancingproductExample example);

    int updateByExample(@Param("record") Financingproduct record, @Param("example") FinancingproductExample example);

    int updateByPrimaryKeySelective(Financingproduct record);

    int updateByPrimaryKey(Financingproduct record);
}