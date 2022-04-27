package pi_projeto_integrador_grupo_1;

import java.util.Scanner;

public class PI_PROJETO_INTEGRADOR_GRUPO_1 {

    static Scanner open = new Scanner(System.in);

    public static String[] INFOS() {
        String[] ARRAY = new String[3];
        
        System.out.println("Escolha o nome de seu personagem: ");
        ARRAY[0] = open.nextLine();
        System.out.println("Escolha uma classe \n"
                + "Arqueiro \n"
                + "Mago \n"
                + "Guerreiro ");
        ARRAY[1] = open.nextLine();
        System.out.println("Escolha uma habilidade \n"
                + "Força \n"
                + "Inteligencia \n"
                + "Raciocinío ");
        ARRAY[2] = open.nextLine();
     return ARRAY;   
    }

	//metodo que recebe o tempo q o microondas vai aquecer o alimento
	 public static void contador(int seconds){       
             System.out.println("Chamou");
         long time, time1;
         	//a variavel time vai receber a hora atual do sistema em milisegundos
            time = System.currentTimeMillis();
            //enquanto o tempo do sistema atual - o tempo do sistema recebido na chamada do metodo for menor q o tempo 
            //q o usuario colocou para aquecer o loop continuara, quando sair irá mostrar a msg q o aquecimento esta
            //pronto.
            do {
                time1 = System.currentTimeMillis();
            	} while ((time1 - time) < (seconds * 1000)) ;
            System.out.println("Pronto!");
     }
	


    public static void main(String[] args) {

        String nome; // variavel = nome do personagem e verificação
        char fnDesafio1,
                fnRetorno,
                osso = '0',
                catatumba = '0',
                saidacastel = '1',
                reinogor = '0',
                options,
                recompensa = '0',
                saida = '0',
                castel = '0',
                mago = '0';

        boolean profecia1;
        //contador(2);
        // Introdução do objetivo do jogo
        System.out.println("Existe um reino chamado de Versália, neste reino vive diversos povos e\ncriaturas místicas,"
                + " comandadas pelo Rei Demétrio.\nUm certo dia o Rei foi envenenado por um de seus leais cavaleiros,\n"
                + "mas só o próprio Rei sabe quem o envenenou, diante disso,\n"
                + "você deve procurar o Cálice Sagrado que contém um incrível antidoto.\n"
                + "Mas deve fazer isso o mais rápido possível para salvar o rei ainda com vida.\n"
                + "Você irá enfrentar diversos obstáculos, decisões difíceis e enigmas.\nBoa Aventura!\n\n\n");

        // Escolher o nome do personagem
        String[] ARRAY = INFOS();
        // Seu nome
        System.out.println("\n\nOlá " + ARRAY[0]);

        // Descrição do persoangem
        System.out.println("\n\n [Descrição de personagem:]");
        System.out.println("Você recebeu uma dádiva desde o nascimento, sendo corajoso e apaixonado por desafios, "
                + "estando em busca de reconhecimento e testar suas habilidades.");

        System.out.println(" _____________________________________________________________________________________________________________________________________");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|_____________________________________________________________________________________________________________________________________|");

        //Introdução ao mundo
        System.out.println("\n\nEm um reino distante chamado de Versália, existe diversos povos e criaturas místicas,\n"
                + "governados pelo Rei Demétrio, este reino é muito bem estabilizado existindo paz. \n"
                + "Mas neste reino existia algumas criaturas e seres humanos que queriam tomar o trono do rei, \n"
                + "perseguindo o poder, e desta forma podendo acabar com outros reinos existentes ali,\n"
                + "como a Reino de Gór e a Cidade dos mortos.\n\n"
                + "Um certo dia o Rei foi envenenado por um de seus leais cavaleiros, este veneno é mortal, \n"
                + "onde o rei teria exatos 1 semana de vida, desta forma, todos tentando encontrar quem o envenenou, \n"
                + "mas só o próprio Rei sabe quem o envenenou. \n"
                + "Diante o empasse você, " + ARRAY[0] + ", o grande Herói, deve procurar o Cálice Sagrado, que possa curar o rei. \n"
                + "O reinos estão abalados com a enfermidade do Rei e conflitos estão começando. \n"
                + "Por isso deve-se fazer isso o mais rápido possível para salvar o Rei com tempo de vida e voltar tudo ao normal entre os reinos.\n");

        System.out.println(" _____________________________________________________________________________________________________________________________________");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|_____________________________________________________________________________________________________________________________________|");

        // O JOGO COMEÇA AQUI
        System.out.println("\n[CHEGANDO EM VERSÁLIA]");

        //Chegando em versalia
        System.out.println("\n\nVocê acaba de passar pelos portões Sul de Versalia, que estava com um \n"
                + "grande nível de segurança, acima dos portões, com vários cavaleiros em sua guarda.\n"
                + "Após entrar na cidade, nota-se ainda mais a presença de cavaleiros dentro do reino.\n"
                + "Aos poucos nota-se o clima inseguro e desconfiado tanto dos guardas, quanto da população\n"
                + "de camponeses e de mercadores ao redor, Como se algo fosse acontecer.\n"
                + "Após andar pela cidade a procura de algum lugar para passar a noite, decide ir a uma taverna próxima dali.\n"
                + "\nA taverna tinha uma essência completamente diferena a cidade, várias pessoas bebendo, como se nada\n"
                + "tivesse acontecendo. A vista, a maioria dos bebados pareciam ser comerciantes de passagem pela cidade.\n");

        // Informações iniciais para o personagem + dialogo com npc
        System.out.println("[O comerciante chama a sua atenção para uma conversa!]\n\n"
                + "*Comerciante*: Olá jóvem, é a primeira vez que te vejo em meu bar, você não é daqui não é?\n"
                + "Notou que a segurança desse lugar está bem ativa, não ? Pois é, a situação\n"
                + "não vai nada bem. Nosso rei está enfermo de uma doença ou veneno terrível.\n"
                + "Recentemente perdemos nossa rainha, agora o rei...\n"
                + "Logo logo, é possível termos de partir dessa cidade, o equilíbrio de paz está muito a um fio\n"
                + "de se perder caso o rei morra, ele era o único que conseguia manter o equilíbrio de poder entre os povos.\n"
                + "Sugiro não perder seu tempo aqui, a maioria dos comerciantes já sairam da cidade.\n"
                + "Mas se quiser passar a noite, eu cobro um preço barato, tome sua chave, seu quarto está no fim do corredor, subindo as escadas.\n\n");

        System.out.println("[Próximo Dia]");

        System.out.println("\nSaindo da taverna\n\n"
                + "*Comerciante*: Hey jóvem aventureiro, leve isso... Esta é uma espada que um comerciante de escravos\n"
                + "deixou de presente para mim. De qualquer forma, isso não me é de nenhum uso. \n"
                + "Leve isso com você!"
                + "Recomendo sair em direção a Floresta Negra\n\n");

        // Item espada
        System.out.println("[Adquirido Espada desconhecida]\n\n");

        // Primeiro mapa floresta negra
        System.out.println("\nSaindo de Versália em direção a: \n"
                + "Floresta Negra\n\n");

        System.out.println(" _____________________________________________________________________________________________________________________________________");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|_____________________________________________________________________________________________________________________________________|");

        System.out.println("[Chegado na Floresta Negra]\n");

        // Descrição Floresta Negra
        System.out.println("A Flortesta Negra não é uma floresta comum, é o lar de vários animais selvagens,\n"
                + "com trilhas suspeitas, quanto mais adentro dela, mais sente a falta de iluminação!\n\n");

        //Continuacao historia
        System.out.println("Caminhando pela floresta em sua trilha comum\n"
                + "você se depara com rastros de uma outra trilha que parece levar a outro caminho,\n"
                + "e ao mesmo tempo, gritos vindos de outra direção.\n");
        do {
            do {
                // 1º Desafio da Floresta Negra
                System.out.println("Escolha: \n"
                        + "1 - Seguir seu caminho em frente\n"
                        + "2 - Seguir trilha suspeita\n"
                        + "3 - Seguir gritos");
                System.out.println("Escolha 1, 2 ou 3\n");
                fnDesafio1 = open.next().charAt(0); // inserir opção 1, 2 ou 3

                // Mostrar opção errada
                if (fnDesafio1 != '1' && fnDesafio1 != '2' && fnDesafio1 != '3') {
                    System.err.println("\nOpção " + fnDesafio1 + " Inválida\n");
                }
            } while (fnDesafio1 != '1' && fnDesafio1 != '2' && fnDesafio1 != '3');

            switch (fnDesafio1) {

                case '1':
                    ////// Continuação para Cidade dos ossos
                    ////// Continuação de jogo

                    System.out.println("Escolha feita: 1 - Seguir seu caminho em frente!\n\n"
                            + "Seguindo o caminho em frente você se depara com antiga caverna\n"
                            + "Dentro desta caverna encontra uma antiga profecia.\n\n");

                    // Profecia História com Matéria EAD
                    System.out.println("Profecia: \n"
                            + "Há muito tempo, um papa tão antigo que já foi esquecido, durante uma oração,\n"
                            + "proferiu que um jovem herói traria de volta o desaparecido Cálice Sagrado de volta ao mundo,\n"
                            + "e com isso a paz reinaria novamente. Isso tudo na antiga língua de Baldur, e foi passado até os dias de hoje.\n\n\\n"
                            + "Fenômenos assim mostram a complexidade da linguagem: ela envolve nossos medos, preconceitos e nossas preconcepções;\n"
                            + "nosso estado de espírito; a tomada de decisão sobre o uso que faremos da linguagem e seus objetivos; \n"
                            + "envolve, enfim, toda uma série de circunstâncias e influências, que não permitem, jamais, \n"
                            + "que você seja absolutamente neutro (a) ou isento (a) no uso da linguagem. \n"
                            + "Ou seja, tudo o que está escrito tem uma visão de mundo, nesse caso a visão de esperança de paz para o mundo.");

                    System.out.println("\n\n[PARABÉNS]\n"
                            + "Informações importantes foram encontradas. \n\n");

                    //char true profecia
                    profecia1 = true;

                    break; // break case1 - fnDesafio1

                // escolha 2
                case '2':

                    ////// FIM DE JOGO
                    ///// MORTE EM FRENTE
                    System.err.println("\nEscolha feita: 2 - Seguir rastro de trilha supeita!\n\n"
                            + "Você segue o rastro de trilha que parece ser de vários animais\n"
                            + "Adentrando por essa trilha desconehcida na floresta, uma neblina densa e obscura começa a cerca-lo.\n"
                            + "De repente ouve diversos uivos de lobo por todos os lados, e, ainda perde a noção de iluminação de todo o local.\n"
                            + "Acabou seguindo uma trilha deixada por uma alcateia de lobos selvagens, lideradas pelo alfa, um Great Wolf.\n"
                            + "Você saca sua espada para se preparar pelo pior. \n"
                            + "Todos os lobos liderados pelo alfa o atacam, você acaba matando 3 lobos da alcateia, \n"
                            + "porém o ataque dos mesmos não acabam. Gravemente ferido, o Great Wolf lhe dá um último ataque\n"
                            + "MORDIDA\n"
                            + "Você acaba sendo envolta as presas do Alfa e acaba morrende neste mesmo ataque,\n"
                            + "decorrido de grande perda de sangue e ferimentos graves...\n\n");

                    System.err.println("\n\nVOCÊ MORREU\n\n"
                            + "Com isso o rei acabou morrendo. Versália acaba por sofrer um golpe interno, \ne por fim acaba "
                            + "sendo invadida por outros povos levando o reino a desgraça!");
                    System.err.println("\n\nFIM DE JOGO");
                        System.exit(0);
                    break; // break case 2 - fnDesafio1
                // escolha 3
                case '3':
                    do {
                        do {
                            System.out.println("Escolha feita: 3 - Seguir gritos!\n"
                                    + "Você segue um grito desesperado, parecendo ser de uma criança.\n"
                                    + "Logo chega ao local em que o grito parecia ter vindo, mas não encontra nada.\n"
                                    + "Observando o local em volta, acaba enccontrando um osso brilhante sendo enraizados por\n"
                                    + "uma árvore apodrecida. Você chega perto desse osso e ao tocá-lo a árvore cede o osso para coleta.\n"
                                    + "[Item desconhecido - Osso petrificado]\n\n"
                                    + "Escolha:\n"
                                    + "1 - Continuar explorando a floresta\n"
                                    + "2 - Ir a Cidade dos Ossos");
                            fnRetorno = open.next().charAt(0); // escolha de retorno    

                            // Mostrar opção errada
                            if (fnRetorno != '1' && fnRetorno != '2') {
                                System.err.println("\nOpção " + fnRetorno + " Inválida");
                            }
                        } while (fnRetorno != '1' && fnRetorno != '2');

                        if (fnRetorno == '1') {
                            fnDesafio1 = '1';
                        } else {
                            fnDesafio1 = fnDesafio1;
                        }

                        osso = '1'; //booleano true osso

                    } while (fnRetorno != '1' && fnRetorno != '2'); // Fim repetição fnRetorno

                    break;

            } // Fim switch case fnDesafio1
        } while (fnDesafio1 == '1' || fnDesafio1 == '2');

        //Cidade dos ossos
        System.out.println("Você acaba de chegar na Cidade Dos Ossos\n"
                + "Cuidado a cidade é governada por esqueletos...\n");
        //laço de repetição para a cidade dos ossos
        do {

            System.out.println("Escolha para onde ir:\n");
            System.out.println("1-Ajudar uma criança perdida\n"
                    + "2-Entrar no Castelo de Ossos\n"
                    + "3-Seguir para as catatumbas");
            options = open.next().charAt(0);
            //switch para escolher qual das tres opções
            switch (options) {
                case '1':
                    System.out.println("Você decide ajudar a criança\n"
                            + "ele diz que foi até a cidade com seu avó\n"
                            + "porém se afastou e se perdeu\n"
                            + "Você ouve gritos de ajuda chegando perto você se depara\n"
                            + "com um senhor cercado por ladrões esqueletos\n"
                            + "após  você lutar contra os esqueletos e salvar o velho\n"
                            + "e ajudar a criança o idoso deseja te dar um presente\n"
                            + "Escolha sua recompensa:\n"
                            + "1-Antiga Espada\n"
                            + "2-Saco de Moedas de Bronze\n");
                    recompensa = open.next().charAt(0);
                    //while para testar resultado
                    while (recompensa != '1' && recompensa != '2') {
                        System.out.println("Comando Inválido\n"
                                + "Escolha sua recompensa:\n"
                                + "1-Antiga espada\n"
                                + "2-Saco de Moedas de Bronze");
                        recompensa = open.next().charAt(0);
                    }

                    System.out.println("Deseja:\n"
                            + "1-Ir para o Reino de Gor\n"
                            + "2-Continuar na Cidade dos ossos\n");
                    saida = open.next().charAt(0);
                    //while para testar resultado
                    while (saida != '1' && saida != '2') {
                        System.out.println("Comando Inválido");
                        System.out.println("Deseja:\n"
                                + "1-Ir para o Reino de Gor\n"
                                + "2-Continuar na Cidade dos ossos\n");
                        saida = open.next().charAt(0);
                    }

                    if (saida == '1') {
                        reinogor = '1';
                    } else {
                    }
                    break;
                case '2':
                    if (osso == '1') {
                        System.out.println("Você entra no castelo muitos corredores e comodos\n"
                                + "Escolha onde ir:\n"
                                + "1-Sala de jantar\n"
                                + "2-Sala de festas");
                        castel = open.next().charAt(0);
                        //while para testar resultado
                        while (castel != '1' && castel != '2') {
                            System.out.println("Coamando Inválido"
                                    + "Escolha onde ir:\n"
                                    + "1-Sala de jantar\n"
                                    + "2-Salão principal");
                        }

                        switch (castel) {
                            case '1':
                                System.out.println("Você entrou na sala de jantar\n"
                                        + "Um mago esqueleto esta la mas ele não te viu\n"
                                        + "Oque você vai fazer:\n"
                                        + "1-Fugir"
                                        + "2-Lutar"
                                        + "3-Conversar");
                                mago = open.next().charAt(0);
                                while (mago != '1' && mago != '2' && mago != '3') {
                                    System.out.println("Coamando Inválido"
                                            + "1-Fugir"
                                            + "2-Lutar"
                                            + "3-Conversar");

                                }
                                switch (mago) {
                                    case '1':
                                        System.out.println("VocÊ fugiu foi por pouco hein");
                                        break;
                                    case '2':
                                        System.err.println("Você escolheu lutar péssima"
                                                + "escolha , ele é o mago esqueleto supremo"
                                                + "e você foi derrotado e Versáliafoi destruída");
                                        System.exit(0);
                                        break;
                                    case '3':
                                        System.out.println("Herói- olá??\n"
                                                + "Mago- Um forasteiro por aqui!!\n"
                                                + "Herói- Eu veio em missão de paz\n"
                                                + "Mago- Qual sua missão mero mortal??\n"
                                                + " Herói- Estou em busca do cálice sagrado para salvar \n"
                                                + "meu reino pois meu rei está muito doente!!\n"
                                                + "Mago -Entendo grande herói, vejo que está em busca de um objetivo nobre mas há\n"
                                                + "algumas coisas que precisa saber!\n"
                                                + "O que te move são as 4 formas do conhecimento:");
                                        System.out.println("1- Empírico: fundamentado na experiência, você é novo mas deve ter muita coragem,\n"
                                                + "e a coragem é adquirida através das missões.\n"
                                                + "2- Cientifico: conhecimento fundamentado na razão e na certeza, a certeza da\n"
                                                + "doença de seu rei é um grande risco de morte.\n"
                                                + "3- Filosófico: fundamentado na reflexão, essa jornada não se trata só do cálice, você\n"
                                                + "está explorando novos lugares, essa jornada trará autoconhecimento a você.\n"
                                                + "4- Por fim, mas não menos importante o conhecimento teológico, fundamentado na fé,\n"
                                                + "e sua jornada se baseia na fé que você tem em um cálice que você nunca viu, e ainda\n"
                                                + "por cima, está desaparecido.");
                                        System.out.println("Herói- Grande Mago, por acaso sabe de alguma coisa sobre esse cálice?\n"
                                                + "Mago- Ahh o antigo cálix ... forjado de ouro sagrado no antigo reino de Baldur durante\n"
                                                + "uma noite de lua cheia, Baldur um grande reino tão prospero que havia grandes cofres\n"
                                                + "e se estendia da floresta negra até onde hoje em dia é chamado Reino de Gór, por\n"
                                                + "essa extensão e essa riqueza Baldur pagou caro, o Reino acabou sendo divido durante\n"
                                                + "a primeira guerra santa e o cálix detentor do poder da vida e da cura foi escondido pela\n"
                                                + "Rainha Ellia para que não caísse em mãos erradas. E assim tanto a Rainha como o\n"
                                                + "Calix nunca mais foram vistos...\n"
                                                + "Mago-Não sou comandante de todos os esqueletos daqui melhor ir ates que noite caia");
                                        System.out.println("Escolha para onde você deseja ir:\n"
                                                + "1-Ir ao Reino de Gor\n"
                                                + "2-Voltar a Cidade de Ossos\n");
                                        saidacastel = open.next().charAt(0);
                                        if (castel == '2') {

                                            castel = '0';
                                            options = '0';
                                        } else {
                                            reinogor = '1';

                                        }
                                }
                                break;
                            case '2':
                                System.out.println("Você não encontrou nada aqui\n"
                                        + "só uma porta que dava pra saída...");
                                break;
                            default:
                                System.out.println("Comando Inválido");
                                break;
                        }

                    } else {
                        System.out.println("Você não pode entrar no castelo sem o osso petrificado");
                    }
                    break;
                case '3':
                    do {
                        System.out.println("Você chegou a catatumba...\n"
                                + "1-Olhar ao Redor da catatumba\n"
                                + "2-Entrar e explorar a catatumba\n");
                        catatumba = open.next().charAt(0);
                        switch (catatumba) {
                            case '1':
                                System.out.println("Você decide olhar ao redor da catatumba\n"
                                        + "andando próximo a catatumba você encontra um antigo pergaminho\n"
                                        + "nele esta esta um escrito\n");
                                System.out.println("O liquido da vida hoje chamam de água na\n"
                                        + "antiga lingua era chamado de aquae");
                                break;
                            case '2':

                                System.err.println("Você decide entrar na catatumba\n"
                                        + "a catacumba se fecha um vento forte apaga sua tocha, o herói se\n"
                                        + "vê cercado por fortes esqueletos\n"
                                        + "aaah não era uma armadilha de esqueletos\n");
                                System.err.println("Você morreu e agora versália será destruida");
                                System.exit(0);

                                break;
                            default:
                                System.out.println("Comando Inválido");
                                break;
                        }
                    } while (catatumba != '1' && catatumba != '2');
                    break;

            }

        } while (reinogor == '0');

        //Mapa de Gor
        char Resposta;
        int thCity;

        do {
            do {
                System.out.println("Voce escolhe conversar:");
                System.out.println("1-Comandante da Guarda \n2-Comerciane Esqueleto \nDigite sua opção !!");
                thCity = open.nextInt();
            } while (thCity != 1 && thCity != 2);

            switch (thCity) {
                case 1:
                    System.out.println("[Comandante] \n"
                            + " Um jovem esta precisando de ajuda, a guarda esta em uma missão de exploração e é preciso ajuda você vai:");
                    System.out.println("Digite sua resposta: \n 1-Ajudar na exploração \n 2-Retornar a entrada de Gor");
                    thCity = open.nextInt();

                    if (thCity == 1) {
                        System.out.println("Parabéns você chegou na Cidade Perdida\n Você acabou se perdendo do seu grupo");
                        System.out.println("Você tem duas opções : \n 1-Procurar Amigos \n 2-Explorar");
                        thCity = open.nextInt();

                        if (thCity == 2) {
                            thCity = thCity;
                        } else {
                            System.out.println("Você escolheu procurar seus amigos, então retorne para entrada do reino ");
                            thCity = 3;
                        }
                    } else {
                        thCity = 3;
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu conversar com Comerciante Esqueleto \n"
                            + "[Comerciante Esqueleto]Olá jovem forasteiro percebo que é um jovem forte, preciso de uma ajuda,\n"
                            + "Gor esta passando por uma crise hidrica, não posso deixar a loja sozinha pode buscar agua para mim?\n"
                            + "\n 1-Sim \n 2-Não");
                    thCity = open.nextInt();
                    if (thCity == 1) {
                        System.out.println("Bom agora temos dois caminhos para sua jornada, você deseja\n"
                                + "Você deseja ir:\n"
                                + "1-Cidade Perdida\n"
                                + "2-Esgoto");
                        thCity = open.nextInt();

                        if (thCity == 1) {
                            thCity = thCity;
                        } else {
                            System.out.println("Voce deseja seguir:\n"
                                    + "1- Rastro de tochas\n"
                                    + "2- Galeria principal");
                            System.out.println("Digite uma opção");
                            thCity = open.nextInt();
                            if (thCity == 2) {
                                thCity = thCity;
                            } else {
                                System.out.println("Você escolhe o rastro de tochas e se depara com uma armadilha de esqueletos no caminho você morre");
                                System.exit(0);
                            }
                        }
                    } else {
                        thCity = 3;
                    }

                    break;
            }
        } while (thCity != 1 && thCity != 2);

        do {

            System.out.println("Magnifico encontramos a fonte, mas há um problema para passar é preciso desvendar\n"
                    + "o enigma da cachoeira");
            System.out.println("Digite Qual opção voce acha que é o enigma\n"
                    + " 1 - Calix\n"
                    + " 2 - Calice Sagrado\n"
                    + " 3 - Calice");
            Resposta = open.next().charAt(0);
        } while (Resposta != '1' && Resposta != '2' && Resposta != '3');

        switch (Resposta) {

            case '1':
                System.out.println(" _____________________________________________________________________________________________________________________________________");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|_____________________________________________________________________________________________________________________________________|");
                System.out.println("Parabéns heroí, você acertou.\n"
                        + "Graças a você a cidade de versália foi salva.\n"
                        + "O rei tomou do calix da vida e foi salvo.\n"
                        + "Então pode voltar a governa Versália e evitar\n"
                        + "que outros reinos tentem atacar Versália.\n"
                        + "E você sempre será lembrado como "+ARRAY[0]
                        +" o "+ARRAY[1]
                        +" que salvou Versália em sua maior crise \n"
                        + "usando de sua/seu "+ARRAY[2]+".");
                System.out.println(" _____________________________________________________________________________________________________________________________________");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////|");
        System.out.println("|_____________________________________________________________________________________________________________________________________|");
                break;
            case '2':
                System.out.println("Você errou !");
                break;
            case '3':
                System.out.println("Voê errou !");
                break;
        }

    }

}
