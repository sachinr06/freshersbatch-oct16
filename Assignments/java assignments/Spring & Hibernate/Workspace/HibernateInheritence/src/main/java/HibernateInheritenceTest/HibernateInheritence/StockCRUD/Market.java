package HibernateInheritenceTest.HibernateInheritence.StockCRUD;


import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="MARKET")
public class Market {

	
		@Id
		@GeneratedValue
		@Column(name="id")
		private Long id;
		
		

		@Column(name="name")
		private String name;
		
		@Column(name="city")
		private String city;


		@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
				fetch=FetchType.EAGER, mappedBy = "market")
		@Column(name="stock_id")
		Map<String,Stock> stocks;
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Market(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		

		public Map<String,Stock> getStocks() {
			return stocks;
		}

		public void setStocks(Map<String,Stock> stocks) {
			this.stocks = stocks;
		}



		public Market(String name, String city, Map<String,Stock> stocks) {
			super();
			this.name = name;
			this.city = city;
			this.stocks = stocks;
		}

		public Market(Long id, String name, String city, Map<String,Stock> stocks) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.stocks = stocks;
		}

		public Market() {
			super();
		}

		@Override
		public String toString() {
			return "Market [id=" + id + ", name=" + name + ", city=" + city + ", stock="+stocks+"]";
		}
		
		
		
}
