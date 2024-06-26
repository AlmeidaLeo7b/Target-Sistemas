# Resolução das atividades - Target Sistemas

## 1) Observe o código abaixo:
```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça {

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA)
```
Ao final do processamento, qual será o valor da variável SOMA?
<br>
Será 91, pois está somando todos os números inteiros entre 1 e 13, ou seja, 1+2+3+...+13.

## 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
<a href="https://github.com/AlmeidaLeo7b/Target-Sistemas/tree/main/Fibonacci" target="_blank"> Resolução Atividade 2</a>

## 3) Descubra a lógica e complete o próximo elemento:

`a) 1, 3, 5, 7,` 9 (Está somando o numero anterior mais 2.)
<br>

`b) 2, 4, 8, 16, 32, 64`, 128 (Multiplicando o termo anterior por 2)

`c) 0, 1, 4, 9, 16, 25, 36`, 49 (Quadrado Perfeito, 6x6 = 36, 7x7 = 49)

`d) 4, 16, 36, 64`, 100 (Quadrado Perfeito apenas dos numeros pares)

`e) 1, 1, 2, 3, 5, 8`, 13 (Fibonacci)

`f) 2,10, 12, 16, 17, 18, 19`, 200 (Apenas números que começam coma  letra D)

## 4)  Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. 
**Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?**
**Resolução**

<ol>
<li> Primeira Ida</li>
<p>
   Ligo o primeiro interruptor e deixo ligado por 5 minutos, ou o suficiente para deixar a lâmpada quente, em seguida
   desligo o primeiro interruptor 1 e ligo o segundo interruptor e me encaminho para as sala de lampada
 
</p>
<li> Segunda Ida</li>
  <p> Verifico a lâmpada da primeira sala</p>
  <ul> 
    <li>Se a lâmpada estiver apagada e quente, ela pertence ao primeiro interruptor</li>
    <li>Se a lâmpada estiver acessa, ela pertence ao segundo interruptor</li>
    <li>Se a lâmpada estiver apagada e fria, ela pertence ao terceiro interruptor</li>
</ul>
 <p> Verifico a lâmpada da segunda sala</p>
  <ul> 
    <li>Se a lâmpada estiver apagada e quente, ela pertence ao primeiro interruptor</li>
    <li>Se a lâmpada estiver acessa, ela pertence ao segundo interruptor</li>
    <li>Se a lâmpada estiver apagada e fria, ela pertence ao terceiro interruptor</li>
</ol>
<p> Vale ressaltar, que essa lógica só se aplica caso as lâmpadas utilizadas não forem de LED</p>

## 5) Escreva um programa que inverta os caracteres de um string.

<a href="https://github.com/AlmeidaLeo7b/Target-Sistemas/tree/main/stringInversa" target="_blank"> Resolução Atividade 5</a>
