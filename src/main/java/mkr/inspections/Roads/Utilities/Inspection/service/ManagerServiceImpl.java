package mkr.inspections.Roads.Utilities.Inspection.service;

import mkr.inspections.Roads.Utilities.Inspection.Domain.OperationsManager;
import mkr.inspections.Roads.Utilities.Inspection.Domain.Project;
import mkr.inspections.Roads.Utilities.Inspection.dao.ManagerRepository;
import mkr.inspections.Roads.Utilities.Inspection.dao.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService {

//	private ManagerRepository managerRepository;
//
//	@Autowired
//	public ManagerServiceImpl(ManagerRepository themanagerRepository) {
//		managerRepository = themanagerRepository;
//	}
//
//	@Override
//	public List<OperationsManager> findAll() {
//		return managerRepository.findAll();
//	}
//
//	@Override
//	public OperationsManager findById(int theId) {
//		Optional<OperationsManager> result = managerRepository.findById(theId);
//
//		OperationsManager operationsManager = null;
//
//		if (result.isPresent()) {
//			operationsManager = result.get();
//		}
//		else {
//			// we didn't find the employee
//			throw new RuntimeException("Did not find Manager id - " + theId);
//		}
//
//		return operationsManager;
//	}
//
//	@Override
//	public void save(OperationsManager operationsManager) {
//		managerRepository.save(operationsManager);
//	}
//
//	@Override
//	public void deleteById(int theId) {
//		managerRepository.deleteById(theId);
//	}

}






