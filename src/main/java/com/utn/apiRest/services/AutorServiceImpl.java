package com.utn.apiRest.services;

import com.utn.apiRest.entities.Autor;
import com.utn.apiRest.repositories.AutorRepository;
import com.utn.apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepositoryRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepositoryRepository) {
        super(baseRepository);
        this.autorRepositoryRepository = autorRepositoryRepository;
    }
}
