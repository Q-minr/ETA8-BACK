package com.cxxy.eta8.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSEntrust<M extends BaseSEntrust<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setEntrustName(java.lang.String entrustName) {
		set("entrustName", entrustName);
		return (M)this;
	}
	
	public java.lang.String getEntrustName() {
		return getStr("entrustName");
	}

}
