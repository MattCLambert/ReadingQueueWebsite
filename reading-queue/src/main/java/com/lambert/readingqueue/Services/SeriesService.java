package com.lambert.readingqueue.Services;

import java.util.List;

import com.lambert.readingqueue.Entitys.Series;

public interface SeriesService {
	List<Series> findAllSeries();
	Series findSeriesById(Long id);
	Series addSeries(Series series);
	Series updateSeries(Series series);
	String deleteSeriesbyId(Long id);
}
