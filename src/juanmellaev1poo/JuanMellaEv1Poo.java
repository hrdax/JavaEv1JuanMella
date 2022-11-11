package juanmellaev1poo;

//Importo la librería de lectura de teclado y arrays
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class JuanMellaEv1Poo {

    public static void main(String[] args) {
        
        /*Se crea los objeto Scanner a utilizar y variable para la repetición del
        ciclo*/
        Scanner in = new Scanner(System.in);
        boolean Repetir = true;
        
            System.out.println("                          ANALISTA PROGRAMADOR TALCA\n"
                    + "              ,                .   (                     \n" +
"                   ,                                   *(                 \n" +
"             *                  .**        *.                              \n" +
"                      ((/************        **************         *           \n" +
"                (((((((((************        ********************               \n" +
"            ((((((((((((((***********        ************************           \n" +
"            ((((((((((((((((*********        ************************           \n" +
"            (((((((((((((((((********        ************************           \n" +
"            (((((((((((((((((((******        ************************           \n" +
"                                                                                \n" +
"                                                                                \n" +
"                                                                                \n" +
"             **,,,,,,,,,,,,,,,,,,,,,,        ,,,,,,,,,,.............            \n" +
"             #####(((((((((((((((((((        ***********************            \n" +
"              ######(((((((((((((((((        **********************             \n" +
"               #########(((((((((((((        (((((****************.             \n" +
"                ############(((((((((        (((((((((((**********              \n" +
"                 #################(((        ((((((((((((((((((((               \n" +
"                  ###################        (((((((((((((#####                 \n" +
"                   ##################        #################                  \n" +
"                     ################        ###############                    \n" +
"                       ##############        #############                      \n" +
"                         /###########        ###########                        \n" +
"                            #########        ########                           \n" +
"                               ######        #####                              \n" +
"                                   ##        #                                  \n" +
"Alumno = Juan Mella          CFT SAN AGUSTIN TALCA    Profesor = Nicolas Olivos");
        do{    
        //Salida de consola para que el usuario pueda saber las opciones
        System.out.println("\nSeleccione el caso que quiere ver");
        System.out.println("Para salir presione 0");
        System.out.println("1.Caso 1\n2.Caso 2\n3.Caso 3\n4.Caso 4\n"
                + "5.Caso 5\n6.Caso 6\n7.Caso 7");
        /*Defino la variable c(de casos) como un entero pero que sea con el 
        valor dado por el usuario*/
        int c = in.nextInt();
        System.out.print("\n");
        
        /*Swtich que dará vida a todas la variantes de opciones de casos que se
        pueden elegir*/
        switch(c)
      {
        //CASO 1 variable que se incrementa hasta que sea valor 6
        case 1:
                //Definición de variable que utilicé
                int i = 0;
                
                do{
                    /*System mostrará el valor de la variable actual mientras
                    que i++ va a ir sumandole +1 a la variable*/
                    System.out.println(i);
                    i++;
                    
                    /*Este if lo utilicé para que cuándo muestre la variable
                    tenga valor 6 muestre un mensaje que el ciclo acabó y para
                    que muestre correctamente el valor de 6 ya que lo mostraba
                    pero bugeado y un i++ para que no recorra el ciclo otra
                    vez*/
                    if(i == 6){
                    System.out.println(i);
                    System.out.println("\nFin del caso 1");
                    System.out.println("¿Desea ver otro caso?\n");
                    i++;
                 }
                    
                }while(i <= 6);
            
                break;
                
        /*CASO 2 leer 4 valores por teclado y asignarlos en una array para luego
        mostrarlas por consola*/
        case 2: 
                //Definición de array y otras variables
                int[] digito = new int[4];
                boolean pregunta = true;
                
                /*Este for recorrera cada posición del array y preguntará por
                cada posición al usuario para darle un valor que el quiera*/
                for(i = 0; i < digito.length; i++){
                System.out.println("Elija un número para el array N° " + i);
                digito[i] = in.nextInt();
                }
                /*Aquí se hizo un do while para establecer un ciclo con fin
                definido cuando el usuario quiera, y este tendrá un switch 
                para mostrarle al usuario el valor asignado de su array*/
                do{
                System.out.println("\nElija un array que desea ver comenzando con"
                        + " 1 siendo el primero y 4 el último\n"
                        + "Para salir presione 0");
                int r = in.nextInt();
                //switch para escribirle al usuario su array solicitada
                switch(r){
                
                    case 1:
                            System.out.println("Su digito N°1 ingresado "
                                    +"fue " + digito[0]);
                             break;
                    case 2:
                            System.out.println("Su digito N°2 ingresado "
                                    +"fue " + digito[1]);
                             break;
                    case 3:
                            System.out.println("Su digito N°3 ingresado "
                                    +"fue " + digito[2]);
                             break;
                    case 4:
                            System.out.println("Su digito N°4 ingresado "
                                    +"fue " + digito[3]);
                             break;
                    case 0:
                            pregunta = false;
                            System.out.println("\nFin del caso 2");
                            System.out.println("¿Desea ver otro caso?\n");
                            break;
                    default:
                           System.out.println("\n*Por favor elija un valor entre "
                                             + "los que se indican*");
                        
                
                }
                }while (pregunta);
                break;
                
        /*CASO 3 implementar un switch de un simulacro tipo telefonía de 
        celular*/
        case 3:
               
                //Salida por consola para informar al usuario de las opciones
                boolean menu = true;
                System.out.println("Bienvenido a servicio 103 de"
                                  + " moviclarentel");
                do{
                System.out.println("¿Qué desea hacer?\n");
                System.out.println("1.Comprar Bolsa de internet\n2.Recargar"
                        + " Minutos\n3.Hacer un reclamo\n4.Salir");
                
                //Entrada de la opción del usuario
                int OpcionCelular = in.nextInt();
                
                pregunta = true;
                //switch para las diferentes opciones y do while para repetir
                do{
                switch(OpcionCelular){
                    
                    //COMPRAR UNA BOLSA**
                    case 1:
                            
                            System.out.println("¿Qué bolsa de internet desea?");
                            System.out.println("1.50MB por 100 Pesos\n"
                                    + "2.100MB por 200 Pesos\n"
                                    + "3.200MB por 350 Pesos\n"
                                    + "4.500MB por 400 Pesos\n"
                                    + "5.1GB por 1500 Pesos\n"
                                    + "6.Salir");
                            /*variable que definirá las opciones ingresadas por
                            el usuario*/
                            int opcion_bolsa = in.nextInt();
                            
                            switch(opcion_bolsa){
                            
                                case 1:
                                    //Confirmaciones de la compra
                                       System.out.println("Has elegido la bolsa"
                                               + " de 50MB por 100 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                       int confirmar = in.nextInt();
                                       if(confirmar == 1){
                                         //Agradecimiento con imagen ilustrativa
                                          System.out.println("Su bolsa ha sido"
                                                  + " confirmada\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          pregunta = false;
                                           
                                       }
                                       break;
                                case 2:
                                       System.out.println("Has elegido la bolsa"
                                               + " de 100MB por 200 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                        confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Su bolsa ha sido"
                                                  + " confirmada\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          pregunta = false;
                                           
                                       }
                                       break;
                                case 3:
                                       System.out.println("Has elegido la bolsa"
                                               + " de 200MB por 350 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                        confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Su bolsa ha sido"
                                                  + " confirmada\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          pregunta = false;
                                           
                                       }
                                       break;
                                case 4:
                                       System.out.println("Has elegido la bolsa"
                                               + " de 500MB por 400 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                        confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Su bolsa ha sido"
                                                  + " confirmada\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          pregunta = false;
                                           
                                       }
                                       break;
                                case 5:
                                       System.out.println("Has elegido la bolsa"
                                               + " de 1GB por 1500 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                        confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Su bolsa ha sido"
                                                  + " confirmada\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          pregunta = false;
                                           
                                       }
                                       break;
                                case 6:
                                       pregunta = false;
                                       break;
                            }
                           break;
                    //RECARGA DE MINUTOS**
                    case 2:
                           /*booleano que repetira el ciclo si el usuario quiere
                           junto al do while*/
                           boolean repetirminutos = true;
                           
                           do{
                           System.out.println("Cuántos minutos desea recargar");
                           System.out.println("1.30 Minutos por 200 Pesos\n"
                                   + "2.1 Hora por 400 Pesos\n"
                                   + "3.1 Hora y media por 500 Pesos\n"
                                   + "4.3 Horas por 1000 Pesos\n"
                                   + "5.Salir");
                           //Variable para la opción del usuario
                           int opcion_minutos = in.nextInt();
                           
                           switch(opcion_minutos){
                           
                               case 1:
                                       System.out.println("Has elegido 30"
                                               + " minutos por 200 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                       int confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Se han activado"
                                                  + " sus minutos"
                                                  + "\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          repetirminutos = false;
                                           
                                       }
                                      
                                      break;
                               case 2:
                                       System.out.println("Has elegido 1"
                                               + " hora por 400 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                       confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Se han activado"
                                                  + " sus minutos"
                                                  + "\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          repetirminutos = false;
                                           
                                       }
                                     
                                      break;
                                     
                               case 3:
                                       System.out.println("Has elegido 1"
                                               + " hora y media por 500 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                       confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Se han activado"
                                                  + " sus minutos"
                                                  + "\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          repetirminutos = false;
                                           
                                       }
                                     
                                     
                                      break;
                                     
                               case 4:
                                       System.out.println("Has elegido 3"
                                               + " horas por 1000 Pesos"
                                               + " ingresa 1 para confimar"
                                               + " 2 para rectroceder");
                                       confirmar = in.nextInt();
                                       if(confirmar == 1){
                                          System.out.println("Se han activado"
                                                  + " sus minutos"
                                                  + "\n\n                       __\n" +
"                     .'  '.\n" +
"                 _.-'/  |  \\\n" +
"    ,        _.-\"  ,|  /  0 `-.\n" +
"    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
"    \\ '-'`        .___.--._)=========================|\n" +
"     \\            .'      |                          |\n" +
"      |     /,_.-'        |                          |\n" +
"    _/   _.'(             |          GRACIAS         |\n" +
"   /  ,-' \\  \\            |                          |\n" +
"   \\  \\    `-'            |                          |\n" +
"    `-'                   '--------------------------'\n\n");
                                          repetirminutos = false;
                                           
                                       }
                                     
                                   
                                      break;
                               case 5:
                                      repetirminutos = false;
                                      break;
                            }
                           }while(repetirminutos);
                           
                           
                           break;
                           
                    //HACER UN RECLAMO**
                    case 3:
                           
                           System.out.println("¿Qué tipo de reclamo desea?");
                           System.out.println("1.Móvil\n2.Servicio al cliente\n"
                                   + "3.Hablar con un operador\n"
                                   + "4.Salir");
                           int opcion_reclamo = in.nextInt();
                           switch(opcion_reclamo){
                           
                               case 1:
                                   System.out.println("*Su reclamo ha sido "
                                           + "enviado espere respuesta de "
                                           + "nuestros operadores*");
                                   break;
                               
                               case 2:
                                   System.out.println("*Su reclamo ha sido "
                                           + "enviado espere respuesta de "
                                           + "nuestros operadores*");
                                   break;
                               case 3:
                                   System.out.println("*Contactando con un "
                                           + "operador espere su llamada*\n"
                                           + "**Musica de amiente**)");
                                   for(int o = 1; o <=50; o++){
                                   System.out.println(".");
                                   if(o ==49){
                                   System.out.println("Operadores Ocupados\n"
                                           + "*Nadie quiere contestar "
                                           + "intentelo más tarde*");
                                   }
                                   }
                                   break;
                                   
                           }
                           break;
                    case 4:
                           System.out.println("\nFin del caso 3");
                           System.out.println("¿Desea ver otro caso?\n");
                           menu = false;
                           break;
                    default:
                           System.out.println("*Por favor ingrese un digito"
                                   + " válido*");
                }
                
                break;
                
                }while(pregunta);
                }while(menu);
                
                break;
        //CASO 4****        
        case 4:
            /*Implementar switch para la comprar puntos de habilidad o de
            experiencia utilizando un saldo*/
            //SALDO SOLICITADO* IMPORTANTE*
                int saldo = 5000;
                boolean RepetirM = true;
                //Imagen ilustrativa
                System.out.println("                                    \n" +
"                                                       .~))>>\n" +
"                                                      .~)>>\n" +
"                                                    .~))))>>>\n" +
"                                                  .~))>>             ___\n" +
"                                                .~))>>)))>>      .-~))>>  \n" +
"                                              .~)))))>>       .-~))>>)>\n" +
"                                            .~)))>>))))>>  .-~)>>)>\n" +
"                        )                 .~))>>))))>>  .-~)))))>>)>\n" +
"                     ( )@@*)             //)>))))))  .-~))))>>)>\n" +
"                   ).@(@@               //))>>))) .-~))>>)))))>>)>\n" +
"                 (( @.@).              //))))) .-~)>>)))))>>)>\n" +
"               ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\n" +
"            ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\n" +
"           )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>\n" +
"         (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\n" +
"          )* @@@ )@*     (@) (@)  /\\b|))) //))))))>>))))>>\n" +
"        (( @. )@( @ .   _/       /  \\b)) //))>>)))))>>>_._\n" +
"         )@@ (@@*)@@.  (6,   6) / ^  \\b)//))))))>>)))>>   ~~-.\n" +
"      ( @jgs@@. @@@.*@_ ~^~^~, /\\  ^  \\b/)>>))))>>      _.     `,\n" +
"       ((@@ @@@*.(@@ .   \\^^^/' (  ^   \\b)))>>        .'         `,\n" +
"        ((@@).*@@ )@ )    `-'   ((   ^  ~)_          /             `,\n" +
"          (@@. (@@ ).           (((   ^    `\\        |               `.\n" +
"            (*.@*              / ((((        \\        \\      .         `.\n" +
"                              /   (((((  \\    \\    _.-~\\     Y,         ;\n" +
"                             /   / (((((( \\    \\.-~   _.`\" _.-~`,       ;\n" +
"                            /   /   `(((((()    )    (((((~      `,     ;\n" +
"                          _/  _/      `\"\"\"/   /'                  ;     ;\n" +
"                      _.-~_.-~           /  /'                _.-~   _.'\n" +
"                    ((((~~              / /'              _.-~ __.--~\n" +
"                                       ((((          __.-~ _.-~\n" +
"                                                   .'   .~~\n" +
"                                                   :    ,'\n" +
"                                                   ~~~~~"
                        + "\nHola! Esta es la tienda de Dragon Hold Kingdom ");
                        int magia_explosiva = 0;
                        int explosion = 1;
                        do{
                        while(magia_explosiva == 1){
                            in.skip("\n");
                            System.out.println("\n¿Asi que obtuviste Magia "
                                    + "Explosiva? jejej veamos Pruébala! nunca\n"
                                    + "la he visto en acción!");
                            String Edialogo = ("mas sombrio que la oscuridad llego la hora de despertar la humanidad no conoce otra tecnica ofensiva mas poderosa es el ataque magico supremo");
                            System.out.println("\nPara usar la magia explosiva"
                                    + " debes pronunciar estas palabras\n"
                                    + " \"mas sombrio que la oscuridad\n"
                                    + " llego la hora de despertar\n"
                                    + " la humanidad no conoce otra tecnica \n"
                                    + " ofensiva mas poderosa es el ataque \n"
                                    + " magico supremo\""
                                    + " Y por último debes gritar\n"
                                    + " \"EXPLOSION\" para liberar tu magia");
                            System.out.println("Vamos tu turno tal cual y como"
                                    + " te mostre");
                            
                            String dialogo = in.nextLine();
                            
                            if(Edialogo.equals(dialogo)){
                                System.out.println("Grita!");
                                String Grito = "EXPLOSION";
                                String GritoU = in.nextLine();
                                if(Grito.equals(GritoU)){
                                    System.out.println("3\n2\n1\nBOOM");
                                    System.out.println("                               ________________\n" +
"                          ____/ (  (    )   )  \\___\n" +
"                         /( (  (  )   _    ))  )   )\\\n" +
"                       ((     (   )(    )  )   (   )  )\n" +
"                     ((/  ( _(   )   (   _) ) (  () )  )\n" +
"                    ( (  ( (_)   ((    (   )  .((_ ) .  )_\n" +
"                   ( (  )    (      (  )    )   ) . ) (   )\n" +
"                  (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )\n" +
"                  ( (  (   ) (  )   (  ))     ) _)(   )  )  )\n" +
"                 ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )\n" +
"                  (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )\n" +
"                 ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )\n" +
"                  ((  (   )(    (     _    )   _) _(_ (  (_ )\n" +
"                   (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)\n" +
"                   ((__)        \\\\||lll|l||///          \\_))\n" +
"                            (   /(/ (  )  ) )\\   )\n" +
"                          (    ( ( ( | | ) ) )\\   )\n" +
"                           (   /(| / ( )) ) ) )) )\n" +
"                         (     ( ((((_(|)_)))))     )\n" +
"                          (      ||\\(|(|)|/||     )\n" +
"                        (        |(||(||)||||        )\n" +
"                          (     //|/l|||)|\\\\ \\     )\n" +
"                        (/ / //  /|//||||\\\\  \\ \\  \\ _)\n" +
"-------------------------------------------------------------------------------");
                                System.out.println("WOW!\n"
                                        + "Nunca había visto una explosión tan "
                                        + " grande! por ahora tendré que irme se"
                                        + " destruyó toda la ciudad\n");
                                System.out.println("*EL JUGADOR SE DESMAYA POR "
                                        + "LA PERDIDA BRUSCA DE MAGIA Y ENERGÍA*");
                                magia_explosiva = 0;
                                System.out.println("Fin del caso 4");
                                System.out.println("¿Desea ver otro caso?");
                                RepetirM = false;
                                explosion = 0;
                                }
                                
                                
                            }
                            
                        }
                        /*Verificador de saldo en el menu que le advierte 
                        al jugador de si no le alcanza nada en la tienda*/
                        if(saldo < 1000 ){
                            System.out.println("\n*Parece te quedaste sin puntos de"
                                    + " aventurero vuelve cuando hayas hecho"
                                    + " más misiones para poder comprar **\n"
                                    //IMPORTANTE** SALIDA DE SALDO EN CONSOLA**
                                    + "Puntos de Aventurero = " + saldo+ "\n");
                        }
                        if (explosion == 1){
                        if(RepetirM == true){
                        System.out.println("¿Cuál de estas opciones deseas"
                        + " adquirir?\n"
                        + "Tus puntos de aventura son de " + saldo
                        + "\n1.Puntos de Habilidad\n"
                        + "2.Puntos de Experiencia\n"
                        + "3.Salir");
                //entrada teclado
                int opcion_aventurero = in.nextInt();
                
                //SWITCH SOLICITADO EN PRUEBA* IMPORTANTE**
                switch(opcion_aventurero){
                    //SWITCH PUNTOS DE HABILIDAD IMPORTANTE**
                    case 1:
                           //boolean para la repetición del ciclo do while
                           boolean RepetirHabilidad = true;
                           do{
                           //Salida de consola para las opciones de compra
                           System.out.println("¿Qué puntos de habilidad"
                                   + " quieres?");
                           System.out.println("1.+10 en dominio del fuego $1000");
                           System.out.println("2.+10 en dominio del agua $1000");
                           System.out.println("3.+50 en Magia Explosiva $5000");
                           System.out.println("4.+30 en sacerdotista $4000");
                           System.out.println("5.Salir");
                           int PuntoHabilidad = in.nextInt();
                           /*switch para las opciones detalladas de compra de
                           habilidades*/
                           switch(PuntoHabilidad){
                               //compra Fuego
                               case 1:
                                      System.out.println("+10 en fuego "
                                              + "Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                      int confirmar = in.nextInt();
                                        //verificador de saldo
                                         if(saldo <1000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirHabilidad = false;
                                          }
                                         //confirmador de la compra
                                      if(confirmar == 1){
                                          
                                          System.out.println("*Tienes +10 en tus"
                                                  + " habilidades con el fuego*");
                                       //Resta para la compra SALDO IMPORTANTE**
                                          saldo = saldo - 1000;
                                          System.out.println("\nPuntos restantes"
                                       //SALIDA DE SALDO EN CONSOLA IMPORTANTE**
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de habilidad?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              /*Cambia el valor para detener el
                                              ciclo*/
                                              RepetirHabilidad = false;
                                          }
                                          
                                              }
                                      break;
                               case 2:
                                      System.out.println("+10 en agua "
                                              + "Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                         confirmar = in.nextInt();
                                         if(saldo <1000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirHabilidad = false;
                                          }
                                      if(confirmar == 1){
                                          System.out.println("*Tienes +10 en tus"
                                                  + " habilidades con el agua*");
                                          saldo = saldo - 1000;
                                          System.out.println("\nPuntos restantes"
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de habilidad?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              RepetirHabilidad = false;
                                          }
                                          
                                              }
                                   
                                      break;
                               case 3:
                                      System.out.println("+50 en Magia Explosiva"
                                              + " Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                         confirmar = in.nextInt();
                                         if(saldo <5000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirHabilidad = false;
                                          }
                                      if(confirmar == 1){
                                          
                                          System.out.println("*Tienes +50 de "
                                                  + " habilidad en magia"
                                                  + " explosiva!!!!!*");
                                          saldo = saldo - 5000;
                                          magia_explosiva = 1;
                                          System.out.println("\nPuntos restantes"
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de habilidad?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              RepetirHabilidad = false;
                                          }
                                          
                                              }
                                   
                                   
                                      break;
                               case 4:
                                      System.out.println("+30 en sacerdotista "
                                              + "Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                         confirmar = in.nextInt();
                                         if(saldo <4000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirHabilidad = false;
                                          }
                                      if(confirmar == 1){
                                          System.out.println("*Tienes +30 en tus"
                                                  + " habilidades de "
                                                  + " sacerdotista!!!*");
                                          saldo = saldo - 4000;
                                          System.out.println("\nPuntos restantes"
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de habilidad?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              RepetirHabilidad = false;
                                          }
                                          
                                              }
                                   
                                      break;
                               case 5:
                                      RepetirHabilidad = false;
                                      break;
                               //DEFAULT** IMPORTANTE VALIDA EL DIGITO INGRESADO*
                               default:
                                  System.out.println("\n*Elige una de las opciones"
                                  + " por favor*\n");
                           }
                                      
                           }while(RepetirHabilidad);
                           
                           break;
                    //SWITCH COMPRA DE EXPERIENCIA** IMPORTANTE*       
                    case 2:
                        boolean RepetirExperiencia = true;
                        do{
                        System.out.println("¿Cuántos puntos de experiencia "
                        + "quieres?");
                        System.out.println("1. 400EXP por $2000\n"
                                          + "2.700EXP por $4000\n"
                                          + "3.1000EXP por $5000\n"
                                          + "4.Salir");
                        int opcion_experiencia = in.nextInt();
                        switch(opcion_experiencia){
                            //opciones de experiencia
                            case 1: 
                                      System.out.println("+400 de experiencia "
                                              + "Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                      int confirmar = in.nextInt();
                                        //verificador de saldo
                                         if(saldo <2000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirExperiencia = false;
                                          }
                                         //confirmador de la compra
                                      if(confirmar == 1){
                                          
                                          System.out.println("*Tienes +400 de"
                                                  + " EXP*");
                                          saldo = saldo - 2000;
                                          System.out.println("\nPuntos restantes"
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de experiencia?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              /*Cambia el valor para detener el
                                              ciclo*/
                                              RepetirExperiencia = false;
                                          }
                                          
                                              }
                                            break;
                            case 2:
                                   System.out.println("+700 de experiencia "
                                              + "Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                        confirmar = in.nextInt();
                                        //verificador de saldo
                                         if(saldo <4000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirExperiencia = false;
                                          }
                                         //confirmador de la compra
                                      if(confirmar == 1){
                                          
                                          System.out.println("*Tienes +5000 de"
                                                  + " EXP*");
                                          saldo = saldo - 5000;
                                          System.out.println("\nPuntos restantes"
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de experiencia?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              /*Cambia el valor para detener el
                                              ciclo*/
                                              RepetirExperiencia = false;
                                          }
                                          
                                              }
                                
                                   break;
                                   
                            case 3:
                                   System.out.println("+1000 de experiencia "
                                              + "Para confirmar presiona"
                                              + " 1 para cancelar 2");
                                        confirmar = in.nextInt();
                                        //verificador de saldo
                                         if(saldo <5000){
                                            System.out.println("\n*No tienes puntos"
                                                    + " suficientes para "
                                                    + "comprar lo seleccionado"
                                                    + " vuelve cuando tengas"
                                                    + " puntos suficientes*\n");
                                            confirmar = 0;
                                            RepetirExperiencia = false;
                                          }
                                         //confirmador de la compra
                                      if(confirmar == 1){
                                          
                                          System.out.println("*Tienes +400 de"
                                                  + " EXP*");
                                          saldo = saldo - 2000;
                                          System.out.println("\nPuntos restantes"
                                                  + " " + saldo);
                                          System.out.println("¿Deseas comprar "
                                                  + "más puntos de experiencia?"
                                                  + "\n1.Sí\n2.No");
                                          int preguntah = in.nextInt();
                                          if(preguntah == 2){
                                              /*Cambia el valor para detener el
                                              ciclo*/
                                              RepetirExperiencia = false;
                                          }
                                          
                                              }
                                   break;
                            case 4:
                                   RepetirExperiencia = false;
                                   break;
                            //DEFAULT** IMPORTANTE VALIDA EL DIGITO INGRESADO*
                            default:
                                   System.out.println("\n*Elige una de las opciones"
                                           + " por favor*\n");
                        }
                        }while(RepetirExperiencia);
                        break;
                        
                    case 3:
                           System.out.println("Fin del caso 4");
                           RepetirM = false;
                           break;
                    //DEFAULT** IMPORTANTE VALIDA EL DIGITO INGRESADO*        
                    default:
                            System.out.println("\n*Elige una de las opciones"
                            + " por favor*\n");
                }
                        }
                        }
                }while(RepetirM);
                                 
                break;
        /*CASO 5 *** Implementar un array de tipo String, leer datos y 
        almacenarlos, mostrar los valores del array por consola*/
        case 5:
                //IMPORTANTE DEFINICION DE ARRAY TIPO STRING**
                String[] dato = new String[5];
                /*IMPORTANTE FOR PARA RECORRER EL ARRAY Y ALMACENARLE DATOS
                ENTREGADOS POR EL USUARIO*/
                for( i = 0; i < dato.length; i++)
                {
                System.out.println("Elija un dato para el array N° " + i);
                /*Este if contiene la solución a un bug que hacía que se saltara
                el primer arreglo dejándolo nulo sin poder darle un valor y se
                utilizó un skip para que java reconozca que se necesita
                introducir un valor y no saltarlo*/
                if(i == 0){
                in.skip("\n");
                }
                //IMPORTANTE LECTURA DE DATO PARA EL ARRAY**
                dato[i] = in.nextLine();
                }
               /*IMPORTANTE FOR PARA LA MUESTRA DE LOS DATOS DE LOS 
                ARRAY POR CONSOLA*/
               for(i = 0; i < dato.length; i++)
               {
               System.out.println("\nEl dato entregado a su"
                       + " array N° " + i + " es: " + dato[i]);
               }
               System.out.println("\nFin del caso 5\n");
               System.out.println("¿Desea ver otro caso?");
               break;
        
        /*CASO 6*** Cree un array de string que posea nombre de marcas de 
        vehiculos utilice un for que permita hacer una comparación de 
        coincidencias, mostrar por consola una coincidencia 
        de datos.*/
        case 6:
                int RespuestaAuto = 1;
                int fin_busqueda = 0;
                boolean RepetirAuto = true;
                //CREACIÓN DEL ARRAY TIPO STRING IMPORTANTE**
                String[] auto = new String[10];
                auto[0] = "AUDI";
                auto[1] = "Ferrari";
                auto[2] = "Nissan";
                auto[3] = "Chevrolet";
                auto[4] = "AUDI";
                auto[5] = "M.Benz";
                auto[6] = "Chevrolet";
                auto[7] = "Tesla";
                auto[8] = "AUDI";
                auto[9] = "BMW";
                System.out.println("Bienvenido a la importadora de autos "
                        + "Itasharin\n");
                //Imágenes ilustrativas
                System.out.println("                              _.-=\"_-         _\n" +
"                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..\n" +
"             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'\n" +
"      __.--\"\"     __        ,'                   o \\           __        [__|\n" +
" __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:\n" +
"]       [w] : /        \\ : |========================|    : /        \\ :  [w] :\n" +
"V___________:|          |: |========================|    :|          |:   _-\"\n" +
" V__________: \\        / :_|=======================/_____: \\        / :__-\"\n" +
" -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
                System.out.println("   __---~~~~--__                      __--~~~~---__\n" +
" `\\---~~~~~~~~\\\\                    //~~~~~~~~---/'  \n" +
"   \\/~~~~~~~~~\\||                  ||/~~~~~~~~~\\/ \n" +
"               `\\\\                //'\n" +
"                 `\\\\            //'\n" +
"                   ||          ||      \n" +
"         ______--~~~~~~~~~~~~~~~~~~--______              \n" +
"    ___ // _-~                        ~-_ \\\\ ___  \n" +
"   `\\__)\\/~                              ~\\/(__/'          \n" +
"    _--`-___                            ___-'--_        \n" +
"  /~     `\\ ~~~~~~~~------------~~~~~~~~ /'     ~\\        \n" +
" /|        `\\         ________         /'        |\\     \n" +
"| `\\   ______`\\_      \\------/      _/'______   /' |          \n" +
"|   `\\_~-_____\\ ~-________________-~ /_____-~_/'   |  \n" +
"`.     ~-__________________________________-~     .'       \n" +
" `.      [_______/------|~~|------\\_______]      .'\n" +
"  `\\--___((____)(________\\/________)(____))___--/'           \n" +
"   |>>>>>>||                            ||<<<<<<|");
                String busqueda_auto;
                do{
                /*CREACIÓN DEL CONTADOR QUE SE UTILIZARÁ PARA ACUMULAR 
                COINCIDENCIAS IMPORTANTE**/
                int contador = 0;
                System.out.println("\nEscriba una de las siguientes marcas de"
                        + " auto que desea buscar para ver cuántos vehículos"
                        + " \nen venta están disponbiles de tal marca. \n*Escriba"
                        + " tal y como se ven por favor*");
                System.out.println("\nAUDI\nFerrari\nNissan\nChevrolet\nM.Benz\n"
                        + "Tesla\nBMW\nEscriba \"Salir\" para retroceder");
                
                //Solución bug que salta la línea*
                in.skip("\n");
                
                /*VARIABLE QUE BUSCARÁ EL AUTO POR LA MARCA
                INGRESADA POR EL USUARIO*/
                busqueda_auto = in.nextLine();
                if(busqueda_auto.equals("Salir")){
                    RespuestaAuto = 2;
                    fin_busqueda = 0;
                    contador = -1;
                }
            //CREACIÓN DEL FOR PARA LA COMPARACIÓN DE COINCIDENCIAS IMPORTANTE**
                for(i = 0;i < auto.length;i++){
                    
                    if(auto[i].equals(busqueda_auto)){
                        contador++;
                        fin_busqueda = 1;
                    }
                }
                //Verificador de dato String válido (solo funciona con string)
                if(contador == 0){
                    System.out.println("*Por favor ingrese datos válidos que se"
                            + " le muestren*");
                    fin_busqueda = 1;
                /*While que arregla un bug al escribir otra palabra que no 
                coincide con lo mostrado y hacía un ciclo infinito de teclado*/
                while(fin_busqueda == 1)   { 
                System.out.println("¿Desea intentar otra vez?\n1.Sí\n2.No");
                RespuestaAuto = in.nextInt();
                fin_busqueda = 0;
                }
                    
                }
                //if que mostrará las coincidencias
                if(contador >= 1){
                //MUESTRA LAS COINCIDENCIAS IMPORTANTE**
                System.out.println("\nHay " + contador + " auto/s disponibles "
                        + "para la venta de la marca " + busqueda_auto + "\n");
                }
                /*While que dará a conocer al do while si repetir o no la 
                busqueda preguntando al usuario*/
                while(fin_busqueda == 1)   { 
                System.out.println("¿Desea Buscar otras marcas disponibles?\n"
                        + "1.Sí\n2.No");
                RespuestaAuto = in.nextInt();
                fin_busqueda = 0;
                }
                
                //APAGA LA REPETICIÓN DEL CICLO**
                if(RespuestaAuto == 2){
                    
                    RepetirAuto = false;
                }
                }while(RepetirAuto);
                
                System.out.println("\nFin del caso 6");
                System.out.println("¿Desea ver otro caso?\n");
                
                break;
                
        /*CASO 7*** Cree un array de tipo string con 10 nombres de marcas de
        vehiculos utilice un for que muestre por consola las primeras 6 marcas*/
        case 7:
                //CREACIÓN DEL ARRAY TIPO STRING CON LOS NOMBRES DE AUTOS**
                String[] autos = new String[10];
                autos[0] = "AUDI";
                autos[1] = "Ferrari";
                autos[2] = "Nissan";
                autos[3] = "Chevrolet";
                autos[4] = "Toyota";
                autos[5] = "Peugeot";
                autos[6] = "Hyundai";
                autos[7] = "Tesla";
                autos[8] = "Kia";
                autos[9] = "BMW";
                
                /*Indica al usuario que se van a imprimir los primeros 6 arrays
                con marcas de autos*/
                System.out.println("\nPrimeras 6 marcas\n");
                
                //FOR QUE IMPRIME LAS PRIMERAS 6 MARCAS IMPORTANTE**
                for(i = 0; i <= 5;i++){
                    System.out.println(autos[i]);
                    
                }
                //Le indica al usuario que el caso se terminó
                System.out.println("\nFin del caso 7");
                System.out.println("¿Desea ver otro caso?\n");
                break;
        //Caso el cuál termina el programa        
        case 0: 
               Repetir = false;
               System.out.println("Adiós!");
               break;
        //DEFAULT validador de digito ingresado         
        default:
            System.out.println("\n*Por favor seleccione una opción válida*\n"
                              + "si quiere salir presione 0");
            
    }
        }while(Repetir);
        
    /*Fuentes que me ayudaron para solucionar algún bug o para obtener 
    las imágenes ilustrativas para el programa
        
    Arte ASCII : http://arteascii.yaia.com/transportes.html
                 https://www.asciiart.eu/vehicles/cars
                 https://www.asciiart.eu/weapons/explosives
        
    Solución bug de salto de linea: 
    https://tazasdejava.blogspot.com/2017/02/problema-con-nextline-se-salta-una-linea.html
    
    Ilustración Logo cft en ASCII con la siguiente herramienta:
        https://manytools.org/hacker-tools/convert-images-to-ascii-art/
        
        También con ayuda de los vídeos de las clases me fuí apoyando cuándo
        dudaba de algo
        */
        
    }
    
}
