package com.sda.chain;

import java.util.Arrays;
import java.util.Scanner;

public class ChainApplication {

    public static void main(String[] args) {

        EmergencyCenter emergencyCenter = new EmergencyCenter(Arrays.asList(
                new AmbulanceChainItem(),
                new PoliceChainItem(),
                new FirefightersChainItem()
        ));

        System.out.println("Request service");
        System.out.println("police, fireFighters, ambulance");
        String input = new Scanner(System.in).nextLine();

        emergencyCenter.handleRequest(input);
    }
}
