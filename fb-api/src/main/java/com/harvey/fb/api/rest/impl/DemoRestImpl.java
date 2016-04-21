package com.harvey.fb.api.rest.impl;    

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.harvey.common.core.service.impl.BaseRestImpl;
import com.harvey.fb.api.bas.model.BasUsersModel;
import com.harvey.fb.api.bas.service.BasUsersService;
import com.harvey.fb.api.common.entity.MessageEntity;
import com.harvey.fb.api.rest.DemoRest;

@Component
public class DemoRestImpl extends BaseRestImpl implements DemoRest {

	@Resource
	private BasUsersService basUsersService;
	@Override
	public MessageEntity test() {
		BasUsersModel model = new BasUsersModel();
		model.setUserName("hhhhhhhhhhhhhhhhhh");
		basUsersService.save(model);
		return MessageEntity.getReturn(true, "justTest", basUsersService.query());
	}

	
	
}