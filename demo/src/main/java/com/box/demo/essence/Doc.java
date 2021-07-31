package com.box.demo.essence;

import javax.persistence.*;


@Entity
public class Doc {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String title;
    private String tag;

    public Doc() {
    }


    public Doc(String title, String barcode) {
        this.title = title;
        this.tag = barcode;
    }




  /*  @OneToMany(fetch = FetchType.EAGER, mappedBy = "box")
    private Set<Box> boxes;

    public Set<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(Set<Box> boxes) {
        this.boxes = boxes;
    }*/



    public Long getId() {
        return id;
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
