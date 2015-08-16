package app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.repository.dao.ApplicationDao;
import app.repository.dao.RentDao;
import app.repository.dao.SalaryDao;
import app.repository.entity.ApplicationEntity;
import app.repository.entity.RentEntity;
import app.repository.entity.SalaryEntity;
import app.repository.entity.map.ModelClassMap;
import domain.model.Application;
import domain.model.Director;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Salary;
import domain.model.Sto;
import domain.service.ReportService;

@Service()
@Transactional
public class ReportServiceImplement implements ReportService{

	@Autowired
	private ApplicationDao applicationRepository;
	
	@Autowired
	private RentDao rentRepository;
	
	@Autowired
	private SalaryDao salaryRepository;
	
	@Autowired
	private ModelClassMap modelClassMap;
	
	private Mapper getMapper() {
		return DozerBeanMapperSingletonWrapper.getInstance();
	}
	
	@Override
	public List<Salary> getListSalary(Date dateStart, Date dateFinish) {
		List<Salary> salary = new ArrayList<Salary>();
		List<SalaryEntity> salaryEntities = salaryRepository.findBySalaryToDate(dateStart, dateFinish);
		for(SalaryEntity SalaryEntity : salaryEntities) {
			salary.add(getMapper().map(SalaryEntity, Salary.class));
		}
		return salary;
	}

	@Override
	public List<Salary> getListDirectorSalary(Director director,
			Date dateStart, Date dateFinish) {
		List<Salary> salary = new ArrayList<Salary>();
		List<SalaryEntity> salaryEntities = salaryRepository.findByDirectorSalaryToDate(director, dateStart, dateFinish);
		for(SalaryEntity SalaryEntity : salaryEntities) {
			salary.add(getMapper().map(SalaryEntity, Salary.class));
		}
		return salary;
	}

	@Override
	public List<Rent> getListSTORent(Sto sto, Date dateStart, Date dateFinish) {
		List<Rent> rent = new ArrayList<Rent>();
		List<RentEntity> rentEntities = rentRepository.findByRentToDate(sto, dateStart, dateFinish);
		for(RentEntity RentEntity : rentEntities) {
			rent.add(getMapper().map(RentEntity, Rent.class));
		}
		return rent;
	}

	@Override
	public List<Salary> getListMechanicSalary(Mechanic mechanic,
			Date dateStart, Date dateFinish) {
		List<Salary> salary = new ArrayList<Salary>();
		List<SalaryEntity> salaryEntities = salaryRepository.findByMechanicSalaryToDate(mechanic, dateStart, dateFinish);
		for(SalaryEntity SalaryEntity : salaryEntities) {
			salary.add(getMapper().map(SalaryEntity, Salary.class));
		}
		return salary;
	}

	@Override
	public List<Application> getListStoApplicationToDate(Sto sto,
			Date dateStart, Date dateFinish) {
		List<Application> application = new ArrayList<Application>();
		List<ApplicationEntity> applicationEntities = applicationRepository.findByStoToDate(sto, dateStart, dateFinish);
		for(ApplicationEntity ApplicationEntity : applicationEntities) {
			application.add(getMapper().map(ApplicationEntity, Application.class));
		}
		return application;
	}

	@Override
	public List<Application> getListMechanicApplicationToDate(
			Mechanic mechanic, Date dateStart, Date dateFinish) {
		List<Application> application = new ArrayList<Application>();
		List<ApplicationEntity> applicationEntities = applicationRepository.findByMechanicToDate(mechanic, dateStart, dateFinish);
		for(ApplicationEntity ApplicationEntity : applicationEntities) {
			application.add(getMapper().map(ApplicationEntity, Application.class));
		}
		return application;
	}

}
