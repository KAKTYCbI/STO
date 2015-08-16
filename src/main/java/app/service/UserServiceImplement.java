package app.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.repository.dao.ReviewDao;
import app.repository.dao.UserDao;
import app.repository.entity.ReviewEntity;
import app.repository.entity.UserPrincipalEntity;
import app.repository.entity.map.ModelClassMap;
import domain.model.Review;
import domain.model.UserPrincipal;
import domain.service.UserService;

@Service()
@Transactional
public class UserServiceImplement implements UserService {

	@Autowired
	private UserDao userRepository;

	@Autowired
	private ReviewDao reviewRepository;
	
	@Autowired
	private ModelClassMap modelClassMap;

	private Mapper getMapper() {
		return DozerBeanMapperSingletonWrapper.getInstance();
	}

	@Override
	public UserPrincipal getUser(String login, String password) {

		UserPrincipalEntity userEntity = userRepository
				.getUser(login, password);
		UserPrincipal userModel = null;
		if (userEntity != null) {
			userModel = (UserPrincipal) getMapper().map(userEntity,
					modelClassMap.getModelClass(userEntity.getClass()));
		}
		return userModel;
	}

	@Override
	public UserPrincipal getUserByID(Long userId) {

		UserPrincipalEntity userEntity = userRepository.getUserByID(userId);
		UserPrincipal userModel = null;
		if (userEntity != null) {
			userModel = (UserPrincipal) getMapper().map(userEntity,
					modelClassMap.getModelClass(userEntity.getClass()));
		}
		return userModel;
	}

	@Override
	public UserPrincipal getUserByName(String name) {
		UserPrincipalEntity userEntity = userRepository.getUserByName(name);
		UserPrincipal userModel = null;
		if (userEntity != null) {
			userModel = (UserPrincipal) getMapper().map(userEntity,
					modelClassMap.getModelClass(userEntity.getClass()));
		}
		return userModel;
	}

	@Override
	public List<UserPrincipal> getUsers() {
		
		List<UserPrincipal> users = new ArrayList<UserPrincipal>();
		List<UserPrincipalEntity> UserEntities = userRepository.findAll();
		for(UserPrincipalEntity UserPrincipalEntity : UserEntities) {
			users.add(getMapper().map(UserPrincipalEntity, UserPrincipal.class));
		}
		return users;
	}

	@Override
	public void saveUser(UserPrincipal user) {
		userRepository.save(getMapper().map(user, UserPrincipalEntity.class));
		
	}

	@Override
	public void deleteUser(UserPrincipal user) {
		userRepository.delete(getMapper().map(user, UserPrincipalEntity.class));
		
	}

	@Override
	public List<Review> getReview() {
		List<Review> reviews = new ArrayList<Review>();
		List<ReviewEntity> ReviewEntities = reviewRepository.findAll();
		for(ReviewEntity ReviewEntity : ReviewEntities) {
			reviews.add(getMapper().map(ReviewEntity, Review.class));
		}
		return reviews;
	}

	
}
