import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class AverageValue {


    public List<Double> values(Integer field, String fileName) {
        String line;

        List<Double> additionList = new LinkedList<>();

        if(fileName ==null) 
            return additionList;
        
        if(field== null) 
            return additionList;
        

        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
            while((line = br.readLine()) != null) { 
                String[] partsOfLine = line.split(",");
                int lineSize = partsOfLine.length;

                if(field > lineSize - 1) {
                    continue;
                }
                if(partsOfLine[field] == null || partsOfLine[field].equals("")) {
                    continue;
                }

                try {
                    additionList.add(Double.parseDouble(partsOfLine[field]));
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        catch (IOException e) {
            return additionList;
        }
        return additionList;
    }


    public Double fieldAverage(List<Double> additionList) {

        double sum = 0;

        if(additionList.isEmpty()) {
            return null;
        }

        for (int i = 0; i < additionList.size(); i++) {
            sum = sum + additionList.get(i);
        }

        double average = sum / additionList.size();

        return average;
    }

    public static void main (String[] args) {
        AverageValue numbers = new AverageValue();
        List<Double> additionList = new LinkedList<>();

        if(args.length != 2) {
            System.out.println("Invalid Data.");
        } else {
            try {
                if (Integer.parseInt(args[0]) < 0) {
                    System.out.println("Invalid Data.");
                    return;
                }
                additionList = numbers.values(Integer.parseInt(args[0]), args[1]);
                Double average = numbers.fieldAverage(additionList);

                if (average != null) {
                    System.out.println("The average is " + average + ".");
                } else {
                    System.out.println("Invalid Data.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Data.");
            }
            catch (Exception e) {
            	e.printStackTrace();
            }
        }
    }
}