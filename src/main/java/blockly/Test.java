package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Test {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Test
public static Var test() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("abc").getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

