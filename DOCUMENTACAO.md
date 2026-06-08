# DOCUMENTAÇÃO — MARS SPACIAL TRAFFIC & MISSION CONTROL

## 1. CAPA

**Nome do Projeto:** MARS SPACIAL TRAFFIC & MISSION CONTROL  
**Subtítulo do Sistema:** Sistema de Operação Aérea e Monitoramento Climático em Marte  
**Ano:** 2026

---

## 2. SUMÁRIO

1. [CAPA](#1-capa)
2. [SUMÁRIO](#2-sumário)
3. [INTRODUÇÃO](#3-introdução)
4. [DESCRIÇÃO DO PROJETO](#4-descrição-do-projeto)
5. [FUNCIONALIDADES PRINCIPAIS](#5-funcionalidades-principais)
6. [MODELAGEM DAS CLASSES](#6-modelagem-das-classes)
7. [ATRIBUTOS DAS CLASSES](#7-atributos-das-classes)
8. [MÉTODOS DAS CLASSES](#8-métodos-das-classes)
9. [RELACIONAMENTO ENTRE CLASSES](#9-relacionamento-entre-classes)
10. [DIAGRAMA DE CLASSES (TEXTUAL)](#10-diagrama-de-classes-textual)
11. [EXEMPLO DE EXECUÇÃO DO SISTEMA](#11-exemplo-de-execução-do-sistema)
12. [CONCLUSÃO](#12-conclusão)

---

## 3. INTRODUÇÃO

No cenário futurista de 2078, a humanidade estabeleceu colônias prósperas em Marte, interconectadas por uma complexa rede de drones e aeronaves. Contudo, a expansão e a manutenção dessas operações aéreas são constantemente ameaçadas por um fenômeno natural marciano: as severas tempestades de poeira. Essas tempestades representam um desafio crítico, pois reduzem drasticamente a visibilidade, comprometem a comunicação essencial entre as colônias e as aeronaves, tornam as rotas de voo perigosas e, consequentemente, elevam o risco de falhas operacionais catastróficas. A segurança e a eficiência das missões de transporte e exploração dependem diretamente da capacidade de mitigar esses riscos.

Diante desse panorama desafiador, surge o sistema **MARS SPACIAL TRAFFIC & MISSION CONTROL**. Este projeto foi concebido com o propósito fundamental de revolucionar a gestão do tráfego aéreo e o monitoramento climático em Marte. A proposta central do sistema é oferecer uma solução robusta e inteligente que permita o controle preciso de aeronaves, o monitoramento em tempo real de tempestades de poeira, o gerenciamento otimizado de drones, a emissão proativa de alertas de segurança e o cálculo dinâmico de rotas seguras. Ao integrar essas funcionalidades, o sistema visa não apenas aprimorar a segurança das operações, mas também garantir a continuidade e o sucesso das missões intercoloniais.

---

## 4. DESCRIÇÃO DO PROJETO

O sistema **MARS SPACIAL TRAFFIC & MISSION CONTROL** é uma plataforma integrada projetada para gerenciar e otimizar as operações aéreas e o monitoramento climático no planeta Marte, especificamente no ano de 2078. Seu principal objetivo é garantir a segurança e a eficiência das missões entre as diversas colônias marcianas, que dependem fortemente de aeronaves e drones para transporte e comunicação. O sistema atua como um centro de controle inteligente, coordenando o tráfego aéreo e fornecendo informações cruciais sobre as condições meteorológicas.

O sistema foi desenvolvido para resolver o problema crítico das tempestades de poeira marcianas, que representam uma ameaça constante às operações aéreas. Essas tempestades podem reduzir drasticamente a visibilidade, interferir nas comunicações e criar rotas de voo extremamente perigosas, resultando em falhas operacionais e riscos para a vida e os equipamentos. Ao mitigar esses riscos, o sistema contribui diretamente para a segurança das colônias, permitindo que as missões sejam realizadas com maior confiança e previsibilidade.

---

## 5. FUNCIONALIDADES PRINCIPAIS

O sistema **Mars Spacial Traffic & Mission Control** incorpora funcionalidades essenciais para garantir a segurança e a eficiência das operações aéreas em Marte.

### 5.1. Monitoramento e Detecção de Tempestades
Esta funcionalidade é responsável por monitorar continuamente as condições climáticas em Marte para identificar a formação e o movimento de tempestades de poeira.
- **Método Java:** `detectarTempestade()` na classe `EventoClimatico`.

### 5.2. Cálculo de Rotas Seguras
Esta funcionalidade permite que o sistema determine as rotas de voo mais seguras para aeronaves e drones, levando em consideração as condições climáticas atuais e previstas.
- **Método Java:** `calcularRotaSegura()` na classe `PlanoDeVoo`.

### 5.3. Emissão de Alertas
Esta funcionalidade é responsável por gerar e disseminar alertas de segurança para aeronaves, drones e colônias quando condições perigosas são detectadas.
- **Método Java:** `emitirAlerta()` na classe `Alerta`.

### 5.4. Verificação de Bateria de Drone
Monitora o nível de bateria dos drones em operação, garantindo que eles tenham carga suficiente para completar suas missões.
- **Método Java:** `verificarBateria()` na classe `Drone`.

---

## 6. MODELAGEM DAS CLASSES

Para o sistema, foram definidas as seguintes classes, que encapsulam as entidades e comportamentos essenciais.

### 6.1. Classe Aeronave
Representa uma aeronave tripulada operando no espaço aéreo marciano.

### 6.2. Classe Drone
Representa um drone autônomo utilizado para monitoramento ou transporte leve.

### 6.3. Classe EventoClimatico
Representa um fenômeno climático em Marte, como uma tempestade de poeira.

### 6.4. Classe Alerta
Representa uma notificação de segurança emitida pelo sistema.

### 6.5. Classe PlanoDeVoo
Define a trajetória e os parâmetros de uma missão aérea.

---

## 11. EXEMPLO DE EXECUÇÃO DO SISTEMA

O sistema opera através de uma interface de console interativa:

1. O usuário inicia o sistema e visualiza o menu principal.
2. Seleciona a opção de gerenciamento desejada.
3. O sistema solicita os dados necessários (ex: modelo da aeronave, tipo de evento).
4. O controlador processa a informação e utiliza os serviços para persistir os dados.
5. Uma mensagem de sucesso ou a listagem dos dados é exibida.

---

## 12. CONCLUSÃO

O **Mars Spacial Traffic & Mission Control** representa um avanço conceitual na gestão de operações em ambientes hostis como Marte. Através de uma arquitetura modular e orientada a objetos, o sistema oferece as ferramentas necessárias para garantir que a expansão humana no planeta vermelho ocorra de forma segura e sustentada.
