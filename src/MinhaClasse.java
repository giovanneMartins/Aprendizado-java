public class MinhaClasse {
  
         /**METODO */
    public static void main(String[] args) {
        /**fim metodo */


            /**VARIAVEIS */
        String dia = "primeiro";
        String mes = "dezembro";
        int ano = 2005;

        String dataNascimento = exibirData(dia, mes, ano);

        System.out.println(dataNascimento);
            /*FIM VARIAVEIS */
    }
        /**METODO */
    public static String exibirData(String dia, String mes, int ano) {
        return dia.concat(" de ").concat(mes).concat(" de ") + (ano);
    }
        /**fim metodo */
}
