import java.util.*;

class Main {
    String nome;
    int ouro;
    int prata;
    int bronze;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String linha;     
        Main[] paises = new Main[300];
        
        boolean existe = false;
        int n = 0;
        
        //ler até EOF
        while (sc.hasNext()){
            linha = sc.nextLine();    //leitura modalidade

            //leitura pais ouro
            linha = sc.nextLine();
            for (int i = 0; i < n; i++){
                if(paises[i].nome.equals(linha)){
                    existe = true;
                    paises[i].ouro++;
                }
            }
            if (!existe){
                paises[n] = new Main();
                paises[n].nome = linha;
                paises[n].ouro++;
                n++;
            }
            existe = false;

            //leitura pais prata
            linha = sc.nextLine();
            for (int i = 0; i < n; i++){
                if(paises[i].nome.equals(linha)){
                    existe = true;
                    paises[i].prata++;
                }
            }
            if (!existe){
                paises[n] = new Main();
                paises[n].nome = linha;
                paises[n].prata++;
                n++;
            }
            existe = false;

            //leitura pais bronze
            linha = sc.nextLine();
            for (int i = 0; i < n; i++){
                if(paises[i].nome.equals(linha)){
                    existe = true;
                    paises[i].bronze++;
                }
            }
            if (!existe){
                paises[n] = new Main();
                paises[n].nome = linha;
                paises[n].bronze++;
                n++;
            }
            existe = false;
        }

        //ordenar
        Main tmp;
        for (int i = 0; i < n; i++){
            int maior = i;
            for (int j = i+1; j < n ;j++){
                if ((paises[j].ouro*100)+(paises[j].prata*10)+(paises[j].bronze) > (paises[maior].ouro*100)+(paises[maior].prata*10)+(paises[maior].bronze)){
                    maior = j;
                }
            }
            //swap
            tmp = paises[i];
            paises[i] = paises[maior];
            paises[maior] = tmp;
        }

        //escrever
        System.out.print("Quadro de Medalhas");
        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.print(paises[i].nome);
            System.out.print(" "+paises[i].ouro);
            System.out.print(" "+paises[i].prata);
            System.out.print(" "+paises[i].bronze);
        }
        
        sc.close();
    }
}
