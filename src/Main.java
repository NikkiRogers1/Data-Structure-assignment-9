import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Company> companyQueue = new PriorityQueue<>();
        companyQueue.add(new Company("Arasaka", 465000));
        companyQueue.add(new Company("Militech", 2200));
        companyQueue.add(new Company("NetWatch", 1500));
        companyQueue.add(new Company("InnovateX", 2000));
        companyQueue.add(new Company("Trauma Team International", 1800));
        companyQueue.add(new Company("Night Corp", 450000));
        companyQueue.add(new Company("Zetatech", 1200));
        companyQueue.add(new Company("Kang tao", 4000));

        Company smallest = companyQueue.poll();
        System.out.println("Smallest company: " + smallest);
        companyQueue.add(smallest);
        System.out.println("Queue size: " + companyQueue.size());

       
        int mergerCount = 0;
        Company titan = null;

        while(companyQueue.size() >= 2 && titan == null) { 
        
      

        //Removing the 2 smallest companies
        Company firstSmallest = companyQueue.poll();
        Company secondSmallest = companyQueue.poll();
    
        int sizeA = firstSmallest.getSize();
        int sizeB = secondSmallest.getSize();

        int totalSize = sizeA + sizeB;

        int newSize = (int) (totalSize * 1.1);

        String newName = firstSmallest.getName() + "-" + secondSmallest.getName();

        Company mergedCompany = new Company(newName, newSize);
        companyQueue.add(mergedCompany);

        System.out.println("MERGER: " + firstSmallest.getName() + " and " + secondSmallest.getName() + " have merged into " + mergedCompany.getName()  + " with size " + mergedCompany.getSize() + "!");
        mergerCount = mergerCount + 1;

        if(mergedCompany.getSize() >= 500000){
            titan = mergedCompany;

        }
        }

        if(titan == null) {
            System.out.println("No titan has emerged.");

        }
        else{
            System.out.println("Titan : " + titan);
        }
   System.out.println("Total mergerCount : " + mergerCount);

   
    }
}