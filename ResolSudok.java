import java.util.ArrayList;

public class ResolSudok{
	
	
	public static void main(String[] args){
		
		int [][] grille = new int [9][9];   //la grille de sudoku a remplir
		ArrayList<Integer> [][] g = new ArrayList[9][9];   //le tableau de liste
		
		//cree une array list dans chaue case
		
        for(int i = 0; i<grille.length; i++){     
			for(int j = 0; j<grille[i].length; j++){
				g[i][j] = new ArrayList<Integer>();
			}
		}		
		
		//pour remplir les listes, sauf celle ou un chiffre est deja present dans la grille
		
		for(int i = 0; i<grille.length; i++){     
			for(int j = 0; j<grille[i].length; j++){
				if(grille[i][j] == 0){
					g[i][j].add(1);
					g[i][j].add(2);
					g[i][j].add(3);
					g[i][j].add(4);
					g[i][j].add(5);
					g[i][j].add(6);
					g[i][j].add(7);
					g[i][j].add(8);
					g[i][j].add(9);
				}
				if(grille[i][j] != 0){
					g[i][j].add(grille[i][j]);
				}
			}
		}
		
	 // premiere methode de resolution
	 
	 for(int i = 0; i< g.length; i++){
		 fot(int j = 0; j<g[i].length; j++){
			 if(g[i][j].size() != 1){
				 
	 
	 
	 
	 
		
		
				
	}
}	
