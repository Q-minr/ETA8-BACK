package com.cxxy.eta8.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSEcoFirst<M extends BaseSEcoFirst<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setTypeName(java.lang.String TypeName) {
		set("TypeName", TypeName);
		return (M)this;
	}
	
	public java.lang.String getTypeName() {
		return getStr("TypeName");
	}

}
