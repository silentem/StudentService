import com.whaletail.dao.StudentDao;
import com.whaletail.entities.Student;
import org.junit.Test;

/**
 * @author Whaletail
 */
public class DatabaseTest {

    @Test
    public void addStudentToDBTest(){
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        student.setName("Artem");
        student.setLastName("Kovalenko");
        student.setPhoneNumber("0505748155");
        student.setEmail("silentem1113@gmail.com");
        studentDao.add(student);
    }

}
