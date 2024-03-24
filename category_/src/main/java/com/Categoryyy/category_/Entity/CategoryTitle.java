package com.Categoryyy.category_.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;



    @Entity
    @Table(name = "categorytitle")
    @Data
    public class CategoryTitle {

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        private String uuid;
        private String title;
        private String description;
        private String videoUrl;
        private String textUrl;
        private String podcastUrl;
        private String date;
        private String thumbnail;
        private String discoverItemImage;


    }


