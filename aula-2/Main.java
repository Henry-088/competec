import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner entrada = new Scanner(System.in);
		double hamburguer = 10.00;
		double refri = 5.00;
		double nuggets = 10.00;
		System.out.print("o que voce quer pedir do menu?");
		String pedido = entrada.next();
		System.out.println("quantas unidades voce quer de cada?");
		String quantidade = entrada.next();
		
		double carteira = 60.00;
		double carrinho= 25.00;
		
		if(carteira < carrinho);{
		System.out.println("boa compra");
		System.out.println("restou dinheiro");}
		else if(carrinho==carteira);{
		System.out.print ln("boa compra");
		System.out.println("zerei");}
		else{
		    System.out.println("nao vai comer");
		}
		
	}
}
