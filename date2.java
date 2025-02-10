import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class date2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws ParseException {
    Scanner in = new Scanner(System.in);
    Date date22 = new  Date();
   
   
  
   



   
   
    
    
    System.out.println(date22);
    //System.out.printf("%1$s %2$td %2$tB %2$tY","Дата",date22);

    //System.out.println(date22);
                 
        ArrayList<String> People = new ArrayList<>();
        ArrayList<String> dates = new ArrayList<>();
        

    
    

        try {
            BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));
            String line = reader.readLine();
            People.add((line));
            while (line != null) {
            People.add(line);
            line = reader.readLine();
            }
            reader.close();
            } catch (IOException e) {
            e.printStackTrace();
            }
            People.remove(0);
    
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader("demo2.txt"));
            String line = reader.readLine();
            dates.add((line));
            while (line != null) {
            dates.add(line);
            line = reader.readLine();
            }
            reader.close();
            } catch (IOException e) {
            e.printStackTrace();
            }
            dates.remove(0);
    for (int i = 0; i < People.size(); i++) {
        Date h = new Date(dates.get(i));
        System.out.println(h);
         if (date22.getMonth() == h.getMonth()){
            if (date22.getDay() == h.getDay()){
         
            System.out.println("День рождение сегодня");      
            System.out.println(People.get(i)+" "+dates.get(i));   
        }
        
    }
    else{
        System.out.println("Нет дней рождений сегодня");
                   
}
    
}
for (int i = 0; i < People.size(); i++) {
Date h = new Date(dates.get(i));
    if (date22.getMonth() <= h.getMonth()){
        if (date22.getDay() <= h.getDay()){
            System.out.println("Грядущие Дни рождение");    
            System.out.println(People.get(i)+" "+dates.get(i)); 
    }
    
}
else{
    System.out.println("Нет грядущих дней рождений");
    
}
}        
          



        
        System.out.printf("%-1s %-2s\n","1 -","Delete the list");
        System.out.printf("%-1s %-2s\n","2 -","Add the List");
        System.out.printf("%-1s %-2s\n","3 -","Red the list");
                                
                                          
                                                                    
                                                            
        System.out.print("Input a number: ");
        int num = in.nextInt();
                                                           
        switch (num){
        case 1:
        System.out.println("Введите номер из всего списка который необходимо удалить");
        int u = in.nextInt();
        People.remove(u-1);
        dates.remove(u-1);
//Метод вывыода всего списка
        for (int i2 = 0; i2 < People.size(); i2++) {   
        System.out.println(People.get(i2)+" "+dates.get(i2));
        }
        System.out.println(People+" "+dates);
//
        try {
            Files.write(Paths.get("demo.txt"), People, StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get("demo2.txt"), dates, StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
                                                            
        break;
        case 2:
        System.out.println("Введите имя ");
        String d = in.next();
        People.add(d);
        System.out.println("Введите дату дня рожденя по шаблону (MMM-dd-yyyy)");
        String h1 = in.next();
        String h2 = in.next();
        String h3 = in.next();
        dates.add(h1+" "+h2+" "+h3);
        
        
        try {
            Files.write(Paths.get("demo.txt"), People, StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get("demo2.txt"), dates, StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                                               
        break;                                
        case 3:
        System.out.println("Введите номер списка который необходимо редоктировать");
        int v = in.nextInt();
        System.out.println("Введите имя");
        String g = in.next();
        People.set(v-1,g);
        System.out.println("Введите дату дня рожденя по шаблону (MMM-dd-yyyy)");
        String gh = in.next();
        dates.set(v-1, gh);
        
        try {
            Files.write(Paths.get("demo.txt"), People, StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get("demo2.txt"), dates, StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        break;
        default:
        System.out.println("error");

       // System.out.println("Чтобы продоллжить введите 0, что-бы выключить програму введите 1");
        //s = in.nextInt();



        


       

       
        
        
        
            
            
        
    }}}