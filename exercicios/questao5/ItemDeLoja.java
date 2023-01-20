package questao5;

public class ItemDeLoja {
    
    private int codigoDoItem;
    private String nomeDoItem;
    private String descriçaoDoItem;
    private String valorDoItem;
    public int getCodigoDoItem() {
        return codigoDoItem;
    }
    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }
    public String getNomeDoItem() {
        return nomeDoItem;
    }
    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }
    public String getDescriçaoDoItem() {
        return descriçaoDoItem;
    }
    public void setDescriçaoDoItem(String descriçaoDoItem) {
        this.descriçaoDoItem = descriçaoDoItem;
    }
    public String getValorDoItem() {
        return valorDoItem;
    }
    public void setValorDoItem(String valorDoItem) {
        this.valorDoItem = valorDoItem;
    }
    
    public int getIdentificador(){
         return this.codigoDoItem;
    }
}