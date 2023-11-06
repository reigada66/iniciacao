import java.util.ArrayList;
import java.util.List;

class Computer {
    private String nome;
    private List<HardwareComponent> componentes;

    public Computer(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<HardwareComponent> getComponentes() {
        return componentes;
    }

    public void adicionarComponente(HardwareComponent componente) {
        componentes.add(componente);
    }

    public void ligar() {
        System.out.println(nome + " está ligando...");
        for (HardwareComponent componente : componentes) {
            componente.ligar();
        }
    }

    public void desligar() {
        System.out.println(nome + " está desligando...");
        for (HardwareComponent componente : componentes) {
            componente.desligar();
        }
    }
    public static void main(String[] args) {
        Computer meuComputador = new Computer("Meu Computador");

        HardwareComponent ram = new MemoryRAM("Memória RAM Kingston", "Kingston", 79.99, 16);
        HardwareComponent discoExterno = new ExternalDisk("Disco Externo Samsung", "Samsung", 129.99, "USB 3.0");
        HardwareComponent fonteAlimentacao = new PowerSupply("Fonte de Alimentação Corsair", "Corsair", 89.99, 650);

        meuComputador.adicionarComponente(ram);
        meuComputador.adicionarComponente(discoExterno);
        meuComputador.adicionarComponente(fonteAlimentacao);

        // Ligar o computador e seus componentes
        meuComputador.ligar();

        // Desligar o computador e seus componentes
        meuComputador.desligar();
    }
}
