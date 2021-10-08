

import javax.swing.JOptionPane;

public class TestComputer {
    public static void main(String[] args)
        {
           String output = "";

           Computer c1 = new Computer();

           output += "Calling the no-argument constructor. " +
                  "The first Computer object details are: \n\n" +
                   "Manufacturer: " + c1.getManufacturer() + " Type: " + c1.getType + " Speed: " +
                   c1.getSpeed + " RAM: " + c1.getRAM + " Price: " + c1.gerice;

           Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);
           c2.speed = -2.75;

           output += "\n\nCalling the multi-argument Computer constructor. " +
                   "The second Computer details are: \n\n" + c2.toStrin();

           JoPtionPane.showMessageDialog(null,output,"Computer Object Data",JOptionPane.INFORMATION_MESSAGE);

           System.exit(0);
        }


}