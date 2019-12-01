package com.zhjie.common.init;

public class CodeEnum {
	private CodeEnum() {
	}

	public static CodeEnum getInstance() {
		return Singleton.INSTANCE.getInstance();
	}

	private enum Singleton {
		INSTANCE(new CodeEnum());
		private CodeEnum singleton;

		// JVM会保证此方法绝对只调用一次
		Singleton(CodeEnum singleton) {
			this.singleton = singleton;
		}

		public CodeEnum getInstance() {
			
			return singleton;
		}
	}

}
