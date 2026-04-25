Atividade N1 da disciplina Técnicas de Programação

Sistema em java para simulação de batalha de personagens e NPCs ao estilo RPG seguindo como base o sistema +2d6 criado por Newton Nitro
disponível sob licença Creative Commons 4.0 em https://drive.google.com/file/d/1JDYBxAv5uDpqichvhvOP4kf1Qno26Qm0/view

O programa inicia solicitando do usuário a inserção de dados como nome e atributos básicos, bem como a seleção da classe do personagem
e seu atributo específico. Em seguida será solicitada a definição dos valores dos atributos básicos do inimigo NPC, a classe do NPC
e o valor de seu atributo exclusivo de forma similar ao do personagem. O usuário é livre para definir todos os atributos do personagem
e do inimigo com qualquer valor inteiro positivo.

Com os dados iniciais do personagem e do inimigo devidamente carregados, o programa executará automaticamente rodadas sucessivas de
ataque e contra-ataque utilizando uma rolagem 2d6 + o atributo específico do personagem/inimigo para definir o nível do ataque
juntamente rolagem 2d6 + o atributo de defesa correspondente ao tipo de ataque para calcular o nível da defesa. Se o valor de ataque
for igual ou maior que a defesa, o golpe foi efetivo e será executado o cálculo de dano utilizado uma rolagem 2d6 + ataque - defesa.
O valor resultante define o nível de dano que será subtraído dos pontos de vida de quem recebeu o dano.

Caso o valor do ataque seja menor que a defesa, o golpe foi defendido com sucesso e não haverá rolagem de dano. Em seguida o oponente,
seja o personagem ou o inimigo executará sua rodada de ataque. Caso esta seja bem sucedida será executada a rolagem de dano deste oponete.

O processo se repetirá até que os pontos de vida do personagem ou do inimigo chegem a zero, definindo assim o vencedor da partida.
