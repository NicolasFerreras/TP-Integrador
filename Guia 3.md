### Ejercicios
---
 * **Ejercicio 1 - Clase persona**
  
```java
package guia_3;

public class Main {
    public static void main(String[] args) {
    Persona myPersona = new Persona("Nicolas", 21);
    Persona myPersona2 = new Persona("Nico", 20);

    Persona.saludar(myPersona);
    Persona.saludar(myPersona2);


    }
}

class Persona {
     String nombre;
     int edad;

   public Persona(String name, int e) {
        nombre = name;
        edad = e;
    }

   static void saludar(Persona p) {
        System.out.println("Mi nombre es " + p.nombre + " y mi edad es " + p.edad);
    }

}
```

### Ejercicio 2 - Coche

```java

package guia_3;

public class Main {
    public static void main(String[] args) {
        Coche myCoche = new Coche();
        myCoche.año = 2000;
        myCoche.modelo = "Escort";
        myCoche.marca = "Ford";
        myCoche.cambiarVelocidad(20);;

        myCoche.mostrarInfo(myCoche.marca, myCoche.modelo, myCoche.año);
        System.out.println(myCoche.getVelocidad());
    }
}
package guia_3;

public class Coche {
        String marca;
        String modelo;
        int año;
        int velocidad = 0;

        void mostrarInfo(String marca, String modelo, int año){
            System.out.println(marca + " " + modelo + " " + año);
        }

        public void cambiarVelocidad(int delta){
            velocidad += delta;
        }

        public int getVelocidad() {
            return  velocidad;
        }
    }


```
# Ejercicio 3 - Rectangulo

```java
package guia_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un ancho");
        var ancho = sc.nextInt();
        System.out.println("Ingresa un largo");
        var largo = sc.nextInt();

        Rectangulo myPerimetro = new Rectangulo(ancho, largo);
        Rectangulo myArea = new Rectangulo(ancho, largo); 
        
        System.out.println(myArea.calcularArea());
        System.out.println(myPerimetro.calcularPerimetro());
       
       
        
        sc.close();
    }
}

    package guia_3;

public class Rectangulo {

        int ancho;
        int largo;

        Rectangulo(int ancho, int largo) {
            this.ancho = ancho;
            this.largo = largo;

        }
        int calcularArea(){
            return this.ancho * this.largo;
        }

         int calcularPerimetro(){
            return (this.ancho + this.largo) * 2;
        }
         
    }



```

# Ejercicio 4 - CuentaBancaria
```java
package guia3;

public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria myCuenta = new CuentaBancaria();
        CuentaBancaria myCuenta2 = new CuentaBancaria();
        CuentaBancaria myCuenta3 = new CuentaBancaria();
        
        myCuenta.saldo = 650;
        myCuenta.titular = "Nicolas";

        myCuenta2.saldo = 1000;
        myCuenta2.titular = "Mateo";

        myCuenta3.saldo = 300;
        myCuenta.titular = "Jose";

        myCuenta.depositar(800);
        myCuenta.mostrarSaldo();

        myCuenta2.retirar(200);
        myCuenta2.mostrarSaldo();

        myCuenta3.retirar(400);
        myCuenta3.mostrarSaldo();
        
    }
}

    package guia3;

 public class CuentaBancaria {

       String titular;
       int saldo;
       

       double depositar(double monto) {
            saldo += monto;
            return saldo;
       }

        
       boolean alcanza = true;
       double retirar (double monto) {
        
            if (saldo >= monto) {
                saldo -= monto;
               alcanza = true;
                System.out.println("Saldo suficiente");
                
            } else {
                alcanza = false;
                System.out.println("Saldo insuficiente");
            }
            return saldo;
       }
       void mostrarSaldo() {
        System.out.println("Su saldo es de: " + saldo);
       }
    }



```
# Ejercicio 5 - Libros

```java
package guia3;

public class Main {
    public static void main(String[] args) {
        
        Libros myLibro = new Libros("La noche", "Nicolas", 2006);
        Libros myLibro2 = new Libros("El dia", "Luz", 2003);

        myLibro.mostrarDatos();
        myLibro2.mostrarDatos();
        
    }
}

    package guia3;

 public class Libros {
        String titulo;
        String autor;
        int año;

     public Libros(String titulo, String autor, int año) {
                this.titulo = titulo;
                this.autor = autor;
                this.año = año;
    }

        void mostrarDatos() {
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.println("Año: " + this.año);

        }
 }



```

# Ejercicio 6 - Peliculas

```java
package guia3;

public class Main {
    public static void main(String[] args) {
        
        Pelicula myPelicula = new Pelicula("La noche", "Nicolas", 200);
        Pelicula myPelicula2 = new Pelicula("El dia", "Luz", 110);

        myPelicula.mostrarDatos();
        myPelicula2.mostrarDatos();
        myPelicula.esLarga();
        myPelicula2.esLarga();
        
    }
}

    package guia3;

 public class Pelicula {
        String titulo;
        String director;
        int duracion;

      Pelicula(String titulo, String director, int duracion) {
                this.titulo = titulo;
                this.director = director;
                this.duracion = duracion;
    }

        void mostrarDatos() {
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Autor: " + this.director);
            System.out.println("Duracion: " + this.duracion);
            System.out.println();
        }

         void esLarga() {
            if (duracion > 120) {
                boolean duracionPelicula = true;
                System.out.println("La pelicula es larga, dura " + duracionPelicula);
                
            } else {
                boolean duracionPelicula = false;
                System.out.println("La pelicula no es larga, dura " + duracionPelicula);
                
            }
        }
 }



```


# Ejercicio 7 - Estudiantes

```java
package guia3;

public class Main {
    public static void main(String[] args) {
        
        Estudiante myEstudiante = new  Estudiante();
        Estudiante myEstudiante2 = new Estudiante();

        myEstudiante.nota1 = 10;
        myEstudiante.nota2 = 7;
        myEstudiante.nota3 = 5;
        myEstudiante.nombre = "Nico";

        myEstudiante2.nota1 = 1;
        myEstudiante2.nota2 = 5;
        myEstudiante2.nota3 = 2;
        myEstudiante2.nombre = "Nicolas";

        myEstudiante.promedio();
        myEstudiante2.promedio();
    }
}

    package guia3;

 public class Estudiante {
        String nombre;
        double nota1, nota2, nota3;

        double promedio() {
              double promedioEstudiante = (nota1 + nota2 + nota3) / 3;
              System.out.println("El promedio de " + nombre + " es de: " + promedioEstudiante);
             return promedioEstudiante;
        }

}
 




```

