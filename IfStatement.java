public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");

        } else {
            fileSended--;
            System.out.println("Por favor encender Bluetooth");
        }
        System.out.println(fileSended);

        boolean par = true;
        int a;
        a = par ? 2 : 3;
        System.out.println(a);
    }
}
