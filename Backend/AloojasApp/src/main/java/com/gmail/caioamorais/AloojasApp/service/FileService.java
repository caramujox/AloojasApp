package com.gmail.caioamorais.AloojasApp.service;


import com.gmail.caioamorais.AloojasApp.exceptions.EventoNotFoundException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

@Service
public class FileService {

    public File createFile() throws Exception{
        File myFile = new File("D:\\Projetos\\AloojasApp\\Backend\\AloojasApp\\src\\main\\java\\com\\gmail\\caioamorais\\AloojasApp\\FileName.xlsx");
        try {
            if (!myFile.createNewFile())                // pregs de fazer uma nova exception
                throw new FileAlreadyExistsException("FileAlreadyExists");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return myFile;
    }
}
