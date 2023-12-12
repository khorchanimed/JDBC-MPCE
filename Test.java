
public class Test {

	public static void main(String[] args) {

		Article a1 = new Article("PC",2000 );
		Article a2 = new Article("TV",1000 );
		Article a3 = new Article("Phone",1500 );
		
				
		  ArticleDB.ajouterArticle(a1); 
		  ArticleDB.ajouterArticle(a2);
		  ArticleDB.ajouterArticle(a3);
		 
		
		ArticleDB.supprimerArticle(5) ;
		
		for(Article a : ArticleDB.getAllArticles())
			System.out.println(a.toString());

		ArticleDB.updateArticle(new Article(2 ,"SSD",120));
		
		System.out.println(ArticleDB.getArticleById(2));

	}

}
