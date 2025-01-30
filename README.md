# Cálculo de Imposto de Renda em Java 💰

Este programa em Java calcula o imposto de renda devido com base no salário informado pelo usuário.

## 📝 Descrição

O programa:

1. Solicita ao usuário que insira o nome do funcionário e seu salário.
2. Calcula o imposto devido de acordo com a seguinte tabela:
   - **Isento**: Salários até R$ 2000,00.
   - **8% sobre o excedente**: Para salários entre R$ 2000,01 e R$ 3000,00.
   - **18% sobre o excedente**: Para salários entre R$ 3000,01 e R$ 4500,00.
   - **28% sobre o excedente**: Para salários acima de R$ 4500,00.
3. Exibe o valor do imposto a ser pago ou informa que o funcionário é isento.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac impostoRenda.java
   ```
4. Execute o programa:
   ```bash
   java impostoRenda
   ```

## 📌 Exemplo de Uso

### Entrada:
```
digite o nome do funcionario
Carlos
digite o seu salario:
3500.00
```

### Saída:
```
funcionário: Carlos
Imposto a pagar: R$ 270.00
```

## 📂 Estrutura do código

O código é composto por:

- **Leitura do nome e salário do funcionário**.
- **Cálculo do imposto** com base nas faixas salariais.
- **Exibição do resultado**, mostrando o valor a ser pago.


