package com.sushil.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Traingle implements InitializingBean,DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	

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

	public void draw() {
		System.out.println("Point A ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C ("+getPointC().getX()+","+getPointC().getY()+")");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The Traingle Bean is Initilizing");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("The Traingle Bean is Destroy");
		
	}
	
	public void myInit() {
		System.out.println("My Init Method get Called");
	}
	
	public void cleanUp() {
		System.out.println("My Cleanup Method get Called");
	}
}


