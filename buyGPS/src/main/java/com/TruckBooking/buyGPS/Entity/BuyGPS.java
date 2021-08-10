package com.TruckBooking.buyGPS.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Table(name="buyGPS")
@Data
public class BuyGPS 
{
	@Id
	private String gpsId;
	
	@NotBlank(message="transporterId cannot be empty")
    private String transporterId;
	
	@NotBlank(message="truckId cannot be left empty")
    private String truckId;
	
	@NotNull(message="rate cannot be left empty")
    private long rate;
	
	@NotBlank(message="duration has to be specified")
    private String duration;
	
	@NotBlank(message="address cannot be empty")
    private String address;
	
	@CreatedDate
    private String purchaseDate;
	
	@Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean installedStatus;
    
    private String imei;
    
    @CreationTimestamp
    public Timestamp timestamp;
    
	
}
