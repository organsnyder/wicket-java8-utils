package com.snyder616.wicket.java8.lambda;

import java.io.Serializable;
import java.util.List;

class MockParent implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object childObject;
	private List<? extends Serializable> childList;
	private Boolean childBoolean;
	
	MockParent(Object childObject) {
		this.childObject = childObject;
	}
	
	MockParent(List<? extends Serializable> childList) {
		this.childList = childList;
	}
	
	MockParent(Boolean childBoolean) {
		this.childBoolean = childBoolean;
	}
	
	Object getChildObject() {
		return childObject;
	}
	
	List<? extends Serializable> getChildList() {
		return childList;
	}
	
	Boolean getChildBoolean() {
		return childBoolean;
	}
}
