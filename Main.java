package treino;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Faça um programa que peça o númeor e então mostre a mensagem "O número informado foi [número].
		System.out.println("Informe um número: ");
		int numero = teclado.nextInt();
		System.out.println("O número informado foi: " + numero);
		
		//Faça um programa que peça dois números e imprima a soma.
		System.out.println("Vamos somar dois números: ");
		System.out.println("Digite o primeiro número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = teclado.nextInt();
		System.out.println("A soma dos dois números é: " + (numero1 + numero2));
		
		//Fala um programa que pela as 4 notas bimestrais e mostre a média.		
		System.out.println("Informe as 4 notas do aluno para exibir a média do mesmo.");		
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double nota4 = teclado.nextDouble();
		System.out.println("A média do aluno é: " + (nota1 + nota2 + nota3 + nota4)/ 4);
		
		//Fala um programa que converta metros para centímetros.
		System.out.println("Digite a quantidade de metros que deseja converter para centímetros");
		double metros = teclado.nextDouble();
		double valorEmCentimetros = (metros * 100);
		System.out.println("O valor convertido em centimetros é: " + valorEmCentimetros);
		
		//Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
		System.out.println("Informe o raio do círculo para descobrir a área do círculo");
		double raio = teclado.nextDouble();
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo é de: " + areaCirculo);
		
		//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		System.out.println("Informe o valor de um dos lados do quadrado:");
		double ladoQuadrado = teclado.nextDouble();
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		System.out.println("A área do quadrado é de: " + areaQuadrado);
		System.out.println("O dobro desta área é de: " + areaQuadrado * 2);
		
		//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		System.out.println("Quanto você ganha por hora?");
		double valorHora = teclado.nextDouble();
		System.out.println("Quantas horas trabalhadas no mês?");
		int horaTrabalhadaMensal = teclado.nextInt();
		double valorMensal = (valorHora * horaTrabalhadaMensal);
		System.out.println("O valor do salário mensal é de: " + valorMensal);
		
		//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. Formula: C = (5 * (F-32) / 9).
		System.out.println("Digite a temperatura em graus Farenheit");
		double grausFarenheit = teclado.nextDouble();
		double conversaoParaCelcius = (5* (grausFarenheit - 32) / 9);
		System.out.println("A temperatura convetida é de: " + conversaoParaCelcius + "º");
		
		//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
		System.out.println("Digite a temperatura em graus Celsius");
		double grausCelsius = teclado.nextDouble();
		double conversaoParaFarenheit = ((grausCelsius * 9/5) + 32);
		System.out.println("A temperatura convertida é de: " + conversaoParaFarenheit);
		
		//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		//a. o produto do dobro do primeiro com metade do segundo .
		//b. a soma do triplo do primeiro com o terceiro.
		//c. o terceiro elevado ao cubo.
		System.out.println("Digite dois números Inteiros e em seguida digite um número Real");
		int numInteiro1 = teclado.nextInt();
		int numInteiro2 = teclado.nextInt();
		double numReal = teclado.nextDouble();		
		double calcA = ((numInteiro1 * 2) * (numInteiro2 / 2));
		double calcB = ((numInteiro1 * 3) + (numReal));
		double calcC = (Math.pow(numReal, 3));		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + calcA);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + calcB);
		System.out.println("O terceiro elevado ao cubo: " + calcC);
		
		//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:(72.7*altura) - 58
		System.out.println("Digite a sua altura para calcularmos o seu peso ideal: ");
		double altura = teclado.nextDouble();
		double pesoIdeal = ((72.7 * altura) - 58);
		System.out.println("O seu peso ideal é: " + pesoIdeal);
		
		//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
		//Para homens: (72.7*h) - 58
		//Para mulheres: (62.1*h) - 44.7 (h = altura)
		//Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
		System.out.println("Informe a sua altura e o seu sexo");
		System.out.println("altura:");
		double altura1 = teclado.nextDouble();
		System.out.println("Digite a opção para o sexo: ");
		System.out.println("1 - Masculino");
		System.out.println("2 - Feminino");	
		int sexo = teclado.nextInt();		
		System.out.println("Qual o seu peso atual?");
		double pesoAtual = teclado.nextDouble();
		double calcMasculino = (72.7 * altura1) - 58;
		double calcFeminino = (62.1 * altura1) - 44.7;				
		if (sexo == 1) {
			if (pesoAtual > calcMasculino) {
				System.out.println("Você está acima do peso...");
			} else if (pesoAtual < calcMasculino) {
				System.out.println("Você está abaixo do peso...");
			} else {
				System.out.println("Você está no peso ideal!");
			}
		} else {
			if (pesoAtual > calcFeminino) {
				System.out.println("Você está acima do peso...");
			} else if (pesoAtual < calcFeminino) {
				System.out.println("Você está abaixo do peso...");
			} else {
				System.out.println("Você está no peso ideal!");
			}
		}
		
		//.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
		//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
		//pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
		//verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário
		//mostrar tais variáveis com o conteúdo ZERO.
		System.out.println("Digite o peso do peixe: ");
		double peso = teclado.nextDouble();
		double excesso;
		double multa;
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.println("A multa será de: R$" + multa);
		} else {
			excesso = 0;
			multa = 0;
			System.out.println("Excesso: " + excesso + " Multa: " + multa);
		}
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora1 = teclado.nextDouble();
		System.out.println("Quantas horas trabalhadas no mês?");
		int horaTrabalhadaMensal1 = teclado.nextInt();
		double valorMensal1 = (valorHora1 * horaTrabalhadaMensal1);
		double inss = valorMensal * 8/100;
		double sindicato = valorMensal * 5/100;
		double impostoRenda = valorMensal * 11/100;
		double salarioLiquido = (valorMensal - (impostoRenda + inss + sindicato));
		System.out.println("Salário bruto: " + valorMensal1);
		System.out.println("Pago ao INSS: " + inss);
		System.out.println("Pago ao sindicato: " + sindicato);
		System.out.println("Salário líquido: " + salarioLiquido);
		
	}

}
