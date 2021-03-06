# JAVA - Design Patterns
Project create to implements the design patterns using java.

## Classification of patterns
Design patterns differ by their complexity, level of detail and scale of applicability to the entire system being designed. 
I like the analogy to road construction: you can make an intersection safer by either installing some traffic lights or 
building an entire multi-level interchange with underground passages for pedestrians.

In addition, all patterns can be categorized by their intent, or purpose. This book covers three main groups of patterns:

**Creational:** patterns provide object creation mechanisms that increase flexibility and reuse of existing code.

![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/creationals.JPG)

**Structural:** patterns explain how to assemble objects and classes into larger structures, while keeping the structures flexible and efficient.

![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structurals.JPG)

**Behavioral:** patterns take care of effective communication and the assignment of responsibilities between objects.

![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behaviorals.JPG)

---

## Patterns

### Abstract Factory
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/creational/abstract-factory.png)

Is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on 
the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.
Ref: https://refactoring.guru/design-patterns/abstract-factory

---

### Adapter 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/adapter.png)

Converte uma interface de uma classe existente em outra interface esperada pelos clientes. Permite que algumas classes
com interfaces diferentes trabalhem em conjunto.

Ref: https://refactoring.guru/design-patterns/adapter

---

### Bridge 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/bridge.png)

Separa uma implementação de sua abstração, de forma que ambas possam variar independentemente.

Ref: https://refactoring.guru/design-patterns/bridge

---

### Builder 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/creational/builder.png)

Separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo possa criar 
representações diferentes.

Ref: https://refactoring.guru/design-patterns/builder

---

### Chain of Responsibility
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/chain-of-responsibility.png)

Evita o acoplamento do remetente de uma solicitação ao seu destinatário, permitindo que diversos objetos tenham a 
chance de tratar a solicitação. Encadeia os objetos receptores e transmite a solicitação através da cadeia até que
um objeto a trate.
> As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. 
> This pattern decouples sender and receiver of a request based on type of request. This pattern comes under behavioral patterns.
> In this pattern, normally each receiver contains reference to another receiver. 
> If one object cannot handle the request then it passes the same to the next receiver and so on.

Ref: https://refactoring.guru/design-patterns/chain-of-responsibility

---

### Command
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/command.png)

Encapsula uma solicitação como um objeto, permitindo que clientes sejam parametrizados com diferentes solicitações
e suportem operações que possam ser desfeitas.

Ref: https://refactoring.guru/design-patterns/command

---

### Composite 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/composite.png)

Compõe objetos em estruturas de árvore para representar hierarquias do tipo partetodo. Permite que os clientes 
tratem objetos individuais e composições de maneira uniforme.

Ref: https://refactoring.guru/design-patterns/composite

---

### Decorator 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/decorator.png)

Atribui responsabilidades adicionais a um objeto dinamicamente. Fornecem uma alternativa flexível a sub-classes
para extensão de funcionalidade.

Ref: https://refactoring.guru/design-patterns/decorator

---

### Façade 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/facade.png)

Fornece uma interface mais simples para um conjunto de interfaces de um subsistema.

Ref: https://refactoring.guru/design-patterns/facade

---

### Factory Method 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/creational/factory-method.png)

Define uma interface para criação de um objeto, mas deixa as sub-classes decidirem qual a classe a ser instanciada. 

Ref: https://refactoring.guru/design-patterns/factory-method

---

### Flyweight
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/flyweight.png)

Usa compartilhamento para suportar grandes quantidades de objetos, de granularidade fina, de maneira eficiente.

Ref: https://refactoring.guru/design-patterns/flyweight

---

### Interpreter 

Dada uma linguagem, define uma representação para sua gramática juntamente com um interpretador que usa a 
representação para interpretar sentenças nesta linguagem.

---

### Intercept

The intercepting filter design pattern is used when we want to do some pre-processing / post-processing with request
or response of the application. Filters are defined and applied on the request before passing the request to actual target application. 
Filters can do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers. 
Following are the entities of this type of design pattern.
> Filter - Filter which will performs certain task prior or after execution of request by request handler.
> Filter Chain - Filter Chain carries multiple filters and help to execute them in defined order on target.
> Target - Target object is the request handler
> Filter Manager - Filter Manager manages the filters and Filter Chain.
> Client - Client is the object who sends request to the Target object.

---

### Iterator
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/iterator.png)

Fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação.

Ref: https://refactoring.guru/design-patterns/iterator

---

### Mediator
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/mediator.png)

Define um objeto que encapsula como um conjunto de objetos interage.

Ref: https://refactoring.guru/design-patterns/mediator
 
---

### Memento 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/memento.png)

Sem violar o encapsulamento, captura e externaliza o estado interno de um objeto, de modo que o mesmo possa ser 
restaurado posteriormente.

Ref: https://refactoring.guru/design-patterns/memento

---

### Observer
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/observer.png)

Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus 
dependentes são notificados.
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, 
its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

Ref: https://refactoring.guru/design-patterns/observer

---

### Prototype 
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/creational/prototype.png)

Especifica os tipos de objetos a serem criados utilizando uma instância protótipo e criando novos objetos copiando 
este protótipo.

Ref: https://refactoring.guru/design-patterns/prototype

---

### Proxy
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/structural/proxy.png)

Fornece um objeto representante de outro objeto, de forma a controlar o acesso ao mesmo.

Ref: https://refactoring.guru/design-patterns/proxy

---

### Singleton
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/creational/singleton.png)

Garante que uma classe tenha somente uma instância e fornece um ponto de acesso global a ela.
Portanto, Singleton é um design pattern de criação cujo objetivo é fazer que a classe tecnicamente ofereça
apenas uma instância de objeto, que será controlada por ela mesma. Ao aplicarmos o Singleton nas situações
corretas, temos como conseqüência um número menor de objetos de “mortalidade infantil”, pois a classe
disponibilizará apenas acesso a um único objeto.
> Herança com Singleton:  Este tipo de implementação Singleton acaba limitando o uso de herança e polimorfismos em 
> função de trabalharmos com o construtor private. Para obter melhores resultados com objetos Singleton que devem ser
> criados a partir de uma família de classes, devemos aplicar o design pattern Factory

Ref: https://refactoring.guru/design-patterns/singleton

---

### State
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/state.png)

Permite que um objeto altere seu comportamento quando seu estado muda.

Ref: https://refactoring.guru/design-patterns/state

---

### Strategy
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/strategy.png)

Define uma familia de algoritmos e os encapsula tornando-os intercambiáveis.
> In Strategy pattern, a class behavior or its algorithm can be changed at run time.
> This type of design pattern comes under behavior pattern. 
> In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies
> as per its strategy object. 
> The strategy object changes the executing algorithm of the context object.

Ref: https://refactoring.guru/design-patterns/strategy

---

### Template Method
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/template-method.png)

Define o esqueleto de um algoritmo em uma operação, postergando a implementação de alguns passos para sub-classes.
> Template Method é uma técnica de modelagem de classes abstratas e sub-classes, que se baseia na seguinte
> idéia:
> 1. Definimos uma classe abstrata com métodos abstratos e métodos concretos
> 2. Nos métodos concretos da classe abstrata, definimos a estrutura dos algoritmos, chamando seus
>    métodos abstratos, mesmo sem saber qual será a implementação
> 3. Definimos sub-classes que implementam os métodos abstratos.
>  Dessa forma eliminamos os principais problemas da solução anterior: repetição de códigos e falta de garantia da
>  integridade da execução do algoritmo.

Ref: https://refactoring.guru/design-patterns/template-method

---

### Visitor
![](https://github.com/rafacancian/java-design-patterns/blob/main/images/animations/behavioral/visitor.png)

Representa uma operação a ser executada sobre os elementos da estrutura de um objeto. Permite que uma nova operação
seja definida sem mudas as classes dos elementos sobre os quais opera.
O Visitor é um design pattern muito interessante que permite acrescentarmos operações em um objeto sem a
necessidade de alterá-lo. Normalmente o Visitor representará uma operação comum que atuará em uma família
de objetos de um mesmo tipo, podendo esta operação ser específica para sub-tipos daquela família de objetos. O
Visitor é também uma maneira elegante de você reduzir radicalmente o uso de extensos if(objeto
instanceof X), else if(objeto instanceof Y), propondo um modelo onde uma classe Visitor poderá
representar a operação para todos os seus sub-tipos e esta operação poderá ser acionada pelo objeto sem ele
conhecer sua realização concreta.

Ref: https://refactoring.guru/design-patterns/visitor