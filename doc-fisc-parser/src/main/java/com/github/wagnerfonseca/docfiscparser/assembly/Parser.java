package com.github.wagnerfonseca.docfiscparser.assembly;

public enum Parser {
	
	MDFE {
		@Override
		public void parser(String path) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object parser(String path, Object src) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	public abstract void parser(String path);
	
	public abstract Object parser(String path, Object src);

}
