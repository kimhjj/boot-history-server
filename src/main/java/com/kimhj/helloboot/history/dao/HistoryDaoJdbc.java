package com.kimhj.helloboot.history.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kimhj.helloboot.history.vo.History;

@Repository
public class HistoryDaoJdbc implements HistoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public History insertNewHistory(History history) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO HISTORY (TIME_MILLIS, URL, PARAM, RESP) ");
		query.append(" VALUES (?, ?, ?, ?) 			                       ");
		
		int insertCount = jdbcTemplate.update(
											query.toString()
											, history.getTimeMillies()	// ? 물음표에 bind 1
											, history.getUrl()		// ? 물음표에 bind 2
											, history.getParam()		// ? 물음표에 bind 3
											, history.getResp()		// ? 물음표에 bind 4
										);
		System.out.println(">>>>>>>" + insertCount);
		return history;
	}
}
