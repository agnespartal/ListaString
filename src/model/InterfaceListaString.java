package model;

public interface InterfaceListaString {
	
	public boolean isEmpty();
	public int size();
	public No getNo(int posicao) throws Exception;
	public void addFirst (String valor);
	public void addLast (String valor) throws Exception;
	public void add (String valor, int posicao)throws Exception;
	public void removeFirst ()throws Exception;
	public void removeLast()throws Exception;
	public void remove (int posicao)throws Exception;
	public String get(int posicao)throws Exception;
}
