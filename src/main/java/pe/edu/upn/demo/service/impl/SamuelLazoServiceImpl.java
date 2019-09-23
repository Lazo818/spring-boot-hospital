package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.SamuelLazo;
import pe.edu.upn.demo.model.repository.SamuelLazoRepository;
import pe.edu.upn.demo.service.CrudService;

@Service
public class SamuelLazoServiceImpl implements CrudService<SamuelLazo, String> {

	@Autowired
	private SamuelLazoRepository Samuellazorepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<SamuelLazo> findAll() throws Exception {
		
		return Samuellazorepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<SamuelLazo> findById(String id) throws Exception {
		
		return Samuellazorepository.findById(id);
	}

	
	@Transactional
	@Override
	public SamuelLazo save(SamuelLazo entity) throws Exception {
		
		return Samuellazorepository.save(entity);
	}

	@Transactional
	@Override
	public SamuelLazo update(SamuelLazo entity) throws Exception {
		
		return Samuellazorepository.save(entity);
	}

	
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		Samuellazorepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		Samuellazorepository.deleteAll();
		
	}

}
