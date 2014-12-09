package uffs.cc.prova2.editor.Elemento;

import uffs.cc.prova2.editor;


public class Imagem extends Elemento implements Rotacinavel, Ajustavel
{
	private String imagem;

	// Atributos implementados
	private float angulo, altura, largura;


	public void setImagem(String img)
	{
		imagem = "[imagem]"+img+"[imagem]";
	}

	public String getImagem()
	{
		return imagem;
	}


	// Metodos implementados
	public void setAngulo(float a)
	{
		angulo = a;
	}

	public float getAngulo()
	{
		return angulo;
	}

	public void setTamanho(int alt, int lar)
	{
		setAltura(alt);
		setLargura(lar);
	}

	public void setAltura(int a)
	{
		this.altura = a;
	}
	public void setLargura(int l)
	{
		this.largura = l;
	}

	public float getAltura()
	{
		return altura;
	}
	public float getLargura()
	{
		return largura;
	}
}