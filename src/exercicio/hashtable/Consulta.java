/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.hashtable;

import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Lucas
 */
public class Consulta 
{
    public String NumConsulta;
    public String CodPaciente;
    public String CodMedico;
    public String DataConsulta;

    public Consulta() {
        UUID uuid = UUID.randomUUID();
        this.NumConsulta = uuid.toString().toUpperCase().substring(15, 18);
    }

    public void LeConsulta() {
        Scanner S = new Scanner(System.in);
        System.out.printf("Número da Consulta: %1$s\n", this.NumConsulta);
        System.out.print("Código do Paciente: ");
        this.CodPaciente = S.nextLine();
        System.out.print("Código do Médico: ");
        this.CodMedico = S.nextLine();
        System.out.print("Data da Consulta: ");
        this.DataConsulta = S.nextLine();
    }
}
