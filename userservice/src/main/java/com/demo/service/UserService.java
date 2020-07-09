package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.UserNotFoundException;
import com.demo.model.User;
import com.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User getUser(Long userId) {
		Optional<User> optionUser = userRepository.findById(userId);
		if (optionUser.isPresent())
			return optionUser.get();
		throw new UserNotFoundException("User not found :" + userId);
	}

	public User save(User user) {
		return userRepository.save(user);
	}

}
