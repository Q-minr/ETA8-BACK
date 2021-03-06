package com.cxxy.eta8.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSSource<M extends BaseSSource<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setSourceName(java.lang.String SourceName) {
		set("SourceName", SourceName);
		return (M)this;
	}
	
	public java.lang.String getSourceName() {
		return getStr("SourceName");
	}

	public M setLevelId(java.lang.Integer levelId) {
		set("levelId", levelId);
		return (M)this;
	}
	
	public java.lang.Integer getLevelId() {
		return getInt("levelId");
	}

}
