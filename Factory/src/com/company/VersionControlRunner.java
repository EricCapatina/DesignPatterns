package com.company;

public class VersionControlRunner {
    
    public static void main(String[] args) {
        Prototype master = new Prototype(1, "Project1", "Source sourcecode = new Source();\n");
        System.out.println(master);

        // 1 example:

        Prototype masterClone = (Prototype) master.copy();
        System.out.println(masterClone);

        // 2 example:

        Factory factory = new Factory(master);
        Prototype masterClone2 = factory.cloneprototype();

        System.out.println(masterClone2);
    }
}
