package br.edu.univas.main;

import java.util.*;
import br.edu.univas.vo.*;

public class StartApp {

	static Scanner ler = new Scanner(System.in);
	static ArrayList<Aluno> alunos = new ArrayList<>();
	static boolean nivel;
	
	public static void main(String[] args) {
		
		boolean control = true;
		int option;
		
		do {
			
			menu();
			option = scanInt();
			
			switch (option) {
				
				case 1:
					
					addAluno();
					
					break;
				case 2:
					nivel = true;
					System.out.println("Lista dos alunos de pós-graduação: ");
					printAluno();
					System.out.println("\n\n");
					
					break;
				case 3:
					nivel = false;
					System.out.println("Lista dos alunos de Mestrado: ");
					printAluno();
					System.out.println("\n\n");
					break;
					
				case 5:
					
					for (int i = 0;i < alunos.size() ;i++) {
						
						System.out.println(alunos.get(i));
						
					}
				
					break;
			
				case 9:
						
						System.out.println("Até mais...");
						control = false;
					
					break;
					
				default:
					
					System.out.println("Opção invalida, tente novamente!!!");
					
					break;
			
			}
			
			
			
		} while (control);
		
		
		
	}

	public static void menu() {
		
		System.out.println("#######################");
		System.out.println("## Cadastro de Aluno ##");
		System.out.println("####################### \n\n");
		System.out.println("1- Cadastrar Aluno ");
		System.out.println("2- Listar alunos Pós-graduação ");
		System.out.println("3- Listar alunos Mestrado");
		System.out.println("9- Sair");
		
	}
	
	public static int scanInt() {
		
		int value = ler.nextInt();
		ler.nextLine();
		
		return value;
	}
	
	public static void addAluno() {
		
		Mestrado m1 = new Mestrado();
		PosGraduacao p1 = new PosGraduacao();
		boolean control = true, control2 = false;
		int option;
		
		do {
		
		System.out.println("Você deseja adicionar um aluno de 'Mestrado' ou Pós 'Graduação'? ");
		System.out.println("1- Mestrado.");
		System.out.println("2- Pós Graduação.");
		option = scanInt();
		
		if (option == 1 || option == 2) {
			
			control = false;
			
		} else {
			
			System.out.println("Opção inavalida, tente novamente!!!");
			
		}
		
		} while (control);
		
		if (option == 1) {
			
			System.out.println("Digite o nome do aluno de mestrado:");
			m1.setNome(ler.nextLine());
			
			System.out.println("Agora digite o número de CPF do aluno:");
			m1.setCpf(scanInt());
			
			System.out.println("Por fim, digite o email desse aluno:");
			m1.setEmail(ler.nextLine());
			
			Aluno m2;
			if (alunos.isEmpty()) {
				
				System.out.println("Aluno adicionado!!!");
				alunos.add(m1);
				
			} else {
				
				for(int i = 0;i < alunos.size();i++) {
					
					m2 = alunos.get(i);
					if (m1.equals(m2)) {
						
						System.out.println("Este Aluno já está cadastrado");
						break;
						
					}
					
				}
				
				System.out.println("Aluno adicionado!!!");
				alunos.add(m1);
				
				
			}
			
			
			
			
			
		} else {
			
			System.out.println("Digite o nome do aluno de pós-graduação:");
			p1.setNome(ler.nextLine());
			
			System.out.println("Agora digite o número de CPF do aluno:");
			p1.setCpf(scanInt());
			
			System.out.println("Por fim, digite o email desse aluno:");
			p1.setEmail(ler.nextLine());
			
			Aluno p2;
			if (alunos.isEmpty()) {
				
				System.out.println("Aluno adicionado!!!");
				alunos.add(p1);
				
			} else {
				
				for(int i = 0;i < alunos.size();i++) {
					
					p2 = alunos.get(i);
					if (p1.equals(p2)) {
						
						control = true;
						System.out.println("Este Aluno já está cadastrado");
						break;
						
					}
					
				}
				
				
				System.out.println("Aluno adicionado!!!");
				alunos.add(p1);
				
				
			}
			
			
		}
		
		
		
		
	}
	
	public static void printAluno () {
		
		if (nivel) {
			Mestrado m3 = new Mestrado();
			
			for (int i = 0;i < alunos.size();i++) {
				if(alunos.get(i).getClass().equals(m3.getClass())) {
					
					System.out.print(alunos.get(i));
					
					
				} 
			}
			
			
			
		} else {
			
			PosGraduacao p3 = new PosGraduacao();
			
			for (int i = 0;i < alunos.size();i++) {
				if(alunos.get(i).getClass().equals(p3.getClass())) {
					
					System.out.print(alunos.get(i));
					
					
				}
				
				
			}
			
			
			
		}
		
	}
	
}


















