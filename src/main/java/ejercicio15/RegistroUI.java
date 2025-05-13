package ejercicio15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUI extends JFrame {
    private JTextField nombreField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton registrarButton;

    public RegistroUI() {
        setTitle("Registro de Usuario");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(10, 10, 80, 25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(100, 10, 160, 25);
        add(nombreField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 40, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(100, 40, 160, 25);
        add(emailField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 70, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 70, 160, 25);
        add(passwordField);

        registrarButton = new JButton("Registrar");
        registrarButton.setBounds(100, 110, 100, 25);
        add(registrarButton);

        registrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                UsuarioE15 usuarioE15 = new UsuarioE15(nombre, email, password);

                RegistroService servicio = new RegistroService(
                        new ArchivoRepositorio(),
                        new ArchivoLogger(),
                        new EmailSender()
                );

                servicio.registrar(usuarioE15);
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
            }
        });
    }

}


