package com.harvey.fb.api.rest;    

import com.harvey.common.core.service.BaseRest;
import com.harvey.fb.api.common.entity.MessageEntity;

public interface DemoRest extends BaseRest {
	MessageEntity test();
	
}