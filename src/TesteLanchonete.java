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
        System.out.println("**********LANCHONETE DO HEITOR**********\n");        
        System.out.println("Pedidos do cliente: \n");
        System.out.println("Refrigerante: "+" id produto: "+a3.id+" "+a3.marca+" "+"valor: "+a3.preco);
        System.out.println("Pizza: "+" id produto: "+a2.id+" "+a2.nomepizza+" "+"valor: "+a2.preco);        
        System.out.println("Lanche: "+" id produto: "+a1.id+" "+a1.nomelanche+" "+"valor: "+a1.preco);        
    } 
}
