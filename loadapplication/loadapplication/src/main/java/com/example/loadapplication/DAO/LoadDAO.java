package com.example.loadapplication.DAO;
import com.example.loadapplication.entities.Loads;
import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loadapplication.entities.Loads;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.io.Serializable;
import java.util.List;
@Repository
public interface LoadDAO extends JpaRepository<Loads, Long>{
    @Query(value = "select l from loads as l where l.shipper_id = :shipperId",nativeQuery = true)
    List<Loads> getByShipperId(@Param("shipperId") String shipperId);



}
