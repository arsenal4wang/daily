package DesignPartenAdapter;

import org.thisdemo.thisDemo01;

public class DrawAdapter implements ICircle,ISquar {
	private ICircle circle;
	private ISquar squar;
	public DrawAdapter(Circle circle){
		this.circle=circle;
	}
	public DrawAdapter(Squar squar){
		this.squar=squar;
	}
	public DrawAdapter(Circle circle,Squar squar){
		this.circle=circle;
		this.squar=squar;
	}
	@Override
	public void drawSquar() {
		squar.drawSquar();
	}
	@Override
	public void drawCircle() {
		circle.drawCircle();
	}
	
	
}
