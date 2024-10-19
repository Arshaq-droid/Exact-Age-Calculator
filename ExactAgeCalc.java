package mydemo;
import java.time.LocalDate;
import java.time.Period;
//
 //package ExactAgeCalc;
//
//
//public class ExactAgeCalc {
  //public static void main(String[] args) {
//    int currentyear , birthyear , currentmonth , birthmonth , currentdate , birthdate , ageyear, agemonth, agedate, x, ageifyear;
//    currentyear = 2024;
//    birthyear = 2005;
//    currentmonth = 10;
//    birthmonth = 8;
//    currentdate = 18;
//    birthdate = 2;
//    
//    x = 1;
//           
//    ageyear = currentyear-birthyear; agemonth = currentmonth-birthmonth; agedate = currentdate-birthdate; ageifyear = ageyear-x;
//
//    
//    if (birthmonth>currentmonth) {
//        System.out.println("Your exact age is " + ageifyear);
//    }
//        
//        else  {
//        System.out.println("Your exact age is " + ageyear + " Years " + agemonth + " Months " + agedate + " Days" );
//
//        }
//    
//    
//   }
//
//
//}

      
public class ExactAgeCalc {
    public static void main(String[] args){
        LocalDate today =  LocalDate.now();
        LocalDate birthDate = LocalDate.of(2011, 3, 21);
        int years, Months, Days;
                years = Period.between(birthDate, today).getYears();
                Months = Period.between(birthDate, today).getMonths();
                                Days = Period.between(birthDate, today).getDays();
    

                System.out.println("Your exact age is " + years + " Years " + Months + " Months " + Days + " Days");

        
                
    }
}
