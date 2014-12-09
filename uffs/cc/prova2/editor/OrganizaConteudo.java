package uffs.cc.prova2.editor;


class OrganizaConteudo 
{

	public OrganizaConteudo(Elementos[] e)
	{
		int i;
		Ajustavel a;
		Rotacionavel r;

		for (i=0; i<e.length; i++)
		{
			if (e instanceof Ajustavel)
			{
				a = (Ajustavel)e;
				economizaTamanho(a);
			} 
			else if (e instanceof Rotacionavel)
			{
				r = (Rotacionavel)e;
				removeRotacao(r);
			}
		}
	}

	private void economizaTamanho(Ajustavel a)
	{
		a.setTamanho(200, 200);
	}

	private void removeRotacao(Rotacionavel r)
	{
		r.setAngulo(0);
	}
}