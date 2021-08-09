package com.TruckBooking.buyGPS.Service;

import java.util.List;

import com.TruckBooking.buyGPS.Entity.BuyGPS;
import com.TruckBooking.buyGPS.Model.BuyGPSPostRequest;
import com.TruckBooking.buyGPS.Model.BuyGPSPutRequest;
import com.TruckBooking.buyGPS.Response.CreateBuyGPSResponse;
import com.TruckBooking.buyGPS.Response.DeleteBuyGPSResponse;
import com.TruckBooking.buyGPS.Response.UpdateBuyGPSResponse;

public interface BuyGPSService 
{
	public CreateBuyGPSResponse addBuyGPS (BuyGPSPostRequest buygpsrequest);
	
	public BuyGPS getBuyGPS (String gpsId);
	
	public List<BuyGPS> getBuyGPS (String truckId, String transporterId, String purchaseDate, 
								   boolean installedStatus);
	
	public UpdateBuyGPSResponse updateBuyGPS (String gpsId, BuyGPSPutRequest buygpsrequest);
	
	public DeleteBuyGPSResponse DeleteBuyGPS (String gpsId);
	

}
