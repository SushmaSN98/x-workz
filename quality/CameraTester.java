package com.Xworkz.quality;

import com.Xworkz.quality.object.Camera;

public class CameraTester {
public static void main(String[] args)
{
	Camera camera=new Camera();
	System.out.println("camera lens"+camera.Lens);
	camera.Lens="A-mount";
	System.out.println("camera type"+camera.type);
	System.out.println("camera colour"+camera.colour);
	System.out.println("camera size"+camera.size);
	System.out.println("camera pixels"+camera.pixels);
	System.out.println("camera quality"+camera.quality);
	System.out.println("camera brand"+camera.brand);
	
	Camera camera1=new Camera();
	camera1.Lens="E-mount";
	System.out.println(camera1.Lens);
	
	
	
	
	
	
	
}

}
