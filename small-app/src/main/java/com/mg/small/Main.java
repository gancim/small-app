package com.mg.small;
import static spark.Spark.get;

import com.mg.small.obj.NumberPrevision;
import com.mg.small.obj.Prevision;
import com.mg.small.obj.StringPrevision;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get("/prevision", (req,res) -> {
			String type = req.queryParams("str");  
			Prevision np = new NumberPrevision();
			
			if(type.equals("str")){
				np = new StringPrevision();
			}
			
			return np.getPrevision();
		});
	}

}
