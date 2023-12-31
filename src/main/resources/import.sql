INSERT INTO clubes (nome, escudo, fundacao) VALUES ('Flamengo', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Flamengo_braz_logo.svg/120px-Flamengo_braz_logo.svg.png', 127);
INSERT INTO clubes (nome, escudo, fundacao) VALUES ('Corinthians', 'https://upload.wikimedia.org/wikipedia/pt/thumb/b/b4/Corinthians_simbolo.png/120px-Corinthians_simbolo.png', 112);

INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('David Luiz', 'https://static-wp-tor15-prd.torcedores.com/wp-content/uploads/2023/07/david-luiz-flamengo.jpg', 'zagueiro',36,1, 1);
INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('Gabriel Barbosa A.K.A Gabigol', 'https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2023/06/GettyImages-1258363358-e1685671294409.jpg?w=876&h=484&crop=1', 'atacante', 26, 109, 1);
INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('Giorgian De Arrascaeta', 'https://tntsports.com.br/__export/1659206053830/sites/esporteinterativo/img/2022/07/30/gettyimages-1408549397_1.jpg_554688468.jpg', 'meia', 29, 57, 1);
INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('Cássio', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/C%C3%A1ssio_2022.jpg/800px-C%C3%A1ssio_2022.jpg', 'goleiro', 36, 0, 2);
INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('Adriano A.K.A Imperador', 'https://tntsports.com.br/__export/1650992048381/sites/esporteinterativo/img/2022/04/26/adriano_comemorando_pela_inter_1.jpg_554688468.jpg', 'atacante', 41, 78, 1);
INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('Filipe Luís', 'https://fla-bucket-s3-us.s3.amazonaws.com/public/images/players/4/1681792841.jpg', 'zagueiro', 37, 4, 1);
INSERT INTO jogadores (nome, foto, posicao, idade, gols, clube_id) VALUES ('Róger Guedes', 'https://www.eusoutimao.com.br/__export/1676916884042/sites/eusoutimao/img/2023/02/17/roger-guedes-do-corinthians-em-partida-contra-o-goias-1655667046749_v2_1x1.jpg_396177672.jpg', 'atacante', 26, 43, 2);

INSERT INTO campeonatos(nome, ano_criacao, logo) VALUES('CONMEBOL Libertadores', 1960, 'https://upload.wikimedia.org/wikipedia/pt/thumb/9/95/Conmebol_Libertadores_logo.svg/280px-Conmebol_Libertadores_logo.svg.png')
INSERT INTO campeonatos(nome, ano_criacao, logo) VALUES('Copa do Brasil', 1989, 'https://upload.wikimedia.org/wikipedia/pt/thumb/9/96/CopaDoBrasil.png/220px-CopaDoBrasil.png')

INSERT INTO times_disputando(campeonato_id,clube_id) VALUES(1,1)
INSERT INTO times_disputando(campeonato_id,clube_id) VALUES(2,1)
INSERT INTO times_disputando(campeonato_id,clube_id) VALUES(2,2)