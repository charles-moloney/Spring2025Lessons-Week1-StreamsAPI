package starter;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import resources.Car;
import resources.Make;
import resources.Model;

public class CarDealershipLab {
    
    public static List<Car> createDealership() {
        return new ArrayList<>(Arrays.asList(
                new Car(Make.JAGUAR, Model.F_TYPE, 2008, 7484, 84196, true, Color.DARK_GRAY),
                new Car(Make.JAGUAR, Model.F_TYPE, 2018, 37657, 65302, true, Color.WHITE),
                new Car(Make.MERCEDES, Model.A_CLASS, 2016, 16521, 478, false, Color.DARK_GRAY),
                new Car(Make.KIA, Model.SOUL, 2014, 10071, 472, false, Color.BLACK),
                new Car(Make.BMW, Model.X4, 2010, 7376, 92842, true, Color.CYAN),
                new Car(Make.HONDA, Model.CIVIC, 2002, 1050, 119595, true, Color.YELLOW),
                new Car(Make.NISSAN, Model.ALTIMA, 2014, 5402, 160568, true, Color.ORANGE),
                new Car(Make.JAGUAR, Model.F_TYPE, 2020, 66577, 20267, true, Color.YELLOW),
                new Car(Make.MERCEDES, Model.E_CLASS, 2020, 27000, 112, false, Color.CYAN),
                new Car(Make.NISSAN, Model.ALTIMA, 2007, 2239, 46476, true, Color.PINK),
                new Car(Make.HONDA, Model.CIVIC, 2011, 3233, 113132, true, Color.GREEN),
                new Car(Make.JAGUAR, Model.F_TYPE, 2017, 34209, 42087, true, Color.ORANGE),
                new Car(Make.NISSAN, Model.ALTIMA, 2021, 25236, 10626, true, Color.CYAN),
                new Car(Make.TOYOTA, Model.COROLLA, 2001, 1000, 102694, true, Color.WHITE),
                new Car(Make.MERCEDES, Model.E_CLASS, 2010, 8258, 75738, true, Color.ORANGE),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2008, 4201, 56603, true, Color.MAGENTA),
                new Car(Make.NISSAN, Model.ROGUE, 2018, 13533, 62350, true, Color.RED),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2001, 2000, 48743, true, Color.RED),
                new Car(Make.KIA, Model.SOUL, 2012, 3483, 120039, true, Color.PINK),
                new Car(Make.NISSAN, Model.ALTIMA, 2021, 21365, 23616, true, Color.MAGENTA),
                new Car(Make.NISSAN, Model.ROGUE, 2003, 1250, 96939, true, Color.PINK),
                new Car(Make.TOYOTA, Model.RAV4, 2016, 11397, 33416, true, Color.WHITE),
                new Car(Make.NISSAN, Model.ALTIMA, 2004, 1312, 118019, true, Color.MAGENTA),
                new Car(Make.TOYOTA, Model.RAV4, 2015, 11015, 552, false, Color.YELLOW),
                new Car(Make.NISSAN, Model.ALTIMA, 2001, 1200, 83143, true, Color.WHITE),
                new Car(Make.JAGUAR, Model.F_TYPE, 2002, 3750, 159645, true, Color.RED),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2008, 3962, 158326, true, Color.ORANGE),
                new Car(Make.MERCEDES, Model.E_CLASS, 2006, 3916, 101714, true, Color.LIGHT_GRAY),
                new Car(Make.HONDA, Model.ODDESSY, 2016, 11760, 69177, true, Color.BLUE),
                new Car(Make.JAGUAR, Model.F_TYPE, 2000, 3750, 174221, true, Color.GRAY),
                new Car(Make.MERCEDES, Model.A_CLASS, 2002, 1650, 185439, true, Color.WHITE),
                new Car(Make.TOYOTA, Model.RAV4, 2002, 1350, 154782, true, Color.LIGHT_GRAY),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2017, 20918, 27342, true, Color.GRAY),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2021, 18807, 54, false, Color.WHITE),
                new Car(Make.KIA, Model.SORENTO, 2013, 6345, 127767, true, Color.DARK_GRAY),
                new Car(Make.TOYOTA, Model.CAMRY, 2001, 1250, 125544, true, Color.CYAN),
                new Car(Make.JAGUAR, Model.F_TYPE, 2006, 5907, 69862, true, Color.RED),
                new Car(Make.KIA, Model.SOUL, 2008, 1629, 141275, true, Color.WHITE),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2001, 2000, 190955, true, Color.BLACK),
                new Car(Make.JAGUAR, Model.F_TYPE, 2005, 4498, 126539, true, Color.BLUE),
                new Car(Make.KIA, Model.SOUL, 2005, 988, 119345, true, Color.ORANGE),
                new Car(Make.NISSAN, Model.ROGUE, 2009, 2970, 130888, true, Color.DARK_GRAY),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2006, 2813, 97780, true, Color.BLACK),
                new Car(Make.TOYOTA, Model.RAV4, 2001, 1350, 33144, true, Color.MAGENTA),
                new Car(Make.BMW, Model.X1, 2016, 16109, 20500, true, Color.WHITE),
                new Car(Make.JAGUAR, Model.F_TYPE, 2012, 17447, 51427, true, Color.GRAY),
                new Car(Make.MERCEDES, Model.E_CLASS, 2019, 39868, 302, false, Color.ORANGE),
                new Car(Make.HONDA, Model.ODDESSY, 2006, 2060, 195564, true, Color.BLUE),
                new Car(Make.NISSAN, Model.ROGUE, 2004, 1250, 196079, true, Color.PINK),
                new Car(Make.HONDA, Model.CIVIC, 2000, 1050, 140136, true, Color.GRAY),
                new Car(Make.JAGUAR, Model.F_TYPE, 2017, 36965, 37938, true, Color.RED),
                new Car(Make.HONDA, Model.CIVIC, 2007, 1703, 116869, true, Color.PINK),
                new Car(Make.NISSAN, Model.ALTIMA, 2021, 23287, 26774, true, Color.LIGHT_GRAY),
                new Car(Make.JAGUAR, Model.F_TYPE, 2021, 90037, 8, false, Color.DARK_GRAY),
                new Car(Make.BMW, Model.X3, 2009, 4219, 178552, true, Color.YELLOW),
                new Car(Make.MERCEDES, Model.E_CLASS, 2020, 41899, 27948, true, Color.PINK),
                new Car(Make.NISSAN, Model.ALTIMA, 2002, 1200, 186273, true, Color.GREEN),
                new Car(Make.TOYOTA, Model.CAMRY, 2010, 3948, 54293, true, Color.GREEN),
                new Car(Make.BMW, Model.X4, 2017, 26180, 66057, true, Color.WHITE),
                new Car(Make.JAGUAR, Model.F_TYPE, 2019, 60847, 22, false, Color.GRAY),
                new Car(Make.BMW, Model.X4, 2004, 3183, 30965, true, Color.CYAN),
                new Car(Make.TOYOTA, Model.RAV4, 2006, 7072, 9, false, Color.WHITE),
                new Car(Make.HONDA, Model.ODDESSY, 2019, 20729, 24558, true, Color.BLUE),
                new Car(Make.BMW, Model.X2, 2013, 8815, 26497, true, Color.YELLOW),
                new Car(Make.KIA, Model.SOUL, 2021, 20888, 732, false, Color.WHITE),
                new Car(Make.KIA, Model.SOUL, 2015, 6006, 39154, true, Color.PINK),
                new Car(Make.HONDA, Model.ODDESSY, 2007, 2625, 78438, true, Color.BLUE),
                new Car(Make.KIA, Model.SORENTO, 2008, 3614, 38198, true, Color.GREEN),
                new Car(Make.HONDA, Model.ODDESSY, 2021, 30895, 27645, true, Color.BLACK),
                new Car(Make.JAGUAR, Model.F_TYPE, 2005, 4512, 172198, true, Color.GREEN),
                new Car(Make.TOYOTA, Model.CAMRY, 2019, 17131, 14239, true, Color.CYAN),
                new Car(Make.HONDA, Model.ODDESSY, 2019, 28806, 758, false, Color.GRAY),
                new Car(Make.MERCEDES, Model.C_CLASS, 2001, 2050, 134309, true, Color.CYAN),
                new Car(Make.MERCEDES, Model.C_CLASS, 2013, 11474, 38343, true, Color.YELLOW),
                new Car(Make.HONDA, Model.CIVIC, 2009, 2214, 152939, true, Color.ORANGE),
                new Car(Make.HONDA, Model.ODDESSY, 2009, 3167, 165335, true, Color.ORANGE),
                new Car(Make.KIA, Model.SOUL, 2021, 15137, 648, false, Color.MAGENTA),
                new Car(Make.TOYOTA, Model.RAV4, 2009, 3360, 75098, true, Color.GRAY),
                new Car(Make.HONDA, Model.ODDESSY, 2014, 8454, 135909, true, Color.MAGENTA),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2021, 38110, 2778, true, Color.LIGHT_GRAY),
                new Car(Make.HONDA, Model.CIVIC, 2007, 1464, 196369, true, Color.CYAN),
                new Car(Make.MERCEDES, Model.A_CLASS, 2000, 1650, 32114, true, Color.PINK),
                new Car(Make.JAGUAR, Model.F_TYPE, 2013, 14986, 185089, true, Color.DARK_GRAY),
                new Car(Make.KIA, Model.SORENTO, 2012, 5457, 83959, true, Color.DARK_GRAY),
                new Car(Make.TOYOTA, Model.CAMRY, 2013, 5631, 77367, true, Color.DARK_GRAY),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2017, 21175, 42662, true, Color.WHITE),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2014, 9128, 195001, true, Color.MAGENTA),
                new Car(Make.HONDA, Model.ODDESSY, 2019, 28167, 706, false, Color.MAGENTA),
                new Car(Make.KIA, Model.SORENTO, 2005, 1669, 144433, true, Color.CYAN),
                new Car(Make.MERCEDES, Model.E_CLASS, 2008, 4979, 156655, true, Color.BLUE),
                new Car(Make.NISSAN, Model.ROGUE, 2002, 1250, 94901, true, Color.YELLOW),
                new Car(Make.HONDA, Model.CIVIC, 2004, 1142, 59539, true, Color.DARK_GRAY),
                new Car(Make.BMW, Model.X2, 2002, 1800, 128755, true, Color.MAGENTA),
                new Car(Make.JEEP, Model.GRAND_CHEROKEE, 2001, 2000, 74220, true, Color.ORANGE),
                new Car(Make.TOYOTA, Model.ODDESSY, 2015, 12925, 10772, true, Color.GREEN),
                new Car(Make.KIA, Model.SORENTO, 2017, 14221, 38906, true, Color.GREEN),
                new Car(Make.KIA, Model.SORENTO, 2000, 1450, 121936, true, Color.LIGHT_GRAY),
                new Car(Make.KIA, Model.SOUL, 2014, 5817, 53456, true, Color.MAGENTA),
                new Car(Make.TOYOTA, Model.ODDESSY, 2018, 20650, 552, false, Color.ORANGE),
                new Car(Make.BMW, Model.X4, 2005, 3694, 33181, true, Color.YELLOW)
            ));
    }
    
    public static void main(String[] args) {
        List<Car> dealership = createDealership();
        System.out.println(dealership.get(0).toString());
        
    }

}
