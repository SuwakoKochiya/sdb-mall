package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseScheduleJob<M extends BaseScheduleJob<M>> extends Model<M> implements IBean {

	public void setJobId(java.lang.Long jobId) {
		set("job_id", jobId);
	}
	
	public java.lang.Long getJobId() {
		return getLong("job_id");
	}

	public void setBeanName(java.lang.String beanName) {
		set("bean_name", beanName);
	}
	
	public java.lang.String getBeanName() {
		return getStr("bean_name");
	}

	public void setMethodName(java.lang.String methodName) {
		set("method_name", methodName);
	}
	
	public java.lang.String getMethodName() {
		return getStr("method_name");
	}

	public void setParams(java.lang.String params) {
		set("params", params);
	}
	
	public java.lang.String getParams() {
		return getStr("params");
	}

	public void setCronExpression(java.lang.String cronExpression) {
		set("cron_expression", cronExpression);
	}
	
	public java.lang.String getCronExpression() {
		return getStr("cron_expression");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
