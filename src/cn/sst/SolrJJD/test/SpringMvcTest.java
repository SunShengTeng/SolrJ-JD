package cn.sst.SolrJJD.test;

import org.apache.solr.client.solrj.SolrClient;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMvcTest {

	
	private SolrClient getHttpSolrJClient() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
		return (SolrClient) applicationContext.getBean("httpSolrClient"); 
	}
	
	
	@Test
	public void testDeleteIndex() throws Exception {

		SolrClient solrClient = getHttpSolrJClient();
		solrClient.deleteByQuery("*:*");
		solrClient.commit();
	}
}
