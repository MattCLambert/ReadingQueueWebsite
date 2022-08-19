package com.lambert.readingqueue.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lambert.readingqueue.Entitys.Series;
import com.lambert.readingqueue.Services.SeriesService;

@RestController
public class SeriesController {
	@Autowired
	private SeriesService seriesService;
	
	@GetMapping("/series")
	public List<Series> findAllSeries()
	{
		return seriesService.findAllSeries();
	}
	@GetMapping("/series/{id}")
	public Series findSeriesById(@PathVariable Long id)
	{
		return seriesService.findSeriesById(id);
	}
	@PostMapping("/series")
	public Series addSeries(@RequestBody Series series)
	{
		return seriesService.addSeries(series);
	}
	@PutMapping("/series")
	public Series updateSeries(@RequestBody Series series)
	{
		return seriesService.updateSeries(series);
	}
	@DeleteMapping("/series/{id}")
	public String deleteSeries(@PathVariable Long id)
	{
		return seriesService.deleteSeriesbyId(id);
	}
}
