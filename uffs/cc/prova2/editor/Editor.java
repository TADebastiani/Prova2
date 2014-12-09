package uffs.cc.prova2.editor;

import java.util.ArrayList;

public class Editor
{
	private ArrayList<Elemento> documento;

	public void addElemento(Elemento e)
	{
		documento.add(e);
	}

	public void removeElemento(Elemento e)
	{
		documento.remove(e);
	}
}