import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@SelectPackages({"ui"})
@SelectClasses({TestWithLogging.class})
@IncludeTags("shorttest")
@Suite
public  class Runner {
}
