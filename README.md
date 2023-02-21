# Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.

Esse projeto foi desenvolvido uma API REST que gerencia um estoque de cerveja, onde é possivel cadastrar cervejas, passando suas propriedades como: Nome, Marca, Capacidade maxima, Quantidade e o Tipo de Cerveja, conta também com o controle de incremento e decremento de cervejas do estoque.

#### Para executar o projeto:
```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/beers
```

Para executar a suíte de testes desenvolvida basta executar o seguinte comando:

```shell script
mvn clean test
```

#### Requisitos:
* Java 17 ou versões superiores.
* Maven 3.8.7 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.

#### Recursos de teste unitário utilizado:
* Junit
* Hamcrest
* Mockito




</br>
</br>
</br>
</br>
</br>


##### Agradecimentos ao instrutor:
Rodrigo Peleias 