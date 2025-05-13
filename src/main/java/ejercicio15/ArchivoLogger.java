package ejercicio15;

import java.io.FileWriter;
import java.io.IOException;

class ArchivoLogger implements Logger {
    public void log(String mensaje) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(mensaje + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
