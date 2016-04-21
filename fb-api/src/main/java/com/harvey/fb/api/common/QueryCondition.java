package com.harvey.fb.api.common;

import com.harvey.common.core.model.PagingInfo;

public class QueryCondition<T> {
	private PagingInfo pagingInfo;
	private T condition;
	
	public PagingInfo getPagingInfo() {
		return pagingInfo;
	}
	public T getCondition() {
		return condition;
	}
	public void setPagingInfo(PagingInfo pagingInfo) {
		this.pagingInfo = pagingInfo;
	}
	public void setCondition(T condition) {
		this.condition = condition;
	}
	
}
