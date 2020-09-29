package com.kgc.controller;

import com.kgc.pojo.Financingproduct;
import com.kgc.pojo.FinancingproductExample;
import com.kgc.service.FinancingproductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FinancingproductContrller {
    @Resource
    FinancingproductService financingproductService;
    @RequestMapping("/list")
    public String list(Long id, Long risk, Model model){
        FinancingproductExample financingproductExample=new FinancingproductExample();
        FinancingproductExample.Criteria criteria =financingproductExample.createCriteria();
        List<Financingproduct> list=financingproductService.getlist(id,risk);
        model.addAttribute("list",list);
        return "/index";
    }
    @RequestMapping("/toadd")
    public  String add(Financingproduct financingproduct){
        int i=financingproductService.add(financingproduct);
        return "redirect:list";
    }
}
