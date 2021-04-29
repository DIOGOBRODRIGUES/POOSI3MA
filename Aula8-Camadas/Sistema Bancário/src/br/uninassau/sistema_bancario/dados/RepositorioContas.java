package br.uninassau.sistema_bancario.dados;

import java.util.Arrays;

import br.uninassau.sistema_bancario.negocios.beans.Conta;


public class RepositorioContas {
    private Conta[] contas;
    private int proxima;

    public RepositorioContas(int tamanho){
        this.contas = new Conta[tamanho];
        this.proxima = 0;
    }
//***************Cadastrar Conta****************** */
    public void cadastrar (Conta c){
        this.contas[this.proxima] = c;
        this.proxima = this.proxima + 1;
    }

//*******************Procurar Conta*************** */
    public Conta procurar (String num){
        int i = this.procurarIndice(num);
        Conta resultado  = null;
        if(i != this.proxima){
            resultado  = this.contas[i];
        }
        return resultado;

    }
//***********************Remover Conta************* */

    public void remover(String num){
        int i = this.procurarIndice(num);
        if (i != this.proxima){
            this.contas[i] = this.contas[this.proxima - 1];
            this.contas[this.proxima - 1] = null;
            this.proxima = this.proxima - 1;
            System.out.println("Conta" + num + "foi removida");
        }else{
            System.out.println("Conta não existe");
        }
    }

// ************* Procurar indice*********************/
    private int procurarIndice(String num){
        int i  = 0;
        boolean achou = false;
        while((!achou) && (i < this.proxima)){
            if(num.equals(this.contas[i].getNumero())){
                achou = true;
            }else{
                i = i+ 1;
            }
        }

        return i;
    }
    @Override
    public String toString() {
        return "RepositorioContas [contas=" + Arrays.toString(contas) + ", proxima=" + proxima + "]";
    }

    

}
