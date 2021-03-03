/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.hashtable;

import java.util.Hashtable;
import java.util.*;

/**
 *
 * @author Lucas
 */
public class Dados 
{
    
    public Hashtable CdMedico;
    public Hashtable CdPaciente;
    public Hashtable CdConsulta;

    public Dados()
    {
        CdMedico = new Hashtable();
        CdPaciente = new Hashtable();
        CdConsulta = new Hashtable();
    }

    public void GravaDados(Paciente x)
    {
        CdPaciente.put(x.CodPaciente, x);
    }

    public void GravaDados(Medico x)
    {
        CdMedico.put(x.CodMedico, x);
    }

    public void GravaDados(Consulta x) 
    {
        CdConsulta.put(x.NumConsulta, x);
    }
    
    public void ListaConsultas()
    {
        Set<String> SetOfConsulta = CdConsulta.keySet();
        for (String ChaveConsulta : SetOfConsulta) {
            Consulta xCon = (Consulta) CdConsulta.get(ChaveConsulta);
            System.out.printf("Número da Consulta: %1$s e Data: %2$s%n",
            xCon.NumConsulta, xCon.DataConsulta);
            Paciente xPac = (Paciente) CdPaciente.get(xCon.CodPaciente);
            System.out.printf("Paciente: %1$s%n", xPac.Nome);
            Medico xMed = (Medico) CdMedico.get(xCon.CodMedico);
            System.out.printf("Médico: %1$s%n%n", xMed.Nome);
        }
    }
}
