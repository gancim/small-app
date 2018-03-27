package com.mg.small;
import static spark.Spark.get;

import com.mg.small.obj.NumberPrevision;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get("/prevision", (req,res) -> {
			NumberPrevision np = new NumberPrevision();
			return np.getPrevision();
		});
	}

}
