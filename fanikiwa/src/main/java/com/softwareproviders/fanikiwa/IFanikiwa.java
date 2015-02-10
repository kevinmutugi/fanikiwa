package com.softwareproviders.fanikiwa;
import java.util.List;
import com.softwareproviders.fanikiwa.Beans.*; 

public interface IFanikiwa {
	Member GetMemberByEmail(String email);
	List<Offer> ListLendOffers(Member member);
	List<Offer> ListMyOffers(Member member);
	List<Offer> ListBorrowOffers(Member member);
	void AcceptLendOffer(Member borrower, Offer offer);
	Offer GetOfferById(int id);

}
