package com.szg.SHDP.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szg.SHDP.entity.NumberOrder;
import com.szg.SHDP.repository.NumberOrderRep;

@Controller
@RequestMapping("/numorder")
public class NumController {
	@Resource
	private NumberOrderRep numberOrderRep;
	
	@RequestMapping(value="/data",method={RequestMethod.GET,RequestMethod.POST},produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<NumberOrder>getNumOrderData(){
		return numberOrderRep.findAll();
	}
}
