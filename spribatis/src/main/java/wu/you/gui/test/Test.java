package wu.you.gui.test;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import wu.you.gui.dto.Address;
import wu.you.gui.dto.Customer;
import wu.you.gui.service.AddressInterFace;
import wu.you.gui.service.CustomerInterface;
import wu.you.gui.service.impl.AddressInterfaceImpl;
import wu.you.gui.service.impl.CustomerInterfaceImpl;





public class Test {
	
    public static void main(String[] args) {
    	try {
			setUpBeforeClass();
			testInsert();
			//testQueryById();
			//testUpdate();
			testDelete();
			//testQueryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
	}
	
    private static CustomerInterfaceImpl customer;
    private static AddressInterfaceImpl address;
	
	 public static void setUpBeforeClass() throws Exception {  
//			 Resource r = new FileSystemResource("appcon.xml");
//		        BeanFactory bf =new XmlBeanFactory(r);
		 ApplicationContext bf= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 		customer=(CustomerInterfaceImpl) bf.getBean("customer");  
		        address=(AddressInterfaceImpl) bf.getBean("address");
		        System.out.println(customer);
		        System.out.println(address);
		 
		 }  
	     
	      
	   
	    public static Address testQueryById(int i){  
	    	Address u = address.address_queryById(i);  
	        if(u!= null){  
	        	System.out.println(u);  
	        }
	        return u;  
	    }  
	      
	    
	    public static void testInsert(){  
	            Customer u = new Customer();  
	            
	            u.setStore_id(1);
	            
	            while(true){
	            System.out.println("请输入first_name");
	            Scanner  sc = new Scanner(System.in);
	            String s = sc.nextLine();
	            
	            if(!(s.matches("[a-zA-Z]+"))){
	            	System.out.println("请输入字符");
	            }else{
	            	u.setFirst_name(s);  
	            	break;
	            }
	            }
	            
	            while(true){
	            System.out.println("请输入last_name");
	            Scanner  sc1 = new Scanner(System.in);
	            String s1 = sc1.nextLine();
	            if(!(s1.matches("[a-zA-Z]+"))){
	            	System.out.println("请输入字符");
	            }else{
	            	u.setLast_name(s1);  
	            	break;
	            }
	            
	            }
	            while(true){
	            System.out.println("请输入邮箱地址");
	            Scanner  sc2 = new Scanner(System.in);
	            String email = sc2.nextLine();
	            if(!(email.matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$"))){
	            	System.out.println("请输入正确的邮箱");
	            }else{
	            	u.setEmail(email);
	            	break;
	            }
	            }
	            
	            
	            while(true){
	            System.out.println("请输入address_id");
	            Scanner  sc3 = new Scanner(System.in);
	            String s3 = sc3.nextLine();
	            int i = Integer.parseInt(s3);
	            Address u1 = testQueryById(i);
	            if(u1==null){
	            	System.out.println("请输入存在的address_id");
	            }else{
	            	u.setAddress_id(i);
	            	break;
	            }
	            
	            }
	            
	            u.setCreate_date(new Date());
	            
	            customer.customer_save(u);  
	            System.out.println("保存成功！");
	            
	            
	            System.out.println("Before	Insert	Customer Data"+"\n"+
	            		"已经保存的数据如下:");
		        System.out.println("ID:"+ u.getStore_id());
		        System.out.println("FirstName:" + u.getFirst_name());
		        System.out.println("LastName:" + u.getLast_name());
		        System.out.println("Email:" + u.getEmail());
		        System.out.println("Address: 1325 Fukuyama Street");
		        
		        
		        
		        

	        
	        
	    }  
	      
//	   
//	    public static void testUpdate(){  
//	        User u = userService.queryById(3);  
//	        u.setUserName("scott");  
//	        u.setPassword("scott");  
//	        userService.update(u);  
//	        System.out.println("修改成功！");  
//	    }  
//	      
//	      
//	     
	    public static void testDelete(){  
	    	while(true){
	    		System.out.println("请输入要删除的 Customer 的 ID:");
	            Scanner  sc = new Scanner(System.in);
	            String s = sc.nextLine();
	            int i = Integer.parseInt(s);
	            customer.customer_delete(i);  
	            System.out.println("删除成功！");
	            }
	    }  
//	      
//	      
//	   
//	    public static void testQueryAll(){  
//	        List<User> users = address.queryAll();  
//	        if(users != null){  
//	            for(int i = 0; i < users.size(); i++){  
//	                System.out.println(users.get(i));  
//	            }  
//	        }  
//	    }  
}
