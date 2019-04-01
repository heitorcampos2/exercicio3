public class TesteLanchonete {
    public static void main(String[] args){
        ////////////////////////////////
        Lanches a1 = new Lanches();
        a1.id = "001";
        a1.preco = 10.50;
        a1.nomelanche = "x-bacon";
        
        Pizzas a2 = new Pizzas();
        a2.id = "002";
        a2.preco = 10.50;
        a2.nomepizza = "calabresa - grande";        
        
        Refri a3 = new Refri();
        a3.id = "003";
        a3.preco = 10.50;
        a3.marca = "coca-cola 500ml";           
        ////////////////////////////////
        System.out.println("**********LANCHONETE DO HEITOR**********");        
        System.out.println("****************************************\nPedidos do cliente: \n****************************************");
        System.out.println("Refrigerante: \n"+" id produto: "+a3.id+" | Marca: "+a3.marca+" | "+"valor R$: "+a3.preco+"\n******************************");
        System.out.println("Pizza: \n"+" id produto: "+a2.id+" | sabor: "+a2.nomepizza+" | "+"valor: R$"+a2.preco+"\n******************************");        
        System.out.println("Lanche: \n"+" id produto: "+a1.id+" | Lanche: "+a1.nomelanche+" | "+"valor: R$"+a1.preco+"\n******************************");        
    } 
}
