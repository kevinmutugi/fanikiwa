package com.softwareproviders.fanikiwa.Beans;

import java.util.*;

public class Offer {

	private int Id, MemberId, Term;  
	private String OfferType, Description, Offerees, Status, PublicOffer;  
	private Date ExpiryDate, CreatedDate;
	private Double Amount, Interest;
	private Boolean PartialPay;
	  
	public int getId() {  
	    return Id;  
	}  
	public void setId(int id) {  
	    this.Id = id;  
	} 
	public int getMemberId() {  
	    return MemberId;  
	}  
	public void setMemberId(int id) {  
	    this.MemberId = id;  
	}
	public int getTerm() {  
	    return Term;  
	}  
	public void setTerm(int id) {  
	    this.Term = id;  
	} 
	public String getOfferType() {  
	    return OfferType;  
	}  
	public void setOfferType(String offerType) {  
	    this.OfferType = offerType;  
	}	
	public String getDescription() {  
	    return Description;  
	}  
	public void setDescription(String description) {  
	    this.Description = description;  
	} 
	public String getOfferees() {  
	    return Offerees;  
	}  
	public void setOfferees(String offerees) {  
	    this.Offerees = offerees;  
	}
	public String getStatus() {  
	    return Status;  
	}  
	public void setStatus(String status) {  
	    this.Status = status;  
	} 
	public String getPublicOffer() {  
	    return PublicOffer;  
	}  
	public void setPublicOffer(String publicOffer) {  
	    this.PublicOffer = publicOffer;  
	}
	public Date getExpiryDate() {  
	    return ExpiryDate;  
	}  
	public void setExpiryDate(Date expiryDate) {  
	    this.ExpiryDate = expiryDate;  
	} 
	public Date getCreatedDate() {  
	    return CreatedDate;  
	}  
	public void setCreatedDate(Date createdDate) {  
	    this.CreatedDate = createdDate;  
	} 
	public Double getAmount() {  
	    return Amount;  
	}  
	public void setAmount(Double amount) {  
	    this.Amount = amount;  
	} 
	public Double getInterest() {  
	    return Interest;  
	}  
	public void setInterest(Double Interest) {  
	    this.Interest = Interest;  
	}  
	public Boolean getPartialPay() {
		return PartialPay;
	}
	public void setPartialPay(Boolean partialPay) {
		PartialPay = partialPay;
	}
	
	
	
	
	
}

