package com.aol.cmi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aol.cmi.dao.CpsDao;
import com.aol.cmi.model.CpsProfile;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private CpsDao cpsDao;

	@Override
	public CpsProfile getProfile(String userId, String accessToken) {
		return cpsDao.getCpsData(userId, accessToken);
	}

}
