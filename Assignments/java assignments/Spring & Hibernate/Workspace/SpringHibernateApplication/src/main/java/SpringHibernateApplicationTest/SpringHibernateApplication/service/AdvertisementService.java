package SpringHibernateApplicationTest.SpringHibernateApplication.service;

import java.util.List;

import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Advertisement;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Message;

public interface AdvertisementService {
	public Advertisement postAd(Advertisement Ad,String sessionId);
	public String searchAll();
	public String searchText(String text);
	public String viewAd(Long postId);
	public String getUserAds(String sessionId);
	public void deleteAd(long postid);
	public Advertisement editAd(Advertisement ad, String sessionId);
	public Message sendMessage(Message m);
}