package com.example.loadapplication.services;

import com.example.loadapplication.entities.Loads;

import java.util.List;

public interface LoadsService{

    public List<Loads> getLoads();
    public List<Loads> getLoadswithshipperId(String shipperId);
    public Loads getLoad(long loadId);
    public Loads addLoad(Loads load);


   public void deleteLoad(long loadId);

   public Loads putLoad(long loadId,Loads load);
}
