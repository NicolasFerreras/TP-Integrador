package guia3;

public class Main {
    public static void main(String[] args) {

        Ciudadano myCiudadano = new Ciudadano("Ferreras", "Nicolas", 11, 3, 2005);
        Ciudadano myCiudadano2 = new Ciudadano("Lopez", "Martin", 28, 2, 2010);
        Ciudadano myCiudadano3 = new Ciudadano("Ferreyra", "Jose", 25, 9, 2008);
        Ciudadano myCiudadano4 = new Ciudadano("Ledesma", "Luz", 28, 6, 2007);


        System.out.println("Edad: " + myCiudadano.getEdad() + " Nombre: " + myCiudadano.nombre + " Apellido: " + myCiudadano.apellido + " Nacimiento: " + myCiudadano.nacimiento.getNacimiento());
        System.out.println("Edad: " + myCiudadano2.getEdad() + " Nombre: " + myCiudadano2.nombre + " Apellido: " + myCiudadano2.apellido + " Nacimiento: " + myCiudadano2.nacimiento.getNacimiento());
        System.out.println("Edad: " + myCiudadano3.getEdad() + " Nombre: " + myCiudadano3.nombre + " Apellido: " + myCiudadano3.apellido + " Nacimiento: " + myCiudadano3.nacimiento.getNacimiento());
        System.out.println("Edad: " + myCiudadano4.getEdad() + " Nombre: " + myCiudadano4.nombre + " Apellido: " + myCiudadano4.apellido + " Nacimiento: " + myCiudadano4.nacimiento.getNacimiento());

        //Para meter un espacio entre usuarios.
        System.out.println();

        System.out.println("El usuario " + myCiudadano.apellido + " desea realizar el tramite: " + myCiudadano.setTramitePrevio(Ciudadano.Tramite.ABRIR_EMPRESA));
        myCiudadano.setTramite(myCiudadano.tramite = Ciudadano.Tramite.ABRIR_EMPRESA);
        //Unicamente para comprobar que el setTramite funcione.
        System.out.println("Valor setTramite() " + myCiudadano.getTramite());
        //Para meter un espacio entre usuarios.
        System.out.println();

        System.out.println("El usuario " + myCiudadano2.apellido + " desea realizar el tramite: " + myCiudadano2.setTramitePrevio(Ciudadano.Tramite.REGISTRO_AUTO));
        myCiudadano2.setTramite(myCiudadano2.tramite = Ciudadano.Tramite.REGISTRO_AUTO);
        //Unicamente para comprobar que el setTramite funcione.
        System.out.println("Valor setTramite() " + myCiudadano2.getTramite());
        //Para meter un espacio entre usuarios.
        System.out.println();

        System.out.println("El usuario " + myCiudadano3.apellido + " desea realizar el tramite: " + myCiudadano3.setTramitePrevio(Ciudadano.Tramite.ABRIR_EMPRESA));
        myCiudadano3.setTramite(myCiudadano3.tramite = Ciudadano.Tramite.ABRIR_EMPRESA);
        //Unicamente para comprobar que el setTramite funcione.
        System.out.println("Valor setTramite() " + myCiudadano3.getTramite());
        //Para meter un espacio entre usuarios.
        System.out.println();

        System.out.println("El usuario " + myCiudadano4.apellido + " desea realizar el tramite: " + myCiudadano4.setTramitePrevio(Ciudadano.Tramite.ABRIR_EMPRESA));
        myCiudadano4.setTramite(myCiudadano4.tramite = Ciudadano.Tramite.ABRIR_EMPRESA);
        //Unicamente para comprobar que el setTramite funcione.
        System.out.println("Valor setTramite() " + myCiudadano4.getTramite());
        //Para meter un espacio entre usuarios.
        System.out.println();

        // PARA COMPROBAR SI FUNCIONA LA VALIDEZ DE LA FECHA
        //INGRESAMOS UN AÑO BISIESTO Y UNO NO, ADEMAS INGRESAMOS LA FECHA 0/0/0
        Ciudadano myCiudadano5 = new Ciudadano("Bisiesto", "Año", 29, 2, 2000);
        Ciudadano myCiudadano6 = new Ciudadano("No bisiesto", "Año", 29, 2, 2005);
        Ciudadano myCiudadano7 = new Ciudadano("CeroCeroCero", "Fecha", 0, 0, 0);

        System.out.println("El usuario " + myCiudadano5.apellido + " desea realizar el tramite: " + myCiudadano5.setTramitePrevio(Ciudadano.Tramite.ABRIR_EMPRESA));
        myCiudadano5.setTramite(myCiudadano5.tramite = Ciudadano.Tramite.ABRIR_EMPRESA);
        System.out.println("Valor setTramite() " + myCiudadano5.getTramite());
        System.out.println();
        System.out.println("El usuario " + myCiudadano6.apellido + " desea realizar el tramite: " + myCiudadano6.setTramitePrevio(Ciudadano.Tramite.ABRIR_EMPRESA));
        myCiudadano6.setTramite(myCiudadano6.tramite = Ciudadano.Tramite.ABRIR_EMPRESA);
        System.out.println("Valor setTramite() " + myCiudadano6.getTramite());
        System.out.println();
        System.out.println("El usuario " + myCiudadano7.apellido + " desea realizar el tramite: " + myCiudadano7.setTramitePrevio(Ciudadano.Tramite.ABRIR_EMPRESA));
        myCiudadano7.setTramite(myCiudadano7.tramite = Ciudadano.Tramite.ABRIR_EMPRESA);
        System.out.println("Valor setTramite() " + myCiudadano7.getTramite());


    }
}