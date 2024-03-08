package org.humber.project.repositories;

import org.humber.project.repositories.entities.WatchListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchListJPARepository extends JpaRepository<WatchListEntity, Long> {
}

