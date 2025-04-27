public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public void establecerHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

    public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.establecerHora(10, 30, 45);
        miReloj.mostrarHora();
        miReloj.avanzarSegundo();
        miReloj.mostrarHora();
    }
}