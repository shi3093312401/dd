package com.kgc.service.impl;

import com.kgc.mapper.FinancingproductMapper;
import com.kgc.pojo.Financingproduct;
import com.kgc.pojo.FinancingproductExample;
import com.kgc.service.FinancingproductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("financingproductService")
public class FinancingproductServiceImpl implements FinancingproductService {
    @Resource
    FinancingproductMapper financingproductMapper;
    @Override
    public List<Financingproduct> getlist(Long id, Long risk) {
        FinancingproductExample financingproductExample=new FinancingproductExample();
        FinancingproductExample.Criteria criteria =financingproductExample.createCriteria();
        if (id!=null&&risk!=0){
            criteria.andIdEqualTo(id);
            criteria.andRiskEqualTo(risk);
        }
        List<Financingproduct> list=financingproductMapper.selectByExample(financingproductExample);
        return list;
    }

    @Override
    public int add(Financingproduct financingproduct) {
        int i=financingproductMapper.insertSelective(financingproduct);
        return i;
    }
}
