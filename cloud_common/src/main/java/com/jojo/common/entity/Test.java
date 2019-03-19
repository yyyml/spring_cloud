package com.jojo.common.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value="test")
public class Test {

	@TableField(value = "id")
	private Integer id;
	
	@TableField(value = "create_at",fill=FieldFill.INSERT)
	private Date createAt;
	
	@TableField(value = "update_at",fill=FieldFill.INSERT_UPDATE)
	private Date updateAt;
	
	@TableField(value = "name")
	private String name;
	
	@TableField(value = "is_delete")
	@TableLogic
	private Integer isDelete;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	
}
