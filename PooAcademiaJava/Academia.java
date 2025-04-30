import java.util.ArrayList;
import java.util.List;

public class Academia {
    protected List<Cliente> clientes;
    protected String nomeAcademia;

    public Academia(String nomeAcademia){
        this.clientes = new ArrayList<>();
        this.nomeAcademia = nomeAcademia;
    }

    public void setNomeAcademia(String nomeAcademia){
        this.nomeAcademia = nomeAcademia;
    }

    public void CadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(int id) {
       clientes.removeIf(cliente -> cliente.getId() == id);
    }

    public int NumeroDeClientes(){
        return clientes.size(); // pode usar length?
    }

    public List<Cliente> ClientesNascidosApos2000(){
        List<Cliente> result = new ArrayList<>();
        for(Cliente cliente : clientes){
            if (cliente.getAnoNascimento() > 2000){
                result.add(cliente);
            }
        }
        return result;
    }
    public void RemoverClientesAntesDe1990() {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAnoNascimento() < 1990) {
                iterator.remove();
            }
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
