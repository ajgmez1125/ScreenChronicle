package org.humber.project.services.impl;

import org.humber.project.domain.WatchList;
import org.humber.project.repositories.WatchListJPARepository;
import org.humber.project.services.WatchListJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchListJPAServiceImpl implements WatchListJPAService {

    private final WatchListJPARepository watchListJPARepository;

    @Autowired
    public WatchListJPAServiceImpl(WatchListJPARepository watchListJPARepository) {
        this.watchListJPARepository = watchListJPARepository;
    }

    @Override
    public List<WatchList> getWatchListByUserId(Long userId) {
        return null; // Implement retrieval of watchlist by user ID
    }

    @Override
    public WatchList addToWatchList(WatchList watchList) {
        return null; // Implement addition of a movie to the watchlist
    }
}
