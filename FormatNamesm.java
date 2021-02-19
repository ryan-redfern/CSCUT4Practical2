import java.io.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.text.ParseException;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FormatNamesm {

    public static void main(String[] args) throws ParseException, IOException { 
       String output; 
       String input;
       Boolean upper = false;
       if (!args[0].equals("-u")){
           
            input = args[0];
            output = args[1];  
       }
       else{
       upper = true;
       input = args[1];
       output = args[2];
       
       }
       
       
       File fileOutput = new File(output);
       fileOutput.delete();
       try {
            if (fileOutput.createNewFile()) {
                System.out.println("File created: " + fileOutput.getName());
             } else {
                System.out.println("File already exists.");
                }
           } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
           }
        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            while (reader.ready()) {
                String inputString = reader.readLine();
                String[] words = inputString.split(" ");
                String text2;
                
                String date = words[words.length - 1];
                String formattedDate = date.substring(0,2) + "/" + date.substring(2, 4) + "/" + date.substring(4, date.length());
                text2 = inputString.replace(date, formattedDate);
                if (words.length == 4){
                    String a = words[words.length - 3];
                    a = a.toUpperCase();
                    String finish = a + ".";
                    text2 = inputString.replace(words[words.length - 3], finish);
                    
                    
                            
                    
                }
                if (upper = true){
                    text2 = text2.toUpperCase();  
                }
                try {
                    FileWriter fw = new FileWriter(output, true);
                    BufferedWriter myWriter = new BufferedWriter(fw);
                    myWriter.write(text2);
                    myWriter.newLine();
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                    }      
            }
        }
            
            }
        
        }  
            
        
        
         
            
        
    
        
    

    
        
    

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

       

     // main

 // FilesInOut
