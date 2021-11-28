package com.example.loadapplication.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="loads")
//@NamedNativeQuery(name = "Loads.getByShipperId",
        //query = "SELECT l.* FROM loads l WHERE l.shipper_id =:shipperId")
public class Loads implements Serializable {
    @Id
    @Column(name="load_id")
    private long loadId;
    @Column(name="loading_point")
    private String loadingPoint;
    @Column(name="unloading_point")
    private String unloadingPoint;
    @Column(name="product_type")
    private String productType;
    @Column(name="truck_type")
    private String truckType;
    @Column(name="no_of_trucks")
    private int noOfTrucks;
    @Column(name="weight")
    private int weight;
    @Column(name="comment")
    private String comment;

    @Column(name = "shipper_id", nullable = false)
    private String shipperId;
    @Column(name="date")
    private String Date;

    public Loads(long loadId,String loadingPoint,String unloadingPoint,String productType,String truckType,int noOfTrucks,int weight,String comment,String shipperId,String Date)
    {
        super();
        this.loadId=loadId;
        this.loadingPoint=loadingPoint;
        this.unloadingPoint=unloadingPoint;
        this.productType=productType;
        this.truckType=truckType;
        this.noOfTrucks=noOfTrucks;
        this.weight=weight;
        this.comment=comment;
        this.shipperId=shipperId;
        this.Date=Date;

    }
    public Loads(long loadId,String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String shipperId, String Date)
    {
        super();
        this.loadId=loadId;
        this.loadingPoint=loadingPoint;
        this.unloadingPoint=unloadingPoint;
        this.productType=productType;
        this.truckType=truckType;
        this.noOfTrucks=noOfTrucks;
        this.weight=weight;
        this.shipperId=shipperId;
        this.Date=Date;

    }
    public Loads()
    {
        super();
    }

    public long getLoadId() {
        return loadId;
    }

    public void setLoadId(long loadId) {
        this.loadId = loadId;
    }

    public String getLoadingPoint()
   {
       return this.loadingPoint;
   }
   public String getUnloadingPoint()
   {
       return this.unloadingPoint;
   }
   public String getProductType()
   {
       return this.productType;
   }
   public String getTruckType()
   {
       return this.truckType;
   }
   public String getComment()
   {
       return this.comment;
   }
   public String getDate()
   {
       return this.Date;
   }
   public int getNoOfTrucks()
   {
       return this.noOfTrucks;
   }
   public int getWeight()
   {
       return this.weight;
   }

    public String getShipperId() {
        return shipperId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
