package cn.meetingbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.meetingbook.annotation.ApiRequest;
import cn.meetingbook.api.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	DemoService demoService;
	
	@ApiRequest
	@RequestMapping("/id")
	@ResponseBody
	public Object findById(int id) throws Exception{
		
		return demoService.findById(id);
	}
}
