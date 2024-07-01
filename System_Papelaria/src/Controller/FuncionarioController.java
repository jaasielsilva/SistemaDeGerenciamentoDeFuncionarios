package Controller;

import model.Funcionario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class FuncionarioController {

    // Configurações do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/teste";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "12345";

    // Método para validar o login do funcionário utilizando o procedimento armazenado
    public boolean validarFuncionario(String nomeUsuario, String senha) {
        String callProcedure = "{CALL efetuarLogin(?, ?, ?, ?)}";
        boolean isValid = false;

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             CallableStatement callableStatement = connection.prepareCall(callProcedure)) {

            // Configura os parâmetros de entrada
            callableStatement.setString(1, nomeUsuario);
            callableStatement.setString(2, senha);

            // Configura os parâmetros de saída
            callableStatement.registerOutParameter(3, Types.VARCHAR);
            callableStatement.registerOutParameter(4, Types.BOOLEAN);

            // Executa o procedimento armazenado
            callableStatement.execute();

            // Obtém o resultado do procedimento
            isValid = callableStatement.getBoolean(4);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isValid;
    }

    // Método para obter o cargo do funcionário utilizando o procedimento armazenado
    public String obterCargoFuncionario(String nomeUsuario, String senha) {
        String callProcedure = "{CALL efetuarLogin(?, ?, ?, ?)}";
        String cargo = null;

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             CallableStatement callableStatement = connection.prepareCall(callProcedure)) {

            // Configura os parâmetros de entrada
            callableStatement.setString(1, nomeUsuario);
            callableStatement.setString(2, senha);

            // Configura os parâmetros de saída
            callableStatement.registerOutParameter(3, Types.VARCHAR);
            callableStatement.registerOutParameter(4, Types.BOOLEAN);

            // Executa o procedimento armazenado
            callableStatement.execute();

            // Verifica se o login foi bem-sucedido
            boolean isValid = callableStatement.getBoolean(4);
            if (isValid) {
                // Obtém o cargo se o login foi bem-sucedido
                cargo = callableStatement.getString(3);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cargo;
    }
}
