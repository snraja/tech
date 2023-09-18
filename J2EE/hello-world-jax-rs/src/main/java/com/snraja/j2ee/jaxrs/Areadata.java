package com.snraja.j2ee.jaxrs;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="areadata")
public class Areadata {
	@Column
	public int id;
	@Column
	public String name;
	@Column
	public String area;
}
