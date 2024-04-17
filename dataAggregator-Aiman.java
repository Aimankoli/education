

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class dataAggregator {
    private ArrayList<SchoolDemographics> schools;
    private ArrayList<DistrictDemographics> districts;

    public dataAggregator(){
        ArrayList<SchoolDemographics> schools = new ArrayList<>();
        ArrayList<DistrictDemographics> districts = new ArrayList<>();

    }

    


    public void printList(ArrayList<SchoolDemographics> schools){
        for (int i = 0; i<schools.size(); i++){
            System.out.println("School: " + schools.get(i).getSchool());
            
            System.out.println("Students: " + schools.get(i).getStudents());

            System.out.println("Blacks: " + schools.get(i).getBlacks());

            System.out.println("Hispanics: " + schools.get(i).getHispanics());

            System.out.println("ELLs: " + schools.get(i).getELLs());

            System.out.println("Students with reduced lunch fees: " + schools.get(i).getLunchfees());

            System.out.println("Non White studentds percentage: " + schools.get(i).getDisadvantaged());
            System.out.println();

        }
    }
    public void readFileSchool(String filename){

    }
    public void readFileDistricts(String filename){
        filename = "NYCDistricts.csv";
        StdIn.setFile(filename);
        StdIn.readLine();
        
        while (StdIn.hasNextLine()){
            String line[] = StdIn.readLine().split(",");
            int district = Integer.parseInt(line[0]);
            double students = Double.parseDouble(line[4]);
            double blacks = Double.parseDouble(line[15]);
            double hispanics = Double.parseDouble(line[17]);

            String line2[] = StdIn.readLine().split(".");

            double ELLs = Double.parseDouble(line2[4]);

            StdIn.readLine();

            String line3[] = StdIn.readLine().split(".");

            double lunchfees = Double.parseDouble(line3[4]);

            StdIn.readLine();
            
            StdIn.readLine();

            double disadvantaged = (blacks + hispanics)/students;



            DistrictDemographics newDistrict = new DistrictDemographics(district, students, blacks, hispanics, ELLs, lunchfees, disadvantaged);
            districts.add(newDistrict);

        }
        

    }
    public ArrayList<DistrictDemographics> mostDisadvantagedDistricts(int count){

        Collections.sort(districts, Comparator.comparingDouble(DistrictDemographics::getDisadvantaged).reversed());
        ArrayList<DistrictDemographics> topDistricts = new ArrayList<>(districts.subList(0, Math.min(districts.size(), count)));
        return topDistricts;

    }
    
}
