
def odd_num(n1:Int,n2:Int):Int = {
	var result = 0
	for(i <- n1 to n2 by 2){ result += i}
	return result
}

println(odd_num(1,10))
