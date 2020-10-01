import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Admin{
    private String email;
    private String password;
    private String name;
    Admin(){}
    Admin(String email, String password, String name){
        this.email=email;
        this.password=password;
        this.name=name;
    }
    
    public String getEmail() {
         return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

class Toy{
    private int toyId;
    private String toyName;
    private String toyType;
    private int minAge;
    private int maxAge;
    private int price;
    private int quantity;
    private int rentalAmount;
    private int refundableDeposit;
    
    
    public Toy(int toyId, String toyName, String toyType, int minAge, 
    int maxAge, int price, int quantity, int rentalAmount, 
    int refundableDeposit){
        this.toyId=toyId;
        this.toyName=toyName;
        this.toyType=toyType;
        this.minAge=minAge;
        this.maxAge=maxAge;
        this.price=price;
        this.quantity=quantity;
        this.rentalAmount=rentalAmount;
        this.refundableDeposit=refundableDeposit;
    }
    
    public int getToyId() {
        return toyId;
    }
    public void setToyId(int toyId) {
        this.toyId = toyId;
    }
    public String getToyName() {
        return toyName;
    }
    public void setToyName(String toyName) {
        this.toyName = toyName;
    }
    public String getToyType() {
        return toyType;
    }
    public void setToyType(String toyType) {
        this.toyType = toyType;
    }
    public int getMinAge() {
        return minAge;
    }
    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
    public int getMaxAge() {
        return maxAge;
    }
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
    public int getRentalAmount() {
        return rentalAmount;
    }
    public void setRentalAmount(int rentalAmount) {
        this.rentalAmount = rentalAmount;
    }
    public int getRefundableDeposit() {
        return refundableDeposit;
    }
    public void setRefundableDeposit(int refundableDeposit) {
        this.refundableDeposit = refundableDeposit;
    }
    
} 
	

public class Source 
{
    public static void main( String[] args )
	{
	    
        Toy toy = new Toy();
	    Admin admin=new Admin();
	    Scanner in = new Scanner(System.in);
	    
	    String str1 = in.nextLine();
	    int i1=Integer.parseInt(str1);
	    toy.setToyId(i1);
	    
	    
	    String str2 = in.nextLine();
	    toy.setToyName(str2);
	    
	    
	    String str3 = in.nextLine();
	    toy.setToyType(str3);
	    
	    
	    String str4 = in.nextLine();
	    int i4=Integer.parseInt(str4);
	    toy.setMinAge(i4);
	    
	   
	    String str5 = in.nextLine();
	    int i5=Integer.parseInt(str4);
	    toy.setMaxAge(i5);
	    
	    
	    String str6 = in.nextLine();
	    int i6=Integer.parseInt(str6);  
	    toy.setPrice(i6);
	    
	    
	    String str7 = in.nextLine();
	    int i7=Integer.parseInt(str7);
	    toy.setQuantity(i7);
	    
	    
	    String str8 = in.nextLine();
	    int i8=Integer.parseInt(str8);  
	    toy.setRentalAmount(i8);
	    
	    
	    String str9 = in.nextLine();
	    int i9=Integer.parseInt(str9);  
	    toy.setRefundableDeposit(i9);

        System.out.println("ID: "+ toy.getToyId());
        System.out.println("ToyName: "+ toy.getToyName());
        System.out.println("ToyType: "+ toy.getToyType());
        System.out.println("Min Age: "+ toy.getMinAge());
        System.out.println("Max Age: "+ toy.getMaxAge());
        System.out.println("Price: "+ toy.getPrice());
        System.out.println("Quanitity: "+ toy.getQuantity());
        System.out.println("RefundableAmount: "+ toy.getRentalAmount());
        System.out.println("Refundable Deposit: "+ toy.getRefundableDeposit());
	    
	}
}