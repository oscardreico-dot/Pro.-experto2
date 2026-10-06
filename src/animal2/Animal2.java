
package animal2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Animal2 {

  
    public static void main(String[] args)
    {
       Scanner sn = new Scanner(System.in);
       int opcion = 0;
       String menu="";
       String Animal = "acuaticos";
       String Animal1 = "aereos";
       String Animal2 = "terrestres";
       String Animal3 = "semiacuaticos";
       String Animal4= "carnivoros";
       String Animal5 = "pelo";
       String Animal6= "oviparos";
       String Animal7 = "grupo";
       String Animal8 = "huevos";
       String Animal9 = "manada";
       String Animal10 = "inteligentes";
       Scanner input = new Scanner(System.in);
        do
        {
        menu="selecccione una opcion de 1 a 3\n";
        menu+="1. Animales segun su caracteristica\n";
        menu+="2. Desea cconocer mas de un Animal\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
             JOptionPane.showMessageDialog(null,"escriba la caracteristica del animal que busca en una sola palabra ");
            while (true) 
            {
                 String carac = input.next();
                 if(carac.equals(Animal7))
                 {
                 JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+
                                 "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n"+"\n"+
                                 "Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n");
                 break;
                 } 
                 else 
                 if(carac.equals(Animal))
                 {
                  JOptionPane.showMessageDialog(null,"Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+ 
                                 "Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n"+"\n"+ 
                                 "El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal1))
                 {
                  JOptionPane.showMessageDialog(null, "Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. Son miembros de las aves de presa, del orden de Accipitriformes, ?, ? familia Accipitridae, subfamilia Buteoninae. \n" +
                                 "Velocidad: Águila calva: 120 – 160 km/h\n" +
                                 "Promedio de vida: Águila calva: 20 años, Stephanoaetus coronatus: 14 años\n" +
                                 "Longitud: Águila real: 66 – 100 cm, Águila harpía: 99 cm, \n" +
                                 "Longitud de las alas: Águila calva: 1.8 – 2.3 m, MÁS\n" +
                                 "Masa Corporal: Águila calva: 3 – 6.3 kg, Águila real: 3 – 7 kg \n" +
                                 "Número de huevos: 1 – 3 Huevos"+"\n"+ 
                                 "El cuervo grande, ? anteriormente denominado cuervo común por la SEO? es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                                 "Nombre científico: Corvus corax\n" +
                                 "Promedio de vida: 10 – 15 años (En libertad)\n" +
                                 "Longitud: 56 – 78 cm (Adulto)\n" +
                                 "Familia: Corvidae\n" +
                                 "Masa Corporal: 0.69 – 2 kg (Adulto)\n" +
                                 "Longitud de las alas: 100 – 150 cm (Adulto\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal2))
                 {
                  JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal3))
                 {
                  JOptionPane.showMessageDialog(null,"El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal4))
                 {
                JOptionPane.showMessageDialog(null, "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n"+"\n"+ 
                                 " El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal5))
                 {
                  JOptionPane.showMessageDialog(null,"El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n"+"\n"+ 
                                 " El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+ 
                                 "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal6))
                 {
                  JOptionPane.showMessageDialog(null, "Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. Son miembros de las aves de presa, del orden de Accipitriformes, ?, ? familia Accipitridae, subfamilia Buteoninae. \n" +
                                 "Velocidad: Águila calva: 120 – 160 km/h\n" +
                                 "Promedio de vida: Águila calva: 20 años, Stephanoaetus coronatus: 14 años\n" +
                                 "Longitud: Águila real: 66 – 100 cm, Águila harpía: 99 cm, \n" +
                                 "Longitud de las alas: Águila calva: 1.8 – 2.3 m, MÁS\n" +
                                 "Masa Corporal: Águila calva: 3 – 6.3 kg, Águila real: 3 – 7 kg \n" +
                                 "Número de huevos: 1 – 3 Huevos\n"+"\n"+ 
                                 "El cuervo grande, anteriormente denominado cuervo común por la SEO es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                                 "Nombre científico: Corvus corax\n" +
                                 "Promedio de vida: 10 – 15 años (En libertad)\n" +
                                 "Longitud: 56 – 78 cm (Adulto)\n" +
                                 "Familia: Corvidae\n" +
                                 "Masa Corporal: 0.69 – 2 kg (Adulto)\n"+"\n"+ 
                                 "El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal8))
                 {
                 JOptionPane.showMessageDialog(null, "Águila es el nombre dado a las mayores aves depredadoras. \n" +
                                 "Son miembros de las aves de presa, del orden de Accipitriformes, familia Accipitridae, subfamilia Buteoninae. \n" +
                                 "Velocidad: Águila calva: 120 – 160 km/h\n" +
                                 "Promedio de vida: Águila calva: 20 años, Stephanoaetus coronatus: 14 años\n" +
                                 "Longitud: Águila real: 66 – 100 cm, Águila harpía: 99 cm, \n" +
                                 "Longitud de las alas: Águila calva: 1.8 – 2.3 m, MÁS\n" +
                                 "Masa Corporal: Águila calva: 3 – 6.3 kg, Águila real: 3 – 7 kg \n" +
                                 "Número de huevos: 1 – 3 Huevos\n"+"\n"+ 
                                 "El cuervo grande, anteriormente denominado cuervo común por la SEO es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                                 "Nombre científico: Corvus corax\n" +
                                 "Promedio de vida: 10 – 15 años (En libertad)\n" +
                                 "Longitud: 56 – 78 cm (Adulto)\n" +
                                 "Familia: Corvidae\n" +
                                 "Masa Corporal: 0.69 – 2 kg (Adulto)\n"+"\n"+ 
                                 "El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n");   
                 break;
                 }
                 else 
                 if(carac.equals(Animal9))
                 {
                 JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+ 
                                 "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n"+"\n"+ 
                                 "Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n");
                 break;
                 }
                 else 
                 if(carac.equals(Animal10))
                 {
                 JOptionPane.showMessageDialog(null,"Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n"+"\n"+  
                                 "El cuervo grande, anteriormente denominado cuervo común por la SEO, es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                                 "Nombre científico: Corvus corax\n" +
                                 "Promedio de vida: 10 – 15 años (En libertad)\n" +
                                 "Longitud: 56 – 78 cm (Adulto)\n" +
                                 "Familia: Corvidae\n" +
                                 "Masa Corporal: 0.69 – 2 kg (Adulto)\n");
                 break;
                 }
                 else
                 {
                 JOptionPane.showMessageDialog(null,"Intentalo de nuevo!");

                 }
            }
          
            break;
            case 2:
            do
            {
                menu="selecccione una opgion de 1 a 7\n";
                menu+="1. Leon\n";
                menu+="2. Ballenas\n";
                menu+="3. Ornitorrinco\n";
                menu+="4. Hombre\n";
                menu+="5. Delfin\n";
                menu+="6. Aguila\n";
                menu+="7. cuervo\n";
                menu+="8. salir\n";
                opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion)
                {
                    case 1:
                    caracteristica leon =new caracteristica();
                    leon.datosleon();
                    break;
                    case 2:
                    caracteristica ballenas =new caracteristica();
                    ballenas.datosballena();
                    break;
                    case 3:
                    caracteristica ornitorrinco =new caracteristica();
                    ornitorrinco.datosornitorinco();
                    break;
                    case 4:
                    caracteristica hombre =new caracteristica();
                    hombre.datoshombre();
                    break;
                    case 5: 
                    caracteristica delfin =new caracteristica();
                    delfin.datosdelfin();
                    break;
                    case 6:
                    caracteristica aguila =new caracteristica();
                    aguila.datosaguila();
                    break;
                    case 7:
                    caracteristica cuervo =new caracteristica();
                    cuervo.datoscuervo();
                    break;
                }

                } while(opcion!=8); 
            }
        
        } while(opcion!=3);
       
    }
    
    
}
