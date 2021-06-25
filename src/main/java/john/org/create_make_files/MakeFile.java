/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package john.org.create_make_files;

/**
 *
 * @author john
 */
public class MakeFile {

    private String name;
    private String command;
    private String current_working_dir;

    public MakeFile() {
        System.out.println("This is makefile ");
        this.name = "makefile";
        this.command = "asciidoc ";
        this.current_working_dir = "/home/john/aaa/junk";
        
        

    }
}
