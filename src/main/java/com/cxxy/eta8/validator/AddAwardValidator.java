package com.cxxy.eta8.validator;

import com.cxxy.eta8.vo.AjaxResult;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class AddAwardValidator extends Validator {

	@Override
	protected void validate(Controller c) {
		setShortCircuit(true);
		validateRequiredString("name", "msg", "奖项名称不能为空");
		validateInteger("type", "msg", "奖项类型不能为空");
	}

	@Override
	protected void handleError(Controller c) {
		c.renderJson(new AjaxResult(AjaxResult.CODE_ERROR, c.getAttrForStr("msg")));
	}

}
