package com.lide.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {
	private BigInteger id;
	private String name;
	private int age;
	private BigDecimal maney;
	private  Date created;
	public TPS(BigInteger id, String name, int age, BigDecimal maney, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.maney = maney;
		this.created = created;
	}
	public TPS() {
		super();
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getManey() {
		return maney;
	}
	public void setManey(BigDecimal maney) {
		this.maney = maney;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", maney=" + maney + ", created=" + created + "]";
	}
	
}
