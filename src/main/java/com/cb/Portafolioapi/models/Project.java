package com.cb.Portafolioapi.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logo;
    private String cover;
    private String image;
    private String name;
    private String description;
    private String linkGit;
    private String link;
    private ArrayList<String> tech;

    public Project() {
    }

    public Project(String logo, String cover, String image, String name, String description, String linkGit, String link, ArrayList<String> tech) {
        this.logo = logo;
        this.cover = cover;
        this.image = image;
        this.name = name;
        this.description = description;
        this.linkGit = linkGit;
        this.link = link;
        this.tech = tech;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkGit() {
        return linkGit;
    }

    public void setLinkGit(String linkGit) {
        this.linkGit = linkGit;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<String> getTech() {
        return tech;
    }

    public void setTech(ArrayList<String> tech) {
        this.tech = tech;
    }
}
