/*
package fr.simplon.forknow.service.impl;

import fr.simplon.forknow.model.Count;
import fr.simplon.forknow.repository.CountRepository;
import fr.simplon.forknow.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service public class CountServiceImpl implements CountService {

    private final CountRepository countRepository;

    @Autowired
    public CountServiceImpl (CountRepository countRepository) {
        this.countRepository = countRepository;
    }


    @Override
    public void save(Count count) {
        countRepository.save(count);
    }

    @Override
    public Optional<Count> findCountById(Integer Id) {
        return countRepository.findById(Id);
    }
}
*/
