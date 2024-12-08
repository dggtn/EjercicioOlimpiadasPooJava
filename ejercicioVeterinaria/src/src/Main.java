//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Dani es un MedicoVeterinario
        //Ale es un Asistente

       Medicoveterinario dani = new Medicoveterinario("dani");
        Asistente ale = new Asistente("ale");
        
        Veterinaria veterinaria = new Veterinaria("Dame la pata");
        veterinaria.agregarMedicoVeterinario(dani);
        veterinaria.agregarAsistente(ale);

        Animal boaLoca = new Boa("Boa la Loca");
        veterinaria.atender(boaLoca);

//Deberia mosstrar:
      /*/  Se atendio a Boa la Loca.
        Recibio un cheque general por parte de:
        Dani
        Recibio el cuidado Alimentacion por parte de Ale/*/


        Animal negrita = new Gato("Negrita");
        veterinaria.atender(negrita);
//Deberia mosstrar:
       /*/ Se atendio a Negrita.
        Recibio un cheque general por parte de:
        Dani
        Recibio el cuidado Alimentacion por parte de Ale
        Recibio el cuidado Cepillado por parte de Ale/*/
    }
}