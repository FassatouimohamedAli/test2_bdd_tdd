package Steps;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testJunit {

    



    @Test
    public void testSuccessfulLogin() {
        //System.out.println("Test: Successful Login");
        // Préparer les données
    	user u = new user("admin","admin") ;
       // u.setUsername("admin");
        // u.setPassword("admin");

        // Exécuter le test
        boolean isAuthenticated = u.getUsername().equals("admin") && u.getPassword().equals("admin");

        // Valider le résultat
        if (isAuthenticated) {
            System.out.println("Login successful with username: " + u.getUsername());
        } else {
            System.out.println("Login failed: Invalid username or password");
        }
        assertTrue("Login failed: Invalid username or password", isAuthenticated);
    }

    @Test
    public void testInvalidLogin() {
 
        //u.setUsername("wrongUser");
        //u.setPassword("wrongPass");
        user u = new user("wrongUser","wrongPass") ;
        // Exécuter le test
        boolean isAuthenticated = u.getUsername().equals("admin") && u.getPassword().equals("admin");

        // Valider le résultat
        if (!isAuthenticated) {
            System.out.println("Login failed as expected with invalid credentials.");
        } else {
            System.out.println("Unexpected success: Login should fail with invalid credentials.");
        }
        assertFalse("Login should fail with invalid credentials", isAuthenticated);
    }

    @Test
    public void testUserInputCredentials() {
        //System.out.println("Test: User Input Credentials");
        // Préparer les données
    	user u = new user("admin","admin") ;
    	
        String expectedUsername = "admin";
        String expectedPassword = "admin";

        // Simuler la saisie
        //u.setUsername(expectedUsername);
        //u.setPassword(expectedPassword);

        // Valider les résultats
        System.out.println("Entered username: " + u.getUsername());
        System.out.println("Entered password: " + u.getPassword());
        assertEquals("Username does not match", expectedUsername, u.getUsername());
        assertEquals("Password does not match", expectedPassword, u.getPassword());
    }
}
