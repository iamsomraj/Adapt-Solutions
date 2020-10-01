import java.util.*;
interface AdminService{
}
class AdminServiceImpl implements AdminService{
}
class Toy{
    private int toyId;
    private String toyName;
    private String toyType;
    private int minAge;
    private int maxAge;
    private double price;
    private int quantity;
    private double rentalAmount;
    private double refundableDeposit;
    Toy(int toyId,String toyName,String toyType,int minAge,int maxAge,double price,int quantity,double rentalAmount,double refundableDeposit){
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
    public int getToyId(){
        return toyId;
    }
    public void setToyId(int toyId){
        this.toyId=toyId;
    }
    public String getToyName(){
        return toyName;
    }
    public String getToyType(){
        return toyType;
    }
    public int getMinAge(){
        return minAge;
    }
    public int getMaxAge(){
        return maxAge;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getRentalAmount(){
        return rentalAmount;
    }
    public double getRefundableDeposit(){
        return refundableDeposit;
    }
    public void setToyName(String toyName){
        this.toyName=toyName;
    }
    public void setToyType(String toyType){
        this.toyType=toyType;

    }
    public void setMinAge(int minAge){
        this.minAge=minAge;

    }
    public void setMaxAge(int maxAge){
        this.maxAge=maxAge;

    }
    public void setPrice(double price){
        this.price=price;

    }
    public void setQuantity(int quantity){
        this.quantity=quantity;

    }
    public void setRentalAmount(double rentalAmount){
        this.rentalAmount=rentalAmount;

    }
    public void setRefundableDeposit(double refundableDeposit){
        this.refundableDeposit=refundableDeposit;
    }
}
class ElectronicToy extends Toy{
    public int numberOfBatteries;
    public String operatingMode;
    ElectronicToy(int toyId,String toyName,String toyType,int minAge,int maxAge,double price,int quantity,double rentalAmount,double refundableDeposit,int numberOfBatteries,String operatingMode){
        super(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit);
        this.numberOfBatteries=numberOfBatteries;
        this.operatingMode=operatingMode;
    }
    public String toString(){
        return "ToyName: "+super.getToyName()+
        "\nType: "+super.getToyType()+
        "\nMode: "+operatingMode+
        "\nBatteries: "+numberOfBatteries;
    }
}
class MusicalToy extends Toy{
    public int noOfSpeakers;
    MusicalToy(int toyId,String toyName,String toyType,int minAge,int maxAge,double price,int quantity,double rentalAmount,double refundableDeposit,int noOfSpeakers){
        super(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit);
        this.noOfSpeakers=noOfSpeakers;
    }
    public String toString(){
        return "ToyName: "+super.getToyName()+
        "\nType: Musical "+super.getToyType()+"\nSpeaker: "+noOfSpeakers;
    }
}
public class Source 
{
    String[][] toys=new String[5][5];
	Source()
	{
	toys[0][0]="1";
	toys[0][1]="Stickle Bricks";
	
	toys[1][0]="2";
	toys[1][1]="Robot Dog";
	
	toys[2][0]="3";
	toys[2][1]="Magic 8 Ball";
	
	toys[3][0]="4";
	toys[3][1]="Juggling Clubs";
	
	toys[4][0]="5";
	toys[4][1]="Chutes and Ladders";
	}
	
    public static void main( String[] args )
	{
	    AdminService adminService=new AdminServiceImpl();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n==1){
            String toyName=sc.nextLine();
            String toyType=sc.nextLine();
            sc.next();
            int minAge=sc.nextInt();
            int maxAge=sc.nextInt();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            double rentalAmount=sc.nextDouble();
            double refundableDeposit=sc.nextDouble();
            int numberOfBatteries=sc.nextInt();
            String operatingMode=sc.next();
	        ElectronicToy e=new ElectronicToy(1,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit,numberOfBatteries,operatingMode);
	        System.out.println(e.toString());
	    }
        else if(n==2){
	        String toyName=sc.next();
	        String toyType=sc.nextLine();
            int minAge=sc.nextInt();
            int maxAge=sc.nextInt();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            double rentalAmount=sc.nextDouble();
            double refundableDeposit=sc.nextDouble();
            int noOfSpeakers=sc.nextInt();
	        MusicalToy m=new MusicalToy(1,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit,noOfSpeakers);
	        System.out.println(m.toString());
	    }
	}
}