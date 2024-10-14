import banco


lista = [
    {
        "assunto": "Reunião de Planejamento",
        "destinatario": "joao@example.com",
        "remetente": "maria@example.com",
        "conteudo": "Olá João, vamos agendar a reunião de planejamento para a próxima segunda-feira?"
    },
    {
        "assunto": "Entrega de Relatório",
        "destinatario": "ana@example.com",
        "remetente": "joao@example.com",
        "conteudo": "Ana, o relatório está pronto e foi enviado para o seu e-mail."
    },
    {
        "assunto": "Convite para evento",
        "destinatario": "maria@example.com",
        "remetente": "evento@empresa.com",
        "conteudo": "Você está convidada para o nosso evento anual. Confirme sua presença."
    },
    {
        "assunto": "Atualização de Projeto",
        "destinatario": "fernando@example.com",
        "remetente": "carla@example.com",
        "conteudo": "Fernando, aqui está a atualização do projeto conforme discutido na reunião."
    },
    {
        "assunto": "Lembrete: Prazo Final",
        "destinatario": "beatriz@example.com",
        "remetente": "gustavo@example.com",
        "conteudo": "Beatriz, o prazo final para envio dos documentos é amanhã às 17h."
    },
    {
        "assunto": "Alteração no Horário da Reunião",
        "destinatario": "joao@example.com",
        "remetente": "maria@example.com",
        "conteudo": "João, a reunião foi alterada para as 15h."
    },
    {
        "assunto": "Confirmação de Pagamento",
        "destinatario": "cliente@example.com",
        "remetente": "financeiro@empresa.com",
        "conteudo": "Informamos que o pagamento foi recebido com sucesso."
    },
    {
        "assunto": "Parabéns pelo desempenho",
        "destinatario": "carlos@example.com",
        "remetente": "rh@empresa.com",
        "conteudo": "Carlos, parabéns pelo seu excelente desempenho no último trimestre!"
    },
    {
        "assunto": "Atualização de Software",
        "destinatario": "suporte@example.com",
        "remetente": "fernando@example.com",
        "conteudo": "O software foi atualizado para a versão mais recente. Favor verificar."
    },
    {
        "assunto": "Oferta de emprego",
        "destinatario": "maria@example.com",
        "remetente": "recrutamento@empresa.com",
        "conteudo": "Gostaríamos de oferecer uma posição na nossa equipe de desenvolvimento."
    },
    {
        "assunto": "Bem-vindo à equipe",
        "destinatario": "novato@example.com",
        "remetente": "gestor@empresa.com",
        "conteudo": "Seja bem-vindo à equipe! Estamos ansiosos para trabalhar com você."
    },
    {
        "assunto": "Reserva confirmada",
        "destinatario": "cliente@example.com",
        "remetente": "reservas@hotel.com",
        "conteudo": "Sua reserva no hotel foi confirmada. Aguardamos sua chegada!"
    },
    {
        "assunto": "Solicitação de Feedback",
        "destinatario": "cliente@example.com",
        "remetente": "suporte@empresa.com",
        "conteudo": "Poderia nos fornecer feedback sobre o atendimento que recebeu?"
    },
    {
        "assunto": "Instruções para entrega",
        "destinatario": "entregador@example.com",
        "remetente": "logistica@empresa.com",
        "conteudo": "Favor seguir as instruções para a entrega na Rua 123, Bairro XYZ."
    },
    {
        "assunto": "Pedido de Orçamento",
        "destinatario": "vendas@empresa.com",
        "remetente": "cliente@example.com",
        "conteudo": "Gostaria de solicitar um orçamento para o fornecimento de 100 unidades do produto XYZ."
    },
    {
        "assunto": "Cancelamento de Assinatura",
        "destinatario": "suporte@empresa.com",
        "remetente": "cliente@example.com",
        "conteudo": "Desejo cancelar minha assinatura a partir do próximo mês."
    },
    {
        "assunto": "Sugestão de Melhorias",
        "destinatario": "desenvolvimento@empresa.com",
        "remetente": "cliente@example.com",
        "conteudo": "Tenho algumas sugestões de melhorias para o sistema atual."
    },
    {
        "assunto": "Atraso na Entrega",
        "destinatario": "cliente@example.com",
        "remetente": "suporte@empresa.com",
        "conteudo": "Lamentamos informar que sua entrega será atrasada em 2 dias devido a problemas logísticos."
    },
    {
        "assunto": "Confirmação de Cadastro",
        "destinatario": "novo_usuario@example.com",
        "remetente": "suporte@empresa.com",
        "conteudo": "Seu cadastro foi confirmado com sucesso. Bem-vindo à nossa plataforma!"
    },
    {
        "assunto": "Solicitação de Reembolso",
        "destinatario": "financeiro@empresa.com",
        "remetente": "cliente@example.com",
        "conteudo": "Gostaria de solicitar um reembolso referente ao pedido #12345, recebido com defeito."
    }
]

for mensagem in lista:
    banco.inclui(mensagem)


banco.altera({"id": 2, "assunto": "Erro banco de dados", "destinatario": "joao@example.com", "remetente": "pedro@example.com", "conteudo": "Meu banco deu erro"})

print(banco.recupera(2))

print()

for mensagem in banco.recupera_assunto("da"):
    print(mensagem)

print()

for mensagem in banco.recupera_destinatario("joao@example.com"):
    print(mensagem)

banco.apaga(1)
