package org.uestc.suntao.dbtest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.uestc.suntao.dbtest.model.Publisher;
import org.uestc.suntao.dbtest.model.User;
import org.uestc.suntao.dbtest.repos.PublisherRepo;
import org.uestc.suntao.dbtest.repos.UserRepo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class RootController {
	@Autowired
	UserRepo userRepo;

	@Autowired
	PublisherRepo publisherRepo;

	@RequestMapping("/publist")
	public String publist(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return JSON.toJSONString(publisherRepo.findAll(), SerializerFeature.BrowserCompatible);
	}

	@RequestMapping("/publisher/add")
	public void addpub(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Publisher param = new Publisher(request);
		publisherRepo.save(param);
	}

	@RequestMapping("/publisher/get")
	public String getpub(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Publisher param = new Publisher(request);
		return JSON.toJSONString(userRepo.findOne(param.getId()));
	}

	@RequestMapping("/publisher/delete")
	public void deletepub(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Publisher param = new Publisher(request);
		publisherRepo.delete(param.getId());
	}

	@RequestMapping("/publisher/update")
	public void updatepub(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Publisher param = new Publisher(request);
		publisherRepo.save(param);
	}

	@RequestMapping("/userlist")
	public String userlist(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return JSON.toJSONString(userRepo.findAll(), SerializerFeature.BrowserCompatible);
	}

	@RequestMapping("/user/add")
	public void adduser(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		User param = new User(request);
		userRepo.save(param);
	}

	@RequestMapping("/user/get")
	public String getuser(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		User param = new User(request);
		return JSON.toJSONString(userRepo.findOne(param.getId()));
	}

	@RequestMapping("/user/delete")
	public void deleteuser(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		User param = new User(request);
		userRepo.delete(param.getId());
	}

	@RequestMapping("/user/update")
	public void updateuser(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		User param = new User(request);
		userRepo.save(param);
	}

}
