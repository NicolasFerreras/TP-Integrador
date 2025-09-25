package guia3;

import java.time.Year;

public class Ciudadano {
    String apellido;
    String nombre;
    Fecha nacimiento;
    Tramite tramite;
    public Ciudadano(String apellido, String nombre, int dia, int mes, int año) {
        this.nacimiento = new Fecha(dia, mes, año);
        this.apellido = apellido;
        this.nombre = nombre;
        this.tramite = Tramite.NINGUNO;
    }
    enum Tramite {
        NINGUNO,
        DOCUMENTO,
        REGISTRO_AUTO,
        ABRIR_EMPRESA
    }
    public int getEdad() {
        return nacimiento.distanciaEnAnios(this.nacimiento);
    }
    static class Fecha {
        int dia;
         int mes;
         int año;
         //No se pedia en el ejercicio pero
         //me gustaria que solo se puedan ingresar fechas validas. Me robo el ejercicio hecho previamente en otra guia pero lo reestructuro un poco.
        boolean esValida = false;

    //Constructor para inicializar variables.
         public Fecha(int dia, int mes, int año) {


             if (mes < 1 || mes > 12) {
                 this.esValida = false;
             } else if (dia < 1 || dia > 31) {
                 this.esValida = false;
             } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                 this.esValida = (dia <= 30);
                  this.mes = mes;
                this.dia = dia;
             } else if (mes == 2) {
                 boolean esBisiesto = Year.isLeap(año); //Aca es donde reestcuturo, conoci ese metodo. Reemplace la formula (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)).
                 if (esBisiesto) {
                     this.esValida = (dia <= 29);
                      this.mes = mes;
                    this.dia = dia;
                 } else {
                     this.esValida = (dia <= 28);
                      this.mes = mes;
                this.dia = dia;
                 }
             } else {
                 this.esValida = true;
                  this.mes = mes;
                this.dia = dia;
             }
             this.año = año;
         }
            //Getters y setters.
         public int getDia() {
             return this.dia;
         }
        public int getMes() {
             return this.mes;
         }
        public int getAño() {
             return this.año;
        }
        public String getNacimiento() {
            return (this.dia + "/" + this.mes + "/" + this.año);
        }
        public boolean getValidez() {
             return this.esValida;
        }

        // Metodo par devolver la fecha de hoy fija.
        public static Fecha hoy() {
             return new Fecha(25, 9, 2025);

        }

        public int distanciaEnAnios(Fecha nuevaFecha) {
             int años = 0;
             if (getValidez()) {
                 if (nuevaFecha.getAño() > hoy().getAño()) {
                     años = nuevaFecha.getAño() - hoy().getAño();
                 } else {
                     años = hoy().getAño() - nuevaFecha.getAño();
                 }
                 if (nuevaFecha.getMes() > hoy().getMes() || (hoy().getMes() == nuevaFecha.getMes() && hoy().getDia() > nuevaFecha.getDia())) {
                     años--;
                 }
             } else {
                 System.out.println("Fecha no valida.");
             }
            return años;
        }
    }
    //metodo setTramite()

    public Tramite getTramite() {
        return this.tramite;
    }
    public void setTramite(Tramite tramite) {

        switch (getTramite()) {
            case REGISTRO_AUTO:
                if (getEdad() >= 16) {
                    System.out.println("El usuario puede realizar el tramite " + getTramite());
                    this.tramite = Tramite.REGISTRO_AUTO;

                } else {
                    System.out.println("No es posible realizar el tramite " + getTramite());
                    this.tramite = Tramite.NINGUNO;

                }
                break;
            case ABRIR_EMPRESA:
                if (getEdad() >= 18) {
                    System.out.println("El usuario puede realizar el tramite " + getTramite());
                    this.tramite = Tramite.ABRIR_EMPRESA;

                } else {
                    System.out.println("No es posible realizar el tramite " + getTramite());
                    this.tramite = Tramite.NINGUNO;

                }
                break;
            default:
                this.tramite = Tramite.NINGUNO;
        }
    }
    //Para no perder el valor del tramite previo.
    public Tramite setTramitePrevio(Tramite tramite) {
        return tramite;
    }
}

