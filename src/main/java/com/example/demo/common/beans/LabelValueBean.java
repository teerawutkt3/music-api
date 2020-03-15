package com.example.demo.common.beans;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LabelValueBean implements Serializable {

	private static final long serialVersionUID = -4903724438420463149L;
	private String label;
	private String value;

	@Override
	public String toString() {
		return "LabelValueBean [label=" + label + ", value=" + value + "]";
	}

}
