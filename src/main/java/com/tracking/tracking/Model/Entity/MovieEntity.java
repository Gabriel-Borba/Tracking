package com.tracking.tracking.Model.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movies")
@Data
public class MovieEntity {

    @Id
    @Column(name = "ID_MOVIE")
    private Integer idMovie;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "YEAR")
    private String year;

    @Column(name = "RATED")
    private String rated;

    @Column(name = "RELEASED")
    private String released;

    @Column(name = "RUNTIME")
    private String runtime;


    @Column(name = "GENRE")
    private String genre;

    @Column(name = "DIRECTOR")
    private String director;

    @Column(name = "WRITER")
    private String writer;

    @Column(name = "ACTORS")
    private String actors;

    @Column(name = "PLOT")
    private String plot;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "AWARDS")
    private String awards;

    @Column(name = "POSTER")
    private String poster;

    @Column(name = "METASCORE")
    private String metascore;

    @Column(name = "IMDBRATING")
    private String imdbrating;

    @Column(name = "IMDBVOTES")
    private String imdbvotes;

    @Column(name = "IMDBID")
    private String imdbid;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DVD")
    private String dvd;

    @Column(name = "BOXOFFICE")
    private String boxoffice;

    @Column(name = "PRODUCTION")
    private String production;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "RESPONSE")
    private String response;

}