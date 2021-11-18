/**
*@author Christopher Perez
*@version 1.0.0
*/
import java.util.*;
import java.io.*;

public class Runner{
    Scanner in;
    Scanner txtFile;
    CustomMap prime_hashmap;
    HashSet temp;
    
    public Runner(int size, String fileName){
        in = new Scanner(System.in);
        try{
        txtFile = new Scanner(new FileReader(new File(fileName)));
        }catch(Exception e){
            System.out.println("File not found");
            System.exit(0);
        }

        prime_hashmap = new CustomMap();
        load();
        //printHashMap();
        play();


    }

    public void play(){
        String userIn = "";
        long holder = 0;
        while(true){
            System.out.println("Enter a key combination(q to quit): ");
            userIn = in.nextLine();

            if (userIn.toUpperCase().equals("Q"))
                break; 

            try{
                holder = Long.parseLong(userIn);
            }catch(Exception e){
                if (e instanceof NumberFormatException)
                    System.out.println("Invalid Input: Please Try Again");
                else 
                    System.out.println("An Unknown Error has Occurred");
                continue;
            }

            temp = prime_hashmap.getHashSetByKey(holder);
            if (temp == null)
                System.out.println("Not Sets found for the key combination");
            else
                printHashSet(temp);
            System.out.println();

        }
        this.endSession();
        System.out.println("Thanks for Playing.");

    }

        

    public void load(){
        //Iterate through the file for every word and add it throught the custom map
        String current = txtFile.next();
        while(txtFile.hasNext()){
            if (current.length() < 19){

            //System.out.println("Adding :" + current);
            prime_hashmap.insertWord(new Word(current));    
            
           
            }
             current = txtFile.next();
        }
    }
    

   
    public void endSession(){
        txtFile.close();
    }
    
    public void printHashSet(HashSet<String> in){
        for(String i : in)
            System.out.print(i + " ");
        System.out.println();
    }

    public void printHashMap(){
        System.out.print("HashMap: \n");    
        for (HashMap.Entry<Long, HashSet<String>> entry : prime_hashmap.getMap().entrySet()) {
            System.out.println(entry.getKey() + " : ");
            printHashSet(entry.getValue());
            System.out.println();

        }   
    }

    
}