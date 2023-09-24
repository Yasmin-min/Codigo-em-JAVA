import java.util.Scanner;
public class Lanchonete {
    Scanner teclado = new Scanner(System.in)
    double valor0=0,valor1=0,valor2=0,valor3=0, valor4=0,valor5=0,total=0;
    int quant=0;
    
    for (;;){
       System.out.println("\n---CARDÁPIO---"
             +"\nEspecificação               Código                Preço"
             +"\nCachorro Quente              100                 R$ 1,20"
             +"\nBauru Simples                101                 R$ 1,30"
             +"\nBauru com ovo                102                 R$ 1,50"
             +"\nHambúrguer                   103                 R$ 1,20"
             +"\nCheeseburguer                104                 R$ 1,30"
             +"\nRefrigerante                 105                 R$ 1,00");
       
       System.out.println("Digite 0 caso queira finalizar o pedido!");
       System.out.print("Digite o código do intem desejado: ");
       int codigo = teclado.nextInt();
       
       if (codigo <=0){
          break;
          }else if (codigo ==100){
             System.out.print("Digite a quantidade do intem desejado: ");
             quant = teclado.nextInt();
             valor0 =+ 1.20*quant;
          }else if (codigo==101){
             System.out.print("Digite a quantidade do intem desejado: ");
             quant = teclado.nextInt();
             valor1 =+ 1.30*quant;
          }else if (codigo==102){
             System.out.print("Digite a quantidade do intem desejado: ");
             quant = teclado.nextInt();
             valor2 =+ 1.50*quant;
          }else if (codigo==103){
             System.out.print("Digite a quantidade do intem desejado: ");
             quant = teclado.nextInt();
             valor3 =+ 1.20*quant;
          }else if (codigo==104){
             System.out.print("Digite a quantidade do intem desejado: ");
             quant = teclado.nextInt();
             valor4 =+ 1.30*quant;
          }else if (codigo==105){
             System.out.print("Digite a quantidade do intem desejado: ");
             quant = teclado.nextInt();
             valor5 =+ 1.00*quant;
          }else{
             System.out.print("\nCodigo invalido, tente novamente!!\n");
          }
    }
       total = valor0+valor1+valor2+valor3+valor4+valor5;
       
       System.out.println("\nVALOR POR ITEM: ");
       System.out.printf("100: %.2f \n101: %.2f \n102: %.2f \n103: %.2f",valor0,valor1,valor2,valor3 );
       System.out.printf("\n104: %.2f \n105: %.2f\n",valor4,valor5);
       System.out.printf("\nVALOR TOTAL A SER PAGO: %.2f",total);
       teclado.close();
}