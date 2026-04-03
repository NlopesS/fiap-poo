# Projeto Sistema de Celulares

Este projeto foi desenvolvido como parte de um desafio prático de Programação Orientada a Objetos (POO) em Java. O objetivo é simular o comportamento de um objeto do mundo real (um Celular) utilizando classes, atributos e métodos com regras de negócio.

## O que o objeto representa?
O objeto `Celular` representa um dispositivo móvel físico, armazenando características básicas como marca, cor e preço, além de controlar se o aparelho está ligado ou desligado.

## Funcionalidades (Métodos)

A classe possui dois métodos principais que garantem a integridade dos dados:

1. **`ligar()`**:
   - **O que faz:** Altera o estado do celular para "ligado".
   - **Regra de Negócio:** Utiliza uma validação (`if`) para verificar se o celular já está ligado. Se estiver, exibe uma mensagem de erro para evitar inconsistência no estado.

2. **`aplicarDesconto(valor)`**:
   - **O que faz:** Reduz o preço atual do celular.
   - **Regra de Negócio:** Verifica se o valor do desconto é válido (não pode ser negativo e nem maior que o preço atual do produto).

## Como usar

No arquivo `SistemaPrincipal.java`, você pode instanciar o objeto e realizar os testes:

```java
// Criando o objeto
Celular meuCelular = new Celular();
meuCelular.preco = 2000.0;

// Chamando os métodos
meuCelular.ligar();                // O celular liga
meuCelular.aplicarDesconto(500.0); // Preço atualizado para 1500.0
