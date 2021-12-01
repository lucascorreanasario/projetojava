package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import entities.Atacante;
import entities.Defensor;
import entities.EventoPartida;
import entities.GerenciadorDePartidaImplementacao;
import entities.Goleiro;
import entities.MeioCampista;
import entities.Partida;
import entities.TipoEvento;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		GerenciadorDePartidaImplementacao jogo = new GerenciadorDePartidaImplementacao();
		Partida partida1 = jogo.iniciaPartida(sdf.parse("23/10/2021"),"Vasco", new ArrayList<>());
		
		Goleiro goleiro = new Goleiro();
		
		goleiro.setNumeroCamisa(1);
		goleiro.setNome("Diego Alves");
		goleiro.setSalarioMensal(50000.00);
		goleiro.setDataAdmissaoClube(sdf.parse("23/05/2017"));
		goleiro.setNumCartoesAmarelos(3);
		goleiro.setNumCartaoVermelhos(0);
		goleiro.setFaltasCometidas(1);
		goleiro.setPartidasSemSofrerGol(4);		
		goleiro.setRoubadasDeBola(6);
		goleiro.setDefesas(10);
		partida1.getAtletasEscalados().add(goleiro);
		
		Defensor defensor1 = new Defensor();
		partida1.getAtletasEscalados().add(defensor1);
		
		defensor1.setNumeroCamisa(23);
		defensor1.setNome("David Luiz");
		defensor1.setSalarioMensal(70000.00);
		defensor1.setDataAdmissaoClube(sdf.parse("24/07/2018"));
		defensor1.setNumCartoesAmarelos(5);
		defensor1.setNumCartaoVermelhos(1);
		defensor1.setFaltasCometidas(2);
		defensor1.setPartidasSemSofrerGol(5);		
		defensor1.setRoubadasDeBola(7);
		
		Defensor defensor2 = new Defensor();
		partida1.getAtletasEscalados().add(defensor2);
		
		defensor2.setNumeroCamisa(3);
		defensor2.setNome("Rodrigo Caio");
		defensor2.setSalarioMensal(8000.00);
		defensor2.setDataAdmissaoClube(sdf.parse("25/02/2019"));
		defensor2.setNumCartoesAmarelos(5);
		defensor2.setNumCartaoVermelhos(0);
		defensor2.setFaltasCometidas(2);
		defensor2.setPartidasSemSofrerGol(5);		
		defensor2.setRoubadasDeBola(5);
		
		Defensor defensor3 = new Defensor();
		partida1.getAtletasEscalados().add(defensor3);
		
		defensor3.setNumeroCamisa(20);
		defensor3.setNome("Rodinei Almeida");
		defensor3.setSalarioMensal(8500.00);
		defensor3.setDataAdmissaoClube(sdf.parse("22/01/2018"));
		defensor3.setNumCartoesAmarelos(7);
		defensor3.setNumCartaoVermelhos(2);
		defensor3.setFaltasCometidas(2);
		defensor3.setPartidasSemSofrerGol(5);		
		defensor3.setRoubadasDeBola(7);
		
		Defensor defensor4 = new Defensor();
		partida1.getAtletasEscalados().add(defensor4);
		
		defensor4.setNumeroCamisa(34);
		defensor4.setNome("Matheus Silva");
		defensor4.setSalarioMensal(9000.00);
		defensor4.setDataAdmissaoClube(sdf.parse("12/11/2018"));
		defensor4.setNumCartoesAmarelos(4);
		defensor4.setNumCartaoVermelhos(1);
		defensor4.setFaltasCometidas(2);
		defensor4.setPartidasSemSofrerGol(5);		
		defensor4.setRoubadasDeBola(10);
		
		MeioCampista meioCampista1 = new MeioCampista();
		partida1.getAtletasEscalados().add(meioCampista1);
		
		meioCampista1.setNumeroCamisa(8);
		meioCampista1.setNome("Thiago Maia");
		meioCampista1.setSalarioMensal(10000.00);
		meioCampista1.setDataAdmissaoClube(sdf.parse("01/01/2021"));
		meioCampista1.setNumCartoesAmarelos(0);
		meioCampista1.setNumCartaoVermelhos(0);
		meioCampista1.setFaltasCometidas(2);
		meioCampista1.setAssitencias(15);
		meioCampista1.setPasses(30);
		meioCampista1.setPassesErrados(20);
		
		MeioCampista meioCampista2 = new MeioCampista();
		partida1.getAtletasEscalados().add(meioCampista2);
		
		meioCampista2.setNumeroCamisa(5);
		meioCampista2.setNome("Willian Arao");
		meioCampista2.setSalarioMensal(9565.00);
		meioCampista2.setDataAdmissaoClube(sdf.parse("02/12/2017"));
		meioCampista2.setNumCartoesAmarelos(4);
		meioCampista2.setNumCartaoVermelhos(0);
		meioCampista2.setFaltasCometidas(2);
		meioCampista2.setAssitencias(15);
		meioCampista2.setPasses(20);
		meioCampista2.setPassesErrados(30);
		
		MeioCampista meioCampista3 = new MeioCampista();
		partida1.getAtletasEscalados().add(meioCampista3);
		
		meioCampista3.setNumeroCamisa(7);
		meioCampista3.setNome("Everton Ribeiro");
		meioCampista3.setSalarioMensal(80000.00);
		meioCampista3.setDataAdmissaoClube(sdf.parse("12/12/2016"));
		meioCampista3.setNumCartoesAmarelos(1);
		meioCampista3.setNumCartaoVermelhos(0);
		meioCampista3.setFaltasCometidas(2);
		meioCampista3.setAssitencias(15);
		meioCampista3.setPasses(31);
		meioCampista3.setPassesErrados(21);
		
		MeioCampista meioCampista4 = new MeioCampista();
		partida1.getAtletasEscalados().add(meioCampista4);
		
		meioCampista4.setNumeroCamisa(99);
		meioCampista4.setNome("Diego Ribas da Cunha");
		meioCampista4.setSalarioMensal(9600.00);
		meioCampista4.setDataAdmissaoClube(sdf.parse("19/09/2019"));
		meioCampista4.setNumCartoesAmarelos(5);
		meioCampista4.setNumCartaoVermelhos(0);
		meioCampista4.setFaltasCometidas(3);
		meioCampista4.setAssitencias(16);
		meioCampista4.setPasses(34);
		meioCampista4.setPassesErrados(29);
		
		Atacante atacante1 = new Atacante();
		partida1.getAtletasEscalados().add(atacante1);
		
		atacante1.setNumeroCamisa(9);
		atacante1.setNome("Gabriel Barbosa");
		atacante1.setSalarioMensal(12000.00);
		atacante1.setDataAdmissaoClube(sdf.parse("08/08/2018"));
		atacante1.setNumCartoesAmarelos(4);
		atacante1.setNumCartaoVermelhos(1);
		atacante1.setFaltasCometidas(2);
		atacante1.setAssitencias(15);
		atacante1.setPasses(30);
		atacante1.setPassesErrados(20);
		atacante1.setGols(2);
		atacante1.setFinalizacoes(10);
		
		Atacante atacante2 = new Atacante();
		partida1.getAtletasEscalados().add(atacante2);
		
		atacante2.setNumeroCamisa(27);
		atacante2.setNome("Bruno Henrique");
		atacante2.setSalarioMensal(13000.00);
		atacante2.setDataAdmissaoClube(sdf.parse("31/04/2021"));
		atacante2.setNumCartoesAmarelos(4);
		atacante2.setNumCartaoVermelhos(1);
		atacante2.setFaltasCometidas(2);
		atacante2.setAssitencias(15);
		atacante2.setPasses(30);
		atacante2.setPassesErrados(20);
		atacante2.setGols(3);
		atacante2.setFinalizacoes(15);
		
		EventoPartida evento1 = jogo.registrarEvento(partida1, TipoEvento.FALTA_COMETIDA, 9);	
		partida1.getEventos().add(evento1);
		
		EventoPartida evento2 = jogo.registrarEvento(partida1, TipoEvento.FALTA_COMETIDA, 1);	
		partida1.getEventos().add(evento2);
		
		EventoPartida evento3 = jogo.registrarEvento(partida1, TipoEvento.CARTAO_VERMELHO, 1);	
		partida1.getEventos().add(evento3);
		
		
		jogo.imprimirEstatisticas(partida1.getAtletasEscalados());
	
		

	}
}