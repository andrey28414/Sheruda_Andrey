package Tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create_file {
    public void create() throws IOException {
        File myDummy = new File("blank.txt");
        FileWriter myblank = new FileWriter("blank.txt");
        myblank.write("****");
        myblank.close();}}