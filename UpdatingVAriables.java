public class UpdatingVAriables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Philip Harmsen";
        employeeName = employeeName + " Rivera";
        System.out.println(employeeName);

        employeeName = "Mark " + employeeName;
        System.out.println(employeeName);

    }
}
