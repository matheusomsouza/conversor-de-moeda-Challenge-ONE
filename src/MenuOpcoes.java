public class MenuOpcoes {
    private String moeda;
    private String moedaNova;

    public String getMoeda() {
        return moeda;
    }

    public String getMoedaNova() {
        return moedaNova;
    }

    public String menu() {
        return """
                ******************************
                
                Bem vindo ao Conversor de Moeda!
                
                1. Real Brasileiro para Dolar Americano
                2. Real Brasileiro para Yene Japonês
                3. Real Brasileiro para Peso Argentino
                4. Dolar Americano para Real Brasileiro
                5. Yene Japonês para Real Brasileiro
                6. Peso Argentino para Real Brasileiro
                7. Sair
                
                ******************************
                
                Escolha uma opção válida:
                """;
    }

    public void opcao(int opcao) {
        if (opcao == 1) {
            moeda = "BRL";
            moedaNova = "USD";
        } else if (opcao == 2) {
            moeda = "BRL";
            moedaNova = "JPY";
        } else if (opcao == 3) {
            moeda = "BRL";
            moedaNova = "ARS";
        } else if (opcao == 4) {
            moeda = "USD";
            moedaNova = "BRL";
        } else if (opcao == 5) {
            moeda = "JPY";
            moedaNova = "BRL";
        } else if (opcao == 6) {
            moeda = "ARS";
            moedaNova = "BRL";
        }
        else {
            moeda = "NULL";
            moedaNova = "NULL";
        }
    }
}
