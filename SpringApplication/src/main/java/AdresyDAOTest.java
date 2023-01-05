import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import bdbt_proj.Adres;
import bdbt_proj.AdresyDAO;

import java.applet.Applet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdresyDAOTest extends Applet {
    private AdresyDAO dao;

    @BeforeEach
    void setUp() throws Exception{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        dataSource.setUsername("BDBTGRC09");
        dataSource.setPassword("BDBTGRC09");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new AdresyDAO(new JdbcTemplate(dataSource));
    }

    @Test
    void testList() {
        List<Adres> listAdresy = dao.list();

        assertFalse(listAdresy.isEmpty());
        System.out.println(listAdresy);
    }

    @Test
    void testSave() {
        Adres adres = new Adres(9,"Gdańsk","Publiczna","02-422",7,0);
        dao.save(adres);
    }
    @Test
    void testGet() {
        fail("Not implemented yet!");
    }
    @Test
    void testUpdate() {
        fail("Not implemented yet!");
    }

    @Test
    void testDelete() {
        fail("Not implemented yet!");
    }


}
