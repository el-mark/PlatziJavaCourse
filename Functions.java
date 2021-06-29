public class Functions {
    public static void main(String[] args) {
        double y = 3;

        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolume(y));

        System.out.println("pesos a dolares: " + convertToDolar(200, "MXN"));
        System.out.println("pesos a dolares: " + convertToDolar(1000, "COP"));
    }

    public static double circleArea(double radio) {
        //Circle Area
        //pi * r2
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio) {
        //Sphere Area
        //4*PI*r2
        return 4 * Math.PI * Math.pow(radio,2);
    }

    public static double sphereVolume(double radio) {
        //Sphere Volume
        //(4/3) * pi * r3
        return (4/3) * Math.PI * Math.pow(radio,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dólares
     *
     * */
    public static double convertToDolar(double quantity, String currency) {
        //Currency MXN or COP
        double total = 0;
        switch (currency){
            case "MXN":
                total = quantity * 0.052;
                break;
            case "COP":
                total = quantity * 0.00031;
                break;
        }
        return total;
    }
}
