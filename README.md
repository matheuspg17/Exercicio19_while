# Resolução Exercicio19_while

## Descrição do problema
Escreva um programa em Java utilizando a estrutura de repetição while que
solicite ao usuário uma frase e um número inteiro. O programa deve exibir a
frase o número de vezes informado pelo usuário.

## Como Funciona
1. O usuário digita uma linha de texto contendo a mensagem desejada, que é salva na variável `frase` via `leia.nextLine()`.
2. Em seguida, insere um número inteiro correspondente ao total de repetições, armazenado na variável `numero`.
3. Uma estrutura de repetição `while (i < numero)` executa o bloco de código enquanto a variável contadora `i` (iniciada em 0) for menor que o limite estipulado.
4. Dentro do laço, o programa imprime a frase na tela e faz o incremento manual da variável de controle (`i++`) para garantir o encerramento do loop.