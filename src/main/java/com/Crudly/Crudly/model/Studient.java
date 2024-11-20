package com.Crudly.Crudly.model;

import jakarta.persistence.*;

@Entity
@Table(name = "studient")
public class Studient {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name", nullable = false , length = 50)
    private String nombre;

    @Column (name = "surname", nullable = false , length = 50)
    private String surname;

    @Column (name = "email", nullable = false , length = 50)
    private String email;

    public Studient(){

    }

    public Studient(long id, String surname, String nombre, String email) {
        this.id = id;
        this.surname = surname;
        this.nombre = nombre;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Studient{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
