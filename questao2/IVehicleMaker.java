// Padrao FACTORY: cada fabricante implementa makeVehicle e decide, a partir
// do modelo informado, qual veiculo concreto sera devolvido. Quem usa nao
// precisa conhecer as classes concretas (Corolla, Civic, etc).
public interface IVehicleMaker {

    IVehicle makeVehicle(String modelo);
}
