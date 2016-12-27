package com.priya.operations;

import org.springframework.stereotype.Component;

@Deprecated
@Component
public class Camera implements ICamera {

	public Camera() {
		System.out.println("Camera Constructor");
	}

	@Override
	public void snap() {
		System.out.println("SNAP!");
	}
}
