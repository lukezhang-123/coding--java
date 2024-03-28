package org.example;

import java.lang.management.ManagementFactory;

public class Main01 {
    public static void main(String[] args) {
        // java version
        // java -XshowSettings:all -version
        System.out.println(System.getProperty("java.version"));
        System.out.println(ManagementFactory.getRuntimeMXBean().getVmVersion());

    }
}
