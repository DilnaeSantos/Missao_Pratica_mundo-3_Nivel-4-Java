- # 📝 Relatório discente de acompanhamento

## Informações do Curso

- **Curso:** Desenvolvimento Full Stack
- **Universidade:** Estácio de Sá - Campus São José dos Pinhais
- **Período:** 3º
- **Turma:** 9001
- **Tutor:** Jhonatan Alves
- **Matéria:** Vamos Manter as Informações? (RPG0015)

## Informações do Aluno

- **Nome:** Dilnae Rennan Souza dos Santos
- **Matrícula:** 202302631631

## Análise e Conclusão

### Organização de um Projeto Corporativo no NetBeans

No NetBeans, um projeto corporativo é organizado em módulos distintos para separar as camadas de aplicação, como apresentação, lógica de negócios e acesso a dados. Por exemplo, em um projeto baseado em Jakarta EE, podem existir diferentes módulos como:
- `CadastroEE-ejb`: Contém os Enterprise JavaBeans (EJBs) que implementam a lógica de negócios.
- `CadastroEE-war`: Contém os componentes web, como Servlets e páginas JSP.
- `CadastroEE-client`: Pode conter um aplicativo cliente para acessar os EJBs.

### Papel das Tecnologias JPA e EJB na Construção de Aplicativos Web no Ambiente Java

- **JPA (Java Persistence API)**: Utilizada para gerenciar dados relacionais em aplicações Java. Permite mapear objetos Java para tabelas de banco de dados e vice-versa, proporcionando uma forma simplificada de interagir com bancos de dados.

- **EJB (Enterprise JavaBeans)**: São componentes de servidor que encapsulam a lógica de negócios de uma aplicação. Facilitam a criação de aplicações transacionais, seguras e escaláveis. Os EJBs podem ser Session Beans, usados para modelar comportamentos de negócio, ou Message-Driven Beans, que lidam com a integração assíncrona.

### Melhoria de Produtividade no NetBeans com JPA e EJB

O NetBeans melhora a produtividade ao fornecer:
- Assistentes de criação de entidades JPA e Session Beans EJB.
- Ferramentas visuais para configuração de persistência (`persistence.xml`).
- Suporte integrado para servidores de aplicação, como GlassFish e Payara.
- Facilita o mapeamento de entidades JPA para tabelas de banco de dados.
- Geração automática de código para operações CRUD (Create, Read, Update, Delete).

### Suporte a Servlets no NetBeans

- **Servlets**: São classes Java que processam requisições e respostas HTTP em uma aplicação web. São componentes essenciais para a construção de aplicativos web dinâmicos em Java.

- **Suporte do NetBeans**:
  - Assistente para criação de Servlets.
  - Geração automática de métodos do ciclo de vida do Servlet (`init`, `doGet`, `doPost`, `destroy`).
  - Facilita a configuração de mapeamentos de URL no arquivo `web.xml`.
  - Integração com servidores de aplicação para testar e depurar Servlets.

### Comunicação entre Servlets e Session Beans do Pool de EJBs

A comunicação entre Servlets e Session Beans é realizada através de injeção de dependência usando a anotação `@EJB`. Isso permite que o Servlet chame métodos nos EJBs para realizar operações de negócios.

### Funcionamento do Padrão Front Controller na Arquitetura MVC

- **Padrão Front Controller**: Centraliza todas as requisições em um único controlador que encaminha a requisição para o componente apropriado, facilitando o tratamento uniforme de requisições e respostas.

- **Implementação em Java (MVC)**:
  - Um único Servlet (Front Controller) intercepta todas as requisições.
  - O Servlet determina a ação a ser executada com base em parâmetros da requisição.
  - Encaminha a requisição para componentes específicos (Model, View) para processamento e renderização.

### Diferenças e Semelhanças entre Servlets e JSPs

- **Servlets**:
  - São classes Java que gerenciam requisições e respostas HTTP.
  - Código Java é misturado com HTML gerado.
  - Mais adequados para lógica de controle.

- **JSPs (JavaServer Pages)**:
  - São páginas HTML com código Java embutido.
  - Mais fáceis para escrever e manter conteúdo dinâmico.
  - Melhor para lógica de apresentação.

- **Semelhanças**:
  - Ambos são componentes server-side usados para gerar conteúdo dinâmico.
  - Podem interagir com objetos JavaBeans, EJBs e outros componentes Java.

### Redirecionamento Simples vs. Uso do Método Forward com RequestDispatcher

- **Redirecionamento Simples (`sendRedirect`)**:
  - Cliente é informado para fazer uma nova requisição para uma URL diferente.
  - URL no navegador é alterada.
  - Novo ciclo de requisição-resposta é iniciado.

- **Forward (`RequestDispatcher.forward`)**:
  - O servidor encaminha a requisição para outro recurso internamente.
  - URL no navegador não muda.
  - Mesmo ciclo de requisição-resposta é mantido.

- **Parâmetros e Atributos**:
  - **Parâmetros**: Dados enviados pelo cliente como parte da URL ou corpo da requisição.
  - **Atributos**: Dados armazenados no objeto `HttpServletRequest` para compartilhar informações entre componentes durante a mesma requisição.

### Utilização do Framework Bootstrap

O Bootstrap é utilizado para estilizar componentes HTML e criar layouts responsivos de maneira rápida e consistente. Inclui CSS e JavaScript prontos para uso, além de componentes de interface do usuário como botões, formulários e tabelas.

### Independência Estrutural do HTML com Bootstrap

O Bootstrap separa claramente o estilo e a estrutura do HTML, permitindo que os desenvolvedores apliquem classes CSS a elementos HTML para estilização sem modificar a estrutura básica do HTML. Isso facilita a manutenção e atualização do design sem alterar o conteúdo HTML.

### Relação entre Bootstrap e a Responsividade da Página

Bootstrap inclui um sistema de grid responsivo que adapta o layout das páginas a diferentes tamanhos de tela e dispositivos. Utilizando classes CSS específicas, os desenvolvedores podem criar layouts flexíveis que se ajustam automaticamente para proporcionar uma experiência de usuário otimizada em dispositivos móveis, tablets e desktops.

---

Este documento fornece uma visão geral das tecnologias e práticas utilizadas no projeto desenvolvido no NetBeans, destacando a importância de JPA, EJB, Servlets, e a integração com o framework Bootstrap para criar aplicações web robustas e responsivas.
