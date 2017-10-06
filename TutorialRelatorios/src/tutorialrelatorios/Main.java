/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorialrelatorios;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import tutorialrelatorios.entidades.Cliente;
import tutorialrelatorios.jdbc.ConnectionFactory;
import tutorialrelatorios.util.ReportUtils;

/**
 * Ponto de entrada do projeto.
 *
 * @author David Buzatto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().abrirRelatorioClientes();
    }

    public void abrirRelatorioClientes() {

        InputStream inputStream = getClass().getResourceAsStream( "/LocacoesPorClientes.jasper" );

        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put( "nomeCliente", "F%" );

        try {

            ReportUtils.openReport( "Locações por Clientes", inputStream, parametros,
                    ConnectionFactory.getSakilaConnection() );

        } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }

    }

    public void abrirRelatorioClientesDS() {

        InputStream inputStream = getClass().getResourceAsStream( "/ClientesCollectionDS.jasper" );

        Map<String, Object> parametros = new HashMap<String, Object>();

        // criando os dados que serão passados ao datasource
        List<Cliente> dados = new ArrayList<Cliente>();

        for ( long i = 1; i <= 50; i++ ) {
            Cliente c = new Cliente();
            c.setId( i );
            c.setNome( "Nome Cliente " + i );
            c.setSobrenome( "Sobrenome Cliente " + i );
            dados.add( c );
        }

        // criando o datasource com os dados criados
        JRDataSource ds = new JRBeanCollectionDataSource( dados );

        try {

            // passando o datasource para o método de criação e exibição do relatório
            ReportUtils.openReport( "Clientes - Bean Collection Data Source", inputStream, parametros,
                    ds );

        } catch ( JRException exc ) {
            exc.printStackTrace();
        }

    }

}
