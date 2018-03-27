package com.mg.small;
import static spark.Spark.post;

import com.mg.small.obj.NumberPrevision;

import spark.Spark;

public class Main {

	public static void main(String[] args) {
		Spark.port(8080);
		// TODO Auto-generated method stub
		post("/prevision", (req,res) -> {
			NumberPrevision np = new NumberPrevision();
			return np.getPrevision();
		});
	}

}
