insert into tb_papel(id, papel) values(1, 'ADMIN');

insert into tb_federacao_continental (id, nome, continente, email) 
values (1, 'Conmebol', 'América do Sul', 'conmebol@gmail.com');

insert into tb_federacao_nacional (id, nome, pais_sede, email, federacao_continental_id)
values (1, 'Confederação Brasileira de Futebol', 'Brasil', 'cbf@gmail.com.br', 1);

insert into tb_treinador(id, nome, nacionalidade, email)
values (1, 'Thiago Carpini', 'Brasil', 'thiago.carpini@gmail.com');


insert into tb_clube(id, nome, pais_origem, email, federacao_nacional_id, treinador_id)
values (1, 'Esporte Clube Vitória', 'Brasil', 'contato@ecvitoria.com.br', 1, 1);

-- Jogadores - Esporte Clube Vitória

INSERT INTO tb_jogador (id, nome, nacionalidade, email, posicao, clube_id) VALUES
(1, 'Lucas Arcanjo', 'Brasil', 'lucas.arcanjo@ecvitoria.com.br', 'GOLEIRO', 1),
(2, 'Gabriel', 'Brasil', 'gabriel@ecvitoria.com.br', 'GOLEIRO', 1),
(3, 'Fintelman', 'Brasil', 'fintelman@ecvitoria.com.br', 'GOLEIRO', 1),
(4, 'Davi Barbosa', 'Brasil', 'davi.barbosa@ecvitoria.com.br', 'GOLEIRO', 1),
(5, 'Ze Marcos', 'Brasil', 'zemarcos@ecvitoria.com.br', 'ZAGUEIRO', 1),
(6, 'Lucas Halter', 'Brasil', 'halter@ecvitoria.com.br', 'ZAGUEIRO', 1),
(7, 'Claudio Salvático', 'Brasil', 'claudio@ecvitoria.com.br', 'LATERAL_DIREITO', 1),
(8, 'Raúl Cáceres', 'Paraguai', 'raul.caceres@ecvitoria.com.br', 'LATERAL_DIREITO', 1),
(9, 'Hugo', 'Brasil', 'hugo@ecvitoria.com.br', 'LATERAL_ESQUERDO', 1),
(10, 'Jamerson', 'Brasil', 'jamerson@ecvitoria.com.br', 'LATERAL_ESQUERDO', 1),
(11, 'Ronald', 'Brasil', 'ronald@ecvitoria.com.br', 'VOLANTE', 1),
(12, 'Gabriel Baralhas', 'Brasil', 'baralhas@ecvitoria.com.br', 'VOLANTE', 1),
(13, 'Ricardo Ryller', 'Brasil', 'ricardo@ecvitoria.com.br', 'VOLANTE', 1),
(14, 'Willian Oliveira', 'Brasil', 'willian@ecvitoria.com.br', 'VOLANTE', 1),
(15, 'Pepê', 'Brasil', 'pepe@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(16, 'Wellington Rato', 'Brasil', 'rato@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(17, 'Matheus', 'Brasil', 'matheus@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(18, 'Osvaldo', 'Brasil', 'osvaldo@ecvitoria.com.br', 'PONTA_DIREITA', 1),
(19, 'Carlos Eduardo', 'Brasil', 'carlos.eduardo@ecvitoria.com.br', 'PONTA_DIREITA', 1),
(20, 'Erick', 'Brasil', 'erick@ecvitoria.com.br', 'PONTA_DIREITA', 1),
(21, 'Léo Pereira', 'Brasil', 'leo.pereira@ecvitoria.com.br', 'PONTA_ESQUERDA', 1),
(22, 'Gustavo Mosquito', 'Brasil', 'mosquito@ecvitoria.com.br', 'PONTA_ESQUERDA', 1),
(23, 'Felipe Cardoso', 'Brasil', 'felipe.cardoso@ecvitoria.com.br', 'PONTA_ESQUERDA', 1),
(24, 'Janderson', 'Brasil', 'janderson@ecvitoria.com.br', 'ATACANTE', 1),
(25, 'Fabrício Santos', 'Brasil', 'fabricio@ecvitoria.com.br', 'ATACANTE', 1),
(26, 'Renato Kayzer', 'Brasil', 'renato.kayzer@ecvitoria.com.br', 'ATACANTE', 1);

