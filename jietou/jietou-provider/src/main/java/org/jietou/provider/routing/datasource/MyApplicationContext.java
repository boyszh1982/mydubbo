package org.jietou.provider.routing.datasource;

import java.util.Optional;

public class MyApplicationContext {
	
	private static ThreadLocal<MyApplicationContext> t = new ThreadLocal<MyApplicationContext>();
	
	//单例，饿汉。
	private static MyApplicationContext context = new MyApplicationContext();
	
	private MyApplicationContext(){
		
	}
	
	//非原子操作需要类锁
	public static synchronized void setDataSource(String datasource) {
		//每次调用都要执行t.set(context),因为在t.get()后，ThreadLocal 会重新创建一个new ThreadLocalMap() .原来的值就没有了。
		t.set(context);
		context.setCurrenDataSource(datasource);
	}
	
	public static synchronized Optional<String> getDataSource() {
		/**
			Optional<String> optional = Optional.of("bam");    
			optional.isPresent();           // true  
			optional.get();                 // "bam"  
			optional.orElse("fallback");    // "bam"   
			optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b" 
		 */
		if(t.get() == null){
			return Optional.ofNullable(null);
		}
		Optional<String> optional = Optional.ofNullable(t.get().getCurrenDataSource());
		return optional;
	}
	
	private String currenDataSource = null; 
	
	public String getCurrenDataSource() {
		return currenDataSource;
	}

	public void setCurrenDataSource(String currenDataSource) {
		this.currenDataSource = currenDataSource;
	}

	
	
	
}
