
package jdk8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Fruit>fruits=getAllFruits();
		List<News>news=getAllNews();
		System.out.println(" DATA SETS ");
	news.forEach(System.out::println);
	 List<Transaction> transactions=getAllTransactions();
	 transactions.forEach(System.out::println);
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		System.out.println("Q-1");
		List<Fruit> declowcal =fruits.stream()
				.filter((Fruit f) -> f.getCalories() < 100).
				sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect (Collectors.toList()); 
		declowcal.forEach(System.out::println);
		System.out.println("---------------------------------------------");
		System.out.println("Q-2");
		
		Map<String,List<Fruit>> colorwise= fruits.stream().collect(Collectors.groupingBy(Fruit::getColor));
		colorwise.entrySet();
		colorwise.entrySet().forEach(System.out::println);
		System.out.println("---------------------------------------------");
		System.out.println("Q-3");
		fruits=getAllFruits();
		List<Fruit> redfruits =fruits.stream().filter((Fruit f) -> f.getColor().equals("Red")).
				sorted(Comparator.comparing(Fruit::getPrice)).collect (Collectors.toList()); 
		redfruits.forEach(System.out::println);
		System.out.println("---------------------------------------------");
		System.out.println("Q-4");

		
	int maxComments = TestData.getAllNews().stream()
            .collect(Collectors.groupingBy(News::getNewsId, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	System.out.println("newsid with maximum comments :" + maxComments);
	System.out.println("---------------------------------------------");
	System.out.println("Q-5");

		long count=news.stream().
           filter((n)->n.comment.contains("budget")).count();
			System.out.println("Buget"+count); 
	System.out.println("---------------------------------------------");
	System.out.println("Q-6");
	Map<Object, Long> counters = TestData.getAllNews().stream()
  		     .collect(Collectors.groupingBy(p -> p.getCommentByUser (), 
  		         Collectors.counting()));
    System.out.println("Count" + counters);
	System.out.println("---------------------------------------------");
	System.out.println("Q-7");
			List<Transaction>transactions2011=transactions.stream()
            .filter(transac-> transac.getYear() == 2011)
            .sorted(Comparator.comparing(Transaction::getYear))
            .collect (Collectors.toList());
		transactions2011.stream().forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		System.out.println("Q-8");
		 List<String> cities=transactions.stream().map((Transaction t)->t.getTrader().getCity()).distinct().collect(Collectors.toList());
				cities.forEach(System.out::println);
	

				System.out.println("---------------------------------------------");
				System.out.println("Q-9");
		//	traders.forEach(System.out::println);
		 List<Transaction> punetraders=transactions.stream().filter((Transaction t)->t.getTrader().getCity().equals("Pune")).sorted(Comparator.comparing((Transaction t)->t.getTrader().getCity())).collect(Collectors.toList());
		 punetraders.forEach(System.out::println);
		 
			System.out.println("---------------------------------------------");
			System.out.println("Q-10");
		
			List<String> namesorttraders=transactions.stream().sorted(Comparator.comparing((Transaction t)->t.getTrader().getCity())).map((Transaction t)->t.getTrader().getName()).collect(Collectors.toList());
			 namesorttraders.forEach(System.out::println);
		
				System.out.println("---------------------------------------------");
				System.out.println("Q-11");
				 List<Transaction> indoretraders=transactions.stream().filter((Transaction t)->t.getTrader().getCity().equals("Indore")).sorted(Comparator.comparing((Transaction t)->t.getTrader().getCity())).collect(Collectors.toList());
				 indoretraders.forEach(System.out::println);
					System.out.println("---------------------------------------------");
					System.out.println("Q-12");
					 List<Integer> punevaluestraders=transactions.stream().filter((Transaction t)->t.getTrader().getCity().equals("Pune")).map(Transaction::getValue).collect(Collectors.toList());
					 punevaluestraders.forEach(System.out::println);
					 System.out.println("---------------------------------------------");
					 System.out.println("Q-13");
					 Optional<Integer> maxValue=transactions.stream().map(Transaction::getValue).reduce(Integer::max);
					 System.out.println("Highest Transaction Value : "+maxValue);
					 System.out.println("---------------------------------------------");
					 System.out.println("Q-14");
					 Optional<Transaction> minValue=transactions.stream().min(Comparator.comparing(Transaction::getValue));
					 System.out.println("Minimum Transaction : "+minValue);
					 System.out.println("---------------------------------------------");
					 System.out.println("Q-15");
					 String maxComments2 = TestData.getAllNews().stream()
					            .collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
						System.out.println("User with maximum comments :" + maxComments2);
					System.out.println("---------------------------------------------");
					
	}
	
	
}
