public class Banco {
    private String nome;
    private int nContas;
    private int[] codigos;
    private double[] saldos;
    
    
    public Banco (String nome) {
        this.nome = nome;
        codigos = new int[10];
        saldos = new double[10];
        nContas = 0;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void addConta(int cConta) {
    }
    
    public void addConta(int cConta, double saldoInicial) {   
    }
    
    public double getSaldo(int cConta) {
    }
    
    public double getSaldoTotal() { 
    }
    
    public void depositar(int cConta, double valor) {
    }
    
    public double retirar(int cConta, double valor) {
    }
    
    public double retirar(int cConta) {
    }
    
    public boolean transferir(int deConta, int paraConta, double valor) {
    }
    
    public int getNumContas() {
    }
    
    public static void man(String[] args) {
    }
}
