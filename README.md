# Explorando Padrões de Projetos na Prática com Java

Projeto desenvolvido como parte do desafio **Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework**, do Bootcamp Santander 2026 — Java Backend na DIO.

Este repositório tem como base o laboratório oficial da Digital Innovation One e apresenta exemplos práticos de padrões de projeto utilizando Java puro.

## Padrões explorados

- Singleton
- Strategy
- Facade

## Evolução realizada

Como evolução do exemplo original, foi adicionada uma nova estratégia ao padrão **Strategy**:

- `ComportamentoExplorador`

O novo comportamento implementa a mesma interface `Comportamento` utilizada pelos comportamentos normal, defensivo e agressivo, demonstrando como novas estratégias podem ser adicionadas sem alterar a estrutura da classe `Robo`.

## Execução

O projeto foi compilado e executado com Java 11.

Devido à codificação original de alguns arquivos do laboratório, a compilação foi realizada informando explicitamente `windows-1252`:

```bash
javac -encoding windows-1252 -d out $(find src -name "*.java")
java -cp out one.digitalinnovation.gof.Test