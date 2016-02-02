package com.hteam.holiday.region.service;


import com.hteam.holiday.region.dao.RegionDao;
import com.hteam.holiday.region.domain.Region;

public class RegionServiceImpl implements RegionService{

	private RegionDao regionDao;
	
	public void saveRegion(Region region) {
		regionDao.saveRegion(region);
	}

	public void setRegionDao(RegionDao regionDao) {
		this.regionDao = regionDao;
	}

}
