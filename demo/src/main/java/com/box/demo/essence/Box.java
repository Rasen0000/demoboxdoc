package com.box.demo.essence;

import javax.persistence.*;

@Entity
@Table(name = "box")
public class Box {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    private String title;

    private String tag;

    public Box(String title, String barcode){};

    public Long getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "box_id", nullable = false)
    private Doc doc;

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBarcode() {
        return tag;
    }

    public void setBarcode(String barcode) {
        this.tag = barcode;
    }


}
