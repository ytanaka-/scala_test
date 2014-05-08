
def calc_list_mean(list:List[Int]) = {
	list.sum.toDouble/list.length
}

println(calc_list_mean(List(1,2,3,5,10)))
