// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2020T3, Assignment 1
 * Name: Irshad Ul Ala
 * Username:ulalairsh
 * ID:300397080
 */

import ecs100.*;

/** Program for calculating cost of shipping a package */

public class ShippingCalculator{

    public static final double HANDLING = 1.60;    // cost of handling a shipment
    public static final double SIZE_RATE = 300;           // cost per cubic meter
    public static final double WEIGHT_RATE = 1.50;        // cost per kg

    /**
     * Calculates and prints cost of shipping a package.
     */
    public void calculateShippingCore(){
        double length = UI.askDouble("Length of package (cm):")/100.00;
        double width = UI.askDouble("Width of package (cm):")/100.00;
        double height = UI.askDouble("Height of package (cm):")/100.00;
        double weight = UI.askDouble("Weight of package(kg):");
        int zones = UI.askInt("Number of zones (minimum of 1):");
        double volumechargeperzone = length*height*width*SIZE_RATE;
        double weightchargeperzone = WEIGHT_RATE * weight;
        double total = (volumechargeperzone + weightchargeperzone)*zones + HANDLING;
        UI.printf("Weight charge per zone: $%.2f \n", weightchargeperzone);
        UI.printf("Volume charge per zone: $%.2f \n", volumechargeperzone);
        UI.printf("Number of zones: %d \n\n", zones);
        UI.printf("Total Charge: $%.2f \n", total);
    }
         

    /**
     * Calculates and prints cost of shipping a collection of packages.
     */
    public void calculateShippingCompletion(){
        UI.println("Shipping Calculator Completion");
        int zones = UI.askInt("Number of zones (minimum of 1):");
        int grp1 = UI.askInt("Number of packages of first size:");
        double length1 = UI.askDouble("Length of package (cm):")/100.00;
        double width1 = UI.askDouble("Width of package (cm):")/100.00;
        double height1 = UI.askDouble("Height of package (cm):")/100.00;
        double weight1 = UI.askDouble("Weight of package(kg):");        
        int grp2 = UI.askInt("Number of packages of second size:");
        double length2 = UI.askDouble("Length of package (cm):")/100.00;
        double width2 = UI.askDouble("Width of package (cm):")/100.00;
        double height2 = UI.askDouble("Height of package (cm):")/100.00;
        double weight2 = UI.askDouble("Weight of package(kg):");
        double volumechargeperzone1 = grp1*length1*height1*width1*SIZE_RATE;
        double weightchargeperzone1 = grp1*WEIGHT_RATE * weight1;
        double total1 = (volumechargeperzone1 + weightchargeperzone1)*zones ;
        double volumechargeperzone2 = grp2*length2*height2*width2*SIZE_RATE;
        double weightchargeperzone2 = grp2*WEIGHT_RATE * weight2;
        double total2 = (volumechargeperzone2 + weightchargeperzone2)*zones;
        double discount = 1.0/3.0*(1.0-1.0/(grp1+grp2));
        UI.println(discount);
        double TOTAL = total1+total2+HANDLING;
        double damount = discount*TOTAL;
        double result = TOTAL-damount;
        
        UI.println(total1+total2);
        UI.println(TOTAL);
        
        UI.println(damount);
        UI.printf("zones:%d \n", zones);
        UI.printf("Group 1 size charge per zone:%.2f\n", volumechargeperzone1);
        UI.printf("Group 1 weight charge per zone:%.2f\n", weightchargeperzone1);
        UI.printf("Group 2 size charge per zone:%.2f\n", volumechargeperzone2);        
        UI.printf("Group 2 weight charge per zone:%.2f\n", weightchargeperzone2);
        UI.printf("Total before discount:%.2f \n", TOTAL);
        UI.printf("Discount for %d items:%.2f \n",(grp1+grp2), damount);
        UI.printf("Total after discount:%.2f \n",result);       
    }

    public void setupGUI(){
        UI.initialise();
        UI.addButton("Core", this::calculateShippingCore ); 
        UI.addButton("Completion", this::calculateShippingCompletion );
        UI.addButton("Quit", UI::quit);
        UI.setDivider(1);    // Expand the Text pane
    }   


}
