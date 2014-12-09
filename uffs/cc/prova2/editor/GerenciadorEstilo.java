package uffs.cc.prova2.editor;

import uffs.cc.prova2.editor.exceptions.*;
import uffs.cc.prova2.editor.Elemento.Palavra;


public class GerenciadorEstilo
{
	public void aplicaEstilo(Elemento e, String estilo) throws EElementoInvalido, EPalavraPequena
	{
		Palavra p;
		if ( !(e instanceof Palavra) )
		{
			throw new EElementoInvalido();
		}

		p = (Palavra)e;

		if (p.getTexto().length() < 2) 
		{
			throw new EPalavraPequena();
		}

		switch (estilo)
		{
			case "negrito"		: p.setNegrito(true);
			case "italico"		: p.setItalico(true);
			case "sublinhado"	: p.setSublinhado(true);
		}

	}
}