package com.aphonso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aphonso.curso.entities.User;
import com.aphonso.curso.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
    
    public User insert(User user) {
    	return userRepository.save(user);
    }
    
    public void delete(Long id) {
    	userRepository.deleteById(id);
    }
    
    public User update(Long id, User user) {
    	User entity = userRepository.getReferenceById(id);
    	updateData(entity, user);
    	return userRepository.save(entity);
    }

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
}
