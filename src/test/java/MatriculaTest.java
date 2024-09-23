import Domain.Matricula;
import dao.IMatriculaDao;
import dao.MatriculaDao;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

        private IMatriculaDao matriculaDao;

        public MatriculaTest(){
            matriculaDao = new MatriculaDao();
        }

        @Test
        public void cadastrar(){
        Matricula mat = new Matricula();
        mat.setCodigo("A!");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());


    }

}
