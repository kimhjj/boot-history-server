package com.kimhj.helloboot.history.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimhj.helloboot.history.dao.HistoryDao;
import com.kimhj.helloboot.history.vo.History;

@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryDao historyDao;
	
	@Override
	public History createNewHistory(History history) {
		return this.historyDao.insertNewHistory(history);
	}
}
