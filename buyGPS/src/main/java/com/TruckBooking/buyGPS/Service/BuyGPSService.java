package com.TruckBooking.buyGPS.Service;

import java.util.List;

import com.TruckBooking.buyGPS.Entity.BuyGPS;
import com.TruckBooking.buyGPS.Model.BuyGPSRequest;
import com.TruckBooking.buyGPS.Response.CreateBuyGPSResponse;
import com.TruckBooking.buyGPS.Response.DeleteBuyGPSResponse;
import com.TruckBooking.buyGPS.Response.UpdateBuyGPSResponse;

public interface BuyGPSService 
{
	public CreateBuyGPSResponse addBuyGPS (BuyGPSRequest buygpsrequest);
	
	public BuyGPS getBuyGPS (String gpsId);
	
	public List<BuyGPS> getBuyGPS (String truckId, String transporterId, String purchaseDate, 
								   boolean installedStatus);
	
	public UpdateBuyGPSResponse updateBuyGPS (String gpsId, BuyGPSRequest buygpsrequest);
	
	public DeleteBuyGPSResponse DeleteBuyGPS (String gpsId);
	

}
