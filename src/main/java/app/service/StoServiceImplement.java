package app.service;

import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import app.repository.dao.StoDao;
import app.repository.entity.StoEntity;
import app.repository.entity.map.ModelClassMap;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Review;
import domain.model.Service;
import domain.model.Sto;
import domain.service.StoService;

public class StoServiceImplement implements StoService {

	@Autowired
	private StoDao stoRepository;

	@Autowired
	private ModelClassMap modelClassMap;

	private Mapper getMapper() {
		return DozerBeanMapperSingletonWrapper.getInstance();
	}

	@Override
	public Sto findByName(String name) {
		StoEntity stoEntity = stoRepository.findByName(name);
		Sto stoModel = null;
		if (stoEntity != null) {
			stoModel = (Sto) getMapper().map(stoEntity,
					modelClassMap.getModelClass(stoEntity.getClass()));
		}
		return stoModel;
	}

	@Override
	public List<Sto> getAllSto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> getStoAllReview(Sto sto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mechanic> getStoAllMechanic(Sto sto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Detail, Long> getDelaitSto(Sto sto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Service, Long> getServiceSto(Sto sto) {
		// TODO Auto-generated method stub
		return null;
	}

}
