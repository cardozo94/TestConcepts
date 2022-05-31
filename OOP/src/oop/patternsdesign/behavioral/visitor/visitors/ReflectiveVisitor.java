package oop.patternsdesign.behavioral.visitor.visitors;

import java.lang.reflect.Method;

import oop.patternsdesign.behavioral.visitor.elements.TheOther;

public abstract class ReflectiveVisitor {
	
	abstract public void visit(Object o);
	
	public void visitTheOther(TheOther e) {
		System.out.println("ReflectiveVisitor: do Base on "+e.theOther());
	}
	
	protected Method getMethod(Class source) {
		Class clazz = source;
		Method methodName = null;
		while(methodName == null && clazz != Object.class) {
			String clazzName = clazz.getName();
			clazzName = "visit"+clazzName.substring(clazzName.indexOf('.')+1);
			try {
				methodName = getClass().getMethod(clazzName, clazz);
			} catch (NoSuchMethodException e) {
				clazz = clazz.getSuperclass();
			}
		}
		if(clazz == Object.class) {
			Class[] interfaces = source.getInterfaces();
			for (Class intrface : interfaces) {
				String interfaceName = intrface.getName();
				interfaceName = "visit"+interfaceName.substring(interfaceName.lastIndexOf('.')+1);
				try {
					methodName = getClass().getMethod(interfaceName, intrface);
				} catch (NoSuchMethodException e) {
//					e.printStackTrace();
				}
			}
		}
		if(methodName == null)
			try {
				methodName = getClass().getMethod("visitObject", Object.class);
			} catch (Exception e) {
//				e.printStackTrace();
			}
		return methodName;
	}

}
