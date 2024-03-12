package org.humber.project.services.impl;

import org.humber.project.domain.WatchList;
import org.humber.project.repositories.WatchListJPARepository;
import org.humber.project.services.WatchListJPAService;
import org.humber.project.repositories.entities.WatchListEntity;
import org.humber.project.transformers.WatchListTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WatchListJPAServiceImpl implements WatchListJPAService {

    private final WatchListJPARepository watchListJPARepository;
    private final WatchListTransformer watchListTransformer;

    @Autowired
    public WatchListJPAServiceImpl(WatchListJPARepository watchListJPARepository, WatchListTransformer watchListTransformer) {
        this.watchListJPARepository = watchListJPARepository;
        this.watchListTransformer = watchListTransformer;
    }

    @Override
    public List<WatchList> getWatchListByUserId(Long userId) {
        return watchListJPARepository.findAllByUserId(userId).stream()
                .map(watchListTransformer::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public WatchList addToWatchList(WatchList watchList) {
        WatchListEntity watchListEntity = watchListTransformer.toEntity(watchList);
        WatchListEntity savedWatchListEntity = watchListJPARepository.save(watchListEntity);
        return watchListTransformer.toDto(savedWatchListEntity);
    }
}
