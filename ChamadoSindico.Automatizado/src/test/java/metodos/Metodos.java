package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browsers.Browsers;
import elementos.elementos;

public class Metodos extends Browsers {
	elementos elementos = new elementos();
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void submit(By elemento) {
		
		driver.findElement(elemento).sendKeys(Keys.ENTER);
	}
		public void submit2(By elemento) {
			driver.findElement(elemento).submit();
		}
	public void baixo(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.DOWN);
	}
	public void tirarPrint(String nomePrint) throws IOException {
        TakesScreenshot print = (TakesScreenshot) driver; // trazendo dependencia
        File arquivo = print.getScreenshotAs(OutputType.FILE);// print em si
        File destinoArquivo = new File("./Evidencias/" + nomePrint + ".png");// onde vai salvar
        FileUtils.copyFile(arquivo, destinoArquivo);// Salvando o arquivo na pasta evidencias

    }

}
