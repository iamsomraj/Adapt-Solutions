import java.util.Scanner;

interface CustomerService
{
  void rent(int toyId);
  void display();
}

class Toy{
    int toyId;
    String toyName;
    String toyType;
    int minAge;
    int maxAge;
    double price;
    int rentalAmt;
    int refundableDeposit;
    int quantity;
    public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, double price, int refundableDeposit,int quantity, int rentalAmt){
        this.toyId=toyId;
        this.toyName=toyName;
        this.toyType=toyType;
        this.minAge=minAge;
        this.maxAge=maxAge;
        this.price=price;
        this.rentalAmt=rentalAmt;
        this.refundableDeposit=refundableDeposit;
        this.quantity=quantity;
    }
    public int getToyId(){
        return toyId;
    }
    public String getToyName(){
        return toyName;
    }
    public String getToyType(){
        return toyType;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getRentalAmount(){
        return rentalAmt;
    }
}
class CustomerServiceImpl implements CustomerService{
    public static Toy availableToys[]=new Toy[4];
    public Toy customerToysRentalInfo[]=new Toy[2];
    
    CustomerServiceImpl(){
        availableToys[0]=new Toy(120,"Rubber Ducky","Toy",1,3,200,20,200,20);
        availableToys[1]=new Toy(130,"Car","Toy",1,5,100,30,20,100);
        availableToys[2]=new Toy(150,"Kite","Toy",3,8,100,50,20,100);
        availableToys[3]=new Toy(180,"Airplane","Toy",4,7,500,30,50,20);
    }
    public void rent(int toyId){
        for(int i=0;i<4;i++){
            if(availableToys[i].getToyId()==toyId){
                System.out.println("Toy Name: "+availableToys[i].getToyName());
                System.out.println("Toy Type: "+availableToys[i].getToyType());
                System.out.println("Quantity: "+availableToys[i].getQuantity());
                System.out.print("RentalAmount: "+availableToys[i].getRentalAmount());
                break;
            }
        }
    }
    public void display(){
        //   something 
    }
}
public class Source {
    public static void main( String[] args )
	{
	    Scanner sc=new Scanner(System.in);
	    int toyId=sc.nextInt();
	    CustomerService cs=new CustomerServiceImpl();
	    cs.rent(toyId);
	}
}