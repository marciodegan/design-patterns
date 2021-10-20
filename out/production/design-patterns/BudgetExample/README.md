- Separamos o calculo do Imposto em diferentes classes
- Uma classe para cada imposto
- O case-if/else que tinhamos na classe CalculadoraImpostos e transferido para cada classe de imposto.
- Ao criar as duas classes de imposto (ICMS e ISS), teremos ambas com 1 método com o mesmo nome "calcular". Então criamos uma interface, deixando o código mais flexivel, usando o polimorfismo.
- Crio a interface TipoImposto e assim, posso excluir o Enum TipoImposto.
- Dentro dessa interface deixo a assinatura do método "calcular()"
- Assim tenho o contrato => todo TipoDeImposto terá o método calcular();
- Agora cada classe de imposto precisa implementar a interface Imposto.

STRATEGY - sempre que tiver um algoritmo (uma validacao, uma regra, um calculo) e ela varia de acordo com determinado parametro, ao inves dessa informacao ser uma String ou um Enum, ela pode ser uma propria classe. Cada classe terá a sua implementação, a sua estratégia de calculo especifica.
Deixando o código mais coeso...uma classe nao conhece a outra.

- Ja a calculadora de Descontos não será possivel usar o padrão strategy. pois precisaria passar o desconto como parametro, porém temos um if/else que precisaria existir em algum outro lugar.
- Na calculadora de descontos temos um fluxo, uma cadeia que precisa ser avaliada para saber qual desconto aplicar.
- O Strategy é utilizado baseado no parametro que será passado. Se determinado parametro é passado, determinada regra é realizada.

-  Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.