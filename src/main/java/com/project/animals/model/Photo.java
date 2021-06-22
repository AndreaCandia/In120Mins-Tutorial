package com.project.animals.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Photo {

    @Getter @Setter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter @Setter @Length(min=5, message = "minimum length not respected")
    @NotBlank(message = "this field is required")
    private String url;
    public Photo() {
    }

    public Photo(int id, String url) {
        this.id = id;
        this.url = url;
    }


}
