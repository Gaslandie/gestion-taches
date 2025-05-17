package com.gaslandie.gestion_taches.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //indique que cette classe est une entité persistée en bdd
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    private Long id;

    private String titre;
    private String description;
    private boolean terminee; //true = tache terminée

    //constructeur vide obligatoire pour JPA
    public Task(){}

    //constructeur pratique pour creer une tache rapidement
    public Task(String titre, String description, boolean terminee){
        this.titre = titre;
        this.description = description;
        this.terminee = terminee;
    }

    // Getters et Setters
    public Long getId(){return id;}
    public String getTitre(){return titre;}
    public void setTitre(String titre){this.titre=titre;}
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isTerminee() { return terminee; }
    public void setTerminee(boolean terminee) { this.terminee = terminee; }

}
