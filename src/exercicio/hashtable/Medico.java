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
public class Medico 
{
    
    public String CodMedico;
    public String Nome;
    public String Area;

    public Medico() {
        UUID uuid = UUID.randomUUID();
        this.CodMedico = uuid.toString().toUpperCase().substring(15, 18);
    }

    public void LeMedico() {
        Scanner S = new Scanner(System.in);
        System.out.printf("Código do Médico: %1$s%n", this.CodMedico);
        System.out.print("Nome do Médico: ");
        this.Nome = S.nextLine();
        System.out.println("");
        System.out.print("Area: ");
        this.Area = S.nextLine();
    }
}
