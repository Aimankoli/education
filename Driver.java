// import java.util.ArrayList;

// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// public class Driver {

//     private static dataAggregator data;
//     public static void main(String[] args) {
//         System.out.println("This program analyzes School Data in NYC from 2017-2018");
        
//         String[] options = 
//         {"See top disadvantaged Schools", 
//         "See top disadvantaged districts",
//         "See schools with highest percentage of a race",
//         "See schools with most ELLs",
//         "See schools with highest percentage of students having free/reduced lunch price"
//         };
//         for (int i = 1; i<options.length+1; i++){
//             System.out.print(i+". " + options[i]+": ");
//         }
//         int choice=0;
//         try {
//             choice = StdIn.readInt();
            
//         } catch (NumberFormatException e) {
//             //handle exception
//             System.out.println("Eter a number from 1-5");
//         }
        

//         while (choice>5 || choice<1){
//             System.out.println("Enter one of the options");
//             choice = StdIn.readInt();
//         }

//         // System.out.println(choice); 
//         //debugging
//         data = new dataAggregator();
//         ArrayList<DistrictDemographics> districts = new ArrayList<>();
//         readFileDistricts(districts);

//         switch (choice){
//             case 1: 
//                 System.out.println("tbd");
//                 int numschools = 0;
//                 try {
//                     numschools = StdIn.readInt();
                    
//                 } catch (NumberFormatException e) {
//                     //handle exception
//                     System.out.println("Enter a valid number");
//                 }
//                 // ArrayList<SchoolDemographics> topschools = mostDisadvantagedSchools(numschools);
//             case 2: 
                
                

//             case 3:
//                 System.out.println("tbd");



//             case 4:
//                 System.out.println("tbd");


//             case 5:
//                 System.out.println("tbd");




//         }

//         private static void drivDistrictFile(String filename) {
//             StdIn.setFile(filename);
//             dataAggregator.readFileDistricts(filename);
//             StdIn.resetFile();


//         }

//         private static void drivDisadvDistricts(int count){
//             ArrayList<DistrictDemographics> topDistricts = dataAggregator.mostDisadvantagedDistricts(5);
//         }

//         private static void drivPrint(ArrayList<SchoolDemographics> schools){
//             dataAggregator.printList(ArrayList<SchoolDemographics> schools);
//         }
// }
