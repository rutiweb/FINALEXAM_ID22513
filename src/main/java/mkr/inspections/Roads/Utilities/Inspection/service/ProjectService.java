package mkr.inspections.Roads.Utilities.Inspection.service;


import mkr.inspections.Roads.Utilities.Inspection.Domain.Project;
import mkr.inspections.Roads.Utilities.Inspection.Domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

	List<Project> findAll();
	//@Cacheable("projects")
	Page<Project> findAll(int pageNumber, String keyword);

	Page<Project> findAllByInspectorId(Long userId, int pageNumber, String keyword);
	//@Cacheable("projects")
	Project findById(int theId);
	//@CachePut("projects")
	void save(Project project, Long userId);
	//@CacheEvict("projects")
	void deleteById(int theId);

}
