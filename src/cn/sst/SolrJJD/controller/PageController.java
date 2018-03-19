package cn.sst.SolrJJD.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @ClassName: PageController 
 * @Description: 页面控制
 * @author: sunshengteng
 * @date: 2018年3月15日 下午5:05:07
 */
@Controller
public class PageController {

	@RequestMapping(value="list.action")
	public String listItem(String queryString,String a,String b,String c,Model model){
		
	
		return "product_list";
	
	}
	

	
}
