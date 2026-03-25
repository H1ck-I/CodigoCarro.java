# 🚗 Sistema de Controle de Carro em Java

Projeto desenvolvido em **Java** com o objetivo de simular o funcionamento básico de um carro, incluindo controle de:

* Ligamento e desligamento
* Velocidade
* Marchas
* Direção (esquerda/direita)

---

## 📌 Funcionalidades

✔️ Ligar e desligar o carro
✔️ Acelerar e reduzir velocidade
✔️ Subir e descer marchas
✔️ Controle de limites de velocidade por marcha
✔️ Virar para esquerda e direita com restrições de velocidade
✔️ Verificar velocidade atual e marcha

---

## ⚙️ Regras do Sistema

* O carro só pode ser ligado se estiver desligado

* Só pode ser desligado se:

  * Velocidade = 0
  * Marcha = 0 (ponto morto)

* Não é possível acelerar:

  * Com o carro desligado
  * Em ponto morto

* Cada marcha possui um limite de velocidade:

| Marcha | Velocidade (km/h) |
| ------ | ----------------- |
| 1ª     | 0 - 20            |
| 2ª     | 21 - 40           |
| 3ª     | 41 - 60           |
| 4ª     | 61 - 80           |
| 5ª     | 81 - 100          |
| 6ª     | 101 - 120         |

* Velocidade máxima: **120 km/h**

* Só é possível virar (direita/esquerda) entre:

  * **1 km/h e 40 km/h**

---

## 🧠 Estrutura do Código

Classe principal:

```java
carro
```

Principais métodos:

* `ligar()`
* `desligar()`
* `acelerar()`
* `diminuirVelocidade()`
* `subirMarcha()`
* `descerMarcha()`
* `virarDireita()`
* `virarEsquerda()`
* `verificarVelocidade()`

---

## ▶️ Como executar

1. Compile o projeto:

```bash
javac Main.java
```

2. Execute:

```bash
java Main
```

---

## 🎯 Objetivo

Este projeto foi desenvolvido com fins educacionais para praticar:

* Programação orientada a objetos (POO)
* Estruturas condicionais
* Métodos em Java
* Lógica de programação

---

## 👨‍💻 Autor

Desenvolvido por **Alexandre Henrique Schmidt Drum**

---

## 📌 Melhorias futuras

* Interface gráfica (GUI)
* Simulação mais realista
* Sistema de combustível
* Controle de frenagem

---
