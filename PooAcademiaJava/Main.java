public class Main {
    public static void main(String[] args) {
        Academia a = new Academia("Corpo e Movimento");

        
        a.CadastrarCliente(new Cliente(1, "João", 1985, "1111-1111"));
        a.CadastrarCliente(new Cliente(2, "Maria", 1992, "2222-2222"));
        a.CadastrarCliente(new Cliente(3, "Carlos", 2003, "3333-3333"));
        a.CadastrarCliente(new Cliente(4, "Ana", 1988, "4444-4444"));

        
        //a.RemoverCliente(1);

        
        System.out.println("Número de clientes matriculados: " + a.NumeroDeClientes());

        
        System.out.println("Clientes nascidos após 2000:");
        for (Cliente cliente : a.ClientesNascidosApos2000()) {
            System.out.println(cliente);
        }

        
        //a.removerClientesAntesDe1990();
        //System.out.println("Clientes após remoção dos nascidos antes de 1990:");
        //a.listarClientes();
    }
}