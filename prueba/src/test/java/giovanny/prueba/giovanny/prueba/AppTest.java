package giovanny.prueba.giovanny.prueba;

import giovanny.prueba.App;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
 
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    public void testApp()
    {
       
    App app=new App();
    String resultado=app.probar();
    Assert.assertEquals("Le resultado deberia ser : Exito","Exito",resultado);
  
       
       
    }
    

    public void testApp2()
    {
       
    App app=new App();
    String resultado=app.probar();

        assertNotNull(true);

    }
    
    public void testApp3()
    {
       
    App app=new App();
    String resultado=app.probar();

        assertNotNull(true);

    }
    
    public void testApp4()
    {
       
    App app=new App();
    String resultado=app.probar();

        assertNotNull(true);

    }
 }
