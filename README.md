# Trabalho Poo 2 companhia eletrônica

Trabalho 2 – Laboratório de Programação de Computadores II;
Prof. Eduardo Cunha Campos;
Valor: 30 pontos;
Data de entrega: 18/03;
A companhia telefônica Alô mantém dados de seus clientes, números de telefone ativados, tipos de planos e chamadas telefônicas.
Tipo de Plano: código, descrição, valor mensal, franquia (minutos) e valor da chamada.
Cliente: CPF, nome e endereço.
Número de Telefone: número, cliente, plano, data/hora de ativação, data/hora de cancelamento e dia de pagamento.
O dia de pagamento deve ser um dos seguintes dias do mês: 1, 5, 10 ou 15.
A data/hora de cancelamento é opcional.
A data/hora de cancelamento deve ser superior à data/hora de ativação.
A data/hora de cancelamento deve ser superior à data/hora mais recente de chamada originada pelo número registrada no sistema.
Chamada Telefônica Originada na Rede: número de origem, número de destino, data/ hora de início da chamada, data/hora de fim de chamada.
Número de origem deve ser um número ativo no sistema (ou seja, sem data de cancelamento informada).
Número de destino pode não estar cadastrado no sistema, pois pode ser um número de outra operadora.
A data/hora de fim de chamada deve ser superior à data/hora de início de chamada.
As datas/horas de início e de fim da chamada devem ser iguais ou superiores à data/hora de ativação.
O sistema para gerenciar chamadas telefônicas dessa operadora deverá prover as seguintes funcionalidades:
Tipo de Plano:
• Cadastrar: inclui um tipo de plano no sistema.
• Alterar: permite alterar os dados de um tipo de plano. Todos os campos são alteráveis, exceto o código.
• Excluir: exclui um tipo de plano do sistema, dada o seu código. Não é permitida a exclusão de tipo de plano que esteja relacionado a número telefônico.
• Listar: lista todos os dados de todos os tipos de plano cadastrados.
• Pesquisar: dado o código, exibe os dados do tipo de plano.
Cliente:
• Cadastrar: cadastra um cliente no sistema. Não é permitido o cadastro de cliente com CPF que já esteja cadastrado no sistema.
• Alterar: permite alterar os dados de um cliente. Todos os campos são alteráveis, exceto o CPF.
• Excluir: exclui um cliente do sistema. Não é permitida a exclusão de cliente que esteja associado a algum número de telefone.
• Listar: lista os dados de todos os clientes cadastrados no sistema.
• Pesquisar: dado o CPF do cliente, exibe os seus dados.
Número de Telefone:
• Cadastrar: permite cadastrar um número de telefone no sistema. Não é permitido o cadastro de telefone com número que esteja ativo no sistema. Um número está ativo quando não possui data de cancelamento informada.
• Alterar: permite alterar os dados de um número de telefone. Todos os campos são alteráveis, exceto a data de ativação e o número do telefone.
• Excluir: permite excluir um número de telefone do sistema.
• Cancelar número: registra a data de cancelamento do número.
• Listar: lista os dados de todos os números cadastrados no sistema.
• Pesquisar: dado o número do telefone, exibe seus dados.
Chamada Originada:
• Registrar: permite registrar uma chamada originada. É permitido o registro de chamadas originadas somente para número ativo na data da chamada.
• Alterar: permite alterar os dados de uma chamada originada. Esta opção também deverá observar a restrição de que é permitido o registro de chamadas originadas somente para número ativo na data da chamada.
• Excluir: permite excluir uma chamada originada.
• Listar: lista os dados de todas as chamadas cadastradas no sistema.
• Pesquisar: dado o número de telefone, exibe os dados das chamadas originadas por ele.
Relatórios:
• Números telefônicos de um cliente
O usuário informa um CPF de um cliente e o sistema exibe os dados dos telefones (ativos e cancelados) dele.
• Conta de telefone
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