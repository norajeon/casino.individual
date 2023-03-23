package com.github.zipcodewilmington.casino;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CasinoAccountManagerTest {

    @Test
    public void testCreateAccount() {
        CasinoAccountManager a = new CasinoAccountManager();
        a.createAccount("Henlo", "password");
        String expectedPW = "password";
        Assert.assertEquals(expectedPW, a.getAccount("Henlo", "password").getPassword());

    }
}
