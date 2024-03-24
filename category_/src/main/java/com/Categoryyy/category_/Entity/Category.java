package com.Categoryyy.category_.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;



    @Entity
    @Table(name = "category")
    @Data
    public class Category {

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        private String uuid;
        private String categoryName;
        private String thumbnail;
        private String categoryItemImage;

        @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
        @JoinTable(name = "category_title",
                joinColumns = @JoinColumn(name = "category_id"),
                inverseJoinColumns = @JoinColumn(name = "categorytitle_id"))
        private List<CategoryTitle> categoryTitleSet = new ArrayList<>();
    }


