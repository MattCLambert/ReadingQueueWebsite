package com.lambert.readingqueue.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lambert.readingqueue.Entitys.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Long> {

}
