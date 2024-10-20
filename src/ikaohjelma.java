public class ikaohjelma {
    public static void main(String[] args) throws Exception {

        // ikä-harjoitusohjelma
        // if lauseen sisällä toinen if ennen else if ja else

        int ika = 100;

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
        } else {
            System.out.println("Olet aikuinen");
        }
         // Laajenna tehtävää niin, että aikuisille ilmoitetaan tasavuosikymmenistä
        // onnentoivotus
        if (ika == 10 || ika == 20 || ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70
                || ika == 80 || ika == 90) {
            System.out.println("Onnea tasavuosista!");
        }

         // jos ikä on 100, tulosta 3-rivinen onnentoivotus.
         if (ika == 100) {
            System.out.println("Onnea tasavuosista!");
            System.out.println("Onnea tasavuosista!");
            System.out.println("Onnea tasavuosista!");
        }

        // Tarkenna eläkeasioita siten, että yli 58-vuotiaille kerro, että he voivat
        // mennä varhaiseläkkeelle.

        if (ika >= 58 && ika < 64) {
            System.out.println("voit jäädä varhaiseläkkeelle");
        }

        if (ika == 65) {
            System.out.println("hyviä eläkepäiviä");
        }

        // ikää voi muuttaa miten haluaa, jolloin tulostus on myös erinäköinen
        

    }
}