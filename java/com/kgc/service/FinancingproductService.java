package com.kgc.service;

import com.kgc.pojo.Financingproduct;
import org.apache.commons.io.FilenameUtils;

import java.util.List;

public interface FinancingproductService {
    List<Financingproduct> getlist(Long id,Long risk );
    int add(Financingproduct financingproduct);
}
