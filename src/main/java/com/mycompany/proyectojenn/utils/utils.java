package com.mycompany.proyectojenn.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author AMARIS
 */
public class utils {

    File fileUsers = new File("ficheroUsuarios.txt");

    public Boolean compareUser(String user, String pass) throws FileNotFoundException, IOException {
        FileReader freader = new FileReader(fileUsers);
        BufferedReader br = new BufferedReader(freader);
        String fileTotal = br.readLine();
        while (fileTotal != null) {
            String textTxt[] = fileTotal.split(",");
            if (textTxt[0].equals(user) && textTxt[1].equals(pass)) return true;
            fileTotal = br.readLine();
        }
        br.close();
        return false;
    }
}
