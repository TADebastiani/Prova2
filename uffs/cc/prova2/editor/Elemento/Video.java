package uffs.cc.prova2.editor.Elemento;

import uffs.cc.prova2.editor;


public class Video extends Elemento implements Ajustavel
{
	private String video;

	// Atributos implementados
	private float altura, largura;

	public void setVideo(String vid)
	{
		video = "[video]"+vid+"[video]";
	}

	public String getVideo()
	{
		return video;
	}


	// Metodos implementados
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