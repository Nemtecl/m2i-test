import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.sql.Connection;


@ExtendWith(MockitoExtension.class)
class ForestManagerWithDAOUnitTest {
    @Mock
    Connection connectionMock;

    @Mock
    JdbcDAO jdbcDAOMock;

    //@InjectMocks
    //...


}