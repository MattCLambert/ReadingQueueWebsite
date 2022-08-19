package com.lambert.readingqueue.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambert.readingqueue.Entitys.Series;
import com.lambert.readingqueue.Repositories.SeriesRepository;

@Service
public class SeriesServiceImpl implements SeriesService{
	@Autowired
	private SeriesRepository seriesRepository;

	@Override
	public List<Series> findAllSeries() {
		// TODO Auto-generated method stub
		return seriesRepository.findAll();
	}

	@Override
	public Series findSeriesById(Long id) {
		// TODO Auto-generated method stub
		
		return seriesRepository.findById(id).get();
	}

	@Override
	public Series addSeries(Series series) {
		// TODO Auto-generated method stub
		return seriesRepository.save(series);
	}

	@Override
	public Series updateSeries(Series series) {
		// TODO Auto-generated method stub
		return seriesRepository.save(series);
	}

	@Override
	public String deleteSeriesbyId(Long id) {
		// TODO Auto-generated method stub
		seriesRepository.deleteById(id);
		return "Deleted Series";
	}
	
}
