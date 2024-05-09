import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Automovel> lista = new ArrayList<Automovel>();

        Automovel maisCaro = new Automovel("ind", "ind", "ind", 0, 2000 );
        Automovel maisBarato = new Automovel("ind", "ind", "ind", 2000000, 2000 );
        double media = 0;
        char controle = 's';
        do {
            System.out.println("Digite a placa: ");
            String placa = leia.next();
            System.out.println("Digite a marca: ");
            String marca = leia.next();
            System.out.println("Digite a modelo: ");
            String modelo = leia.next();
            System.out.println("Digite a preço: ");
            double preco = leia.nextDouble();
            System.out.println("Digite o ano de fabricação: ");
            int ano = leia.nextInt();
            Automovel car = new Automovel(placa, marca, modelo, preco, ano);
            lista.add(car);
            System.out.println("Deseja cadastrar outro Automovel ? s ou S para sim.");
            controle = leia.next().charAt(0);
        } while (controle == 's' || controle == 'S');

        for (Automovel i : lista) {
            if (i.getPreco() > maisCaro.getPreco()) {
                maisCaro = i;
            }
            if (i.getPreco() < maisBarato.getPreco()) {
                maisBarato = i;        
            }
            media += i.getPreco();
            System.out.println(i.toString());           
        }
        media /= lista.size();
        System.out.println("O automovel mais barato é " + maisBarato);
        System.out.println("O automovel mais Caro é " + maisCaro);
        System.out.println("A media de preços dos veículos é " + media);
    }
}
