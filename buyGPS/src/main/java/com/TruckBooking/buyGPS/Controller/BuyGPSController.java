package com.TruckBooking.buyGPS.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TruckBooking.buyGPS.Entity.BuyGPS;
import com.TruckBooking.buyGPS.Model.BuyGPSPostRequest;
import com.TruckBooking.buyGPS.Model.BuyGPSPutRequest;
import com.TruckBooking.buyGPS.Service.BuyGPSServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BuyGPSController 
{
	@Autowired
	private BuyGPSServiceImpl buygpsservice;
	
	@PostMapping("/buygps")
	public ResponseEntity<Object> addBuyGPS(@Valid @RequestBody BuyGPSPostRequest buygpsrequest)
	{
		log.info("post controller started");
		return new ResponseEntity<>(buygpsservice.addBuyGPS(buygpsrequest), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/buygps/{gpsId}")
	public ResponseEntity<Object> getBuyGPS(@PathVariable String gpsId)
	{
		log.info("get by gpsId controller started");
		return new ResponseEntity<>(buygpsservice.getBuyGPS(gpsId), HttpStatus.OK);
	}
	
	@GetMapping("/buygps")
	public ResponseEntity<List<BuyGPS>> getBuyGPS (@RequestParam (name="truckId", required=false) String truckId,
								   @RequestParam (name="transporterId", required=false) String transporterId,
								   @RequestParam (name="purchaseDate", required=false) String purchaseDate,
								   @RequestParam (name="installedStatus", required=false) Boolean installedStatus)
	{
		log.info("get with params controller has started");
		return new ResponseEntity<>(buygpsservice.getBuyGPS(truckId, transporterId, purchaseDate, installedStatus), HttpStatus.OK);
	}
	
	@PutMapping("/buygps/{gpsId}")
	public ResponseEntity<Object> updateBuyGPS(@PathVariable String gpsId, @RequestBody BuyGPSPutRequest buygpsrequest)
	{
		log.info("Put Controller Started");
		return new ResponseEntity<>(buygpsservice.updateBuyGPS(gpsId, buygpsrequest), HttpStatus.OK);
	}
	
	@DeleteMapping("/buygps/{gpsId}")
	public ResponseEntity<Object> deleteBuyGPS (@PathVariable String gpsId)
	{
		log.info("delete controller has started");
		return new ResponseEntity<>(buygpsservice.DeleteBuyGPS(gpsId), HttpStatus.OK);
	}

}
