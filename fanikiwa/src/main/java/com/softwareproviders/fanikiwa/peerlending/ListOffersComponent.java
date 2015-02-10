package com.softwareproviders.fanikiwa.peerlending;

import com.softwareproviders.fanikiwa.Beans.*;
import com.softwareproviders.fanikiwa.DAO.*;

public class ListOffersComponent {

	/*
	public OfferReceipient CreateOfferReceipient(OfferReceipient or);
    public void DeleteOfferById(Offer offer);
    public List<Offer> GetAllMyOffersByDate(DateTime datefrom, DateTime dateto, int total_display_records);
    public List<Offer> GetAllMyOffersByMember(string OfferOwner, int total_display_records);
    public List<Offer> GetAllMyOffersByOfferType(string OfferType, int total_display_records);
    public List<Offer> GetAllNonExpiredOffers();
    public List<Offer> GetAllOffers();
    */
    public Offer GetOfferById(int Id)
    {
    	OfferDAC or = new OfferDAC();
        return or.SelectById(Id);
    }
    /*
    public List<OfferReceipient> GetOfferReceipients(int OfferId);
    public List<Offer> GetPublicBorrowOffers(Member m);
    public List<Offer> GetPublicLendOffers(Member m);
    public List<Offer> ListBorrowOffers(Member m);
    public List<Offer> ListLendOffers(Member m);
    public List<Offer> ListMyBorrowOffers(Member m);
    public List<Offer> ListMyLendOffers(Member m);
    public List<Offer> ListMyOffers(Member m);
    public List<Offer> ListPrivateBorrowOffers(Member m);
    public List<Offer> ListPrivateLendOffers(Member m);
    public List<Offer> SelectOffersToMember(int MemberId, string OfferType);
    public List<Offer> SelectOffersToMember(Member m, string OfferType);
    */
}
