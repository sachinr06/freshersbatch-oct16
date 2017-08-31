package collectionpackage;
import java.util.*;
class Floor{
	int fno;
	HashSet<Section> sections =new HashSet<Section>();
	Floor(int fno){
		this.fno=fno;
	}
	

}


class  Section{
	int sectionno;
	Owner o;
	Section(int sec,Owner o){
		this.sectionno=sec;
		this.o=o;
	}
	
	Section(int sec){
		this.sectionno=sec;
		
	}
}

class Owner{
	String name;
	String vehicle;
	int vehicleno;
	Owner(String name,String vehicle,int vehicleno)
	{
		this.name=name;
		this.vehicle=vehicle;
		this.vehicleno=vehicleno;
		
	}
	
	void getownerDetails()
	{
		System.out.println("NAME : "+this.name);
		System.out.println("CAR MODEL"+this.vehicle);
		System.out.println("CAR NUMBER"+this.vehicleno);
		
	}
	
	
	void setownerDetails(String name,String vehicle,int vehicleno)
	{
		this.name=name;
		this.vehicle=vehicle;
		this.vehicleno=vehicleno;
		
	}
}
public class parkingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char again;
		Floor f=new Floor(1);
		Floor f2=new Floor(2);
		Floor f3=new Floor(3);
		HashSet<Floor> floor=new HashSet<Floor>();
	    Owner o=new Owner("Sachin","BAJAJ",123);
	    Owner o2=new Owner("Aniket","YAMAHA",125);
	    Owner o3=new Owner("Gopal","HONDA",153);
	    Owner o4=new Owner("Swapnil","TVS",623);
       Section s1=new Section(1);
       Section s2=new Section(2);
       Section s3=new Section(3);
       Section s4=new Section(4);
       Section s5=new Section(1);
       Section s6=new Section(2);
       Section s7=new Section(3);
       Section s8=new Section(4);
   
       Section s9=new Section(1);
       Section s10=new Section(2);
       Section s11=new Section(3);
       Section s12=new Section(4);
   
   
		HashSet<Floor> floors=new HashSet<Floor>();
		floors.add(f);
		floors.add(f2);
		floors.add(f3);
		f.sections.add(s1);
		f.sections.add(s2);
		f.sections.add(s3);
		f.sections.add(s4);
		f2.sections.add(s5);
		f2.sections.add(s6);
		f2.sections.add(s7);
		f2.sections.add(s8);
		f3.sections.add(s9);
		f3.sections.add(s10);
		f3.sections.add(s11);
		f3.sections.add(s12);
		
		System.out.println(" PARK APPLICATION ");
		System.out.println("1. GET A PARKING SLOT ");
		System.out.println("2. GET USER DETAILS OF PARTICULAR PARKING SLOT ");
		System.out.println("3. GET DETAILS OF ALL USERS ");
		
		System.out.println("ENTER your choice");
		 Scanner sc=new Scanner(System.in);  
		  int choice=sc.nextInt(); 
		  do{
		  switch(choice){
		 
			 
		
		 case 1: 
				System.out.println(" ENTER YOUR NAME");
					String name=sc.next();
				System.out.println(" ENTER YOUR  CAR MODEL");
					String vehicle=sc.next();
				System.out.println(" ENTER CAR NO");
					int vehicleno=sc.nextInt();
					
					Owner iw=new Owner(name,vehicle,vehicleno);
					System.out.println("AVAIALBLE PARKING SLOTS");
					for(Floor x:floor){
						for(Section y:x.sections){
							if(y.o==null);
							System.out.println("Floor : " +x.fno +" section : "+y.sectionno);
						}
					}
					boolean flag1=false;
					System.out.println("ENTER FLOOR NO");
					int fno=sc.nextInt();
					System.out.println("ENTER SECTION NO");
					int sectionno=sc.nextInt();
					for(Floor x: floor){
						for(Section y:x.sections){
						if((x.fno==fno) && (y.sectionno==sectionno) && (y.o==null)){
							y.o=iw;
							flag1=true;
						}
						}
					}
					if(flag1==false){
						System.out.println("PARKING LOT U SPECIFIED IS FULL PLEASE TRY AGAIN WITH ANOTHER ONE");
					}
					break;
			
		 case 2: 
			 	System.out.println("ENTER FLOOR NO");
				int fno1=sc.nextInt();
				System.out.println("ENTER SECTION NO");
				int sectionno1=sc.nextInt();
				for(Floor x: floor){
					for(Section y:x.sections){
						if((x.fno==fno1) && (y.sectionno==sectionno1) ){
							y.o.getownerDetails();
						}
					}
					}
			break;
		 
		 case 3:
			 for(Floor x:floor){
					for(Section y:x.sections){
						y.o.getownerDetails();
					}
				}
			 break;
			 
		 }
		  again=sc.next().charAt(0);
		 }while(again=='y');
	}

}
