package org.camcar.springtutorial.xmlconfig;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape{ 
	//implements InitializingBean, DisposableBean{
	//implements ApplicationContextAware, BeanNameAware{

		
	/*private String type;
	private int height;
	
	public Triangle(String type) {
		this.type = type;
		System.out.println("Constructor 1 parameter");
	}
	
	public Triangle(int height) {
		this.height = height;
		System.out.println("Constructor 1 parameter 2");
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
		System.out.println("Constructor 2 parameters");
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	*/
	
	
	// Injecting Objects and inner beans and Bean autowiring
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
//	private ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	//initializing collections
	/*private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
		System.out.println("set list of points");
	}*/

	public void draw() {
		//System.out.println(getType()+" Triangle drawn of height "+getHeight());
		System.out.println("Drawing a triangle");
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		
		/*for (Point point : points) {
			System.out.println("Point = ("+ point.getX()+", "+point.getY()+")");
		}*/		
	}

	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing beanas init method called fro Triangle");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Before bean Triangle is distroy");		
	}*/

	/* ApplicationContextAware
	 * @Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
				this.context = context;
				System.out.println("setApplicationContext");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: "+beanName);
		
	}*/
	
	public void myInit() {
		System.out.println("my init method called for Triangle");
	}
	
	public void cleanUp() {
		System.out.println("Before bean Triangle is cleanup");		
	}

}
