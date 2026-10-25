/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;


import model.Renter;
import java.io.*;
import java.util.ArrayList; 
/**
 *
 * @author USER
 */
public class RenterStorage {
    
     private static final String FILE_NAME = "renters.dat";

    public static ArrayList<Renter> loadRenters() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream input =
                     new ObjectInputStream(new FileInputStream(file))) {

            return (ArrayList<Renter>) input.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Could not load renter records: "
                    + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void saveRenters(ArrayList<Renter> renters) {
        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream(FILE_NAME))) {

            output.writeObject(renters);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Could not save renter records: " + e.getMessage(), e);
        }
    }
    
}
