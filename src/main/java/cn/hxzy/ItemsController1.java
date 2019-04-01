package cn.hxzy;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



public class ItemsController1 implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//调用service查找 数据库，查询商品列表，这里使用静态数据模�?
		List<Items> itemsList = new ArrayList<Items>();
		//向list中填充静态数�?
		
		Items items_1 = new Items();
		items_1.setName("联想笔记�?");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机�?");
		
		itemsList.add(items_1);
		itemsList.add(items_2);

		//返回ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//相当 于request的setAttribut，在jsp页面中�?�过itemsList取数�?
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");

		return modelAndView;
	}

}
