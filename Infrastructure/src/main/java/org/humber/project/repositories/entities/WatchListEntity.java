package org.humber.project.repositories.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "watchlist")
public class WatchListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long watchlistId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "movie_id")
    private Long movieId;
}