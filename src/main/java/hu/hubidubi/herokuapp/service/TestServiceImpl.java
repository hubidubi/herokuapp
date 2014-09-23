package hu.hubidubi.herokuapp.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public String hello() {
		return "hello";
	}
}
