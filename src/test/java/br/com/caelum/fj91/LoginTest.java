package br.com.caelum.fj91;

import br.com.caelum.fj91.model.Authenticable;
import br.com.caelum.fj91.model.LoginStrategy;
import br.com.caelum.fj91.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTest {


    private User user;

    @Before
    public void setup(){
        user = new User("feh-wilinando","123");
    }
    @Test
    public void shouldLogInByEmail(){
        LoginStrategy login = LoginStrategy.EMAIL;

        Optional<Authenticable> authenticableOptional =  login.validate(user);


        assertTrue(authenticableOptional.isPresent());

        Authenticable authenticable = authenticableOptional.get();
        assertTrue(authenticable.isAuthenticated());


        assertEquals(authenticable.getProvider(), "EMAIL");
    }


    @Test
    public void shouldLogInByFacebook(){
        LoginStrategy login = LoginStrategy.FACEBOOK;

        Optional<Authenticable> authenticableOptional =  login.validate(user);


        assertTrue(authenticableOptional.isPresent());

        Authenticable authenticable = authenticableOptional.get();
        assertTrue(authenticable.isAuthenticated());


        assertEquals(authenticable.getProvider(), "FACEBOOK");
    }


    @Test
    public void shouldLogInByGPlus(){
        LoginStrategy login = LoginStrategy.GPLUS;

        Optional<Authenticable> authenticableOptional =  login.validate(user);


        assertTrue(authenticableOptional.isPresent());

        Authenticable authenticable = authenticableOptional.get();
        assertTrue(authenticable.isAuthenticated());


        assertEquals(authenticable.getProvider(), "GPLUS");
    }


    @Test
    public void shouldLogInByGithub(){
        LoginStrategy login = LoginStrategy.GITHUB;

        Optional<Authenticable> authenticableOptional =  login.validate(user);


        assertTrue(authenticableOptional.isPresent());

        Authenticable authenticable = authenticableOptional.get();
        assertTrue(authenticable.isAuthenticated());


        assertEquals(authenticable.getProvider(), "Github");
    }
}
