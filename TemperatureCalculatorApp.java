
package temperaturecalculatorapp;
import java.util.Scanner;
/**
 *
 * @author raushan kumar
 */
public class TemperatureCalculatorApp {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please Choose the Temperature unit");
        System.out.println("1.Celsius");
        System.out.println("2.Farenheit");
        System.out.println("3.Kelvin");
        System.out.print("Enter your Choice (1/2/3)------");
        int choose = scan.nextInt();
        if(choose==1){
            //celsius to farenheit and kelvin 
            System.out.print("Please Enter the Value in Celsius:");
            double d = scan.nextDouble();
            System.out.print("Temperature in Farenheit:");
            double faren = Math.round(((d*1.8)+32)*10.0 )/10.0;
            System.out.print(faren);
            System.out.println();
            System.out.print("Temperature in Kelvin:");
            double kelvin = Math.round((d+273.15)*10.0)/10.0;
            System.out.print(kelvin);
            System.out.println();
        }       
        else if(choose==2){
            //farenheit to celsius and kelvin
            System.out.print("Please Enter the Value in Farenheit:");
            double df = scan.nextDouble();
            System.out.print("Temperature in celsius:");
            double cel = Math.round((df-32)*0.555)*10.0/10.0;
            System.out.print(cel);
            System.out.println();
            System.out.print("Temperature in Kelvin:");
            double kelv = Math.round((df-32)*0.56+273.15)*10.0/10.0;
            System.out.print(kelv);
            System.out.println();
        }
        else if(choose==3){
            //kelvin to clesius and farenheit
            System.out.print("Please Enter the Value in kelvin:");
            double dk = scan.nextDouble();
            System.out.print("Temperature in celsius:");
            double cels = Math.round((dk-273.15)*10.0)/10.0;
            System.out.print(cels);
            System.out.println();
            System.out.print("Temperature in Farenheit:");
            double kelvi = Math.round((dk-273.15)*1.8+32)*10.0/10.0;
            System.out.print(kelvi);
            System.out.println();
        }
        else{
            System.out.println("invalid choice...");
        }
 
    }
    
}
