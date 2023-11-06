// Classe base que representa um componente de hardware genérico
class HardwareComponent {
    private String nome;
    private String fabricante;
    private double preco;

    public HardwareComponent(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    // Métodos getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para descrever o componente de hardware
    public void descrever() {
        System.out.println("Nome: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Preço: " + preco);
    }

    public void ligar() {
        System.out.println("Ligando o componente de hardware: " + getNome());
    }

    // Método para desligar o componente de hardware
    public void desligar() {
        System.out.println("Desligando o componente de hardware: " + getNome());
    }

}

// Subclasse que representa um componente de hardware específico (Memória RAM)
class MemoryRAM extends HardwareComponent {
    private int capacidade;

    public MemoryRAM(String nome, String fabricante, double preco, int capacidade) {
        super(nome, fabricante, preco);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // Sobrescrever o método de descrição para incluir a capacidade
    @Override
    public void descrever() {
        super.descrever();
        System.out.println("Capacidade: " + capacidade + " GB");
    }

    // Implementação do método ligar específico para memória RAM
    @Override
    public void ligar() {
        System.out.println("Inicializando a memória RAM: " + getNome());
    }

    // Implementação do método desligar específico para memória RAM
    @Override
    public void desligar() {
        System.out.println("Desligando a memória RAM: " + getNome());
    }
}

// Subclasse que representa outro tipo de componente de hardware (Disco Externo)
class ExternalDisk extends HardwareComponent {
    private String tipoInterface;

    public ExternalDisk(String nome, String fabricante, double preco, String tipoInterface) {
        super(nome, fabricante, preco);
        this.tipoInterface = tipoInterface;
    }

    public String getTipoInterface() {
        return tipoInterface;
    }

    public void setTipoInterface(String tipoInterface) {
        this.tipoInterface = tipoInterface;
    }

    // Sobrescrever o método de descrição para incluir o tipo de interface
    @Override
    public void descrever() {
        super.descrever();
        System.out.println("Tipo de Interface: " + tipoInterface);
    }

    public void ligar() {
        System.out.println("Montando o disco externo: " + getNome());
    }

    // Implementação do método desligar específico para disco externo
    @Override
    public void desligar() {
        System.out.println("Desmontando o disco externo: " + getNome());
    }

}

// Subclasse que representa outro tipo de componente de hardware (Fonte de Alimentação)
class PowerSupply extends HardwareComponent {
    private int potencia;

    public PowerSupply(String nome, String fabricante, double preco, int potencia) {
        super(nome, fabricante, preco);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Sobrescrever o método de descrição para incluir a potência
    @Override
    public void descrever() {
        super.descrever();
        System.out.println("Potência: " + potencia + " Watts");
    }

    // Implementação do método ligar específico para fonte de alimentação
    @Override
    public void ligar() {
        System.out.println("Iniciando a fonte de alimentação: " + getNome());
    }

    // Implementação do método desligar específico para fonte de alimentação
    @Override
    public void desligar() {
        System.out.println("Desligando a fonte de alimentação: " + getNome());
    }
}