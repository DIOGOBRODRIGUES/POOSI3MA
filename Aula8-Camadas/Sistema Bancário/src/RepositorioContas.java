public class RepositorioContas {
    private Conta[] contas;
    private int proxima;

    public RepositorioContas(int tamanho){
        this.contas = new Conta[tamanho];
        this.proxima = 0;
    }

    public void cadastrar (Conta c){
        this.contas[this.proxima] = c;
        this.proxima = this.proxima + 1;
    }

    public Conta procurar (String num){
        int i = 0;
        boolean achou = false;

        while((!achou) && (i < this.proxima)){
            if(num.equals(this.contas[i].getNumero())){
                achou = true;
            }else{
                i = i + 1;
            }
        }

        Conta resultado  = null;
        if(i != this.proxima){
            resultado  = this.contas[i];
        }
        return resultado;

    }
}
