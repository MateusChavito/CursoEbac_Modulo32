import Domain.Curso;
import dao.CursoDao;
import dao.ICursoDao;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest(){
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Back-end");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
