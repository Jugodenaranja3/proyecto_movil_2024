package com.example.herediavaldiviaproyectomovil_i;

public class ProductType {
    // CONSTRUCTORS
    public ProductType() {}
    public ProductType(String title) {
        this.title = title;
    }

    // GETTER AND SETTER
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // ATTRIBUTES
    private String title;
}
