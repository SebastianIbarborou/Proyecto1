package uwu;


 


import java.util.ArrayList;


 


import java.util.List;


 


import java.util.Scanner;


 


public class Proyectito1 {


 


int where;


 


 


 


String Gerardo777;


 


 


 


String[] cedulita = new String[10];


 


 


 


String[] apicultores = new String[10];


 


 


 


String[] ciudades = new String[5];


 


 


 


String[] colmenaritos = new String[5];


 


 


 


double coXeY[] = new double[10];


 


 


 


double coXeY2[] = new double[10];


 


private List<CentroDeExtraccion> centros = new ArrayList<>();


 


private List<Tramo> tramos = new ArrayList<>();


 


private List<Colmenar> colmenas = new ArrayList<> ();


 


private Scanner scanner = new Scanner(System.in);


 


String ap1;


 


String ap2;


 


String ap3;


 


String ap4;


 


String ap5;


 


String ap6;


 


String ap7;


 


String ap8;


 


String ap9;


 


String ap10;


 


String marron = "\033[130;33m";


 


public static final String ANSI_RESET = "\u001B[0m";


 


public static final String ANSI_GREEN = "\u001B[31m";


 


public static final String ANSI_RED = "\u001B[32m";


 


public static final String ANSI_BLUE = "\u001B[34m";


 


Scanner tec = new Scanner(System.in);


 


Scanner tecint = new Scanner(System.in);











private double coordY;











private double coordX;


 


public void menuPrincipal() {


 


System.out.println(ANSI_BLUE + "1.Ir a Apicultor");

System.out.println("2. Ir a Ciudad");

System.out.println("3. Ir a Colmenar");

System.out.println("4. Ir a centros de Extraccion");

System.out.println("5. Ir a Tramo");

System.out.println("6. Ir a Estadistica " + ANSI_RESET);
  


int opcion = tec.nextInt();


 


switch (opcion) {


 


case 1:


 


menuApicultor();


 


break;


 


case 2:


 


menuCiudad();


 


break;


 


case 3:


 


Proyectito1 Colmenar = new Proyectito1();


 


menuColmenares();


 


break;


 


case 4:


 


Proyectito1 Extraccion = new Proyectito1();


 


menuExtraccion();


 


break;


 


case 5:


 


Proyectito1 Tramo = new Proyectito1();


 


menuTramos();


 


break;


 


case 6:


 


Proyectito1 Estadistica = new Proyectito1();


 


Estadistica.menuEstadistica();


case 7: 
	
	Proyectito1 colmenar = new Proyectito1(); 
	
	


break;


 


default:


 


System.out.println(ANSI_RED + "Error" + ANSI_RESET);


 


}


 


}


 


public static void main(String[] args) {


 


Proyectito1 fefo = new Proyectito1();


 


fefo.menuPrincipal();


 


}


 


public void listadoDeApicultores() {


 


if (ap1 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap1);


 


}


 


if (ap2 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap2);


 


}


 


if (ap3 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap3);


 


}


 


if (ap4 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap4);


 


}


 


if (ap5 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap5);


 


}


 


if (ap6 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap6);


 


}


 


if (ap7 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap7);


 


}


 


if (ap8 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap8);


 


}


 


if (ap9 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap9);


 


}


 


if (ap10 == null) {


 


System.out.println("no se ha logrado registrar al apicultor");


 


} else {


 


System.out.println(ap10);


 


}


 


}


 


public void registradoDeApicultores()


 


{


 


String cedula;


 


String nombre;


 


String direccion;


 


String ciudad;


 


String departamento;


 


String email;


 


String teléfono;


 


int anioDeRegistro;


 


do {


 


do {


 


System.out.println("Ingresar su nombre");


 


nombre = tec.nextLine();


 


} while (nombre.length() < 2);


 


do {


 


System.out.println("Ingrese su cedula");


 


cedula = tec.nextLine();


 


} while (cedula.length() < 8);


 


do {


 


System.out.println("Ingrese su email");


 


email = tec.nextLine();


 


} while (email.length() < 10);


 


do {


 


System.out.println("Ingresar Ciudad");


 


ciudad = tecint.nextLine();


 


} while (ciudad.length() < 3);


 


do {


 


System.out.println("Ingrese un numero de telefono");


 


teléfono = tecint.nextLine();


 


} while (teléfono.length() < 7);


 


do {


 


System.out.println("Ingrese el departamento en el cual se encuentra actualmente");


 


departamento = tecint.nextLine();


 


} while (departamento.length() < 5);


 


do {


 


System.out.println("Ingrese su direccion exacta actual");


 


direccion = tecint.nextLine();


 


} while (direccion.length() < 5);


 


do {


 


System.out.println("Ingrese su año de registro");


 


anioDeRegistro = tecint.nextInt();


 


} while (anioDeRegistro < 0);


 


System.out.println("Los datos se registraron correctamente");


 


if (ap1 == null)


 


ap1 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap2 == null)


 


ap2 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap3 == null)


 


ap3 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap4 == null)


 


ap4 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap5 == null)


 


ap5 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap6 == null)


 


ap6 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap7 == null)


 


ap7 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap8 == null)


 


ap8 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap9 == null)


 


ap9 = nombre + " " + cedula + " " + anioDeRegistro;


 


else if (ap10 == null)


 


ap10 = nombre + " " + cedula + " " + anioDeRegistro;


 


} while (ap2 == null || ap3 == null || ap4 == null || ap5 == null || ap6 == null || ap7 == null || ap8 == null


|| ap9 == null || ap10 == null);


 


}


 


public void menuApicultor() {


 


Proyectito1 juancitobr = new Proyectito1();


 


System.out.println(ANSI_BLUE + "1. Registrar Apicultor");


 


System.out.println("2. Mostrar Apicultores registrados");


 


System.out.println("3. Buscar Apicultor");


 


System.out.println("4. Regresar" + ANSI_RESET);


 


int opcion = tec.nextInt();


 


switch (opcion) {


 


case 1:


 


registradoDeApicultores();


 


listadoDeApicultores();


 


break;


 


case 2:


 


System.out.println("En construccion...");


 


juancitobr.menuPrincipal();


 


break;


 


case 3:


 


System.out.println("En construccion...");


 


juancitobr.menuPrincipal();


 


break;


 


case 4:


 


System.out.println("En construccion");


 


juancitobr.menuPrincipal();


 


break;


 


case 5:


 


System.out.println("En construccion...");


 


juancitobr.menuPrincipal();


 


break;


 


case 6:


 


System.out.println("En construccion...");


 


juancitobr.menuPrincipal();


 


break;


 


default:


 


System.out.println(ANSI_RED + "Error" + ANSI_RESET);


 


}


 


}


 
public void listadoDeColmenaresEnCiudad (double coordX,double coordY) {

	System.out.println ( "Listado de los colmenares que se encuentran en la ciudad)(" + coordX + "  " + coordY + " "); 
	
	for (Colmenar colmenar : colmenas) {
		
		double distancia = Math.sqrt (Math.pow(colmenar.coordX - coordY,2) + Math.pow(colmenar.coordY - coordY,2));
		
		if (distancia <= 20.0) {
			
			System.out.println ("coordenadas X:" + colmenar.coordX + " coordenadas Y" + colmenar.coordY);
			
		}
		
		
		
		
	}
}
 public void listadoDeCentros () {
	 
	 System.out.println ("Listados de centros de extraccion que han sido registrados exitosamente"); 
	 
	 for (CentroDeExtraccion centro : centros) {
		 System.out.println ("coordenadas X: " + centro.coordX + "coordenadas Y:" + centro.coordY + "Capacidad:" + centro.capacidad); 
	 }
 }


 


public void registrarCiudad() {


 


 


 


double coordX = 0;


 


 


 


double coordY = 0;


 


 


 


String nom;


 


 


 


int nada = 0;


 


 


 


do {


 


 


 


System.out.println("Registrar Ciudades");


 


 


 


 


for (int lugarcito = 0; lugarcito < ciudades.length; lugarcito++) {


 


 


 


if (ciudades[lugarcito] == null) {


 


 


 


do {


 


 


 


System.out.println(ANSI_BLUE + "Ingrese el nombre de la ciudad" + ANSI_RESET);


 


 


 


nom = tecint.nextLine();


 


 


 


if (nom.length() < 2) {


 


 


 


System.out.println(ANSI_RED + "ERROR: El nombre ingresado no es válido." + ANSI_RESET);


 


 


 


}


 


 


 


} while (nom.length() < 2);


 


 


 


do {


 


 


 


System.out.println(ANSI_BLUE + "Ingrese la coordenada X de la ciudad ha registrar" + ANSI_BLUE);


 


 


 


coordX = tec.nextDouble();


 


 


 


if (coordX < -180 || coordX > 180) {


 


 


 


System.out.println(ANSI_RED + "ERROR: La coordenada X ingresada no es válida." + ANSI_RESET);


 


 


 


}


 


 


 


} while (coordX < -180 || coordX > 180);


 


 


 


do {


 


 


 


System.out.println(ANSI_BLUE + "Ingrese la coordenada Y de la ciudad ha registrar" + ANSI_RESET);


 


 


 


coordY = tec.nextDouble();


 


 


 


if (coordY < -90 || coordY > 90) {


 


 


 


System.out.println(ANSI_RED + "ERROR: Ingrese una coordenada Y válida" + ANSI_RESET);


 


 


 


}


 


 


 


} while (coordY < -90 || coordY > 90);


 


 


 


for (int l = 0; l < coXeY.length; l = l + 2) {


 


 


 


if (Double.compare(coordX, coXeY[l]) == 0 && Double.compare(coordY, coXeY[l + 1]) == 0) {


 


 


 


nada = nada + 1;


 


 


 


if (nada == 10) {


 


 


 


System.out.println(ANSI_RED


 


 


 


+ "ERROR 1: Ya existe un punto en las coordenadas coordX, coordY del sistema."


 


 


 


+ ANSI_RESET);


 


 


 


}


 


 


 


} else if (Double.compare(coordX, coXeY[l]) != 0 && Double.compare(coordY, coXeY[l + 1]) != 0) {


 


 


 


if (coXeY[l] == 0 && coXeY[l + 1] == 0) {


 


 


 


coXeY[l] = coordX;


 


 


 


coXeY[l + 1] = coordY;


 


 


 


}


 


 


 


if (ciudades[lugarcito] == null) {


 


 


 


ciudades[lugarcito] = ("Nombre de la ciudad: " + nom + " Coordenadas: " + "X: "


 


 


 


+ coXeY[l] + " Y: " + coXeY[l + 1]);


 


 


 


}


 


 


 


}


 


 


 


}


 


 


 


} else if (ciudades[lugarcito] != null) {


 


 


 


System.out.println(marron + "Ya no hay espacio disponible para otra ciudad." + ANSI_RESET);


 


 


 


lugarcito = 4;


 


 


 


}


 


System.out.println("Ciudad registrada");


 


System.out.println("1- Salir del menu");


 


 


 


System.out.println("Cualquier otro número: Volver a registrar");


 


 


 


where = tec.nextInt();


 


if (where==1) {


 


menuPrincipal();


 


}


 


}


 


 


} while (where != 1);


 


 


 


}


 


 


 


 


public void menuCiudad() {


int opcion;


do {


System.out.println(ANSI_GREEN + "1.Registrar Ciudad");


 


System.out.println("2. Mostrar Ciudades registradas");


 


System.out.println("3.Buscar Ciudades");


 


System.out.println("4. Regresar" + ANSI_RESET);


 


Proyectito1 juancitobr = new Proyectito1();


opcion = tec.nextInt();


switch (opcion) {


 


case 1:


 


registrarCiudad();


 


break;


 


case 4:


 


menuPrincipal();


break;


}


 


} while (opcion != 4);


 


}


 


 


 


public void menuColmenares() {


 


int opcion;


do {


System.out.println(ANSI_BLUE + "1.Registrar colmenares");


 


System.out.println("2.Mostrar colmenares registrados");


 


System.out.println("3. Buscar colmenares");


 


System.out.println("4. Regresar" + ANSI_RESET);


 


Proyectito1 juancitobr = new Proyectito1();


 


opcion = tec.nextInt();


 


switch (opcion) {


 


case 1:


 


registrarTramo();


case 2: 


listadoDeColmenaresEnCiudad(coordY, coordX);





break;


 


case 4:


 


menuPrincipal();


 


}


 


} while (opcion != 4);


 


}


 


 


 


 


public void menuExtraccion() {


 


int opcion;


 


do {


 


System.out.println(ANSI_GREEN + "1. Registrar centros de extraccion");


 


System.out.println("2. Mostrar centros de extraccion registrados");


 


System.out.println("3.Buscar centros de extraccion");


 


System.out.println("4. Regresar" + ANSI_RESET);


 


Proyectito1 juancitobr = new Proyectito1();


 


opcion = tec.nextInt();


 


switch (opcion) {


 


case 1:


 


registrarCentroDeExtraccion();


case 2: 
	
	listadoDeCentros(); 


break;


 


case 4:


 


menuPrincipal();


 


}


 


} while (opcion != 4);


 


}


class Colmenar{


double coordX;


 


double coordY;


 


int capacidad;


 


public Colmenar (double coordX, double coordY, int capacidad) {


this.coordX = coordX;


 


this.coordY = coordY;


 


this.capacidad = capacidad;


}


 


public void add(Colmenar colmenas) {


// TODO Auto-generated method stub


 


}


}


 


class CentroDeExtraccion {


 


double coordX;


 


double coordY;


 


int capacidad;


 


public CentroDeExtraccion(double coordX, double coordY, int capacidad) {


 


this.coordX = coordX;


 


this.coordY = coordY;


 


this.capacidad = capacidad;


System.out.println("Centro de extracción registrado exitosamente.");

System.out.println("Ingresa [1] si deseas ir a otra sección por más información");

int opciones = tec.nextInt();

switch (opciones) {

case 1:

listadoDeCentros();

}


}


 


}


 


class Tramo {


 


double coordXInicial;


 


double coordYInicial;


 


double coordXFinal;


 


double coordYFinal;


 


int distancia;


 


public Tramo(double coordXInicial, double coordYInicial, double coordXFinal, double coordYFinal,


int distancia) {


 


this.coordXInicial = coordXInicial;


 


this.coordYInicial = coordYInicial;


 


this.coordXFinal = coordXFinal;


 


this.coordYFinal = coordYFinal;


 


this.distancia = distancia;


 


}


 


}


 


public void registrarColmenar() {


System.out.println("Ingrese la coordenada X del centro de extracción: ");


 


double coordX = scanner.nextDouble();


 


System.out.println("Ingrese la coordenada Y del centro de extracción: ");


 


double coordY = scanner.nextDouble();


 


System.out.println("Ingrese la capacidad de extracción en litros por mes: ");


 


int capacidad = scanner.nextInt();


 


Colmenar colmenas = new Colmenar(coordX, coordY, capacidad);


 


colmenas.add(colmenas);


 


System.out.println("Centro de extracción registrado exitosamente. ");


 


}


 


 


public void registrarCentroDeExtraccion() {


 


System.out.println("Ingrese la coordenada X del centro de extracción: ");


 


double coordX = scanner.nextDouble();


 


System.out.println("Ingrese la coordenada Y del centro de extracción: ");


 


double coordY = scanner.nextDouble();


 


System.out.println("Ingrese la capacidad de extracción de litros de miel por mes: ");


 


int capacidad = scanner.nextInt();


 


CentroDeExtraccion centro = new CentroDeExtraccion(coordX, coordY, capacidad);


 


centros.add(centro);


 


System.out.println("Centro de extracción ha sido registrado correctamente. ");


 


}


 


public void menuTramos() {


 


int opcion;


 


do {


 


System.out.println(ANSI_BLUE + "1. Registrar Tramo.");


 


System.out.println("2. Mostrar Tramos registrados por el usuario.");


 


System.out.println("3. Buscar Tramos ingresados por el usuario");


 


System.out.println(ANSI_RESET + "4. Regresar");


 


Proyectito1 juancitobr = new Proyectito1();


 


opcion = tec.nextInt();


 


switch (opcion) {


 


case 1:


 


registrarTramo();


 


break;


 


case 4:


 


menuPrincipal();


 


}


 


} while (opcion != 4);


 


}


 


public void registrarTramo() {


 


System.out.println("Ingrese la coordenada X inicial del tramo: ");


 


double coordXInicial = scanner.nextDouble();


 


System.out.println("Ingrese la coordenada Y inicial del tramo: ");


 


double coordYInicial = scanner.nextDouble();


 


System.out.println("Ingrese la coordenada X final del tramo: ");


 


double coordXFinal = scanner.nextDouble();


 


System.out.println("Ingrese la coordenada Y final del tramo: ");


 


double coordYFinal = scanner.nextDouble();


 


System.out.println("Ingrese la distancia del tramo: ");


 


int distancia = scanner.nextInt();


 


if (distancia <= 0) {


 


System.out.println("ERROR: La distancia debe ser mayor que 0. ");


 


return;


 


}


 


Tramo tramo = new Tramo(coordXInicial, coordYInicial, coordXFinal, coordYFinal, distancia);


 


for (Tramo existente : tramos) {


 


if ((existente.coordXInicial == coordXInicial && existente.coordYInicial == coordYInicial


 


&& existente.coordXFinal == coordXFinal && existente.coordYFinal == coordYFinal)


 


|| (existente.coordXInicial == coordXFinal && existente.coordYInicial == coordYFinal


 


&& existente.coordXFinal == coordXInicial && existente.coordYFinal == coordYInicial)) {


 


System.out.println("ERROR: Ya existe un tramo registrado entre estas coordenadas.");


 


return;


 


}


 


}


 


tramos.add(tramo);


 


System.out.println("OK: Tramo registrado exitosamente.");


 


}


 


public void menuEstadistica() {


 


System.out.println(ANSI_GREEN + "1. Registrar Estadisticas");


 


System.out.println("2. Mostrar Estadisticas registradas");


 


System.out.println("3. Buscar Estadisticas");


 


System.out.println(ANSI_RESET + "4. Regresar");


 


Proyectito1 juancitobr = new Proyectito1();


 


int opcion = tec.nextInt();


 


switch (opcion) {


 


case 1:


 


System.out.println ("En construccion... "); 

 


break;


 


case 2:


 


System.out.println("En construccion...");


 


System.out.println("Ingrese 4 para volver");


 


tec.nextInt();


 


case 4:


 


System.out.println("En construccion");


 


juancitobr.menuPrincipal();


 


tec.nextInt();


 


break;


 


case 3:


 


System.out.println("En construccion...");


 


tec.nextInt();


 


break;


 


case 5:


 


System.out.println("En construccion...");


 


tec.nextInt();


 


break;


 


case 6:


 


System.out.println("En construccion...");


 


tec.nextInt();


 


break;


 


default:


 


System.out.println(ANSI_RED + "Error" + ANSI_RESET);


 


}


 


}


 


}



