package com.example.peter.ashardalontranslated;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText cardNumberText;

    List<String[]> Cards;

    private void initCards(){
        Cards = new ArrayList<String[]>();
        String[] builder;

        for(int x = 0; x < 50; x++){
            builder = new String[2];
            Cards.add(builder);
        }

        //51
        builder = new String[4];
        builder[0] = "UM BURACO NA ARMADURA";
        builder[1] = "A última luta danificou sua armadura, e você precisa gastar alguns momentos para repara-la.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nVocê tem uma penalidade de -4 AC enquanto a maldição estiver ativa.";
        builder[3] = "Se você não se mover durante sua Fase de Herói, descarte essa carta.";
        Cards.add(builder);

        //52
        builder = new String[4];
        builder[0] = "MÁ SORTE";
        builder[1] = "Uma maldição tráz azar para você e seus aliados.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nNo começo de sua Fase de Vilão, compre 1 Carta de Encontro adicional.";
        builder[3] = "Role o dado no final de sua Fase de Vilão: 10+ descarte essa carta.";
        Cards.add(builder);

        //53
        builder = new String[4];
        builder[0] = "SEDE DE SANGUE";
        builder[1] = "A necessidade de destruição toma conta de sua mente.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nNo começo de sua Fase de Herói, você toma 1 dano.";
        builder[3] = "Descarte essa carta quando derrotar um Monstro.";
        Cards.add(builder);

        //54
        builder = new String[4];
        builder[0] = "GAIOLA";
        builder[1] = "Pisar em uma placa de pressão faz uma gaiola cair em cima de você!";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nVocê tem uma penalidade de -2 AC e não pode se mover enquanto a maldição estiver ativa.\n\nEm vez de atacar, voce ou outro Herói na sua peça pode tentar abrir a gaiola.\n\nABRIR A GAIOLA: Role 10+";
        builder[3] = "Descarte essa carta quando a gaiola for aberta.";
        Cards.add(builder);

        //55
        builder = new String[4];
        builder[0] = "MEDO DE DRAGÕES";
        builder[1] = "A presença do dragão vermelho na masmorra lhe causa uma sensação de medo incontrolável.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nMedo paralizante te controla.\nSempre que se mover para uma nova peça, sofra 1 dano.";
        builder[3] = "Role o dado no final de sua Fase de Herói: 10+ descarte essa carta.";
        Cards.add(builder);

        //56
        builder = new String[4];
        builder[0] = "RUGIDO ATERRORIZADOR";
        builder[1] = "O som distante de um rugido de dragão preenche você com medo, causando tremores incontroláveis.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nVocê tem uma penalidade de -4 quando rolar o dado para atacar enquanto a maldição estiver ativa.";
        builder[3] = "Role o dado no final de sua Fase de Herói: 10+ descarte essa carta.";
        Cards.add(builder);

        //57
        builder = new String[4];
        builder[0] = "SALTO TEMPORAL";
        builder[1] = "Você cai em uma fenda na realidade quando energias incomensuráveis dobram o espaço à sua volta.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nRemova seu Herói do jogo. Compre uma Carta de Monstro e coloque sua miniatura no quadrado de onde seu Herói desapareceu.\n\nNo começo de sua próxima Fase de Herói, coloque seu Herói em qualquer peça.";
        builder[3] = "Quando seu Herói retornar, descarte essa carta.";
        Cards.add(builder);

        //58
        builder = new String[4];
        builder[0] = "IRA DO INIMIGO";
        builder[1] = "Os monstros te isolam para um ataque.";
        builder[2] = "Você está amaldiçoado! Coloque essa carta na sua Carta de Herói como um lembrete.\n\nAo final de sua Fase de Exploração, encontre o Monstro mais perto de seu Herói que não está na peça de seu Herói. Coloque esse Monstro adjacente ao seu Herói.";
        builder[3] = "Role o dado no final de sua Fase de Exploração: 10+ descarte essa carta.";
        Cards.add(builder);

        //59
        builder = new String[4];
        builder[0] = "TRIBUTO DO DRAGÂO";
        builder[1] = "Ashardalon demanda um tributo em ouro daqueles que se abrigam sob a montanha.";
        builder[2] = "Se ja existe uma Carta de Ambiente, descarte-a. Esse Ambiente continua no jogo até um novo Ambiente substitui-lo.";
        builder[3] = "Quando comprar um marcador de Tesouro, compre dois e descarte o de maior valor.\n\n(Se um dos Tesouros for um item, descarte o item.)";
        Cards.add(builder);

        //60
        builder = new String[4];
        builder[0] = "ATIRADORES ESCONDIDOS";
        builder[1] = "Flechas e dardos voam das sombras.";
        builder[2] = "Se ja existe uma Carta de Ambiente, descarte-a. Esse Ambiente continua no jogo até um novo Ambiente substitui-lo.";
        builder[3] = "Sempre que o Herói ativo terminar sua Fase de Herói em uma peça que não tem outro Herói, o Herói ativo sofre 1 dano.";
        Cards.add(builder);

        //61
        builder = new String[4];
        builder[0] = "ALERTA";
        builder[1] = "Os monstros se reúnem para defender a masmorra dos aventureiros invasores.";
        builder[2] = "Se ja existe uma Carta de Ambiente, descarte-a. Esse Ambiente continua no jogo até um novo Ambiente substitui-lo.";
        builder[3] = "Ao final de cada Fase de Vilão, o Herói ativo passa uma Carta de Monstro (se ele ou ela possuir alguma) para o jogador à direita.";
        Cards.add(builder);

        //62
        builder = new String[4];
        builder[0] = "ARMADILHAS KOBOLD";
        builder[1] = "Armadilhas dos kobolds são dificeis de superar.";
        builder[2] = "Se ja existe uma Carta de Ambiente, descarte-a. Esse Ambiente continua no jogo até um novo Ambiente substitui-lo.";
        builder[3] = "Você leva uma penalidade de -4 quando rolar para desarmar uma armadilha enquanto essa Ambiente estiver ativo.";
        Cards.add(builder);

        //63
        builder = new String[4];
        builder[0] = "CERCADO!";
        builder[1] = "A batida de tambores distantes alertam-lhe das hordas que se aproximam.";
        builder[2] = "Se ja existe uma Carta de Ambiente, descarte-a. Esse Ambiente continua no jogo até um novo Ambiente substitui-lo.";
        builder[3] = "Ao final de cada Fase de Exploração, se um Herói não controlar pelo menos um Monstro, ele ou ela compra uma Carta de Monstro e coloca sua miniatura na borda inexplorada mais próxima.";
        Cards.add(builder);

        //64
        builder = new String[4];
        builder[0] = "PAREDES DE MAGMA";
        builder[1] = "O calor que irradia das paredes cobertas de magma ameaçam te derrotar";
        builder[2] = "Se ja existe uma Carta de Ambiente, descarte-a. Esse Ambiente continua no jogo até um novo Ambiente substitui-lo.";
        builder[3] = "Sempre que o Herói ativo terminar sua Fase de Herói adjacente a uma parede, esse Herói sofre 1 dano.";
        Cards.add(builder);

        //65
        builder = new String[4];
        builder[0] = "BENÇÂO DO ESPÍRITO ANCIÃO";
        builder[1] = "Um espírito de anão ancião te ajuda na sua missão de livrar a montanha do mal.";
        builder[2] = "O Herói ativo vira um Poder Diário utilizado de qualquer Herói.\n\nCompre outra Carta de Encontro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //66
        builder = new String[4];
        builder[0] = "VENENO MORTAL";
        builder[1] = "A toxina que te infecta tem uma potência sobrenatural.";
        builder[2] = "Cada Herói que estiver atualmente Envenenado sofre 1 dano. \nCompre outra Carta de Encontro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //67
        builder = new String[4];
        builder[0] = "ACAMPAMENTO DUERGAR";
        builder[1] = "Os duergar mantêm um pequeno acampamento na montanha.";
        builder[2] = "Compre 5 Cartas de Monstro. Descarte qualquer Monstro que não for um Diabo (Devil). Embaralhe as cartas restantes e coloque-as no topo do baralho de Cartas de Monstro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //68
        builder = new String[4];
        builder[0] = "SALTO ENLOUQUECIDO";
        builder[1] = "Um monstro salta em você com velocidade sobrenatural!";
        builder[2] = "Se um Monstro está na mesma peça que o Herói ativo, esse Herói sofre 2 dano.\n\nSe não, compre uma Carta de Monstro e coloque sua miniatura na peça mais próxima que conter uma borda inexplorada.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //69
        builder = new String[4];
        builder[0] = "CORREDOR DOS ORCS";
        builder[1] = "Os símbolos sagrados crus de Gruumsh pintados nas paredes te avisam dos habitantes dessa seção.";
        builder[2] = "Compre 5 Cartas de Monstro. Descarte qualquer Monstro que não for um Orc (Orc). Embaralhe as cartas restantes e coloque-as no topo do baralho de Cartas de Monstro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //70
        builder = new String[4];
        builder[0] = "TESOURO ESCONDIDO";
        builder[1] = "Você avista uma caixa de tesouro escondida a uma curta distância.";
        builder[2] = "Coloque 1 marcador de Tesouro em qualquer peça que não conter um Herói. Compre outra Carta de Encontro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //71
        builder = new String[4];
        builder[0] = "SENTINELA KOBOLD";
        builder[1] = "Os kobolds abaixo da montanha tratam de todas necessidades de Ashardalon.";
        builder[2] = "Compre 5 Cartas de Monstro. Descarte qualquer Monstro que não for um Réptil (Reptile). Embaralhe as cartas restantes e coloque-as no topo do baralho de Cartas de Monstro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //72
        builder = new String[4];
        builder[0] = "PERDIDO";
        builder[1] = "Esses túneis parecem todos iguais!";
        builder[2] = "Sem olhar, coloque a peça debaixo da pilha de Peças de Masmorra no topo.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //73
        builder = new String[4];
        builder[0] = "LAR OCUPADO";
        builder[1] = "Muitas criaturas chamam as cavernas abaixo da montanha de lar.";
        builder[2] = "Saque uma peça debaixo da pilha de Peças de Masmorra. Coloque a peça ao lado da borda inexplorada mais próxima.\n\nCompre uma Carta de Monstro e coloque sua miniatura nessa peça. Coloque 1 marcador de Tesouro nessa peça.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //74
        builder = new String[4];
        builder[0] = "AVANÇO RÁPIDO";
        builder[1] = "Seus inimigos avançam com velocidade sobrenatual.";
        builder[2] = "Escolha um Monstro que não estiver em um peça com algum Herói. Esse Monstro se move 1 peça na direção do Herói mais próximo.\n\nCompre outra Carta de Encontro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //75
        builder = new String[4];
        builder[0] = "DELEITE DE DESTRUIÇÂO";
        builder[1] = "Enquanto você se cansa, seus inimigos ficam mais fortes!";
        builder[2] = "Escolha um Monstro danificado. \nEsse Monstro recupera 1 hit point.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //76
        builder = new String[4];
        builder[0] = "GRITO DA SENTINELA";
        builder[1] = "Intrusos!";
        builder[2] = "Se nenhum Monstro está em jogo, descarte essa carta.\n\nEscolha um Monstro. Saque uma peça debaixo da pilha de Peças de Masmorra. Coloque a peça ao lado da borda inexplorada mais próxima desse Monstro. Compre uma Carta de Monstro e coloque sua miniatura na nova peça.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //77
        builder = new String[4];
        builder[0] = "AVISTADO!";
        builder[1] = "Pisos irregulares fazem você tropeçar, alertando um guarda próximo de sua presença.";
        builder[2] = "Compre 5 Cartas de Monstro. Descarte qualquer Monstro que não for uma Sentinela (Sentry). Embaralhe as cartas restantes e coloque-as no topo do baralho de Cartas de Monstro. \n\nColoque a peça debaixo da pilha de Peças de Masmorra ao lado da borda inexplorada mais próxima do Herói ativo. Compre uma Carta de Monstro e coloque sua miniatura na nova peça.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //78
        builder = new String[4];
        builder[0] = "LADRÂO NO ESCURO";
        builder[1] = "Você verifica sua mochila e descobre que uma de suas posses preciosas foi roubada!";
        builder[2] = "O Herói ativo descarta uma Carta de Tesouro. Se o Herói ativo não possuir uma Carta de Tesouro, descarte um marcador de Tesouro. Se o Herói ativo não possuir nada, o ladrão no escuro não ganha nada.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //79
        builder = new String[4];
        builder[0] = "CALOR INSUPORTÁVEL";
        builder[1] = "Os vapores vulcânicos que preenchem a masmorra lentamente desgastam sua resistência.";
        builder[2] = "Cada Herói sofre 1 dano.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //80
        builder = new String[4];
        builder[0] = "CORRUPÇÂO SOBRENATURAL";
        builder[1] = "O Reino Distante tem um efeito sobrenatural na masmorra.";
        builder[2] = "Compre 5 Cartas de Monstro. Descarte qualquer Monstro que não for uma Aberração (Aberrant). Embaralhe as cartas restantes e coloque-as no topo do baralho de Cartas de Monstro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //81
        builder = new String[4];
        builder[0] = "MONSTRO VAGANTE";
        builder[1] = "Um monstro terrível vaga para sua visão, atraído por sua presença.";
        builder[2] = "Compre uma Carta de Monstro e coloque sua miniatura em qualquer peça com uma borda inexplorada.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //82
        builder = new String[4];
        builder[0] = "DOBRA NO TEMPO";
        builder[1] = "Seus pensamentos estão enevoados enquanto uma núvem de tempo corrompido lava a masmorra.";
        builder[2] = "Cada jogador passa uma Carta de Monstro (se tiver) para o Herói à sua direita. \n\nCompre outra Carta de Encontro.";
        builder[3] = "Descarte essa carta.";
        Cards.add(builder);

        //83
        builder = new String[7];
        builder[0] = "BOMBA CEGANTE";
        builder[1] = "A esfera de cerâmica explode quando se choca contra uma parede próxima.";
        builder[2] = "Ataque cada Herói dentro de 1 peça do Herói ativo.\n\nApós o ataque, cada Monstro Sentinela (Sentry) se move 1 peça na direção da peça com uma borda inexplorada mais próxima.";
        builder[3] = "+8";
        builder[4] = "Tonto";
        builder[5] = "";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //84
        builder = new String[7];
        builder[0] = "NO ALVO!";
        builder[1] = "Uma flecha voa das sombras!";
        builder[2] = "Ataque o Herói ativo";
        builder[3] = "+10";
        builder[4] = "1";
        builder[5] = "";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //85
        builder = new String[7];
        builder[0] = "EXPLOSÂO CONCUSSIVA";
        builder[1] = "Uma armadilha engenhosa libera uma explosão de pressão massiva do vulcão abaixo.";
        builder[2] = "Ataque cada Herói na peça do Herói ativo.\n\nApós o ataque, mova todos os Heróis na peça do Herói ativo para uma peça adjacente.";
        builder[3] = "+8";
        builder[4] = "2";
        builder[5] = "Erro: 1 Dano";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //86
        builder = new String[7];
        builder[0] = "TREMOR PROFUNDO";
        builder[1] = "Um tremor profundo sacode a masmorra e rochas caem do teto.";
        builder[2] = "Ataque cada Herói.";
        builder[3] = "+8";
        builder[4] = "1";
        builder[5] = "";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //87
        builder = new String[7];
        builder[0] = "TERREMOTO!";
        builder[1] = "A montanha toda treme e sacode.";
        builder[2] = "Ataque cada Herói.";
        builder[3] = "+6";
        builder[4] = "2 e Tonto";
        builder[5] = "Erro: 1 Dano";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //88
        builder = new String[7];
        builder[0] = "DESABROCHAR FUNGAL";
        builder[1] = "Uma bola de fungo enorme explode, preenchendo o ar com esporos venenosos.";
        builder[2] = "Ataque cada Herói dentro de 1 peça do Herói ativo.";
        builder[3] = "+8";
        builder[4] = "Tonto e Envenenado";
        builder[5] = "";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //89
        builder = new String[7];
        builder[0] = "ATAQUE DO ESPREITADOR";
        builder[1] = "Um dardo envenenado avisa o avanço de um inimigo oculto.";
        builder[2] = "Compre uma Carta de Monstro e coloque sua miniatura na peça do Herói ativo. Ataque cada Herói na peça de Herói ativo.";
        builder[3] = "+8";
        builder[4] = "1 e Envenenado";
        builder[5] = "";
        builder[6] = "Descarte essa carta.";
        Cards.add(builder);

        //90
        builder = new String[7];
        builder[0] = "LAR DO PHALAGAR";
        builder[1] = "Você vaga para dentro do lar de um Horror do Submundo que ataca com uma massa de tentáculos!";
        builder[2] = "Ataque cada Herói na peça do Herói ativo.";
        builder[3] = "+4";
        builder[4] = "3 e Tonto";
        builder[5] = "Eroo: 1 Dano";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //91
        builder = new String[7];
        builder[0] = "FLECHA ENVENENADA";
        builder[1] = "Uma placa de pressão disfarçada ativa uma armadilha, disparando uma flecha envenenada.";
        builder[2] = "Ataque o Herói ativo";
        builder[3] = "+8";
        builder[4] = "2 e Envenenado";
        builder[5] = "Erro: 1 Dano";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //92
        builder = new String[7];
        builder[0] = "DUTO DE VAPOR";
        builder[1] = "O chaõ desintegra e vapor superaquecido escapa para a passagem";
        builder[2] = "Ataque cada Herói na peça do Herói ativo.";
        builder[3] = "+8";
        builder[4] = "2";
        builder[5] = "Eroo: 1 Dano";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //93
        builder = new String[7];
        builder[0] = "NUVEM DE ENXOFRE";
        builder[1] = "Um tremor leve precede uma explosão de gás tóxico de uma brecha na parede.";
        builder[2] = "Ataque cada Herói na peça do Herói ativo.";
        builder[3] = "+8";
        builder[4] = "1 e Envenenado";
        builder[5] = "Erro: Envenenado";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //94
        builder = new String[7];
        builder[0] = "FIO DE ARMADILHA";
        builder[1] = "Um passo descuidado rompe um fio fino, disparando um dardo envenenado e soando um alarme distante.";
        builder[2] = "Compre uma Carta de Monstro e coloque sua miniatura na borda inexplorada mais próxima. \n\nAtaque o Herói ativo.";
        builder[3] = "+10";
        builder[4] = "Envenenado";
        builder[5] = "";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //95
        builder = new String[7];
        builder[0] = "EXPLOSÃO VULCÂNICA";
        builder[1] = "Uma parede próxima explode, esguichando gotas de lava pela área.";
        builder[2] = "Ataque cada Herói na peça do Herói ativo.";
        builder[3] = "+6";
        builder[4] = "3";
        builder[5] = "Erro: 1 Dano";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //96
        builder = new String[7];
        builder[0] = "SONHO DESPERTADOR";
        builder[1] = "Uma influencia corruptiva do Reino Distante libera um pesadelo despertador.";
        builder[2] = "Ataque o Herói ativo.";
        builder[3] = "+8";
        builder[4] = "1 e Tonto";
        builder[5] = "";
        builder[6] = "Descarte essa carta";
        Cards.add(builder);

        //97
        builder = new String[8];
        builder[0] = "DESABAMENTO";
        builder[1] = "O teto acima de você colapsa, engasgando a passagem com destroços.";
        builder[2] = "Coloque o marcador de Cave In na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre uma nova Carta de Encontro.";
        builder[3] = "Ataque cada Herói na peça do Herói ativo.";
        builder[4] = "+9";
        builder[5] = "2";
        builder[6] = "Erro: 1 Dano";
        builder[7] = "Descarte essa carta.";
        Cards.add(builder);

        //98
        builder = new String[8];
        builder[0] = "POÇO";
        builder[1] = "Um poço se abre abaixo de você, derrubando-o na escuridão.";
        builder[2] = "Coloque o marcador de Pit na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre uma nova Carta de Encontro.";
        builder[3] = "Ataque cada Herói na peça do Herói ativo.";
        builder[4] = "+10";
        builder[5] = "2";
        builder[6] = "Vá para essa carta.";
        builder[7] = "Se um Herói está nessa carta, ele pode rolar um dado no final de sua Fase de Herói para tentar sair (10+). Se conseguir, coloque-o na peça com o marcador de Pit.";
        Cards.add(builder);

        //99
        builder = new String[8];
        builder[0] = "VAPORES VULCÂNICOS";
        builder[1] = "Rachaduras no chão expelem vapores venenosos das piscinas de magma abaixo.";
        builder[2] = "Coloque o marcador de Vulcanic Vapors na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre uma nova Carta.";
        builder[3] = "";
        builder[4] = "";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "Um Herói que entrar ou começar a Fase de Herói nessa peça é Envenenado.";
        Cards.add(builder);

        //100
        builder = new String[8];
        builder[0] = "FLUXO DE LAVA";
        builder[1] = "Lava quente vermelha flui de um cano na parede.";
        builder[2] = "Coloque o marcador de Lava Flow na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre outra Carta de Encontro.";
        builder[3] = "Ative a Armadilha durante sua Fase de Vilão: Coloque um marcador de Lava Flow em qualquer peça adjacente a uma peça com um marcador Lava Flow. \n\nCada Herói em uma peça com um marcador Lava Flow recebe 1 Dano.";
        builder[4] = "";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "Ao invés de atacar, um Herói em uma peça com uma Armadilha pode tentar desarmá-la (10+). \nRemova todos marcadores Lava Flow se desarmar.";
        Cards.add(builder);

        //101
        builder = new String[8];
        builder[0] = "ARMADILHA DE DARDOS ENVENENADOS";
        builder[1] = "A armadilha lança dardos encharcados em veneno de cobra dos buracos da parede.";
        builder[2] = "Coloque o marcador de Poisoned Dart Trap na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre outra Carta de Encontro.";
        builder[3] = "Ative a Armadilha durante sua Fase de Vilão: Ataque cada Herói nessa peça.";
        builder[4] = "+8";
        builder[5] = "2 e Envenenado";
        builder[6] = "Erro: 1 Dano";
        builder[7] = "Ao invés de atacar, um Herói em uma peça com uma Armadilha pode tentar desarmá-la (10+).";
        Cards.add(builder);

        //102
        builder = new String[8];
        builder[0] = "PEDREGULHO ROLANTE";
        builder[1] = "Um pedregulho gigante rola pelo corredor, esmagando tudo em seu caminho!";
        builder[2] = "Coloque o marcador de Rolling Boulder na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre outra Carta de Encontro.";
        builder[3] = "Ative a Armadilha durante sua Fase de Vilão: Mova o marcador de Rolling Boulder uma peça na direção do Herói mais próximo. Cada Herói na nova peça sofre 2 dano.";
        builder[4] = "";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "Ao invés de atacar, um Herói em uma peça com uma Armadilha pode tentar desarmá-la (10+).";
        Cards.add(builder);

        //103
        builder = new String[8];
        builder[0] = "LÂMINAS GIRATÓRIAS";
        builder[1] = "Uma lâmina ergue-se de um compartimento oculto e gira incontrolavelmente pelo chão da masmorra.";
        builder[2] = "Coloque o marcador de Whirling Blades na peça do Herói ativo. Se essa peça ja conter um marcador, descarte essa carta e compre outra Carta de Encontro.";
        builder[3] = "Ative a Armadilha durante sua Fase de Vilão: Mova o marcador de Whirling Blades uma peça na direção do Herói mais próximo, então ataque cada Herói nessa peça.";
        builder[4] = "+8";
        builder[5] = "2";
        builder[6] = "Erro: 1 Dano";
        builder[7] = "Ao invés de atacar, um Herói em uma peça com uma Armadilha pode tentar desarmá-la (10+).";
        Cards.add(builder);

        //Monsters
        //104, 105, 106
        builder = new String[21];
        builder[0] = "ANIMAL";
        builder[1] = "URSO DA CAVERNA";
        builder[2] = "14";
        builder[3] = "2";
        builder[4] = "Se o Urso da Caverna estiver na mesma peça que um Herói,";
        builder[5] = "ele ataca cada Herói nessa peça com suas Garras.";
        builder[6] = "Se o Urso da Caverna estiver dentro de 1 peça de distância de um Herói,";
        builder[7] = "ele se move para o lado do Herói mais próximo e ataca com um Salto.";
        builder[8] = "Caso contrário,";
        builder[9] = "o Urso da Caverna se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "Garras";
        builder[11] = "Salto";
        builder[12] = "+6";
        builder[13] = "+8";
        builder[14] = "2";
        builder[15] = "";
        builder[16] = "2 e Tonto";
        builder[17] = "";
        builder[18] = "2 EXPERIÊNCIA";
        builder[19] = "#478c4c";
        builder[20] = "#a4c1a6";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //107, 108, 109
        builder = new String[21];
        builder[0] = "Diabo, Anão, Sentinela";
        builder[1] = "Guarda Duergar";
        builder[2] = "16";
        builder[3] = "2";
        builder[4] = "Se o Duergar estiver adjacente a um Herói,";
        builder[5] = "ele ataca o Herói com um Martelo.";
        builder[6] = "Se o Duergar estiver em uma peça sem nenhum Herói e com uma borda inexplorada,";
        builder[7] = "saque uma peça debaixo da pilha de Peças de Masmorra e coloque ao lado da borda inexplorada da peça do Duergar. Compre uma Carta de Monstro e coloque sua miniatura na nova peça.";
        builder[8] = "Caso contrário,";
        builder[9] = "o Duergar se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "Martelo";
        builder[11] = "";
        builder[12] = "+8";
        builder[13] = "";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "2 EXPERIÊNCIA";
        builder[19] = "#478c4c";
        builder[20] = "#a4c1a6";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //110, 111, 112
        builder = new String[21];
        builder[0] = "Aberração";
        builder[1] = "BOCÂO TAGARELA";
        builder[2] = "14";
        builder[3] = "2";
        builder[4] = "Se o Bocão Tagarela estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ele ataca todos os Heróis a 1 peça de distância.";
        builder[6] = "Caso contrário,";
        builder[7] = "o Bocão Tagarela se move 1 peça na direção do Herói mais próximo.";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "";
        builder[11] = "";
        builder[12] = "+8";
        builder[13] = "";
        builder[14] = "1 e Tonto";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "3 EXPERIÊNCIA";
        builder[19] = "#6b726c";
        builder[20] = "#a7afa7";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //113, 114, 115
        builder = new String[21];
        builder[0] = "Aberração";
        builder[1] = "GRELL";
        builder[2] = "15";
        builder[3] = "2";
        builder[4] = "Se o Grell estiver adjacente a um Herói,";
        builder[5] = "ele ataca esse Herói com uma Mordida venenosa.";
        builder[6] = "Se o Grell estiver dentro de 1 peça de distância de um Herói,";
        builder[7] = "ele se move para o lado do Herói mais próximo e ataca com seus Tentáculos.";
        builder[8] = "Caso contrário,";
        builder[9] = "o Grell se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "Mordida";
        builder[11] = "Tentáculos";
        builder[12] = "+7";
        builder[13] = "+7";
        builder[14] = "1 e Envenenado";
        builder[15] = "Erro: 1 Dano";
        builder[16] = "1 e Tonto";
        builder[17] = "";
        builder[18] = "2 EXPERIÊNCIA";
        builder[19] = "#478c4c";
        builder[20] = "#a4c1a6";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //116, 117, 118
        builder = new String[21];
        builder[0] = "Humano";
        builder[1] = "CULTISTA HUMANO";
        builder[2] = "14";
        builder[3] = "1";
        builder[4] = "Se o Cultista estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ele se move para o lado do Herói mais próximo e ataca com uma Adaga envenenada.";
        builder[6] = "Caso contrário,";
        builder[7] = "o Cultista se move 1 peça na direção do Herói mais próximo.";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "Adaga";
        builder[11] = "";
        builder[12] = "+6";
        builder[13] = "";
        builder[14] = "1 e Envenenado";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "1 EXPERIÊNCIA";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //119, 120, 121
        builder = new String[21];
        builder[0] = "Réptil, Sentinela";
        builder[1] = "KOBOLD ESCUDO DRACÔNICO";
        builder[2] = "16";
        builder[3] = "1";
        builder[4] = "Se o Kobold estiver adjacente a um Herói,";
        builder[5] = "ele ataca o Herói com uma Espada.";
        builder[6] = "Se o Kobold estiver em uma peça sem nenhum Herói e com uma borda inexplorada,";
        builder[7] = "saque uma peça debaixo da pilha de Peças de Masmorra e coloque ao lado da borda inexplorada da peça do Kobold. Compre uma Carta de Monstro e coloque sua miniatura na nova peça.";
        builder[8] = "Caso contrário,";
        builder[9] = "o Kobold se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "Espada";
        builder[11] = "";
        builder[12] = "+7";
        builder[13] = "";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "1 EXPERIÊNCIA";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //122, 123, 124
        builder = new String[21];
        builder[0] = "Diabo";
        builder[1] = "DIABO LEGIONÁRIO";
        builder[2] = "16";
        builder[3] = "1";
        builder[4] = "";
        builder[5] = "Quando colocar um novo Diabo Legionário, coloque dois Diabos Legionários ao lado do primeiro. Você não ganha experiência por essa carta até todos os Diabos Legionários serem derrotados.";
        builder[6] = "Se o Diabo Legionário estiver a 1 peça de distância de um Herói,";
        builder[7] = "ele se move para o lado do Herói mais próximo e ataca com uma Espada";
        builder[8] = "Caso contrário,";
        builder[9] = "o Diabo Legionário se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "Espada";
        builder[11] = "";
        builder[12] = "+11";
        builder[13] = "";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "3 EXPERIÊNCIA";
        builder[19] = "#6b726c";
        builder[20] = "#a7afa7";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //125, 126, 127
        builder = new String[21];
        builder[0] = "Orc";
        builder[1] = "ORC ARQUEIRO";
        builder[2] = "13";
        builder[3] = "1";
        builder[4] = "Se o Orc Arqueiro estiver adjacente a um Herói,";
        builder[5] = "ele ataca esse Herói com um Soco.";
        builder[6] = "Se o Orc Arqueiro estiver dentro de 2 peças de distância de um Herói,";
        builder[7] = "ele ataca o Herói mais próximo com uma Flecha.";
        builder[8] = "Caso contrário,";
        builder[9] = "o Orc Arqueiro se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "Soco";
        builder[11] = "Flecha";
        builder[12] = "+6";
        builder[13] = "+6";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "2";
        builder[17] = "Erro: 1 Dano";
        builder[18] = "1 EXPERIÊNCIA";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //128, 129, 130
        builder = new String[21];
        builder[0] = "Orc";
        builder[1] = "ORC ESMAGADOR";
        builder[2] = "15";
        builder[3] = "2";
        builder[4] = "Se o Orc Esmagador estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ele se move para o lado do Herói mais próximo e ataca com um Bastão";
        builder[6] = "Caso contrário,";
        builder[7] = "o Orc Esmagador se move 1 peça na direção do Herói mais próximo.";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "Bastão";
        builder[11] = "";
        builder[12] = "+9";
        builder[13] = "";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "2 EXPERIÊNCIA";
        builder[19] = "#6b726c";
        builder[20] = "#a7afa7";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //131, 132, 133
        builder = new String[21];
        builder[0] = "Réptil";
        builder[1] = "COBRA";
        builder[2] = "13";
        builder[3] = "1";
        builder[4] = "Se a Cobra estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ela ataca o Herói mais próximo com uma Mordida venenosa.";
        builder[6] = "Caso contrário,";
        builder[7] = "a Cobra se move 1 peça na direção do Herói mais próximo.";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "Mordida";
        builder[11] = "";
        builder[12] = "+7";
        builder[13] = "";
        builder[14] = "Envenenado";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "1 EXPERIÊNCIA";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //Items
        //134
        builder = new String[9];
        builder[0] = "+1 ESPADA MÁGICA";
        builder[1] = "A borda afiadissíma dessa espada corta com a menor quantidade de pressão.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus +1 ao rolar para atacar contra Monstros adjacentes enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //Items
        //135
        builder = new String[9];
        builder[0] = "+2 ESPADA MÁGICA";
        builder[1] = "Essa arma é forjada usando segredos antigos dos anões.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus +2 ao rolar para atacar contra Monstros adjacentes enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //136
        builder = new String[9];
        builder[0] = "AMULETO DE PROTEÇÂO";
        builder[1] = "Esse amuleto mágico deflete ataques.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus de +1 AC enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //137
        builder = new String[9];
        builder[0] = "ESCUDO ABENÇOADO";
        builder[1] = "A benção de Bahamut proteje você e seus aliados.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você e todos os Heróis na sua peça ganham um bônus de +2 AC enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //138
        builder = new String[9];
        builder[0] = "BOTAS DE CAMINHADA";
        builder[1] = "Essas botas de couro simples fazem você leve nos pés.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus de +1 Velocidade (Speed) enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //139
        builder = new String[9];
        builder[0] = "CAIXA DE ARMADILHAS";
        builder[1] = "Essa caixa de madeira contem armadilhas de metal com pontas afiadas.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Coloque três marcadores Caltrop em qualquer 3 quadrados na sua peça.\n\nQuando um Monstro for colocado em um quadrado com um marcador Caltrop, remova o marcador e dê 1 de dano ao Monstro.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta depois de usá-la";
        Cards.add(builder);

        //140
        builder = new String[9];
        builder[0] = "BRAÇADEIRAS DE DEFESA";
        builder[1] = "Esses protetores de braço absorvem dano.";
        builder[2] = "Use quando você sofrer dano.";
        builder[3] = "Reduza o dano do ataque em 1.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "VIRE ESSA CARTA APÓS USAR O ITEM";
        Cards.add(builder);

        //141
        builder = new String[9];
        builder[0] = "CROSSBOW DE VELOCIDADE";
        builder[1] = "A habilidade de recarregar rapidamente essa arma torna-a mortal.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Em vez de se mover, você pode atacar um Monstro dentro de 1 peça de distância com um dardo.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "+4";
        builder[6] = "1";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //142
        builder = new String[9];
        builder[0] = "DENTE DE DRAGÃO";
        builder[1] = "Essa arma penetra até na armadura mais grossa.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus +1 ao rolar para atacar contra Monstros adjacentes enquanto esse item estiver em jogo.\n\nSe você rolar 19 ou 20 no ataque, você causa +1 dano adicional.";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //143
        builder = new String[9];
        builder[0] = "MARTELO ANÃO";
        builder[1] = "Esse martelo é mortal nas mãos de um duelista proficiente.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus +1 ao rolar para atacar contra Monstros adjacentes enquanto esse item estiver em jogo.\n\nSe você escolher não se mover durante sua Fase de Herói, esse bônus aumenta para +3 até o final de sua Fase de Herói.";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //144
        builder = new String[9];
        builder[0] = "CAPUZ ÉLFICO";
        builder[1] = "Esse capuz camufla-se com os arredores, dando-lhe o elemento surpresa.";
        builder[2] = "Use esse item antes de comprar uma Carta de Monstro na sua Fase de Exploração.";
        builder[3] = "O jogador à sua esquerda coloca o Monstro no seu lugar.";
        builder[4] = "Preço: 600 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //145
        builder = new String[9];
        builder[0] = "TAPETE VOADOR";
        builder[1] = "Esse tapete foi tecido com uma costura diferente e runas estranhas.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Coloque o marcador de Flying Carpet em qualquer peça sem um marcador. \n\nEm vez de se mover, você pode mover o marcador de Flying Carpet para qualquer peça a 1 peça de distância dele. Qualquer herói que estiver sobre o marcador de Flying Carpet se move junto.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //146
        builder = new String[9];
        builder[0] = "LUVAS DE PODER OGRÓIDE";
        builder[1] = "Essas luvas de metal dão ao usuário uma força incrível.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você causa +1 dano quando acertar um Monstro adjacente com um ataque.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //147, 148
        builder = new String[9];
        builder[0] = "PINGENTE DE SORTE";
        builder[1] = "Com um pouco de sorte se chega longe";
        builder[2] = "Use esse item após qualquer rolagem do dado.";
        builder[3] = "Role o dado novamente.";
        builder[4] = "Preço: 600 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);
        Cards.add(builder);

        //149
        builder = new String[9];
        builder[0] = "PÉROLA DO PODER";
        builder[1] = "Essa pérola pulsa com poder cru.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Desvire um de sues poderes ou items usados.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "VIRE ESSA CARTA APÓS USAR O ITEM";
        Cards.add(builder);

        //150, 151, 152
        builder = new String[9];
        builder[0] = "POÇÃO DE CURA";
        builder[1] = "Uma ferida perigosa some quando você bebe essa poção.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Você ou um Herói adjacente recupera 2 Hit Points.";
        builder[4] = "Preço: 600 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);
        Cards.add(builder);
        Cards.add(builder);

        //153, 154
        builder = new String[9];
        builder[0] = "POÇÃO DE RECUPERAÇÂO";
        builder[1] = "Esse elixir limpa a mente e purifica o corpo.";
        builder[2] = "Use qualquer hora.";
        builder[3] = "Termine uma condição no seu Herói ou em um Herói adjacente.";
        builder[4] = "Preço: 300 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);
        Cards.add(builder);

        //155
        builder = new String[9];
        builder[0] = "POÇÃO DE RENOVAÇÂO";
        builder[1] = "Você se sente relaxado e refrescado após beber essa poção.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Desvire um de seus poderes usados.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);

        //156
        builder = new String[9];
        builder[0] = "POÇÃO DE VELOCIDADE";
        builder[1] = "Energia arcana lhe provê rapidez sobrenatural.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Mova-se até sua Velocidade (Speed).";
        builder[4] = "Preço: 300 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);

        //157
        builder = new String[9];
        builder[0] = "ANEL DE ESTRELAS CADENTES";
        builder[1] = "Raios de energia voam desse anel encantado.";
        builder[2] = "Use esse item durante sua Fase de Herói.";
        builder[3] = "Ataque 1 Monstro dentro de 2 peças de distância de você. Esse ataque não conta como uma ação de ataque.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "+8";
        builder[6] = "1";
        builder[7] = "";
        builder[8] = "VIRE ESSA CARTA APÓS USAR O ITEM";
        Cards.add(builder);

        //158
        builder = new String[9];
        builder[0] = "PERGAMINHO DE CONTROLE DE MONSTRO";
        builder[1] = "Você toma controle de seu inimigo temporariamente.";
        builder[2] = "Use esse item durante sua Fase de Vilão quando escolher uma ação para o Monstro.";
        builder[3] = "O Monstro não age normalmente. Em vez disso, coloque o Monstro em qualquer quadrado dentro de 1 peça de distância dele. Se ele estiver adjacente a outro Monstro, ataque esse Monstro.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "+9";
        builder[6] = "1";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);

        //159
        builder = new String[9];
        builder[0] = "ESCUDO DE PROTEÇÂO";
        builder[1] = "Esse escudo encantado lhe dá proteção mágica.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus de +1 AC enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 1000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //160
        builder = new String[9];
        builder[0] = "CAJADO DOS ELEMENTOS";
        builder[1] = "Esse cajado de ébano tem no seu topo uma bola de cristal que lateja com poder elemental.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus de +2 ao rolar para atacar Monstros dentro de 1 peça de distância enquanto esse item estiver ativo.";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //161
        builder = new String[9];
        builder[0] = "FERRAMENTAS DE LADRÂO";
        builder[1] = "Pequenos pinos, chaves, e gazuas estão organizadas em uma bolsa de couro.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus +4 ao rolar para desativar Armadilhas enquanto esse item estiver em jogo.";
        builder[4] = "Preço: 600 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //162
        builder = new String[9];
        builder[0] = "ESCUDO ARREMESSÁVEL";
        builder[1] = "Você arremessa seu escudo em um inimigo próximo, depois o escudo retorna em um arco gracioso.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus de +2 AC enquanto esse item estiver em jogo.\n\nAtaque 1 Monstro dentre de 2 peças de distância. Esse ataque não conta como uma ação de ataque.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "+6";
        builder[6] = "1";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //163
        builder = new String[9];
        builder[0] = "TOMO DA EXPERIÊNCIA";
        builder[1] = "Energia arcana lhe provê rapidez sobrenatural.";
        builder[2] = "Use enquanto seu Herói é Nível 1.";
        builder[3] = "Seu Herói se torna Nível 2 \n\n(Vire sua Carta de Herói.)";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "Descarte essa carta após usa-la";
        Cards.add(builder);

        //164
        builder = new String[9];
        builder[0] = "ESPADA VORPAL";
        builder[1] = "Não há nada tão afiado como a mordida de uma lâmina vorpal.";
        builder[2] = "Use esse item imediatamente.";
        builder[3] = "Você ganha um bônus de +2 ao rolar para atacar Monstros adjacentes enquanto esse item estiver em jogo.\n\nSe você rolar um 18, 19, ou 20 quando atacar, você dá +1 de dano com esse ataque.";
        builder[4] = "Preço: 2000 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "";
        Cards.add(builder);

        //165
        builder = new String[9];
        builder[0] = "VARINHA DO MEDO";
        builder[1] = "Um raio âmbar pálido atinge seus inimigos, mandando-os embora.";
        builder[2] = "Use em vez de atacar.";
        builder[3] = "Escolha uma peça dentro de 1 peça de distância de você. Coloque cada Monstro nessa peça até 2 peças de distância de você.";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "VIRE ESSA CARTA APÓS USAR O ITEM";
        Cards.add(builder);

        //166
        builder = new String[9];
        builder[0] = "VARINHA DO POLIMORFISMO";
        builder[1] = "A varinha envolve o monstro em luz, transformando-o em uma criatura diferente.";
        builder[2] = "Use em vez de atacar.";
        builder[3] = "Escolha um Monstro dentro de 2 peças de distância de você. Compre uma Carta de Monstro e substitua o Monstro original.";
        builder[4] = "Preço: 1500 gold";
        builder[5] = "";
        builder[6] = "";
        builder[7] = "";
        builder[8] = "VIRE ESSA CARTA APÓS USAR O ITEM";
        Cards.add(builder);

        for(int x = 0; x < 18; x++){
            Cards.add(builder);
        }

        //Villagers
        //185
        builder = new String[21];
        builder[0] = "Aldeão";
        builder[1] = "Alek";
        builder[2] = "15";
        builder[3] = "2";
        builder[4] = "Se o Alek estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ele se move para o lado do Herói mais próximo.";
        builder[6] = "Se o Alek estiver adjacente a um Monstro,";
        builder[7] = "ele ataca o Monstro com um Soco.";
        builder[8] = "Caso contrário,";
        builder[9] = "Alek se move 1 peça na direção do Herói mais próximo.";
        builder[10] = "";
        builder[11] = "";
        builder[12] = "+2";
        builder[13] = "";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);

        //186
        builder = new String[21];
        builder[0] = "Aldeão";
        builder[1] = "Brandis";
        builder[2] = "13";
        builder[3] = "2";
        builder[4] = "Se o Brandis estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ele se move para o lado do Herói mais próximo.";
        builder[6] = "Se o Brandis estiver em uma peça com uma borda inexplorada,";
        builder[7] = "saque uma peça debaixo da pilha e coloque um Monstro nessa peça.";
        builder[8] = "Caso contrário,";
        builder[9] = "Brandis se move 1 peça na direção da peça mais próxima com uma borda inexplorada.";
        builder[10] = "";
        builder[11] = "";
        builder[12] = "";
        builder[13] = "";
        builder[14] = "";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);

        //187
        builder = new String[21];
        builder[0] = "Aldeão";
        builder[1] = "Cassi";
        builder[2] = "14";
        builder[3] = "1";
        builder[4] = "Se a Cassi estiver dentro de 1 peça de distância de um Herói,";
        builder[5] = "ele se move para o lado do Herói mais próximo.";
        builder[6] = "Caso contrário,";
        builder[7] = "Cassi se move 1 peça na direção da Saída.";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "";
        builder[11] = "";
        builder[12] = "";
        builder[13] = "";
        builder[14] = "";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);

        //188
        builder = new String[21];
        builder[0] = "Aldeão";
        builder[1] = "Donnel";
        builder[2] = "15";
        builder[3] = "2";
        builder[4] = "Se o Alek estiver dentro de 1 peça de distância de um Monstro,";
        builder[5] = "ele se move para o lado do Monstro e ataca com um Soco.";
        builder[6] = "Caso contrário,";
        builder[7] = "Donnel se move 1 peça na direção do Herói mais próximo.";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "";
        builder[11] = "";
        builder[12] = "+2";
        builder[13] = "";
        builder[14] = "1";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);

        //189
        builder = new String[21];
        builder[0] = "Aldeão";
        builder[1] = "Elizar";
        builder[2] = "12";
        builder[3] = "1";
        builder[4] = "Se a Elizar estiver dentro de 1 peça de distância de um Monstro,";
        builder[5] = "ela treme de medo e não faz nada.";
        builder[6] = "Caso contrário,";
        builder[7] = "Elizar se move 1 peça na direção do Herói mais próximo";
        builder[8] = "";
        builder[9] = "";
        builder[10] = "";
        builder[11] = "";
        builder[12] = "";
        builder[13] = "";
        builder[14] = "";
        builder[15] = "";
        builder[16] = "";
        builder[17] = "";
        builder[18] = "";
        builder[19] = "#999768";
        builder[20] = "#b2b197";
        Cards.add(builder);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardNumberText = (EditText) findViewById(R.id.cardNumberET);
        cardNumberText.setInputType(InputType.TYPE_CLASS_NUMBER);
        initCards();
    }

    public void onCardGo(View view){
        int cardN = 0;
        boolean invalid = false;

        try {
            cardN = Integer.parseInt(cardNumberText.getText().toString());
            if(cardN < 50 || (cardN > 166 && cardN < 185) || cardN > 189)
                invalid = true;
        }
        catch (NumberFormatException e){
            invalid = true;
        }


        if(invalid){
            Toast.makeText(getBaseContext(), "Numero Invalido!",
                    Toast.LENGTH_SHORT).show();

            return;
        }


        Intent intent = new Intent(this, ShowCardInfo.class);
        intent.putExtra("cardN", cardN);
        intent.putExtra("texts", Cards.get(cardN-1));

        startActivity(intent);

    }
}
