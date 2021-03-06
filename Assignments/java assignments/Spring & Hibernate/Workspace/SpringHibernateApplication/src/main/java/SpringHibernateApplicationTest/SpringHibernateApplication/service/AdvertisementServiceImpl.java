package SpringHibernateApplicationTest.SpringHibernateApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SpringHibernateApplicationTest.SpringHibernateApplication.dao.AdvertisementDao;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Advertisement;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Message;

public  class AdvertisementServiceImpl implements AdvertisementService {

	@Autowired
	AdvertisementDao adDao;
	public Advertisement postAd(Advertisement Ad, String sessionId) {
		// TODO Auto-generated method stub
			return adDao.postAd(Ad,sessionId);
	}
	public String searchAll() {
		// TODO Auto-generated method stub
		return adDao.searchAll();
	}
	public String searchText(String text) {
		// TODO Auto-generated method stub
		return adDao.searchText(text);
	}
	public String viewAd(Long postId) {
		// TODO Auto-generated method stub
		return adDao.viewAd(postId);
	}
	public String getUserAds(String sessionId) {
		// TODO Auto-generated method stub
		return adDao.getUserAds(sessionId);
	}
	public void deleteAd(long postid) {
		// TODO Auto-generated method stub
		 adDao.deleteAd(postid);
	}
	public Advertisement editAd(Advertisement ad, String sessionId) {
		// TODO Auto-generated method stub
		return adDao.editAd(ad,sessionId);
	}
	public Message sendMessage(Message m) {
		// TODO Auto-generated method stub
		return adDao.sendMessage(m);
	}



	
}

