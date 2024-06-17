INSERT INTO tb_categoria (descricao) VALUES ('Curso');
INSERT INTO tb_categoria (descricao) VALUES ('Oficina');

INSERT INTO tb_participante (nome, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Maria do Rosario', 'maria@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_atividade (nome, descricao, preco) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.0);
INSERT INTO tb_atividade (nome, descricao, preco) VALUES ('Oficina de Github', 'Controle versões de seus projetos', 50.0);

INSERT INTO tb_bloco (inicio, fim) VALUES ('2017-09-25T08:00:00Z', '2017-09-25T11:00:00Z');
INSERT INTO tb_bloco (inicio, fim) VALUES ('2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z');
INSERT INTO tb_bloco (inicio, fim) VALUES ('2017-09-26T08:00:00Z', '2017-09-26T11:00:00Z');

INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (01, 01);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (01, 02);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (02, 01);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (03, 01);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (03, 02);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (04, 02);