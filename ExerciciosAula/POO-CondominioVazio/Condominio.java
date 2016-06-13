public class Condominio {

    private String nome;
    private static int numMaxLotes = 10;
    private Lote[] lotes;
    private int nLotes;
    private int numMaximo;
    
    
    public Condominio(String nome, int numMaxLotes){
        this.nome = nome;
        lotes = new Lote[numMaxLotes];
        this.numMaxLotes = numMaxLotes;
    }
    
    public Condominio(String nome) {
        this.nome = nome;
        lotes = new Lote[numMaxLotes];
    }
    
    public boolean addLote(Lote lte) {
        boolean loteAdd = false;
        
        if (nLotes < numMaxLotes) {
            lotes[nLotes] = lte;
            boolean addLote = true;
            nLotes++;
        }
        return loteAdd;
    }
    
    public Lote getLote(int numero) {
        for (int i = 0; i < nLotes; i++) {
            if (lotes[i].getNumero() == numero) {
                return lotes[i];
            }
        }
        return null;
    }
    
}
