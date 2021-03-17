# Trabalho Poo 2 companhia eletrônica

Trabalho 2 – Laboratório de Programação de Computadores II  
Prof. Eduardo Cunha Campos  
Valor: 30 pontos  
Data de entrega: 18/03;
A companhia telefônica Alô mantém dados de seus clientes, números de telefone ativados, tipos de planos e chamadas telefônicas.
Tipo de Plano: código, descrição, valor mensal, franquia (minutos) e valor da chamada.<br/>
**Cliente:** CPF, nome e endereço.<br/>
**Número de Telefone**: número, cliente, plano, data/hora de ativação, data/hora de cancelamento e dia de pagamento.
O dia de pagamento deve ser um dos seguintes dias do mês: 1, 5, 10 ou 15.<br/>
A data/hora de cancelamento é opcional.<br/>
A data/hora de cancelamento deve ser superior à data/hora de ativação.<br/>
A data/hora de cancelamento deve ser superior à data/hora mais recente de chamada originada pelo número registrada no sistema.<br/>
**Chamada Telefônica Originada na Rede:** número de origem, número de <br/>destino, data/ hora de início da chamada, data/hora de fim de chamada.
Número de origem deve ser um número ativo no sistema (ou seja, sem data de cancelamento informada).<br/>
Número de destino pode não estar cadastrado no sistema, pois pode ser um número de outra operadora.<br/>
A data/hora de fim de chamada deve ser superior à data/hora de início de chamada.<br/>
As datas/horas de início e de fim da chamada devem ser iguais ou superiores à data/hora de ativação.<br/>
O sistema para gerenciar chamadas telefônicas dessa operadora deverá prover as seguintes funcionalidades:<br/>
**Tipo de Plano:**<br/>
• ***Cadastrar***: inclui um tipo de plano no sistema.<br/>
•***Alterar***: permite alterar os dados de um tipo de plano. Todos os campos são alteráveis, exceto o código.<br/>
• ***Excluir***: exclui um tipo de plano do sistema, dada o seu código. Não é permitida a exclusão de tipo de plano que esteja relacionado a número telefônico.<br/>
• ***Listar***: lista todos os dados de todos os tipos de plano cadastrados.<br/>
• ***Pesquisar***: dado o código, exibe os dados do tipo de plano.<br/>
**Cliente:**<br/>
• ***Cadastrar***: cadastra um cliente no sistema. Não é permitido o cadastro de cliente com CPF que já esteja cadastrado no sistema.<br/>
• ***Alterar***: permite alterar os dados de um cliente. Todos os campos são alteráveis, exceto o CPF.<br/>
• ***Excluir***: exclui um cliente do sistema. Não é permitida a exclusão de cliente que esteja associado a algum número de telefone.<br/>
• ***Listar***: lista os dados de todos os clientes cadastrados no sistema.<br/>
• ***Pesquisar***: dado o CPF do cliente, exibe os seus dados.<br/>
**Número de Telefone:**<br/>
• ***Cadastrar***: permite cadastrar um número de telefone no sistema. Não é permitido o cadastro de telefone com número que esteja ativo no sistema. Um número está ativo quando não possui data de cancelamento informada.<br/>
• ***Alterar***: permite alterar os dados de um número de telefone. Todos os campos são alteráveis, exceto a data de ativação e o número do telefone.<br/>
• ***Excluir**: permite excluir um número de telefone do sistema.<br/>
• ***Cancelar número***: registra a data de cancelamento do número.<br/>
• ***Listar***: lista os dados de todos os números cadastrados no sistema.<br/>
• ***Pesquisar***: dado o número do telefone, exibe seus dados.<br/>
**Chamada Originada:**<br/>
• ***Registrar:*** permite registrar uma chamada originada. É permitido o registro de chamadas originadas somente para número ativo na data da chamada.<br/>
• ***Alterar***: permite alterar os dados de uma chamada originada. Esta opção também deverá observar a restrição de que é permitido o registro de chamadas originadas somente para número ativo na data da chamada.
• ***Excluir:*** permite excluir uma chamada originada.<br/>
• ***Listar:*** lista os dados de todas as chamadas cadastradas no sistema.<br/>
• ***Pesquisar:*** dado o número de telefone, exibe os dados das chamadas originadas por ele.<br/><br/>
**Relatórios:**
• Números telefônicos de um cliente
O usuário informa um CPF de um cliente e o sistema exibe os dados dos telefones (ativos e cancelados) dele.<br/>
• Conta de telefone<br/>
O usuário informa o número de telefone e o mês/ano de referência. O sistema exibe os seguintes dados:
- lista de chamadas originadas no mês, com suas respectivas durações e preços.
- total de duração das chamadas
- franquia em minutos do plano
- minutos além da franquia
- valor do plano
- valor total a ser pago (soma do valor do plano e do valor referente aos minutos além da franquia)
1. O que fazer e como se organizar?
Os alunos deverão implementar um programa em Java que atenda aos requisitos do software. Na implementação, os alunos deverão utilizar Arranjos, ArrayLists e/ou HashMaps. Outros recursos de implementação deverão ser autorizados pelo professor.
O Trabalho 2 deverá ser feito em grupos de 4 pessoas. Lembrando que os grupos deverão ser os mesmos definidos no Trabalho 1.
2. O que entregar?
Todos os trabalhos deverão ser enviados para: edu@cefetmg.br. O grupo deverá colocar todo o código-fonte do trabalho em um arquivo zip. O arquivo zipado deverá conter os nomes completos dos alunos bem como os seus números de matrícula. Qualquer dúvida sobre o trabalho deverá ser enviada para o monitor da disciplina.