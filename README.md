# 🧱 Revisão de Orientação a Objetos em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge)

Este repositório contém uma série de scripts desenvolvidos para revisar e fixar os conceitos fundamentais da Programação Orientada a Objetos (POO) em Java. Através de uma série de implementações iterativas, o projeto explora desde a criação básica de classes até a estruturação de arquiteturas flexíveis utilizando interfaces e abstração.

---

## 🗂️ Conteúdos Explorados

### 1. Abstração (Classes, Objetos e Métodos)
Transição do pensamento estruturado para a modelagem de entidades do mundo real.
* **Estado e Comportamento:** Modelagem de atributos e métodos para entidades como `Livro`, `Produto` e `Colaborador`.
* **Construtores Parametrizados:** Garantia de que nenhum objeto seja instanciado sem os dados mínimos necessários para existir em um estado válido.
* **Coesão Lógica:** Inserção de regras de negócio internas diretamente nas classes (ex: validação de estoque antes de uma venda).

### 2. Encapsulamento
Proteção da integridade dos dados e ocultação da complexidade interna.
* **Modificadores de Acesso:** Uso restrito da palavra-chave `private` para impedir acesso direto e não autorizado ao estado dos objetos.
* **Validação em Setters:** Filtros lógicos para impedir a inserção de dados inconsistentes (ex: impedir depósitos negativos em `Conta` ou notas inválidas em `Disciplina`).
* **Imutabilidade:** Uso da palavra-chave `final` para criar atributos estruturais de "somente leitura" após a instanciação (ex: classe `Contato`).

### 3. Herança
Reaproveitamento estrutural e criação de hierarquias lógicas.
* **Extensão de Comportamentos:** Uso da palavra-chave `extends` para criar subclasses (`Docente`, `Aluno`) que herdam características de uma superclasse comum (`Pessoa`).
* **Centralização de Lógica:** Agrupamento de atributos e métodos utilitários genéricos na classe mãe para eliminar duplicação de código.

### 4. Polimorfismo
Capacidade de tratar objetos de tipos diferentes de maneira uniforme.
* **Sobrecarga (Overloading):** Criação de múltiplos métodos com o mesmo nome na mesma classe, mas com assinaturas (parâmetros) diferentes (ex: classe `Notificador` e `Reserva`).
* **Sobrescrita (Overriding):** Redefinição de métodos herdados utilizando a anotação `@Override` para fornecer comportamentos específicos e customizados nas subclasses (ex: cálculo de taxas específico para `Pix`, `BoletoBancario` e `CartaoCredito`).
* **Upcasting:** Utilização do tipo da superclasse como referência para instanciar e manipular subclasses dinamicamente.

### 5. Interfaces
Implementação estrita de regras de negócio utilizando `implements`. Interfaces como `Imprimivel` e `Controlavel` ditam os comportamentos que outras classes são obrigadas a possuir, sem ditar como devem fazê-lo.

### 6. Classes Abstratas
Combinação do poder das interfaces com a herança clássica. Criação de classes parciais (`OperacaoBancaria`) que não podem ser instanciadas diretamente, mas que fornecem estado base e exigem que suas subclasses implementem ações contratuais (`AcaoBancaria`).

---

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 25):**
* **IntelliJ IDEA:**
