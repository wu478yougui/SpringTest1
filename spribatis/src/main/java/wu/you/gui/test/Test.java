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
import wu.you.gui.dto.Film;
import wu.you.gui.service.AddressInterFace;
import wu.you.gui.service.CustomerInterface;
import wu.you.gui.service.FilmInterface;
import wu.you.gui.service.impl.AddressInterfaceImpl;
import wu.you.gui.service.impl.CustomerInterfaceImpl;
import wu.you.gui.service.impl.FilmInterfaceImpl;





public class Test {
	
    public static void main(String[] args) {
    	try {
			setUpBeforeClass();
			testInsert();
			//testQueryById();
			//testUpdate();
			testDelete();
			filmInsetTest();
			//testQueryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
	}
	
    private static CustomerInterfaceImpl customer;
    private static AddressInterfaceImpl address;
    private static FilmInterface film;
	
	 public static void setUpBeforeClass() throws Exception {  
//			 Resource r = new FileSystemResource("appcon.xml");
//		        BeanFactory bf =new XmlBeanFactory(r);
		 ApplicationContext bf= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 		customer=(CustomerInterfaceImpl) bf.getBean("customer");  
		        address=(AddressInterfaceImpl) bf.getBean("address");
		        film=(FilmInterface)bf.getBean("film");
		        System.out.println(customer);
		        System.out.println(address);
		        System.out.println(film);
		 
		 }  
	     
	      
	   //查询一个
	    public static Address testQueryById(int i){  
	    	Address u = address.address_queryById(i);  
	        if(u!= null){  
	        	System.out.println(u);  
	        }
	        return u;  
	    }  
	      
	    //插入customer
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
	      
	    
	    public static void filmInsetTest(){
	    	Film film1 = new Film();
	    	
	    	System.out.println("下面执行增强处理：");
	    	System.out.println("请输入title： ");
	    	Scanner ser = new Scanner(System.in);
	    	String s= ser.nextLine();
	    	film1.setTitle(s);
	    	
	    	System.out.println("请输入language_id： ");
	    	Scanner ser1 = new Scanner(System.in);
	    	String s1= ser.nextLine();
	    	int i = Integer.parseInt(s1);
	    	film1.setLanguage_id(i);
	    	film.film_save(film1);
	    	System.out.println("插入成功！！！！");
	    	
	    }
	    
	    //删除
	    public static void testDelete(){  
	    		System.out.println("请输入要删除的 Customer 的 ID:");
	            Scanner  sc = new Scanner(System.in);
	            String s = sc.nextLine();
	            int i = Integer.parseInt(s);
	            customer.customer_delete(i);  
	            System.out.println("删除成功！");
	    }  
      
	      
	   //查询全部
	    public static void testQueryAll(){  
	        List<Customer> customer1 = customer.customer_queryAll();  
	        if(customer1 != null){  
	            for(int i = 0; i < customer1.size(); i++){  
	                System.out.println(customer1.get(i));  
	            }  
	        }  
	    }  
}
