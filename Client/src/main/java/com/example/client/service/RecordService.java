package com.example.client.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.client.model.RecordLabel;

@Repository
public class RecordService implements RecordsDAO{
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<RecordLabel> getRecords() {
		// TODO Auto-generated method stub
		RecordLabel[] records= restTemplate.getForEntity("http://localhost:8090/records", RecordLabel[].class).getBody();
		return Arrays.asList(records);
	}
	
}
