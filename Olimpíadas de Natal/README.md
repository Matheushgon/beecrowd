# Olimpíadas de Natal
Segundo a tradição, as provas das Olimpíadas de Natal são muito interessantes e diferentes. Dentre as provas existentes, podemos citar por exemplo, o levantamento de saco de brinquedos, a escalada de pinheiros, o hipismo com renas, o arremesso de duendes (com e sem o consentimento deles - esse segundo é mais perigoso) e o tempo de mergulho em buraco no gelo sem equipamentos, entre outros.

Parte do melhoramento da competição proposto por Noel para este ano sera a disponibilização do quadro de medalhas dos países participantes através de um placar eletrônico. Você foi convidado para viajar até as montanhas de Korvatunturi na Lapônia, Finlândia, aonde será a sede destes jogos, para, à partir de uma relação das provas e os países vencedores, desenvolver o sistema para este placar.

Serão quase trezentos países participantes e até 1000 modalidades de provas, no máximo.

### Entrada
A entrada contem um unico caso de teste que consiste em uma relacao com o resultado de todas as provas realizadas nas Olimpíadas de Natal. Cada prova ou modalidade contém quatro linhas de informação: a primeira linha contém a descrição da prova, a segunda linha contém o país que ficou campeão nesta modalidade, a terceira linha contém o país vice-campeão e a última linha contém o país que ficou com a medalha de bronze na referida prova. O final da entrada é determinado por EOF.

### Saída
Como saída, deve ser impresso o quadro de medalhas das Olimpíadas de Natal. A primeira linha contém a informação "Quadro de Medalhas". Cada uma das próximas linhas conterá o nome de um país seguido pelo respectivo número de medalhas de ouro, prata e bronze que este país conquistou, separadas por um espaço em branco. O critério de desempate é, na ordem, o número de medalhas de ouro seguido pelo número de medalhas de prata e de bronze. Se países empatarem nestes três critérios, a listagem será por ordem ascendente do nome do país participante.

**Exemplo de Entrada**</br>
Arremesso de duende</br>
Finlandia</br>
Noruega</br>
Sri Lanca</br>
Levantamento de Saco de Brinquedos</br>
Russia</br>
Africa do Sul</br>
Estonia</br>
Escalada de Pinheiro</br>
Estados Unidos</br>
Canada</br>
Sri Lanca</br>
Hipismo com Renas</br>
Finlandia</br>
Estados Unidos</br>
Finlandia</br>
Mergulho em Buraco no Gelo</br>
Islandia</br>
Estonia</br>
Russia</br>

**Exemplo de Saída** </br>
Quadro de Medalhas </br>
Finlandia 2 0 1 </br>
Estados Unidos 1 1 0 </br>
Russia 1 0 1 </br>
Islandia 1 0 0 </br>
Estonia 0 1 1 </br>
Africa do Sul 0 1 0 </br>
Canada 0 1 0 </br>
Noruega 0 1 0 </br>
Sri Lanca 0 0 2 </br>         
