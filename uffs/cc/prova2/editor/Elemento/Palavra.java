package uffs.cc.prova2.editor.Elemento;

import uffs.cc.prova2.editor;


public class Palavra extends Elemento implements Rotacionavel
{
	private String texto;
	private boolean negrito, italico, sublinhado;
	// Atributos implementados
	private float angulo;



	public void setTexto(String s)
	{
		texto = s;
	}

	public String getTexto()
	{
		return texto;
	}
	public void setNegrito(boolean b)
	{
		negrito = b;
	}
	public void setItalico(boolean b)
	{
		italico = b;
	}
	public void setSublinhado(boolean b)
	{
		sublinhado = b;
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
}