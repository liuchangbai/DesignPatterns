package 享元模式;

public class Main {
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		WebSite site = f.getWebSiteCategory("产品展示");
		site.use();
		
		WebSite site1 = f.getWebSiteCategory("产品展示");
		WebSite site2 = f.getWebSiteCategory("产品展示");
	}
}
