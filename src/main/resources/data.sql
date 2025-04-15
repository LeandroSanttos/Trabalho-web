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
(5, 'Claudio Coelho Salvático', 'Brasil', 'claudio@ecvitoria.com.br', 'ZAGUEIRO', 1),
(6, 'Ze Marcos', 'Brasil', 'zemarcos@ecvitoria.com.br', 'ZAGUEIRO', 1),
(7, 'Lucas Halter', 'Brasil', 'halter@ecvitoria.com.br', 'ZAGUEIRO', 1),
(8, 'Hugo', 'Brasil', 'hugo@ecvitoria.com.br', 'ZAGUEIRO', 1),
(9, 'Raúl Cáceres', 'Paraguai', 'raul.caceres@ecvitoria.com.br', 'ZAGUEIRO', 1),
(10, 'Pepê', 'Brasil', 'pepe@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(11, 'Ronald', 'Brasil', 'ronald@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(12, 'Wellington Rato', 'Brasil', 'rato@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(13, 'Ricardo', 'Brasil', 'ricardo@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(14, 'Willian', 'Brasil', 'willian@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(15, 'Matheus', 'Brasil', 'matheus@ecvitoria.com.br', 'MEIO_CAMPO', 1),
(16, 'Gustavo Mosquito', 'Brasil', 'mosquito@ecvitoria.com.br', 'ATACANTE', 1),
(17, 'Osvaldo', 'Brasil', 'osvaldo@ecvitoria.com.br', 'ATACANTE', 1),
(18, 'Fabrício Santos', 'Brasil', 'fabricio@ecvitoria.com.br', 'ATACANTE', 1),
(19, 'Erick', 'Brasil', 'erick@ecvitoria.com.br', 'ATACANTE', 1),
(20, 'Léo Pereira', 'Brasil', 'leo.pereira@ecvitoria.com.br', 'ATACANTE', 1),
(21, 'Janderson', 'Brasil', 'janderson@ecvitoria.com.br', 'ATACANTE', 1),
(22, 'Carlos Eduardo', 'Brasil', 'carlos.eduardo@ecvitoria.com.br', 'ATACANTE', 1); 

