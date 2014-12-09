package uffs.cc.prova2.editor;

public class Elemento implements Posicao
{
	private float x, y;

	public void setPosicao(float x, float y)
	{
		setX(x);
		setY(y);
	}
	public void setX(float x)
	{
		this.x = x;
	}
	public void setY(float y)
	{
		this.y = y;
	}
	public float getX()
	{
		return x;
	}
	public float getY()
	{
		return y;
	}
}