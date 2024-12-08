public class Prueba {
    public static void main(String[] args) {
        Olimpiada brasil2016 = new Olimpiada();
        Pais ecuador =  new Pais("Ecuador");


        Medalla oro = new Medalla(TipoMedalla.ORO);
        Medalla plata = new Medalla(TipoMedalla.PLATA);
        Medalla bronce = new Medalla(TipoMedalla.BRONCE);



        Deporte atletismo = new Deporte("Atletismo");
        Deporte remo = new Deporte("Remo");
        Deporte ciclismoBmx = new Deporte("Ciclismo BMX");
        Deporte ciclismoRuta = new Deporte("Ciclismo en Ruta");
        Deporte futbol = new Deporte("Futbol");
        Deporte hockey = new Deporte("Hockey");
        Deporte rugby = new Deporte("Rugby");
        Deporte pentatlon = new Deporte("Pentatlon");


        // Atletas individuales
        Participante florenciaBorelli = new Atleta("Florencia Borelli", atletismo);
        Participante daianaOcampo = new Atleta("Daiana Ocampo", atletismo);
        Participante elianLarregina = new Atleta("Elian Larregina", atletismo);

        florenciaBorelli.asignarMedallaoORO(oro);
        daianaOcampo.cantMedallasPlata();
        daianaOcampo.cantMedallasBronce();


        Participante carla = new Atleta("Carla", atletismo);
        Participante andres = new Atleta("Andres", atletismo);
        Participante juan = new Atleta("Juan", atletismo);

        carla.asignarMedallaoORO(oro);
        andres.asignarMedallaoORO(oro);
        juan.asignarMedallaoORO(oro);

        // Equipos
        Equipo escaloneta = new Equipo("Seleccion Argentina de Futbol", futbol);
        escaloneta.agregarIntegrante(new Atleta("Javier Mascherano", futbol));
        // TODO: Agregar al resto de los integrantes del equipo

        Participante losPumas = new Equipo("Seleccion Argentina de Rubgy", rugby);
        Participante leonas = new Equipo("Seleccion Argentina de Hockey femenino", hockey);


        // Agregar equipos y atletas.
        Pais argentina = new Pais("Argentina");
        argentina.agregarParticipante(florenciaBorelli);
        argentina.agregarParticipante(daianaOcampo);
        argentina.agregarParticipante(elianLarregina);

        Pais francia = new Pais("Francia");
        francia.agregarParticipante(carla);
        francia.agregarParticipante(andres);
        francia.agregarParticipante(juan);


        // Organizar Olimpiada
        Olimpiada paris2024 = new Olimpiada();
        paris2024.agregarDeporte(atletismo);
        paris2024.agregarDeporte(remo);
        paris2024.agregarDeporte(ciclismoBmx);
        paris2024.agregarDeporte(ciclismoRuta);
        paris2024.agregarDeporte(futbol);
        paris2024.agregarDeporte(hockey);
        paris2024.agregarDeporte(rugby);
        paris2024.agregarDeporte(pentatlon);

        paris2024.agregarPais(argentina);
        paris2024.agregarPais(francia);

        brasil2016.agregarPais(argentina);
        brasil2016.agregarPais(ecuador);
        brasil2016.agregarPais(francia);

        System.out.println("CANT ATLETAS ECUADOR: "+ecuador.cantAtletas());
        System.out.println("CANT ATLETAS argentina: "+ecuador.cantAtletas());argentina.cantAtletas();
        System.out.println("CANT ATLETAS francia: "+ecuador.cantAtletas());francia.cantAtletas();


        System.out.println("cant medallas oro ecuador en brasil 2016 "+paris2024.obtenerCantOroPorPais(ecuador,oro));
        System.out.println("cant medallas plata ecuador en brasil 2016 "+paris2024.obtenerCantOroPorPais(ecuador,plata));
        System.out.println(("cant medallas bronce ecuador en brasil 2016 "+paris2024.obtenerCantOroPorPais(ecuador,bronce)));

        System.out.println("pais con mas medallas en olimpiada brasil: "+brasil2016.obtenerPaisConMasMedallas());

        System.out.println("Que pais tiene mas medallas entre ecuador y francia en olimpiadas brasil"+ brasil2016.compararPaisesPorMasMedallero(ecuador,francia));
        System.out.println("cant total de medallas "+ brasil2016.obtenerCantTotalMedallas());

        System.out.println("cant medallas oro ecuador en paris 2024 "+paris2024.obtenerCantOroPorPais(ecuador,oro));
        System.out.println("cant medallas plata ecuador en paris 2024 "+paris2024.obtenerCantOroPorPais(ecuador,plata));
        System.out.println(("cant medallas bronce ecuador en paris 2024 "+paris2024.obtenerCantOroPorPais(ecuador,bronce)));

        System.out.println(brasil2016.obtenerPaisConMasMedallas());

        System.out.println(paris2024.compararPaisesPorMasMedallero(argentina,francia));
        System.out.println(paris2024.obtenerCantTotalMedallas());



    }
}