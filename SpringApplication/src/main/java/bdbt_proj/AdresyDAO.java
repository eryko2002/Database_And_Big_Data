package bdbt_proj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdresyDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public AdresyDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Adres> list() {
        String sql = "SELECT * FROM ADRESY";

        List<Adres> listAdresy = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Adres.class));
        return listAdresy;
    }

    public void save(Adres adres) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("adresy").usingColumns("id_adresu","miasto","ulica","kod_pocztowy","nr_mieszkania", "nr_lokalu");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adres);
        insertActor.execute(param);
    }

    public Adres get(int id_adresu) {
        return null;
    }

    public void update(Adres adres) {

    }

    public void delete(int id_adresu) {

    }
}
