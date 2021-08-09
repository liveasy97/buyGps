package com.TruckBooking.buyGPS.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TruckBooking.buyGPS.Entity.BuyGPS;

@Repository
public interface BuyGPSDao extends JpaRepository<BuyGPS,String>
{
 
	Optional <BuyGPS> findById(String gpsId);

    List<BuyGPS> findByTruckId(String truckId);

	List<BuyGPS> findByTransporterId(String transporterId);

	List<BuyGPS> findByPurchaseDate(String purchaseDate);

	List<BuyGPS> findByInstalledStatus(boolean installedStatus);
}
