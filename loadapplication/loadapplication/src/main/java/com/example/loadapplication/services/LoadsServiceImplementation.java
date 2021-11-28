package com.example.loadapplication.services;

import com.example.loadapplication.DAO.LoadDAO;

import com.example.loadapplication.entities.Loads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoadsServiceImplementation implements LoadsService {
 @Autowired
 private LoadDAO loadDao;



    @Override
    public List<Loads> getLoads() {
        return loadDao.findAll();
    }

    public List<Loads> getLoadswithshipperId(String shipperId) {
        if (shipperId != null) {
            return loadDao.getByShipperId(shipperId);
        }
        return null;
    }

    @Override
    public Loads getLoad(long loadId) {
        Loads entity = loadDao.findById(loadId).get();
        return entity;
    }

    @Override
    public Loads addLoad(Loads load) {
        loadDao.save(load);
        return load;
    }
    public void deleteLoad(long loadId)
    {
        Loads entity = loadDao.getById(loadId);
        loadDao.delete(entity);

    }

    public Loads putLoad(long loadId, Loads load)
    {
      loadDao.save(load);
     return load;
    }
}
