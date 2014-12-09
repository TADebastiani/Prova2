package uffs.cc.prova2.editor;

public interface Posicao
{
	private float x, y;
	private boolean posicionavel;
	public void setPosicao(float x, float y);
	public void setX(float x);
	public void setY(float y);
	public float getX();
	public float getY();
	public void setPOsicionavel(boolean b);
	public boolean getPosicionavel();
}