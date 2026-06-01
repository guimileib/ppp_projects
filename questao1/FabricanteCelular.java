// Padrao FABRICA (Factory Method):
// quem chama nao instancia o celular diretamente com "new". Apenas pede o
// modelo pela String e cada fabricante decide qual classe concreta devolver.
public interface FabricanteCelular {

    Celular constroiCelular(String modelo);
}
