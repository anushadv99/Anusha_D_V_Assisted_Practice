package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serial_DeSerial {

	public static void main(String[] args) throws IOException 
	{
		employee obj = new employee(101, 25, "Chaitanya", "cse", 8296, "chay@gmail.com");
		employee obj2 = new employee(102, 26, "Anusha", "Ise", 829696, "anu@gmail.com");
	    
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C:\\Users\\anush\\OneDrive\\Documents\\MPH Training Activities\\employee.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      oos.writeObject(obj2);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
	    employee o=null;
	    employee o2=null;
	     try{
	       FileInputStream fis = new FileInputStream("C:\\Users\\anush\\OneDrive\\Documents\\MPH Training Activities\\employee.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	       o = (employee)ois.readObject();
	       o2=(employee)ois.readObject();
	       ois.close();
	       fis.close();
	     }
	     catch(IOException ioe)
	     {
	        ioe.printStackTrace();
	        return;
	     }catch(ClassNotFoundException cnfe)
	      {
	        System.out.println("employee Class is not found.");
	        cnfe.printStackTrace();
	        return;
	      }
	     System.out.println("employee Name:"+o.getempName());
	     System.out.println("employee Age:"+o.getempAge());
	     System.out.println("employee id No:"+o.getempid());
	     System.out.println("employee Deptname:"+o.getempDeptname());
	     System.out.println("employee contact:"+o.getempcontact());
	     System.out.println("employee email:"+o.getempemail());
	     System.out.println("employee Name:"+o2.getempName());
	     System.out.println("employee Age:"+o2.getempAge());
	     System.out.println("employee id No:"+o2.getempid());
	     System.out.println("employee Deptname:"+o2.getempDeptname());
	     System.out.println("employee contact:"+o2.getempcontact());
	     System.out.println("employee email:"+o2.getempemail());
	  }
	}

	//------------------------------Student-------------------------//
	class employee implements java.io.Serializable{
		  
		  private int empid;
		  private int empAge;
		  private String empName;
		  private String empDeptname;  
		  private int empcontact; 
		  private String empemail;
		  
		  public employee(int id, int age, String name,String Deptname, int contact, String email) {
		    this.empid = id;
		    this.empAge = age;
		    this.empName = name;
		    this.empDeptname = Deptname;
		    this.empcontact = contact;
		    this.empemail = email;
		  }
		  
		public int getempid() {
		    return empid;
		  }
		  public void setempid(int empid) {
		    this.empid = empid;
		  }
		  public int getempAge() {
		    return empAge;
		  }
		  public void setempAge(int empAge) {
		    this.empAge = empAge;
		  }
		  public String getempName() {
		    return empName;
		  }
		  public void setempName(String empName) {
		    this.empName = empName;
		  }
		  public String getempDeptname() {
		    return empDeptname;
		  }
		  public void setempDeptname(String empDeptname) {
		    this.empDeptname = empDeptname;
		  }
		  public int getempcontact() {
		    return empcontact;
		  }
		  public void setempcontact(int stuHeight) {
		    this.empcontact = empcontact;
		  }
		  public String getempemail() {
			    return empemail;
			  }
			  public void setempemail(String empemail) {
			    this.empemail = empemail;
			  }
		  
		}
