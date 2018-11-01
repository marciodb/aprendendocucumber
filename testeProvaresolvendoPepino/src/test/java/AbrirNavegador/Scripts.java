package AbrirNavegador;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.linkText;

public class Scripts {

    private WebDriver navegador;

    @Before
    public void AiMeuDeus() {
        navegador = Web.createChrome();
    }


    @After

     public void FecharNavegador()

    {

        //navegador.quit();
    }

    @Test
    public void AgoraVaiTerQueFuncionar() {

        navegador.findElement(linkText("Printed Dress")).click();

        navegador.findElement(By.id("add_to_cart")).click();



    }

}