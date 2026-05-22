📋 ESPECIFICAÇÃO DO PROJETO: Sistema LogiTech (v1.0)

De: Gerência de Logística - LogiTech Transportes

Para: Desenvolvedor Java Backend

Assunto: Protótipo para controle de veículos de entrega e cálculo de frete.

Olá, dev! Estamos expandindo nossa operação de entregas e precisamos de um sistema rodando no terminal para que nossa equipe de expedição consiga cadastrar nossos veículos e simular o custo de envio de mercadorias.
1. Regras para os Veículos (A Arquitetura)

O sistema deve trabalhar com dois tipos de veículos: Caminhão e Moto.

    Atributos Obrigatórios: Todo veículo cadastrado na frota deve possuir:

        Placa (String ou número identificador único).

        Modelo (String).

        Capacidade Máxima de Carga (double, em kg).

2. Regras de Negócio Dinâmicas (O Polimorfismo)

A empresa precisa calcular o valor do frete com base na distância da entrega (em quilômetros) e no peso da carga (em kg). O comportamento desse cálculo muda radicalmente dependendo do veículo:

    Envio por Moto: >     * Validação: A moto é ágil, mas tem limite. Se o peso da carga ultrapassar a capacidade máxima da moto, o sistema deve barrar o envio com uma mensagem de erro.

        Custo do Frete: O valor é fixo: R$ 2,00 por quilômetro rodado, independentemente do peso.

    Envio por Caminhão:

        Validação: Se o peso da carga ultrapassar a capacidade máxima do caminhão, o sistema também deve barrar o envio.

        Custo do Frete: O cálculo é mais complexo: R$ 5,00 por quilômetro rodado, mais uma taxa adicional de R$ 0,50 por cada quilo de carga que ele estiver carregando.

3. A Interface da Expedição (O Menu de Controle)

O menu interativo no console deve permitir as seguintes operações:

    Cadastrar Moto: Solicitar placa, modelo e capacidade de carga (ex: 30 kg).

    Cadastrar Caminhão: Solicitar placa, modelo e capacidade de carga (ex: 5000 kg).

    Simular Envio de Mercadoria: >     * O usuário digita a placa do veículo que deseja usar.

        O sistema busca o veículo na lista de frota.

        Se encontrar, o sistema pede o peso da carga (kg) e a distância da entrega (km).

        O sistema processa as validações e exibe na tela o custo total do frete calculado com base nas regras daquele veículo específico.

    Listar Frota Cadastrada: Exibir na tela todos os veículos cadastrados, mostrando a placa, modelo, capacidade e o tipo do veículo (usando o instanceof para detalhar se é Moto ou Caminhão).

    Encerrar Programa.