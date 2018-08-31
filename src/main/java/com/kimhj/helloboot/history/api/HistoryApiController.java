package com.kimhj.helloboot.history.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kimhj.helloboot.history.service.HistoryService;
import com.kimhj.helloboot.history.vo.History;
import com.kimhj.helloboot.response.ApiResponse;

@RestController
public class HistoryApiController {

	@Autowired
	private HistoryService historyService;
	
	@PostMapping("/histories")
	public ApiResponse createHistoryApi(@RequestBody History history){
		historyService.createNewHistory(history);

		return new ApiResponse();
	}
}
