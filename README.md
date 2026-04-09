# Minhas Músicas

Este é um projeto de exercício em Java Orientado a Objetos (POO), desenvolvido como parte do curso de Java da Alura. O projeto simula um sistema simples de músicas e podcasts, demonstrando conceitos fundamentais de POO como herança, polimorfismo e encapsulamento.

## Descrição do Exercício

O desafio consiste em criar um sistema que gerencie áudios, especificamente músicas e podcasts. Cada áudio possui atributos como título, total de reproduções e curtidas, além de uma classificação baseada em critérios específicos.

### Funcionalidades
- **Reproduzir**: Incrementa o contador de reproduções.
- **Curtir**: Incrementa o contador de curtidas.
- **Classificação**: Calculada dinamicamente baseada em reproduções (para músicas) ou curtidas (para podcasts).
- **Favoritos**: Permite incluir áudios em uma lista de preferidos, com mensagens personalizadas baseadas na classificação.

## Como foi Feito

O projeto foi estruturado utilizando os princípios de POO:

### Classes Principais

1. **Audio** (Classe Base)
   - Atributos: `titulo`, `totalReproducoes`, `totalCurtidas`, `classificacao`.
   - Métodos: `curte()`, `reproduz()`, getters e setters.
   - Serve como superclasse para Música e Podcast.

2. **Musica** (Herda de Audio)
   - Atributos adicionais: `artista`, `album`, `genero`.
   - Sobrescreve `getClassificacao()`: Retorna 10 se reproduções > 2000, senão 7.

3. **Podcast** (Herda de Audio)
   - Atributos adicionais: `apresentador`, `descricão`.
   - Sobrescreve `getClassificacao()`: Retorna 10 se curtidas > 500, senão 8.

4. **MinhasPreferidas**
   - Método `inclui(Audio audio)`: Verifica a classificação e imprime mensagens apropriadas.
   - Demonstra polimorfismo ao aceitar qualquer subclasse de Audio.

5. **Principal**
   - Classe principal com o método `main()`.
   - Cria instâncias de Música e Podcast, simula reproduções e curtidas, e inclui em favoritos.

### Conceitos Demonstrados
- **Herança**: Música e Podcast herdam de Audio.
- **Polimorfismo**: Método `getClassificacao()` é sobrescrito nas subclasses.
- **Encapsulamento**: Atributos privados com getters/setters.
- **Composição**: MinhasPreferidas utiliza objetos Audio.

### Estrutura do Projeto
```
minhasmusicas/
├── src/
│   └── br/com/alura/minhasMusicas/
│       ├── modelos/
│       │   ├── Audio.java
│       │   ├── Musica.java
│       │   ├── Podcast.java
│       │   └── MinhasPreferidas.java
│       └── Principal/
│           └── Principal.java
└── README.md
```

### Como Executar
1. Certifique-se de ter o Java instalado.
2. Compile os arquivos: `javac -d out src/br/com/alura/minhasMusicas/**/*.java`
3. Execute: `java -cp out br.com.alura.minhasMusicas.Principal.Principal`

Este projeto ilustra como aplicar conceitos de POO para modelar um domínio simples e extensível.
