package dev.ahmed.graduationproject.app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:03 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Entity
@Table(name = "CATEGORIES")
@Getter
@Setter
public class Category {

    @Id
    @SequenceGenerator(name = "Category" , sequenceName = "CATEGORY_ID_SEQ")
    @GeneratedValue(generator = "Category")
    private Long id;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;


    @Column(name = "KDV_RATE")
    private Double kdvRate;
}
