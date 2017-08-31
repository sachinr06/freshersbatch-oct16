package collectionpackage;


import java.util.*;
class ChatRoom{
	
	ChatRoom(String name){
		this.name=name;
	}
	String name;
	HashSet<User> users=new HashSet<User>();
	ArrayList<Message> messages=new ArrayList<Message>();
	
}

class User{
	
	double uid;
	String uname;
	User(double uid,String uname){
		this.uid=uid;
		this.uname=uname;
	}
	
}

class Message{
	String data;
	String mname;
	Message(String data,String uname){
		this.data=data;
		this.mname=uname;
	}
}


public class ChatApplication {

	public static void main(String args[]){
		
		
		HashSet<ChatRoom> chatRoom=new HashSet<ChatRoom>();

		 char again;
		 char againin;
		 do{
		System.out.println(" CHAT APPLICATION");
		System.out.println("1. CREATE A CHATROOM");
		System.out.println("2. REGISTER  A USER  ");
		System.out.println("3. USER LOGIN ");
		
		System.out.println("ENTER your choice");
		 Scanner sc=new Scanner(System.in);  
		  int choice=sc.nextInt(); 
		 
		 
	  switch(choice)
		  {
		  
		  case 1: 
			  boolean flag3=false;
			  System.out.println("NAME OF THE CHAT ROOM ?");
			  String croom=sc.next(); 
				Iterator<ChatRoom> i=chatRoom.iterator();
						
		        for(ChatRoom x:chatRoom){
		        	if(x.name.equals(croom)==true)
		        	{
		        	  System.out.println("CHATROOM Already exists!!");
		        	  flag3=true;
		        	}
		        	  }
		        if(flag3==false){
		        	ChatRoom c=new ChatRoom(croom);
			          chatRoom.add(c);
			     
		        }
		          
		        
		        break;
		        
		  case 2:
			  
			  Iterator<ChatRoom> i2=chatRoom.iterator();
			  double uid=Math.random();
			  uid=uid*100;
				int no=0;

				System.out.println("ENTER YOUR NAME");
				 String username=sc.next();
				 
				System.out.println("ENTER NAME OF A CHATROOM");
		        while(i2.hasNext()){
		        	System.out.println(" CHAT ROOM  :"+no+":"+i2.next().name);
		        	no++;
		        }
		        String croomu=sc.next();
		        for(ChatRoom x:chatRoom){
		        	if(x.name.equals(croomu)){
		        	  User u=new User(uid,username);
		        	  x.users.add(u);
		        	}
		        		
		       }
		        System.out.println("Your userid is :" +uid);
		       
		        
		        break;
		        
		        
		  case 3:
				System.out.println("ENTER NAME OF A CHATROOM");
				String croomu2=sc.next();
				
			      /*for(ChatRoom x:chatRoom){
			    	 if(x.name==croomu2)
			    		 break;
			      }*/
				 
					boolean flag=false;
					boolean flag2=false;
					
					    for(ChatRoom x:chatRoom){
					    
					    	 if(x.name.equals(croomu2))
					    	 {
					    			flag=true;
					    		 for(User u:x.users){
			    					 System.out.println(u.uname);
			    				 }
					    		 System.out.println("ENTER YOUR NAME");
								 String username2=sc.next();
					    		 
					    	outer :for(User y:x.users){
					    		
					    		if(username2.equals(y.uname)){
					    			flag2=true;
					    			do{
					    			System.out.println("Welcome "+y.uname);
					    			System.out.println("1. SEND A MESSAGE");
					    			System.out.println("2. SEE ALL MESSAGES  ");
					    			System.out.println("2. SEE ALL USERS  ");
					    			System.out.println("4. LOGOUT ");
					    			  int choice3=sc.nextInt();
					    			  switch(choice3)
					    			  {
					    			  case 1:
					    				  Scanner sc2= new Scanner(System.in);
					    				  System.out.println("ENTER YOUR MESSAGE");
					    				  String msg=sc2.nextLine();
					    				
					    				  Message umsg=new Message(msg,y.uname);
					    				  x.messages.add(umsg);
					    				  System.out.println("YOUR MESSAGE WAS SENT SUCCESSFULLY");
					    				  break;
					    			  case 2:
					    				  System.out.println("MESSAGES OF CHAT ROOM "+x.name);
					    				 for(Message m:x.messages){
					    					 System.out.println(m.mname+"> "+m.data);
					    				 }
					    				 break;
					    			  case 3:
					    				  System.out.println("USERS OF CHAT ROOM "+x.name);
						    				 for(User u:x.users){
						    					 System.out.println(u.uname);
						    				 }
						    				 break;
					    			  case 4: 
					    				   break outer;
					    			  
					    			   default: 
					    				   System.out.println("WRONG CHOICE");
					    				   break;
					    			  }
					    			   System.out.println("Press y to continue n to logout : ");
					    			  againin= sc.next().charAt(0);
					    			}while(againin=='y');
					    			  
					    		}
					    		
					    	}
					         
					    if(flag2==false){
					    	System.out.println("User Does Not Exists");
					    	
					    }
					  }
			     }
					    
					    if(flag==false){
					    	System.out.println("Chatroom doesnot exists");
					    }
					    break;
					    
		  default: 
			   System.out.println("WRONG CHOICE");
			   break;
				 
		  }
		        System.out.println("Continue Using CHAT APPLICATION ? : ");
          
			   again = sc.next().charAt(0);
		  }while(again=='y');
		  
		  }
}

