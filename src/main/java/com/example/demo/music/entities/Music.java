package com.example.demo.music.entities;

import com.example.demo.common.entities.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MUSIC")
@Getter
@Setter
@AttributeOverride(name = "id", column = @Column(name = "MUSIC_ID", nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class Music extends BaseEntity {

    private String type;
    private String name;
    private String time;
    private String singer;
    private String belong;
    private String description;
}
