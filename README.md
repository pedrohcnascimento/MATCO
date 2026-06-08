# Mars Spacial Traffic & Mission Control 

## Visão Geral

O **Mars Spacial Traffic & Mission Control** é um sistema simulado de gerenciamento e monitoramento de operações aéreas e climáticas em Marte. Este projeto foi desenvolvido como uma simulação educacional baseada na documentação do sistema Mars Spacial Traffic & Mission Control, seguindo a mesma estrutura lógica do repositório do projeto **ChallengeEcopulse**.

## Objetivo

O Mars Spacial Traffic & Mission Control visa simular um sistema integrado que:

- **Monitora eventos climáticos** em Marte, especialmente tempestades de poeira
- **Gerencia aeronaves** e drones para operações aéreas seguras
- **Calcula rotas seguras** considerando condições climáticas
- **Emite alertas** para operadores em tempo real
- **Planeja voos** com segurança e eficiência

## Estrutura do Projeto

```
Mars Spacial Traffic & Mission Control/
├── src/br/com/mstmc/
│   ├── domain/              # Entidades do domínio
│   │   ├── Aeronave.java
│   │   ├── EventoClimatico.java
│   │   ├── Drone.java
│   │   ├── Alerta.java
│   │   └── PlanoDeVoo.java
│   ├── repository/          # Camada de persistência
│   │   └── GenericRepository.java
│   ├── service/             # Lógica de negócio
│   │   ├── AeronaveService.java
│   │   ├── EventoClimaticoService.java
│   │   ├── DroneService.java
│   │   ├── AlertaService.java
│   │   └── PlanoDeVooService.java
│   ├── controller/          # Controladores
│   │   ├── AeronaveController.java
│   │   ├── EventoClimaticoController.java
│   │   ├── DroneController.java
│   │   ├── AlertaController.java
│   │   └── PlanoDeVooController.java
│   └── interfaces/          # Interface com o usuário
│       ├── Exibition.java   # Classe principal
│       ├── Menus.java       # Menus da aplicação
│       └── Texts.java       # Mensagens de texto
├── out/                     # Arquivos compilados
└── README.md                # Este arquivo
```

## Funcionalidades Principais

### 1. Gerenciamento de Aeronaves
- Cadastrar novas aeronaves
- Listar aeronaves registradas
- Visualizar status e modelo de cada aeronave

### 2. Gerenciamento de Eventos Climáticos
- Registrar eventos climáticos (tempestades de poeira, etc.)
- Indicar intensidade (Leve, Moderada, Severa)
- Marcar eventos como detectados ou não
- Listar todos os eventos registrados

### 3. Gerenciamento de Drones
- Cadastrar drones para operações
- Registrar localização e status
- Listar drones disponíveis

### 4. Emissão de Alertas
- Criar alertas climáticos e operacionais
- Registrar mensagens e localizações
- Manter histórico de alertas

### 5. Planejamento de Voos
- Criar planos de voo com origem e destino
- Definir rotas seguras
- Estimar tempo de viagem

## Como Compilar e Executar

### Pré-requisitos
- Java 17 ou superior
- Compilador `javac`

### Compilação

```bash
javac -d out src/br/com/mstmc/domain/*.java
javac -d out src/br/com/mstmc/repository/*.java
javac -d out src/br/com/mstmc/service/*.java
javac -d out src/br/com/mstmc/controller/*.java
javac -d out -cp out src/br/com/mstmc/interfaces/*.java
```

### Execução

```bash
java -cp out br.com.mstmc.interfaces.Exibition
```

## Arquitetura

O projeto segue o padrão **DDD (Domain Driven Desgin)** com camadas bem definidas:

| Camada | Responsabilidade |
|--------|------------------|
| **Domain** | Entidades do sistema (modelos de dados) |
| **Repository** | Acesso e persistência de dados |
| **Service** | Lógica de negócio e processamento |
| **Controller** | Orquestração entre serviços e interface |
| **Interfaces** | Interação com o usuário (menus e textos) |

## Fluxo de Funcionamento

1. **Exibition.java** inicia a aplicação e exibe o menu principal
2. Usuário escolhe uma opção (Aeronaves, Eventos, Drones, Alertas, Planos de Voo)
3. **Menus.java** exibe o submenu correspondente
4. **Controller** processa a ação do usuário
5. **Service** executa a lógica de negócio
6. **Repository** persiste os dados em memória
7. Resultado é exibido através de **Texts.java**

## Exemplo de Uso

```
Bem-vindo ao Sistema MARS AIR TRAFFIC & CLIMATE OPS (Mars Spacial Traffic & Mission Control)!

--- MENU PRINCIPAL ---
1. Gerenciar Aeronaves
2. Gerenciar Eventos Climáticos
3. Gerenciar Drones
4. Gerenciar Alertas
5. Gerenciar Planos de Voo
0. Sair
Escolha uma opção: 1

--- MENU DE AERONAVES ---
1. Cadastrar Aeronave
2. Listar Aeronaves
0. Voltar ao Menu Principal
Escolha uma opção: 1

Digite o modelo da aeronave: Boeing 737
Digite o status da aeronave: Operacional
Aeronave cadastrada com sucesso!
```

## Observações Importantes

- Este é um projeto **simulado** e não implementa funcionalidades reais de monitoramento ou cálculo de rotas
- Os dados são armazenados em memória e são perdidos ao encerrar a aplicação
- A aplicação é interativa e baseada em entrada de texto pelo console

## Referências

- Documentação Mars Spacial Traffic & Mission Control fornecida
- Estrutura baseada no projeto ChallengeEcopulse
- Padrão de arquitetura DDD com camadas

---

**Versão:** 1.0  
**Data:** 2026
