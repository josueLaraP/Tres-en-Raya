
package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private static final String FILE_PATH = "usuarios.txt";

    // Función para registrar un nuevo usuario
    public void registrarUsuario(Usuario usuario) throws IOException {
        FileWriter fw = new FileWriter(FILE_PATH, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println(usuario.getNombre() + ":" + usuario.getContraseña());
        pw.close();
    }

    // Función para verificar el inicio de sesión
    public boolean iniciarSesion(Usuario usuario) throws IOException {
        FileReader fr = new FileReader(FILE_PATH);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        boolean exito = false;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(":");
            String usuarioArchivo = datos[0];
            String contrasenaArchivo = datos[1];

            if (usuarioArchivo.equals(usuario.getNombre()) && contrasenaArchivo.equals(usuario.getContraseña())) {
                exito = true;
                break;
            }
        }
        br.close();
        return exito;
    }

    // Para depuración, obtener todos los usuarios
    public List<Usuario> obtenerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        FileReader fr = new FileReader(FILE_PATH);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(":");
            usuarios.add(new Usuario(datos[0], datos[1]));
        }
        br.close();
        return usuarios;
    }
}