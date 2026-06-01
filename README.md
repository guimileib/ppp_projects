# Laboratório 2 - Padrões de Projeto (Fábrica e Singleton)

Princípios e Padrões de Projetos - BCC FACOM UFU

Soluções das duas questões do laboratório. Em cada questão são usados os
padrões **Factory** (para construir os produtos a partir do nome do modelo)
e **Singleton** (para garantir uma única instância de cada fabricante).

## Estrutura

- `questao1/` - domínio de celulares (Apple/Samsung)
- `questao2/` - domínio de veículos (Toyota/Honda)

## Como compilar e executar

Dentro da pasta da questão desejada:

```bash
javac -d out *.java
java -cp out Main
```

## Questão 1 - Celulares

- `Celular` - interface dos produtos (`fazLigacao`, `tiraFoto`)
- `FabricanteCelular` - interface fábrica (`constroiCelular`)
- `IPhoneX`, `IPhoneS`, `Galaxy8`, `Galaxy20` - modelos concretos
- `Apple`, `Samsung` - fabricantes (Singleton + Factory)
- `Main` - demonstração

## Questão 2 - Veículos

- `IVehicle` - interface dos produtos (`start`, `drive`, `stop`)
- `IVehicleMaker` - interface fábrica (`makeVehicle`)
- `AbstractVehicle` - base que evita repetir o comportamento padrão
- `Corolla`, `Hilux`, `Etios`, `City`, `Civic`, `Fit` - modelos concretos
- `Toyota`, `Honda` - fabricantes (Singleton + Factory)
- `Main` - demonstração
