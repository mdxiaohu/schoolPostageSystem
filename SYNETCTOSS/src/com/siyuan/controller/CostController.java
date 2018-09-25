package com.siyuan.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.siyuan.dao.CostDao;
import com.siyuan.entity.Cost;
import com.siyuan.entity.page.CostPage;

@Controller
@RequestMapping("/cost")
@SessionAttributes("costPage")
public class CostController extends BaseController {

	@Resource
	private CostDao costDao;

//	@RequestMapping("/findCost.do")
//	public String find(Model model) {
//		List<Cost> list = costDao.findAll();
//		model.addAttribute("costs", list);
//		return "cost/cost_list";
//	}
	
	@RequestMapping("/findCost.do")
	public String find(CostPage page, Model model) {
		page.setRows(costDao.findRows());
		model.addAttribute("costPage", page);
		
		List<Cost> list = costDao.findByPage(page);
		model.addAttribute("costs", list);
		
		return "cost/cost_list";
	}
	
	@RequestMapping("/toAddCost.do")
	public String toAdd() {
		return "cost/add_cost";
	}
	
	@RequestMapping("/addCost.do")
	public String add(Cost cost) {
		cost.setStatus("1");
		cost.setCreatime(
			new Timestamp(System.currentTimeMillis()));
		costDao.save(cost);
		return "redirect:findCost.do";
	}
	
	@RequestMapping("/toUpdateCost.do")
	public String toUpdate(
		@RequestParam("id") int id, Model model) {
		Cost cost = costDao.findById(id);
		model.addAttribute("cost", cost);
		return "cost/update_cost";
	}

	@RequestMapping("/updateCost.do")
	public String update(Cost cost) {
		costDao.update(cost);
		return "redirect:findCost.do";
	}
	
	@RequestMapping("/deleteCost.do")
	public String delete(@RequestParam("id") int id) {
		costDao.delete(id);
		return "redirect:findCost.do";
	}
	
}
