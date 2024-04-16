import Guaragem.Guaragem;
import Guaragem.Caminhao.Caminhao;
import Guaragem.Carro.Carro;
import Guaragem.Moto.Moto;
import Guaragem.Veiculo;

public class Demo {
    public static void main(String[] args) {
        Veiculo volvo = new Caminhao("Volvo",2024,"XXX0X00");
        Veiculo teslaModelS = new Carro("Tesla Model S",2024,"XXX0X00");
        Veiculo toyotaCorolla = new Carro("Toyota Corolla",2024,"XXX0X00");
        Veiculo yamaha  = new Moto("Yamaha ",2024,"XXX0X00");

        Guaragem<Veiculo> veicularMax = new Guaragem<Veiculo>("VeicularMax",1322312);

        veicularMax.addGuaragem(volvo);
        veicularMax.addGuaragem(teslaModelS);
        veicularMax.addGuaragem(toyotaCorolla);
        veicularMax.addGuaragem(yamaha);

        veicularMax.imprimirListGuaragem();

        veicularMax.removeFistListGuaragem();

        veicularMax.imprimirListGuaragem();


    }
}