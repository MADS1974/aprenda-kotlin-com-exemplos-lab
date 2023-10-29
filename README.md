# Desafio de Projeto (Lab)

Este código em Kotlin modela um cenário educacional onde existem conceitos de Formação (um curso), Usuários (alunos) e Conteúdo Educacional. O objetivo é criar uma Formação, matricular Usuários nela e, em seguida, exibir informações detalhadas sobre esses Usuários, a Formação em que estão matriculados e os Conteúdos Educacionais associados.


A enumeração (enum) chamada Nivel define três níveis possíveis de conteúdo educacional: Básico, Intermediário e Avançado.

A classe Usuario é uma data class que representa um usuário com um campo nome.

A classe ConteudoEducacional é outra data class que representa o conteúdo educacional com campos como nome, duracao e nivel. A duração da aula é definida em minutos.

A classe Formacao é a parte central do cenário. Ela representa uma formação (curso) com informações sobre seu nome, nivel e uma lista de conteudos. Além disso, mantém uma lista de Usuários matriculados.

A função matricular na classe Formacao permite matricular um ou mais Usuários na formação. Isso é feito usando uma lista variável de argumentos (varargs).

Na função main, são criados uma instância da classe Formacao, três Usuários e, em seguida, os Usuários são matriculados na Formacao.

Dentro do loop for, as informações sobre os Usuários, a Formacao e os Conteúdos Educacionais são impressas. O joinToString é usado para formatar os Conteúdos Educacionais em uma única linha, separados por vírgulas.

### [LinkedIN  MADS1974](https://www.linkedin.com/in/mads1974/)

Este projeto em Kotlin foi feito conforme as orientações do especialista Venilton FalvoJr 👋 ✨ Tech Lead na DIO e entusiasta de tecnologia e educação.
### [Github (falvojr)](https://github.com/falvojr)

