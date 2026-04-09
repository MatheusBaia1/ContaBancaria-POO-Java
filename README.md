# Sistema Bancário em Java

Projeto simples de simulação de sistema bancário desenvolvido em Java com foco em POO.

## Funcionalidades

- Depósito
- Saque
- Consulta de saldo
- Menu interativo no console

## Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Separação de responsabilidades
- Uso de classes e métodos
- Boas práticas de organização de código

## Estrutura do projeto

- Main: responsável pela interação com o usuário
- SistemaBanco: camada de serviço responsável pelas operações
- ContaBancaria: regras de negócio da conta
- ContaCorrente: implementação com taxa de saque utilizando herança
- ContaPoupanca: estrutura preparada para futuras melhorias

## Atualizações recentes
- Criação automática do número da conta (ex: 0001, 0002, 0003...)
- Ajuste na estrutura para geração de contas dentro do SistemaBanco
- Refatoração da criação de contas para melhor organização do código
- Correção de inconsistências entre Main e construtores das classes
- Melhoria na separação de responsabilidades dentro do sistema
- Ajuste no fluxo de criação de contas para não exigir número manual
  
## Aprendizados

Projeto desenvolvido com foco em evolução para nível júnior, aplicando separação de responsabilidades e boas práticas de arquitetura simples.

## Próximas melhorias

- Validações de entrada
- Tratamento de exceções
- Interface gráfica futura
