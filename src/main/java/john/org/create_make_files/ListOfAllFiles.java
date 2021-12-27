/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package john.org.create_make_files;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author john
 */
class ListOfAllFiles {

    public ListOfAllFiles() {

        System.out.println("This will be a list of all the files");
        // TODO Need a list of files in the Working Directory
        Set s = listFilesUsingJavaIO(".");
        System.out.println(s);
        System.out.println();

    }

    public Set<String> listFilesUsingJavaIO(String dir) {
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toSet());
    }

}
