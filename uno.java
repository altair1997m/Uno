/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Uno {
        static int Jugador1[] = new int [120];
        static int Jugador2[] = new int [120];
        static int Jugador3[] = new int [120];
        static int Jugador4[] = new int [120];
        static int jugadores[] = new int [3];
        static int Bot1[] = new int [120];
        static int Bot2[] = new int [120];
        static int Bot3[] = new int [120];
        static int baraja[] = new int [120];


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rotado;
        Scanner carta = new Scanner(System.in);
        System.out.println("Modo de juego");
        System.out.println("1- Multiplayer");
        System.out.println("2- Local");
        int p1 = carta.nextInt();
        // DESICION SI BOT O PERSONAS
        switch(p1){
      
            case 1 :
        //CON PERSONAS
        System.out.println("¿Cuantas personas jugaran?");
                int jugador = carta.nextInt();
                //JUGADORES
                switch(jugador){
                    case 2:
        for(int x=0; x < baraja.length; x++){
            baraja[x] = numeroAleatorio();
        }
        System.out.println("Se barajearan las cartas");
        for(int x= 0; x <120 ;x++){
           // System.out.print(baraja[x]+" ");
        }
            System.out.println("");
            System.out.println("Se han barajeado las cartas");
            //REPARTIR CARTAS J1 
                for (int x=0;x<7;x++){
            Jugador1[x] = baraja[x];
          }
            //CARTAS DE LOS JUGADORES
           System.out.println("______JUGADOR 1_______");
                System.out.println("Sus cartas son: ");
            for(int x=119; x >7;x--){
                
                Jugador1[x] = -1;
            }
            for(int x=0; x< Jugador1.length; x++){
                
                System.out.print(Jugador1[x]+" ");
               
            }
                System.out.println("");
                 rotado = baraja[0];
  for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }                
                }
               //JUGADOR 2
                
                for (int x=0;x<7;x++){
            Jugador2[x] = baraja[x];
          }
           System.out.println("______JUGADOR 2_______");
                System.out.println("Sus cartas son: ");
            for(int x=119; x >7;x--){
                Jugador2[x] = -1;
            }
            for(int x=0; x< Jugador2.length; x++){
                
                System.out.print(Jugador2[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
       for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }                
                }
                System.out.println("———––——————El juego comienza———––——————");
                break;
                     case 3:
                         for(int x=0; x < baraja.length; x++){
            baraja[x] = numeroAleatorio();
        }
        System.out.println("Se barajearan las cartas");
        for(int x= 0; x <120 ;x++){
          //  System.out.print(baraja[x]+" ");
        }
            System.out.println("");
            System.out.println("Se han barajeado las cartas");
            //REPARTIR CARTAS J1 
                for (int x=0;x<7;x++){
            Jugador1[x] = baraja[x];
          }
            //CARTAS DE LOS JUGADORES
           System.out.println("______JUGADOR 1_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador1.length; x++){
                
                System.out.print(Jugador1[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
  for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }                
                }
               //JUGADOR 2
                
                for (int x=0;x<7;x++){
            Jugador2[x] = baraja[x];
          }
           System.out.println("______JUGADOR 2_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador2.length; x++){
                
                System.out.print(Jugador2[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
  for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }
                }
                    for (int x=0;x<7;x++){
            Jugador3[x] = baraja[x];
          }
           System.out.println("______JUGADOR 3_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador3.length; x++){
                
                System.out.print(Jugador3[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
  for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }
                }
                      break;
                    case 4:
                     for(int x=0; x < baraja.length; x++){
            baraja[x] = numeroAleatorio();
        }
        System.out.println("Se barajearan las cartas");
        for(int x= 0; x <120 ;x++){
        //    System.out.print(baraja[x]+" ");
        }
            System.out.println("");
            System.out.println("Se han barajeado las cartas");
            //REPARTIR CARTAS J1 
                for (int x=0;x<7;x++){
            Jugador1[x] = baraja[x];
          }
            //CARTAS DE LOS JUGADORES
           System.out.println("______JUGADOR 1_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador1.length; x++){
                
                System.out.print(Jugador1[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
    for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }                
                }  
               //JUGADOR 2
                
                for (int x=0;x<7;x++){
            Jugador2[x] = baraja[x];
          }
           System.out.println("______JUGADOR 2_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador2.length; x++){
                
                System.out.print(Jugador2[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
    for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }           
                }
                    for (int x=0;x<7;x++){
            Jugador3[x] = baraja[x];
          }
           System.out.println("______JUGADOR 3_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador3.length; x++){
                
                System.out.print(Jugador3[x]+" ");
            }
                System.out.println("");
                 rotado = baraja[0];
     for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }
     }
                    for (int x=0;x<7;x++){
            Jugador4[x] = baraja[x];
          }
           System.out.println("______JUGADOR 4_______");
                System.out.println("Sus cartas son: ");
            for(int x=0; x< Jugador4.length; x++){
                
                System.out.print(Jugador4[x]+" ");
            }
            
                System.out.println("");
                 rotado = baraja[0];
                 for(int y =0; y<=7;y++){
                for(int x = 1; x<=119 ;x++){
                    baraja[x-1] = baraja[x];
                    baraja[119] = rotado;
                    baraja[119] = -1;
                }
                }
                for(int x=0; x<baraja.length;x++){
              //  System.out.print(" "+baraja[x]);
                }           
                        break;
                    default :
                        System.out.println("No se eligio una opcion correcta");
        }
            
            
           
 
            
                       
                                  
                                             
                                                        
                                                                              
            
            break;
            //CON BOTS
            case 2:
                    for(int x=0; x < baraja.length; x++){
            baraja[x] = numeroAleatorio();
        }
        System.out.println("Se barajearan las cartas");
        for(int x= 0; x< 120 ;x++){
            System.out.print(baraja[x]);
        }
                System.out.println("");
            System.out.println("Se han barajeado las cartas");
    
    }
}
    public static int numeroAleatorio(){
        return (int)(Math.random()*9)+0;
    }
    
    public static void  bot(){
        
        
    }
}