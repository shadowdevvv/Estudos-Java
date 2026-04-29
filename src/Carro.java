public class Carro {

  private String marca;
  private String modelo;
  private int ano;
  private String chassi;

  // Construtor
  public Carro(String marca, String modelo, int ano, String chassi) {
    this.marca  = marca;
    this.modelo = modelo;
    this.ano    = ano;
    this.chassi = chassi;
  }

  // Getters e Setters
  public String getMarca()          { return marca; }
  public void   setMarca(String m)  { this.marca = m; }

  public String getModelo()         { return modelo; }
  public void   setModelo(String m) { this.modelo = m; }

  public int    getAno()            { return ano; }
  public void   setAno(int a)       { this.ano = a; }

  public String getChassi()         { return chassi; }
  public void   setChassi(String c) { this.chassi = c; }

  // Para imprimir bonito
  @Override
  public String toString() {
    return marca + " " + modelo + " (" + ano + ") - Chassi: " + chassi;
  }
}
