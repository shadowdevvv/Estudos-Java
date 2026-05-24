public class OperadoresLogicos {

  static void main(String[] args) {
    String immigrant = "Imigrante";
    int idade = 35;
    double salario1 = 4.612;
    double salario2 = 3.331;
    boolean DentroDaLeiMaiorQueTrinta = idade > 30 && salario1 >= 4.612;
    boolean DentroDaLeiMenorQueTrinta = idade < 30 && salario2 <= 3.331;

    System.out.println("Dentro da Lei Maior Que Trinta: " +DentroDaLeiMaiorQueTrinta);
    System.out.println("Dentro da Lei Menor Que Trinta: " +DentroDaLeiMenorQueTrinta);


    //System.out.println(immigrant);
    //System.out.println("Idade: " + idade + " anos");
    //System.out.println("Se o imigrante for mais que 45 anos: " + idade1 + " verdadeiro");
    //System.out.println("Salário: R$" + salario1);
    //System.out.println("Se for menor que 45: " + idade2);
    //System.out.println("Salário: R$" + salario2);

  }
}
