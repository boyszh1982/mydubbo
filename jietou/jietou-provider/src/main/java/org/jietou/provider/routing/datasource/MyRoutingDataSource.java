package org.jietou.provider.routing.datasource;

import java.util.Optional;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		Optional<String> datasource = MyApplicationContext.getDataSource();
		//非空
		if(datasource.isPresent()){
			System.out.println(String.format("Datasource change to :%s", datasource.get()));
			return datasource.get();
		}
		//默认使用default
		return null;
	}

}
