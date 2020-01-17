package 享元模式;

import java.util.Hashtable;

public class WebSiteFactory {
	private Hashtable flyweights = new Hashtable();

	public WebSite getWebSiteCategory(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite) flyweights.get(key);
	}

	public int getWebSiteCount() {
		return flyweights.size();
	}
}
