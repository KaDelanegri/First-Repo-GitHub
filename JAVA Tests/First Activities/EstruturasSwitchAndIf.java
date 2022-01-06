public class EstruturasSwitchAndIf {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
//        ifFerias();
//        ifMenor();

        switchSemana();
//        switchNumero();
        switchFerias();
    }

    private static void ifFlecha() { //exemplo de if em flecha, código ilegível
        int mes = 14; //entrada do número do mês equivalente
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês Indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    } //estrutura de flecha >

    private static void ifSemFlecha() { //utilização do if else if, maior legibilidade ao código
        int mesSemFlecha = 13;
        if (mesSemFlecha == 1) {
            System.out.println("Janeiro");
        }
        else if (mesSemFlecha == 2) {
            System.out.println("Fevereiro");
        }
        else if (mesSemFlecha == 3) {
            System.out.println("Março");
        } else {
            System.out.println("Mês Indefinido");
        }
    }

    private static void switchSemana() { //estrutura switch para um único valor (no caso String que devolve o número do mês equivalente)
        String diaDaSemana = "karine";
        switch (diaDaSemana) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case"Quarta":
                System.out.println(4);
                break;
            default:
                System.out.println("Por favor, coloque um dia válido");
        }
    }

    private static void switchFerias() { //switch para um conjunto de Strings (no caso: Janeiro, Julho e Dezembro) retornando uma mensagem
        String mesesFerias = "karine";
        switch (mesesFerias) {
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Férias!!!");
                break;
            default:
                System.out.println("Mês Indefinido"); //o default é usado apenas para apontar que a informação apontado não é a correta relacionada com o valor, NÃO é para usar como um valor definitivo ou opção de valor
                break;
            }
            /*case "Fevereiro":
            case "Março":
            case "Abril":
            case "Maio":
            case "Junho":
            case "Agosto":
            case "Setembro":
            case "Outubro":
            case "Novembro":
                System.out.println("Indefinido");
                break;*/ //parte do exercício que fiz sozinha, coloquei um case para cada opção não desejada, mas pode ser diminuído para o default e depois o break
        }
    }