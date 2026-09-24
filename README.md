# Singleton: Cronômetro de Treino

Exercício da disciplina **Aspectos Avançados de Engenharia de Software** implementando o padrão de projeto **Singleton**.

## Tema

O projeto modela o **cronômetro de round** de uma academia de Muay Thai. Em uma luta, o round tem duração fixa e é seguido de um descanso. Em lutas profissionais, por exemplo, é comum 5 rounds de 3 minutos com 2 minutos de descanso.

A academia possui um único cronômetro, e todo o sistema precisa consultar os mesmos tempos. Se existissem dois cronômetros com valores diferentes, parte da turma treinaria fora de sincronia. Dessa forma, sendo necessário o uso do padrão Singleton.

## Como o padrão foi aplicado

| Elemento do padrão | Implementação |
|---|---|
| Construtor privado | `private CronometroTreino()` impede o uso de `new` fora da classe |
| Instância única | atributo estático `instance`, criado uma vez no carregamento da classe |
| Ponto de acesso global | método estático `getInstance()` |
| Estado compartilhado | `tempoRound` e `tempoDescanso` (em segundos) |
