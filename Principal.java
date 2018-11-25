package practica_1rtrimestre;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface Treballadors {
    int quantitat();
}

interface TotalTreballadors {
    int quantitat(int g, int e);
}

public class Principal {
	
	

	public static void main(String[] args) {
		
		Treballador g1 = new Gerent("Ivan","Fontclara","12345678W","Carrer 123",68916254,5000.101);
		Treballador g2 = new Gerent("Arnau","Elias","58493828R","Carrer 531",68135674,5000.100);
		Treballador g3 = new Gerent("María","López","64955644X","Carrer 321",680895671,2000.100);
		Treballador g4 = new Gerent("Alejandro","Montañés","88504962L","Carrer 513",684217115,1000.100);
		Treballador g5 = new Gerent("Marina","Barreiro","49669647C","Carrer 562",687686021,1230.500);
		Treballador g6 = new Gerent("Pedro","González","23684222H","Carrer 445",685687028,2000.300);
		Treballador g7 = new Gerent("Isabel","Navarro","30204870M","Carrer 908",684095616,2000.100);
		
		 Scanner scanadmin = new Scanner(System.in);
		 
		 System.out.println("Escogeix que vols saber");
         System.out.println("1- Total gerents");
         System.out.println("2- Total empleats");
         System.out.println("3- Total treballadors");
         System.out.println("4- Llistat de plantas");
         System.out.println("5- Pagar als gerents");
         System.out.println("6- Registrar correu");
         System.out.println("7- Pagar als empleats per ordre de llista ");
         System.out.println("8- Esbrinar si existeixen dos Pepes i 2 Marias ");
         System.out.println("9- Día de pagament dels gerents");
         System.out.println(".. -Salir ");
         
		int x= scanadmin.nextInt();
	switch(x){
	case 1:
		//USO DE LAMBDAS
		Treballadors gerents; 
        gerents=()->7; 
        System.out.println("Actualment de gerents al gym tenim: "+gerents.quantitat());
		
       break;
	
	case 2:
		//USO DE LAMBDAS
		Treballadors empleats; 
        empleats=()->28; 
        System.out.println("Actualment de empleats al gym tenim: "+empleats.quantitat());
        
        break;
        
	case 3:
		//USO DE LAMBDAS
		TotalTreballadors totals= (g,e)-> (g+e);
        System.out.println("Actualment de treballadors al gym tenim: "+totals.quantitat(7,28));
            
        break;
     
	case 4:
		//NUMERO DE PLANTA
				Sala sala1 = new SMaquina(1,"Sala 1",1);
				sala1.setCodiNum(NumPlanta.P1);
				Sala sala2 = new SMaquina(1,"Sala 2",2);
				sala1.setCodiNum(NumPlanta.P2);
				Sala sala3 = new SMaquina(1,"Sala 3",3);
				sala1.setCodiNum(NumPlanta.P3);
				Sala sala4 = new SMaquina(1,"Sala 4",4);
				sala1.setCodiNum(NumPlanta.P4);
				Sala sala5 = new SMaquina(1,"Sala 5",5);
				sala1.setCodiNum(NumPlanta.P5);
				
		break;
		
	case 5:
		//METODO TOSTRING
				
				System.out.println(g1.toString());
				System.out.println(g2.toString());
				System.out.println(g3.toString());
				System.out.println(g4.toString());
				System.out.println(g5.toString());
				System.out.println(g6.toString());
				System.out.println(g7.toString());
		break;
		
	case 6:
		//EXPRESIÓN REGULAR CORREO 
		Scanner sc = new Scanner(System.in);
	       String email;
	       System.out.print("Introdueix email: ");
	       email = sc.nextLine();
	       Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	       Matcher mat = pat.matcher(email);
	       if(mat.find()){
	          System.out.println("Correu Registrat");
	       }else{
	          System.out.println("Correu No Vàlid");
	     }
	    break;
	case 7:
		// ESTRUCTURA DE DADES DINÀMICA
		ArrayList<Treballador> treballadors = new ArrayList<Treballador>();
		treballadors.add(new Empleat("Hector", "Zeto", "27164902Q", "Calle 123",689493,1000.101));
		treballadors.add(new Empleat("Aaron", "Yolo", "63038890F", "Calle 567", 689493,1000.101));
		treballadors.add(new Empleat("Albert", "Navas", "34386054L", "Calle 556",689493,1000.101));
		treballadors.add(new Empleat("Pepe", "Blázquez", "05760496P", "Calle 111",689493,1000.101));
		treballadors.add(new Empleat("Pepe", "Vázquez", "07107542J", "Calle 116",689493,1000.101));
		treballadors.add(new Empleat("José", "Montoro", "99019054Y", "Calle 326",689493,1000.101));
		treballadors.add(new Empleat("Ramón", "Loperas", "13310383F", "Calle 356",689493,1000.101));
		treballadors.add(new Empleat("Juan", "Cuenca", "69404653Z", "Calle 356",689493,1000.101));
		treballadors.add(new Empleat("Carlos", "Jiménez", "70159183Y", "Calle 358",689493,1000.101));
		treballadors.add(new Empleat("Jorge", "Guzmán", "06098824Y", "Calle 376",689493,1000.101));
		treballadors.add(new Empleat("Pilar", "Ramírez", "28787972E", "Calle 356",689493,1000.101));
		treballadors.add(new Empleat("Enrique", "Gómez", "99440880N", "Calle 996",689493,1000.101));
		treballadors.add(new Empleat("Manuel", "García", "95326557K", "Calle 888",689493,1000.101));
		treballadors.add(new Empleat("Rocío", "Romero", "16176538V", "Calle 356",689493,1000.101));
		
		Collections.sort(treballadors);
		
		System.out.println("ARRAY AUTORS ORDENAT");
		for(int i=0; i<treballadors.size(); i++)
			System.out.println(treballadors.get(i));
	break;
	
	case 8:
		//COMPARAR EMPLEADOS TIENEN MISMO NOMBRE
		Empleat e1 = new Empleat("Pepe", null, null, null, 0, 0);
		Empleat e2 = new Empleat("Pepe", null, null, null, 0, 0);
		
		System.out.println(e1.equals(e2));
		
		Empleat e3 = new Empleat("Maria", null, null, null, 0, 0);
		Empleat e4 = new Empleat("Carla", null, null, null, 0, 0);
		
		System.out.println(e3.equals(e4));
	break;
	
	case 9:
		//QUE DIA COBRAN LOS GERENTES
		
		Gerent.diadepago();
		break;
		
	default: System.out.println ("Gràcies per utilitzar el menú"); break;
	}
	
		
		
		
				
		
			       
	      
	}
	
	
}
