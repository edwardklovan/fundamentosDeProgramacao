public class Lote {
    private int numero;
    private double largura;
    private double comprimento;
    double area, perimetro;
    
    public Lote(int numero, double largura, double comprimento) {
        this.numero = numero;
        this.largura = largura;
        this.comprimento = comprimento;
        
        area = largura * comprimento;
        perimetro = (2 * largura) + (2 * comprimento);
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public double getComprimento() {
        return comprimento;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getPerimetro() {
        return perimetro;
    }
    
}
