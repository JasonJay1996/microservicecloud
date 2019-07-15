package com.atguigu.springcloud.entities;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	private static final long serialVersionUID = -3452464073208041180L;
	private Long deptno; //主键
	private String dname; //部门名称
	private String db_source; //来自那个数据库
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
