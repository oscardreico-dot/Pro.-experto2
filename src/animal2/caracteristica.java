
package animal2;

import java.util.Scanner;
import javax.swing.JOptionPane;

class caracteristica
{
    Scanner sn = new Scanner(System.in);
    int opcion = 0;
    String menu="";
    public caracteristica(){}
    @SuppressWarnings("empty-statement")
    public void datosleon()
    {
        JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                           "Nombre científico: Panthera leo\n" +
                           "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                           "Familia: Felidae\n" +
                           "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                           "Clase: Mammalia\n" +
                           "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                           "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)");
        do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null," La forma en que el león realiza la caza resulta diferente a la de otros felinos.\n"
                    +"Cazan en grupo, en lugar de hacerlo solos. Son capaces de crear planes estratégicos y rodear a sus presas, \n"+
                    "esto aumenta las posibilidades de éxito de la cacería, también les permite derribar presas muy grandes. \n"+
                    "Puesto que son muchos para alimentar, tiene sentido para conseguir una presa con bastante carne.\n"+
                    "Las presas más grandes del león incluyen ñus, cebras, impalas, búfalos y ciervos, estas presas a menudo dependen del hábitat donde residan.\n"+
                    "De vez en cuando buscará una jirafa, pero esto puede ser una prueba muy peligrosa. \n"+
                    "El león se centrará en las presas jóvenes, débiles, y mayores, con las que pueden acabar sin demasiado riesgo de resultar heridos en el proceso. \n"+
                    "El tamaño de la presa puede variar desde 420 libras a 1.200 libras.\n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Los leones se comunican de varias formas, por rugidos, olor y lenguaje corporal.\n"+
                    "Los rugidos pueden ser suaves o tan fuertes que se escuchan a kilómetros de distancia, los cuales usan para proteger a su manada o su territorio.\n");
            break;
            }
        
        } while(opcion!=3);
        
    }
    
    public void datosballena()
    {
        JOptionPane.showMessageDialog(null,"Los balénidos son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                            "Nombre científico: Balaenidae\n" +
                            "Promedio de vida: Eubalaena japonica: 70 años\n" +
                            "Familia: Balaenidae; Gray, 1825?\n" +
                            "Clase: Mammalia\n" +
                            "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                            "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                            "Masa Corporal: Ballena franca austral: 23,000 kg");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Las ballenas son grandes mamíferos, por lo que no es de extrañar que consuman grandes \n"+
                    "cantidades de comida cada día, son muy buenos depredadores y encuentran lo que necesitan para sobrevivir en las aguas donde viven.  \n"+
                    "Básicamente, comen cualquier cosa que puedan encontrar para su supervivencia. Algunos tipos de ballenas tienen estómagos muy grandes y pueden comer todos los días, por  \n"+
                    "ejemplo, la ballena azul puede almacenar hasta 2,200 libras de alimentos en su estómago antes de llenarse. \n"+
                    "Los predadores más agresivos son las ballenas dentadas y comen peces más grandes que sus \n"+
                    "primas las ballenas barbadas, algunas ballenas dentadas de mayor tamaño se alimentan también  \n"+
                    "de lobos marinos y otros grandes animales en las aguas, tal vez te sorprenda saber que incluso osos polares se han encontrado consumidos por ballenas.\n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Se cree que las ballenas utilizan el sonido para la eco-localización, un tipo de sonar, \n"+
                    "que les permite a las ballenas localizar peligros y otros animales  microscópicos si el suministro de alimentos es escaso. \n"+
                    "Una ballena produce un sonido que envía a través del agua y rebota en objetos o animales. \n"+
                    "Las ballenas tienen una capacidad especial para obtener información sobre la forma y la distancia del objeto con que el sonido chocó.\n"+
                    "Existen varias vocalizaciones o sonidos producidos por las ballenas, y cada uno, se cree, tenga un propósito diferente, incluyendo aquellos que se usan para la comunicación y la socialización. \n");
            break;
            }
        
        } while(opcion!=3);
    }
   public void datosornitorinco()
    {
        JOptionPane.showMessageDialog(null,"El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                            "Nombre científico: Ornithorhynchus anatinus\n" +
                            "Orden: Monotremata\n" +
                            "Clase: Mammalia\n" +
                            "Número de huevos: 1 – 3\n" +
                            "Periodo de gestación: 10 – 14 días\n" +
                            "Promedio de vida: 17 años (En cautiverio)");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Al salir de sus madrigueras, el ornitorrinco pasa la mayor parte de las horas de la tarde y noche en  \n"+
                    "el forrajeo de aguas poco profundas en busca de los invertebrados que habitan el fondo.\n"+
                    "Su dieta consiste principalmente de crustáceos, gusanos, camarones, moluscos, anélidos,  \n"+
                    "cangrejos, libélulas, mejillones, huevos de trucha, renacuajos y larvas de insectos.  \n"+
                    "De hecho, los ornitorrincos pueden consumir la totalidad de su peso corporal en alimentos en un  período de 24 horas.\n"+
                    "Durante 20 a 40 segundos por vez, los ornitorrincos buscan sus alimentos por medio del buceo a la  \n"+
                    "parte inferior de la corriente, con sus patas palmeadas y sondean el fondo fangoso con su sensible pico. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Bajo el agua, mantienen sus ojos cerrados y utilizan un sistema electro-receptor de sus picos para \n"+
                    "encontrar comida, mediante el moviendo de su cabeza de lado a lado. \n"+
                    "Pueden detectar el movimiento de la cola de un camarón a 10 centímetros de distancia. \n");
            break;
            }
        
        } while(opcion!=3);
        
    }
    public void datoshombre()
    {
        JOptionPane.showMessageDialog(null,"Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                            "Promedio de vida: 79 años\n" +
                            "Orden: Primates\n" +
                            "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                            "Clase: Mammalia\n" +
                            "Familia: Hominidae\n" +
                            "Reino: Animalia\n" +
                            "Filo: Chordata; Craniata");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"La comida es más que combustible para tu cuerpo; y es que la dieta puede ayudarte a combatir enfermedades y, además, a lucir más joven.\n "+
                    "Una alimentación saludable para los hombres debe incluir vitaminas, minerales y fibra. \n"+
                    "Para conseguir estos nutrientes es importante que comas al menos dos tazas de frutas y dos y media tazas de verduras al día. \n"+
                    "Asimismo, debes comer cereales enteros, remplaza los granos refinados por integrales en el pan, la pasta y el arroz, por ejemplo. \n"+
                    "Es fundamental que comas dos o tres porciones de pescado por semana. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"La comunicación humana es el campo dedicado a entender cómo se comunican los seres \n"+
                    "humanos, ya que el ser humano se comunica para transmitir información, manifestar \n"+
                    "sentimientos, influir en los demás y realizar acciones específicas. \n"+
                    "La comunicación humana refuerza las relaciones sociales, enriquece a sus participantes y es el  \n"+
                    "principal agente del desarrollo cultural.1 Su instrumento fundamental es el lenguaje verbal, pero \n"+
                    "las personas se comunican también por medio de gestos, movimientos, miradas, etc. \n");
            break;
            }
        
        } while(opcion!=3);
    }
    public void datosdelfin()
    {
        JOptionPane.showMessageDialog(null,"Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                            "Nombre científico: Delphinidae\n" +
                            "Familia: Delphinidae; Gray, 1821\n" +
                            "Velocidad: Delphinus delphis: 60 km/h\n" +
                            "Promedio de vida: Orca: 29 años, MÁS\n" +
                            "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                            "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                            "Periodo de gestación: Orca: 15 – 18 meses,");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Los delfines se alimentan principalmente de peces, en realidad no son cazadores, sino más bien \n "+
                    "parecen estar contentos con la especie más abundante y disponible para ellos. \n"+
                    "En consecuencia, la dieta en su hábitat natural suele depender de la zona en la que estén viviendo, así como la época del año. \n"+
                    "Regularmente se alimentan con especies de peces, calamares y pulpos. \n"+
                    "Se tragan su comida entera, sin masticar, utilizan los músculos en la parte posterior de la lengua y  \n"+
                    "la garganta para expulsar  el agua salada y enviar los peces hacia adentro. \n"+
                    "Los adultos pueden comer peces que pesen hasta 5 kilogramos, los delfines más jóvenes tienden a quedarse con los peces más pequeños. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Los delfines son como un niño que no se calla, hacen constantemente sonidos de comunicación o de navegación. \n"+
                    "Dichos sonidos se realizan de diferentes maneras.\n"+
                    "Los sonidos de ecolocalización se producen en las fosas nasales justo por debajo de sus orificios  \n"+
                    "nasales, y se denominan clics. Se producen a veces en una sucesión tan rápida que suenan como zumbidos.  \n"+
                    "Estos sonidos se producen justo detrás del ¨mellon¨, un aceite, un poco fuera del centro de la masa que podríamos llamar la frente del delfín. \n"+
                    "Los delfines se comunican como la mayoría de otros animales, sus chillidos y silbidos comunican  \n"+
                    "estados emocionales y a menudo, la presencia del peligro y la comida en la zona.  \n");
            break;
            }
        
        } while(opcion!=3);
    }
    
    public void datosaguila()
    {
        JOptionPane.showMessageDialog(null,"Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. Son miembros de las aves de presa, del orden de Accipitriformes, ?, ? familia Accipitridae, subfamilia Buteoninae. \n" +
                            "Velocidad: Águila calva: 120 – 160 km/h\n" +
                            "Promedio de vida: Águila calva: 20 años, Stephanoaetus coronatus: 14 años\n" +
                            "Longitud: Águila real: 66 – 100 cm, Águila harpía: 99 cm, \n" +
                            "Longitud de las alas: Águila calva: 1.8 – 2.3 m, MÁS\n" +
                            "Masa Corporal: Águila calva: 3 – 6.3 kg, Águila real: 3 – 7 kg \n" +
                            "Número de huevos: 1 – 3 Huevos");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Estas aves rapaces se alimentan principalmente de peces, como salmón y la trucha. En invierno, prefieren consumir carroña.\n "+
                    "Las águilas calvas son capaces de devorar cadáveres de grandes mamíferos como las ballenas. \n"+
                    "Estos tipos de águilas también se alimentan de los vertederos de basura. \n"+
                    "Otros águilas calvas dieta incluye mapaches, castores, liebres, ratones almizcleros, conejos, lagartos y ciervos. \n"+
                    "Las águilas moneras, al igual que otras rapaces, se alimentan de zorros voladores, lagartijas, serpientes, lémures voladores, lagartos, lechuzas y perros. \n"+
                    "Las águilas de cola blanca también son muy oportunistas y se alimentan principalmente de peces, mamíferos y aves. \n"+
                    "Entre otros alimentos del águila se incluyen ratones, zorros, antílopes, cabras, ciervos y ovejas. y algunas águilas se comen a las crías de otras especies de águilas. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"La mayoría de las vocalizaciones se producen durante la época reproductora, normalmente dentro \n"+
                    "o cerca de los territorios de nidificación. Fuera de la estación reproductora son más bien escasas.\n"+
                    "Se han identificado hasta ocho sonidos diferentes durante la reproducción gritos de alarma, emitidos tanto por el macho como la hembra. \n"+
                    "Los gritos de alarma suelen tener diversas funciones, entre ellas las de atraer a la pareja, marcar el  \n"+
                    "territorio y avisar de peligros. Existen ligeras variaciones entre el macho y la hembra, tanto de  \n"+
                    "intensidad como de longitud, debido probablemente al mayor tamaño de las hembras. \n");
            break;
            }
        
        } while(opcion!=3);
    }
    public void datoscuervo()
    {
        JOptionPane.showMessageDialog(null,"El cuervo grande, ? anteriormente denominado cuervo común por la SEO? es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                            "Nombre científico: Corvus corax\n" +
                            "Promedio de vida: 10 – 15 años (En libertad)\n" +
                            "Longitud: 56 – 78 cm (Adulto)\n" +
                            "Familia: Corvidae\n" +
                            "Masa Corporal: 0.69 – 2 kg (Adulto)\n" +
                            "Longitud de las alas: 100 – 150 cm (Adulto");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Esta es un ave omnivora que se alimenta casi de cualquier cosa que consiga, su alimentación se \n "+
                    "basa dependiendo del lugar donde este y la época del año. Son capaces de sobrevivir con bajos \n"+
                    "recursos alimenticios, estas aves comen desde hortalizas y frutas hasta carroña y desperdicios de  \n"+
                    "comida desechados por los seres humanos, entre lo que esta ave consume están los siguientes  \n"+
                    "alimentos; maíz, frutos secos, semillas, manzanas, higos, avellanas, hayucos, nueces, ingiere  \n"+
                    "mamíferos como  ratas, ratones, arañas, lagartijas, pájaros, conejos etc, y si esta cerca de alguna  \n"+
                    "playa comerá pescado, moluscos o  crustáceos. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Es un ave inteligente capaz de copiar hasta la voz humana, generalmente posee un grito que lo\n"+
                    "caracteriza y suena algo así como crascitar un poco profundo rrok-rrok este entre los más \n"+
                    "comunes y que lo diferencian de otras especies. Entre sus sonidos también encontramos un toc- \n"+
                    "toc-toc, un kraa que siempre son emitidos de una forma ronca, produce graznidos de manera  \n"+
                    "gutural y muchas veces t Esta ave esta dotada de grandes cualidades y como tal tiene la capacidad  \n"+
                    "de imitar los sonidos tanto de la naturaleza como la del ser humano. Posee grandes habilidades  \n"+
                    "con su voz y tiene un gran repertorio de vocalizaciones dentro de las que destacan los gritos que  \n"+
                    "emite en forma de alarma, de vuelo y los de persecución.ambién tiene sonidos de naturaleza musical. \n");
            break;
            }
        
        } while(opcion!=3);
    } 
}
