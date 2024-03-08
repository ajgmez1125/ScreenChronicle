package org.humber.project.controllers;

import org.humber.project.domain.WatchList;
import org.humber.project.services.WatchListJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/watchlist")
public class WatchListController {

    private final WatchListJPAService watchListJPAService;

    @Autowired
    public WatchListController(WatchListJPAService watchListJPAService) {
        this.watchListJPAService = watchListJPAService;
    }

    @PostMapping("/add")
    public ResponseEntity<WatchList> addToWatchList(@RequestBody WatchList watchList) {
        WatchList addedToWatchList = watchListJPAService.addToWatchList(watchList);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedToWatchList);
    }
}
