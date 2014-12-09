package uffs.cc.prova2.editor;

public interface Ajustavel
{
	private float altura, largura;

	public void setTamanho(float alt, float lar);
	public void setAltura(float a);
	public void setLargura(float l);

	public float getAltura();
	public float getLargura();
}