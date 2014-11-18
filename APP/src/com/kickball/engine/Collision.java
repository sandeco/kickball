package com.kickball.engine;

import android.graphics.Rect;

public class Collision {
	
	public static boolean collided(GameObject a, GameObject b){
		
		Rect rA = a.getRect();
		Rect rB = b.getRect();
		
		return rA.intersect(rB);
	}
}
