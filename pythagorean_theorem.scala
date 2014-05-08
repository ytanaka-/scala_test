def pythagorean_calc(max:Int) = {
	for(i <- 1 to max){
		for(j <- i to max){
			for(k <- j to max){
				if ( i*i + j*j == k*k)
					println(i+":"+j+":"+k)
			}
		}
	}
}

pythagorean_calc(100)


