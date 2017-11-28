package god;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ god.codegen.crud.sys.alltabcomments.service.impl.GodCodegenCrudSysAllTabCommentsDAOTest.class,
		god.codegen.crud.sys.alltables.service.impl.GodCodegenCrudSysAllTablesDAOTest.class,
		god.codegen.crud.sys.alltabcols.service.impl.GodCodegenCrudSysAllTabColsDAOTest.class,
		god.codegen.crud.sys.allcolcomments.service.impl.GodCodegenCrudSysAllColCommentsDAOTest.class })
public class AllTests {

}
