# java-design-patterns
Project create to implements the design patterns of Java.
Os 23 design patterns GoF representam um conjunto de técnicas de modelagem orientada a objetos.
A seguir seguem as descrições dos patterns extraídas do próprio livro do GoF.

####Abstract Factory 
> Fornece uma interface para a criação de uma família de objetos relacionados ou dependentes sem fornecer os detalhes
> de implementação das classes concretas.

####Adapter 
> Converte uma interface de uma classe existente em outra interface esperada pelos clientes. Permite que algumas classes
> com interfaces diferentes trabalhem em conjunto.

####Bridge 
> Separa uma implementação de sua abstração, de forma que ambas possam variar independentemente.

####Builder 
> Separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo possa criar 
> representações diferentes.

####Chain of Responsibility
> Evita o acoplamento do remetente de uma solicitação ao seu destinatário, permitindo que diversos objetos tenham a 
> chance de tratar a solicitação. Encadeia os objetos receptores e transmite a solicitação através da cadeia até que
> um objeto a trate.

####Command
> Encapsula uma solicitação como um objeto, permitindo que clientes sejam parametrizados com diferentes solicitações
> e suportem operações que possam ser desfeitas.

####Composite 
> Compõe objetos em estruturas de árvore para representar hierarquias do tipo partetodo. Permite que os clientes 
> tratem objetos individuais e composições de maneira uniforme.

####Decorator 
> Atribui responsabilidades adicionais a um objeto dinamicamente. Fornecem uma alternativa flexível a sub-classes
> para extensão de funcionalidade.

####Façade 
> Fornece uma interface mais simples para um conjunto de interfaces de um subsistema.

####Factory Method 
> Define uma interface para criação de um objeto, mas deixa as sub-classes decidirem qual a classe a ser instanciada. 
> Design-pattern Descrição

####Flyweight
> Usa compartilhamento para suportar grandes quantidades de objetos, de granularidade fina, de maneira eficiente.

####Interpreter 
> Dada uma linguagem, define uma representação para sua gramática juntamente com um interpretador que usa a 
> representação para interpretar sentenças nesta linguagem.

####Iterator
> Fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação.

####Mediator
> Define um objeto que encapsula como um conjunto de objetos interage.
 
####Memento 
> Sem violar o encapsulamento, captura e externaliza o estado interno de um objeto, de modo que o mesmo possa ser 
> restaurado posteriormente.

####Observer
> Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus 
> dependentes são notificados.

####Prototype 
> Especifica os tipos de objetos a serem criados utilizando uma instância protótipo e criando novos objetos copiando 
> este protótipo.

####Proxy
> Fornece um objeto representante de outro objeto, de forma a controlar o acesso ao mesmo.

####Singleton
> Garante que uma classe tenha somente uma instância e fornece um ponto de acesso global a ela.

####State
> Permite que um objeto altere seu comportamento quando seu estado muda.

####Strategy
> Define uma familia de algoritmos e os encapsula tornando-os intercambiáveis.

####Template Method
> Define o esqueleto de um algoritmo em uma operação, postergando a implementação de alguns passos para sub-classes.

####Visitor
> Representa uma operação a ser executada sobre os elementos da estrutura de um objeto. Permite que uma nova operação
> seja definida sem mudas as classes dos elementos sobre os quais opera.
