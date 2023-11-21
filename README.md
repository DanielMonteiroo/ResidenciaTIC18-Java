Pesquise no Google e responda às perguntas abaixo.
1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.
R. Em Java, uma classe é uma estrutura fundamental que serve como modelo para criar objetos. Ela define um conjunto de atributos e métodos que os objetos criados a partir dela possuirão. Uma classe é uma espécie de planta baixa para a criação de objetos.

Classe: É uma estrutura que define atributos e comportamentos comuns a um grupo de objetos. Objeto: É uma instância específica de uma classe, criada a partir do molde definido pela classe.

5 classes em C++:

class Pessoa { public: string nome; int idade; };

class Carro { public: string modelo; int ano; };

class ContaBancaria { public: string titular; double saldo; };

class Retangulo { public: float comprimento; float largura; };

class Livro { public: string titulo; string autor; };

5 classes em java:

public class Pessoa { String nome; int idade; }

public class Carro { String modelo; int ano; }

public class ContaBancaria { String titular; double saldo; }

public class Retangulo { float comprimento; float largura; }

public class Livro { String titulo; String autor; }

2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.
Em Java, você declara uma variável especificando o tipo de dado seguido pelo nome da variável, em C++ é a mesma coisa.

Os tipos primitivos são iguais tanto em java quando em c++, são eles, inteiros, pontos flutuante caractere, booleano

3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.
Herança em Java é um conceito fundamental da programação orientada a objetos que permite a criação de uma nova classe usando uma classe já existente.

5 exemplos em C++:

class Veiculo { // código da classe Veiculo };

class Carro : public Veiculo { // código da classe Carro };

class Animal { // código da classe Animal };

class Mamifero { // código da classe Mamifero };

class Cachorro : public Animal, public Mamifero { // código da classe Cachorro };

class Animal { public: virtual void fazerBarulho() { cout << "Alguns animais fazem barulho." << endl; } };

class Gato : public Animal { public: void fazerBarulho() override { cout << "O gato mia." << endl; } };

class Pessoa { public: Pessoa() { // construtor }

~Pessoa() {
    // destrutor
}
};

class Animal { public: Animal() { cout << "Construindo um animal." << endl; } };

class Cachorro : public Animal { public: Cachorro() : Animal() { cout << "Construindo um cachorro." << endl; } };

5 Exemplos em Java:

class Veiculo { // código da classe Veiculo }

class Carro extends Veiculo { // código da classe Carro }

class Animal { void fazerBarulho() { System.out.println("Alguns animais fazem barulho."); } }

class Gato extends Animal { void fazerBarulho() { System.out.println("O gato mia."); } }

class Pessoa { Pessoa() { // construtor }

void finalize() {
    // destrutor
}
}

class Animal { Animal() { System.out.println("Construindo um animal."); } }

class Cachorro extends Animal { Cachorro() { super(); // chamada para o construtor da superclasse System.out.println("Construindo um cachorro."); } }

4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

R. Enquanto em Java o conceito de ponteiros é encapsulado e oculto para tipos primitivos, em C++ os ponteiros são uma parte mais fundamental da linguagem e permitem manipulações mais diretas com a memória. Isso dá a C++ uma flexibilidade adicional, mas também aumenta a responsabilidade do programador em gerenciar a alocação e liberação de memória.
