# Lógica de Programação

### 1. Introdução a Lógica

A lógica é a ciência que estuda o raciocínio correto. É a base fundamental para a criação de algoritmos e programação. Ela é responsável por determinar a validade de um argumento e é utilizada para a tomada de decisão.

### 2. Introdução a Algoritmos e tipos de algoritmos
Algoritmos são uma sequência de instruções que devem ser seguidas para resolver um problema específico. Existem vários tipos de algoritmos, como os sequenciais, condicionais e repetitivos, cada um com sua forma de implementação.


### 3. Conceitos básicos sobre algoritmos
#### 3.1 Definição de dados:
Dados são informações que são manipuladas pelos algoritmos. Essas informações podem ser numéricas, textuais, datas, entre outras. É importante definir os tipos de dados que serão utilizados no algoritmo, pois isso impactará a forma como os dados serão manipulados e armazenados.

#### 3.2 Tipos de dados:
Existem diversos tipos de dados que podem ser utilizados em algoritmos, tais como:

- Inteiro (int): números inteiros, como 1, 2, 3, -4, -5...
- Real (float ou double): números decimais, como 1.5, 3.1415, 0.75, ...
- Caractere (char): letras, números ou símbolos, como 'a', 'B', '3', '@', ...
- String: sequência de caracteres, como "hello world", "1234", "a+b=c", ...
- Lógico (bool): valores booleanos, como verdadeiro (true) ou falso (false).

#### 3.3 Variáveis

Variáveis são espaços de memória reservados para armazenar valores. Elas podem ser definidas pelo programador com um nome e um tipo de dado, e seu valor pode ser alterado durante a execução do algoritmo. Por exemplo, pode-se criar uma variável "idade" do tipo inteiro e armazenar o valor 25.

#### 3.4 Constantes

Constantes são valores fixos que não podem ser alterados durante a execução do algoritmo. Elas são definidas pelo programador e podem ser utilizadas para armazenar valores que não precisam ser modificados, como o número PI, por exemplo. Constantes são declaradas com a palavra reservada "const" ou "final" dependendo da linguagem de programação utilizada.

#### 3.5 Operadores 

Operadores são símbolos que representam operações matemáticas e lógicas. 

- Operadores de atribuição:
  Os operadores de atribuição são utilizados para atribuir um valor a uma variável. O operador de atribuição mais comum é o sinal de igual (=), que atribui o valor à direita do sinal de igual à variável à esquerda do sinal de igual. Por exemplo:
 ``int x = 5;``
- Operadores Aritméticos:
  Os operadores aritméticos são utilizados para realizar operações matemáticas em valores numéricos. Os operadores aritméticos comuns incluem:
  -  Adição (+): realiza a adição de dois valores.
  -  Subtração (-): realiza a subtração de dois valores.
  -  Multiplicação (*): realiza a multiplicação de dois valores.
  -  Divisão (/): realiza a divisão de dois valores.
  -  Resto da divisão (%): retorna o resto da divisão entre dois valores.
  - ``` int x = 5;int y = 3; int z = x + y; // z = 8 ```
- Operadores relacionais
  Os operadores relacionais são utilizados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso) com base na comparação. Os operadores relacionais comuns incluem:
  - Igual (==): verifica se dois valores são iguais.
  - Diferente (!=): verifica se dois valores são diferentes.
  - Maior que (>): verifica se um valor é maior do que outro.
  - Maior ou igual (>=): verifica se um valor é maior ou igual a outro.
  - Menor que (<): verifica se um valor é menor do que outro.
  - Menor ou igual (<=): verifica se um valor é menor ou igual a outro.
  - ```int x = 5; int y = 3; boolean resultado = x > y; // resultado = true```
- Operadores Lógicos: os operadores lógicos são utilizados para combinar valores booleanos e retornar um valor booleano resultante. Os operadores lógicos comuns incluem:
  - E (&&): retorna verdadeiro se ambos os valores são verdadeiros.
  - Ou (||): retorna verdadeiro se pelo menos um dos valores é verdadeiro.
  - Não (!): inverte o valor booleano (verdadeiro se o valor original era falso e vice-versa).