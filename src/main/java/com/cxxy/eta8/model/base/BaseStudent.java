package com.cxxy.eta8.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseStudent<M extends BaseStudent<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setStuNo(java.lang.String stuNo) {
		set("stuNo", stuNo);
		return (M)this;
	}
	
	public java.lang.String getStuNo() {
		return getStr("stuNo");
	}

	public M setStuName(java.lang.String stuName) {
		set("stuName", stuName);
		return (M)this;
	}
	
	public java.lang.String getStuName() {
		return getStr("stuName");
	}

	public M setGenderId(java.lang.Integer genderId) {
		set("genderId", genderId);
		return (M)this;
	}
	
	public java.lang.Integer getGenderId() {
		return getInt("genderId");
	}

	public M setClassId(java.lang.Integer classId) {
		set("classId", classId);
		return (M)this;
	}
	
	public java.lang.Integer getClassId() {
		return getInt("classId");
	}

}
