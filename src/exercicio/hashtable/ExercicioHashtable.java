/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.hashtable;

import java.awt.AWTException;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author Lucas
 */
public class ExercicioHashtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        Dados Cadastro = new Dados();
        
        Paciente MPaciente;
        Medico MMedico;
        Consulta MConsulta;
        
        do {
            ConsoleClear();
            MPaciente = new Paciente();
            MPaciente.LePaciente();
            Cadastro.GravaDados(MPaciente);
            
            System.out.print("\n Cadastrar outro Paciente? - Digite: (S/N)");
            
        } while (S.nextLine().toUpperCase().charAt(0) != 'N');
        
        ConsoleClear();
        
        do {
            ConsoleClear();
            MMedico = new Medico();
            MMedico.LeMedico();
            Cadastro.GravaDados(MMedico);
            System.out.print("\nDeseja cadastrar outro Médico? - Digite: (S/N)");
        } while (S.nextLine().toUpperCase().charAt(0) != 'N');
        
        ConsoleClear();
        
        do {
            ConsoleClear();
            MConsulta = new Consulta();
            MConsulta.LeConsulta();
            Cadastro.GravaDados(MConsulta);
            System.out.print("\nDeseja cadastrar outra Consulta? - Digite: (S/N)");
        } while (S.nextLine().toUpperCase().charAt(0) != 'N');
        
        ConsoleClear();
        
        Cadastro.ListaConsultas();
        
    }
    
        static void ConsoleClear() {
        try {
            Robot robot = new Robot();

            robot.setAutoDelay(5);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
