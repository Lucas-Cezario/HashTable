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
public class Paciente 
{
    public String CodPaciente;
    public String Nome;

    public Paciente()
    {
        UUID uuid = UUID.randomUUID();
        this.CodPaciente = uuid.toString().toUpperCase().substring(15, 18);
    }

    public void LePaciente()
    {
        Scanner S = new Scanner(System.in);
        System.out.printf("Código do Paciente: %1$s%n", this.CodPaciente);
        System.out.print("Nome do Paciente: ");
        this.Nome = S.nextLine();
    }
}
