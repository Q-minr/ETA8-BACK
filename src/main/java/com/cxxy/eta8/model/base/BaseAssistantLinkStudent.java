package com.cxxy.eta8.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAssistantLinkStudent<M extends BaseAssistantLinkStudent<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setClassId(java.lang.Integer classId) {
		set("classId", classId);
		return (M)this;
	}
	
	public java.lang.Integer getClassId() {
		return getInt("classId");
	}

	public M setAssistantId(java.lang.String assistantId) {
		set("assistantId", assistantId);
		return (M)this;
	}
	
	public java.lang.String getAssistantId() {
		return getStr("assistantId");
	}

}
