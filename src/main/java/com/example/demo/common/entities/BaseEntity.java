package com.example.demo.common.entities;

import com.example.demo.common.constants.ProjectConstant;
import com.example.demo.common.utils.DateUtils;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 5140575813889967178L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")
	protected Long id;

	@Column(name = "IS_DELETED", length = 1)
	protected String isDeleted = "N";

	@Column(name = "CREATED_DATE", updatable = false)
	protected Date createdDate;

	@Column(name = "UPDATED_DATE", nullable = true)
	protected Date updatedDate;

	@PrePersist
	public void prePersist() {
		isDeleted = ProjectConstant.Flag.N;

		createdDate = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		updatedDate = new Date();
	}

	public String getCreatedDateStr(){
		return DateUtils.formatDateToString(createdDate, DateUtils.DD_MM_YYYY_HHMMSS);
	}
	public String getUpdatedDateStr(){
		return DateUtils.formatDateToString(updatedDate, DateUtils.DD_MM_YYYY_HHMMSS);
	}
	public String getIdStr() {
		return id.toString();
	}
}
